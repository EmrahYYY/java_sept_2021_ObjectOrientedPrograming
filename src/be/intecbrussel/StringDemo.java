package be.intecbrussel;

import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {

        String text = "very money";
        // text = text.toUpperCase();
        text = text.concat(" very happy");
        text = text.replace('a', 'o');

        String textToPlaceInUpperCase = text.substring(5, 10);
        String textInUppercase = textToPlaceInUpperCase.toUpperCase();

        System.out.println(textToPlaceInUpperCase);
        text = text.replace(textToPlaceInUpperCase, textInUppercase);

        System.out.println(text);


    }
}
