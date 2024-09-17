//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    static void task1() {
        System.out.println("Задача №1");
        String text = "Kemerovo42Rus";
        String formattedString;
        int countDigitFromZeroToFour = 0;
        int countDigitFromFiveToNine = 0;
        int countLetterUpper = 0;
        int countLetterLower = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                switch (text.charAt(i)) {
                    case '0', '1', '2', '3', '4' -> countDigitFromZeroToFour++;
                    case '5', '6', '7', '8', '9' -> countDigitFromFiveToNine++;
                }
            } else if (Character.isLetter(text.charAt(i))) {
                if (Character.isUpperCase(text.charAt(i))) {
                    countLetterUpper++;
                } else if (Character.isLowerCase(text.charAt(i))) {
                    countLetterLower++;
                }
            }
        }
        formattedString = String.format("Количество цифр от 0 до 4: %d, Количество цифр от 5 до 9: %d," +
                        " Количество больших букв: %d, Количество маленьких букв: %d"
                , countDigitFromZeroToFour, countDigitFromFiveToNine, countLetterUpper, countLetterLower);
        System.out.println(formattedString);
    }

    static void task2() {
        System.out.println(" ");
        System.out.println("Задача№2");
        String text = "I like Java!!!";
        System.out.println("Последний символ: " + text.charAt(text.length() - 1));
        if (text.endsWith("!!!")) {
            System.out.println("Текст заканчивается подстрокой '!!!' ");
        } else {
            System.out.println("Текст НЕ заканчивается подстрокой '!!!' ");
        }

        if (text.startsWith("I like")) {
            System.out.println("Текст начинается подстрокой 'I like' ");
        } else {
            System.out.println("Текст НЕ начинается подстрокой 'I like' ");
        }

        if (text.contains("Java")) {
            System.out.println("Наш текст содержит подстроку 'Java' ");
        } else {
            System.out.println("Наш текст НЕ содержит подстроку 'Java' ");
        }

        System.out.println("Индекс подстроки Java: " + text.indexOf("Java"));

        text = text.replaceAll("a", "o");
        System.out.println(text);

        text = text.toUpperCase();
        System.out.println(text);

        text = text.toLowerCase();
        System.out.println(text);
    }

    static void task3() {
        System.out.println(" ");
        System.out.println("Задача №3");
        String keyboard = "Keyboard";
        String disk = "Disk";
        String headphones = "Headphones";
        String keybordMiddleTwoChar = keyboard.substring(((keyboard.length() / 2) - 1), ((keyboard.length() / 2) + 1));
        System.out.println(keybordMiddleTwoChar);
        String diskMiddleTwoChar = disk.substring(((disk.length() / 2) - 1), ((disk.length() / 2) + 1));
        System.out.println(diskMiddleTwoChar);
        String headphonesMiddleTwoChar = headphones.substring(((headphones.length() / 2) - 1), ((headphones.length() / 2) + 1));
        System.out.println(headphonesMiddleTwoChar);
        // Сначала написал с минимальным количеством скобок, потом поменял на то что есть сейчас. Не знаю как лучше, с точки зрения чтения кода,мне будто бы так понятнее)
    }
}