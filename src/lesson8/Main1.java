package lesson8;

public class Main1 {
    public static void main(String[] args) {
        Proizvoditel dell = new Proizvoditel();
        dell.setName("DELL");
        dell.setPathToImage("https://82.img.avito.st/640x480/11808582882.jpg");

        User user = new User();
        user.setName("Пришелец");
        user.setRate(160);
        user.setPathToAvatar("https://www.youtube.com/watch?v=b2jgt2bkGRQ");

        Otziv otziv = new Otziv();
        otziv.setUser(user);
        otziv.setRate(5);
        otziv.setText("Отлично работает, буду советовать!");

        Tovar tovar = new Tovar();
        tovar.setId(1231232);
        tovar.setPrice(14990);
        tovar.setName("Камера заднего вида");
        tovar.addOtziv(otziv);
        tovar.setProizvoditel(dell);
        System.out.println();
    }
}
