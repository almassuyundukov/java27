package lesson14;

public class Main1 {
    public static void main(String[] args) {
        MultiMapImpl<String, String> telContacts = new MultiMapImpl();
//        System.out.println(telContacts.countValues("Василий"));
        telContacts.put("Василий", "+7985565488");
        telContacts.put("Василий", "+7985563272");
        telContacts.put("Василий", "+7985509841");
        telContacts.put("Георгий", "+7935290382");
        telContacts.put("Георгий", "+7997068274");
//        System.out.println(telContacts.multiMap);
//        System.out.println(telContacts.countValues("Василий"));

//        for(Iterator<String> iter = telContacts.valuesIterator("Василий"); iter.hasNext();){
//            System.out.println(iter.next());
//        }

//        for(String tel:telContacts.values()){
//            System.out.println(tel);
//        }
        System.out.println(telContacts.get("Василий"));
        System.out.println(telContacts.get("Василий"));

        System.out.println(telContacts);

    }
}
