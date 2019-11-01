package CreationalPatterns.Builder;

import java.util.Arrays;

class Product {
    int a = 0;
    String b = "b1";
    char[] c = { 'a', 'b', 'c' };

    public String toString() {
        return "A: " + this.a + " | B: " + this.b + " | C: " +
                Arrays.toString(c);
    }
}
