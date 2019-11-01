package StructuralPatterns.Decorator;

import java.io.*;

public class MaskInputStream extends FilterInputStream {
    private final char[] set;
    private final char REPLACER = '*';


    protected MaskInputStream(InputStream in, char[] set) {
        super(in);
        this.set = set;
    }

    private char mask(char c) {
        for (int i = 0; i < set.length; i++) {
            if (c == set[i]) {
                return REPLACER;
            }
        }
        return c;
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        if (c == -1)
            return -1;
        return mask((char) c);
    }
}
