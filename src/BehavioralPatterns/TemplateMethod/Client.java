package BehavioralPatterns.TemplateMethod;

public class Client {
    public static void main(String[] args) {
        Dungeon epicDungeon = new EpicDungeon();
        epicDungeon.onEnterDungeon();

        Dungeon smallDungeon = new SmallDungeon();
        smallDungeon.onEnterDungeon();
    }
}
