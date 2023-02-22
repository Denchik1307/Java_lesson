package homework.fourth;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        PhoneBook phones = new PhoneBook();
        phones.addContact("Denis");
        phones.addContact("Max", "+375(29)134-56-58");
        phones.showAll();
        phones.addPhone("Denis", "+375(29)125-69-51");
        phones.addPhone("Alex", "+375(29)124-62-01");
        phones.addPhone("Alex", "+375(29)795-52-46");
        phones.showAll();
        phones.movePhoneToContact("Alex", "Denis", "+375(29)795-52-46");
        phones.replaceNumber("Alex", "+375(29)124-62-01", "+375(29)767-34-82");
        phones.showAll();
        phones.deleteContact("Max");
        phones.showAll();
        phones.find("Alex");
        phones.find("Max");

    }
}


class PhoneBook {
    private static final HashMap<String, HashSet<String>> phoneBook = new HashMap<>();

    public void addContact(String login) {
        if (!phoneBook.containsKey(login)) {
            HashSet<String> phones = new HashSet<>();
            phoneBook.put(login, phones);
        } else {
            System.out.printf("Contact \"%s\"is there\n", login);
        }
    }

    public void addContact(String login, String phone) {
        if (!phoneBook.containsKey(login)) {
            HashSet<String> phones = new HashSet<>();
            phones.add(phone);
            phoneBook.put(login, phones);
        } else {
            System.out.printf("Contact \"%s\"is there\n", login);
        }
    }

    public void addPhone(String login, String phone) {
        if (!(login == null && phone == null)) {
            if (phoneBook.get(login) == null) {
                HashSet<String> phones = new HashSet<>();
                phones.add(phone);
                phoneBook.put(login, phones);
            } else if (phoneBook.get(login).contains(phone)) {
                System.out.println("This number is there\n");
            } else {
                phoneBook.get(login).add(phone);
            }
        } else {
            System.out.println("Something wrong\n");
        }
    }

    public void movePhoneToContact(String fromContact, String toContact, String phone) {
        if (phoneBook.containsKey(fromContact) && phoneBook.containsKey(toContact)) {
            if (phoneBook.get(fromContact).contains(phone)) {
                addPhone(toContact, phone);
                deletePhone(fromContact, phone);
            } else {
                System.out.println("Something wrong\n");
            }
        }
    }

    public void find(String login) {
        if (phoneBook.containsKey(login)) {
            System.out.println("Found contact ↓");
            System.out.println(login);
            phoneBook.get(login).forEach(System.out::println);
            System.out.println("Found contact ↑\n");
        } else {
            System.out.printf("Can`t find user \"%s\"\n", login);
        }
    }

    public void showAll() {
        System.out.println("All contacts ↓");
        phoneBook.forEach((name, phones) -> {
            System.out.println(name);
            phones.forEach(System.out::println);
            System.out.println();
        });
        System.out.println("All contacts ↑\n");
    }

    public void deleteContact(String name) {
        if (phoneBook.containsKey(name)) {
            phoneBook.remove(name);
        } else {
            System.out.println("Not found contact for delete");
        }
    }

    public void deletePhone(String name, String phone) {
        if (phoneBook.containsKey(name)) {
            if (phoneBook.get(name).contains(phone)) {
                phoneBook.get(name).remove(phone);
            } else {
                System.out.println("Not found this number");
            }
        } else {
            System.out.println("User not found");
        }
    }

    public void replaceNumber(String name, String oldPhone, String newPhone) {
        if (phoneBook.containsKey(name)) {
            if (phoneBook.get(name).contains(oldPhone)) {
                phoneBook.get(name).remove(oldPhone);
                phoneBook.get(name).add(newPhone);
            } else {
                System.out.println("Not found this number");
            }
        } else {
            System.out.println("User not found");
        }
    }

}
