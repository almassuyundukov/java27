package lesson16;

public class Main1 {
    public static void main(String[] args) {
        StringUtilsImpl util = new StringUtilsImpl();
        // util.div("23", "1");
        double[] nums = null;
        try {
            nums = util.findNumbers("asjd12j4n-124.023nnskmadkm-2314mlas ");
        } catch (CustomException e){
            e.printStackTrace();
        }

        for(double d: nums){
            System.out.println(d);
        }

        int[] word = null;
        word = util.findWord("Qwerty ifwqi tre nasjdk treksad nastrejdn", "tre");
        for(int i: word){
            System.out.println(i);
        }
    }
}
