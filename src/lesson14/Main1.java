package lesson14;

import java.util.HashSet;

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
        System.out.println(telContacts.get("Георгий"));
        System.out.println(telContacts.get("Василий"));
        System.out.println(telContacts.get("Василий"));
        telContacts.remove("Василий");
        System.out.println(telContacts);
        System.out.println(telContacts.containsKey("Георгий"));
        telContacts.remove("Георгий", "+7997068274");
        System.out.println(telContacts);
        System.out.println(telContacts.keySet());;
        System.out.println(telContacts.isEmpty());
        System.out.println(telContacts.clone());
        System.out.println(telContacts.size());
        System.out.println(telContacts.containsValue("+7935290382"));
        System.out.println(telContacts.replace("Георгий", "+10935290383"));
        System.out.println(telContacts);
        System.out.println(telContacts.replace("Георгий", "+10935290383", "111"));


    }
}
