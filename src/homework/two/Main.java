package homework.two;


public class Main {
    public static void main(String[] args) {

        String[] testText = {"Добрый   день Как      дела Все хорошо Вижу у    вас    тоже   неплохо     :-)",
                null,
                "Привет",
                ""};

        for (String sentence : testText) {
            System.out.println(sentence + " <- start text");
            System.out.println(correction(sentence) + " <- after correction\n");
        }
    }

    public static String correction(String text) {
        if (text == null) return "Sending \"null\" is incorrect!!!";

        StringBuilder tmp = new StringBuilder();
        String[] listWords = text.split("\\s+");
        if (!listWords[0].equals("")) {
            tmp.append(listWords[0]);
            for (int i = 1; i < listWords.length; i++) {
                if (Character.isUpperCase(listWords[i].codePointAt(0))) {
                    tmp.append(".");
                }
                tmp.append(" ");
                tmp.append(listWords[i]);
            }
            tmp.append(".");
        } else {
            return "Need more words for correct working!!!";
        }

        return tmp.toString();
    }
}
