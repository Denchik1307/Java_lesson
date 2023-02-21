package homework.fourth;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        PhoneBook phones = new PhoneBook();
        phones.addContact("Denis");
        phones.show("Denis");
        phones.addPhone("Denis", "375291256951");
        phones.show("Den");
        phones.addPhone("Denis", "375291256952");
        phones.show("Denis");
        System.out.println();
        phones.addPhone("Alex", "375291246201");
        phones.show("Alex");
    }
}


class PhoneBook {
    private static final HashMap<String, HashSet<String>> phoneBook = new HashMap<>();

    public void addContact(String login) {
        HashSet<String> phones = new HashSet<>();
        phoneBook.put(login, phones);
    }

    public void addPhone(String login, String phone) {
        if (phoneBook.get(login) == null) {
            HashSet<String> phones = new HashSet<>();
            phones.add(phone);
            phoneBook.put(login, phones);
        } else {
            phoneBook.get(login).add(phone);
        }
    }

    public void show(String login) {
        if (phoneBook.containsKey(login)) {
            System.out.println(login);
            phoneBook.get(login).forEach(System.out::println);
        }else {
            System.out.printf("Can`t find user \"%s\"\n", login);
        }
    }

}
