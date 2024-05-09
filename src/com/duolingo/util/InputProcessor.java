package com.duolingo.util;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputProcessor {

    public static String requestWord(Scanner scanner) {
        
        while (true) {
            System.out.print("Ingrese una palabra: ");
            String word = scanner.nextLine().toLowerCase();

            try {
                validateWord(word);
                return word;
            } catch (DictionaryException e) {
                System.out.println(e.getMessage());
                System.out.println("Por favor, introduzca el dato nuevamente.");
            }
        }
    }

    private static void validateWord(String word) throws DictionaryException {
         
        String wordRegex = "[a-z]+";

        if (!Pattern.matches(wordRegex, word)) {
            throw new DictionaryException("La palabra ingresada no es válida. Debe contener solo letras.");
        }
    }

    public static char requestLetter(Scanner scanner) {

        while (true) {
            System.out.print("Ingrese una letra: ");
            String input = scanner.nextLine().toLowerCase();

            try {
                char letter = validateLetter(input);
                return letter;
            } catch (DictionaryException e) {
                System.out.println(e.getMessage());
                System.out.println("Por favor, introduzca el dato nuevamente.");
            }
        }
    }

    private static char validateLetter(String input) throws DictionaryException {
        
        String letterRegex = "[a-z]";

        if (!Pattern.matches(letterRegex, input)) {
            throw new DictionaryException("Debe ingresar una letra válida.");
        }

        return input.charAt(0);
    }
}