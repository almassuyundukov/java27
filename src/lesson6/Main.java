package lesson6;

public class Main {
    public static void main(String[] args) {
        int count = StringUtils.countGlassFromText("asdkaskd asdas dasd fqwr fsadds");
        System.out.println(count);

        int count2 = StringUtils.countGlassFromText("qweqewqtqweqwrdqwgdsf");
        System.out.println(count2);

        StringUtils.printTextByWords("andqwj dsajndq asdj:asd :asd;fqj");
        StringUtils.coding("asdDWEWHhdw dqwh - huwqh123");

        StringUtils.countWords("quwhrq dsjqb asdnjn; djwqn.");
        String[] ary = "almas".split("");;
        System.out.println(ary[1]);
        StringUtils.wordsInTextReversed("Almas poshel za hlebom");
        int countSoglass = StringUtils.countSoglassFromText("qwueqweQQQQW");
        System.out.println(countSoglass);
        double s = StringUtils.ploshadOnThreeSides("23","43","23");
        System.out.println(s);
        double ploshadHeigntAndBase = StringUtils.ploshadByHeightAndBase("5","2");
        System.out.println(ploshadHeigntAndBase);
        System.out.println("asdkqodk");
    }
}
