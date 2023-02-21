package homework.fourth;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        PhoneBook phones = new PhoneBook();
        phones.addContact("Denis");
        phones.addPhone("Denis", "375291256951");
        phones.addPhone("Alex", "375291246201");
        phones.addPhone("Alex", "375291246201");
//        phones.deletePhone("Denis", "375291256951");
        phones.addPhone("Alex", "375292236201");
        phones.showAll();
    }
}


class PhoneBook {
    private static final HashMap<String, HashSet<String>> phoneBook = new HashMap<>();

    public void addContact(String login) {
        if (!phoneBook.containsKey(login)) {
            HashSet<String> phones = new HashSet<>();
            phoneBook.put(login, phones);
        } else {
            System.out.println("Contact is there");
        }
    }

    public void addPhone(String login, String phone) {
        if (!(login == null && phone == null)) {
            if (phoneBook.get(login) == null) {
                HashSet<String> phones = new HashSet<>();
                phones.add(phone);
                phoneBook.put(login, phones);
            } else if (phoneBook.get(login).contains(phone)) {
                System.out.println("This number is there");
            } else {
                phoneBook.get(login).add(phone);
            }
        } else {
            System.out.println("Something wrong");
        }
    }

//    public void find(String login) {
//        ArrayList<String> found = new ArrayList<>();
//        if (phoneBook.containsKey(login)) {
//            System.out.println(login);
//            phoneBook.get(login).forEach(System.out::println);
//        } else {
//            System.out.printf("Can`t find user \"%s\"\n", login);
//        }
//    }

    public void showAll() {
        phoneBook.forEach((name, phones) -> {
            System.out.println(name);
            phones.forEach(System.out::println);
        });
    }

//    public void deleteContact(String name) {
//        if (phoneBook.containsKey(name)) {
//            phoneBook.remove(name);
//        } else {
//            System.out.println("Not found contact for delete");
//        }
//    }

//    public void deletePhone(String name, String phone) {
//        phoneBook.get(name).remove(phone);
//    }

}
