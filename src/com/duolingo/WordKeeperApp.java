package com.duolingo;

import com.duolingo.elements.Dictionary;
import com.duolingo.util.DictionaryException;
import com.duolingo.util.InputProcessor;

import java.util.Scanner;

public class WordKeeperApp {
    
    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n| Duolingo WordKeeper |");

        while(true) {
            showMenu();
            performAction(dictionary, scanner);
        }
    }

    private static void showMenu() {

        System.out.print("""
            
                              Menú de opciones:
                              1. Agregar palabra.
                              2. Eliminar palabra.
                              3. Verificar si existe una palabra.
                              4. Obtener letras iniciales.
                              5. Obtener palabras por inicial.
                              Q. Detener simulación.
                            """);
    }

    private static void performAction(Dictionary dictionary, Scanner scanner) {

        System.out.print("  -> ");
        String option = scanner.nextLine().toUpperCase();

        switch (option) {
            case "1": 
                addWord(dictionary, scanner); 
                break;
            case "2": 
                removeWord(dictionary, scanner); 
                break;
            case "3": 
                checkWord(dictionary, scanner); 
                break;
            case "4": 
                showInitials(dictionary); 
                break;
            case "5": 
                showWordsByInitial(dictionary, scanner); 
                break;
            case "Q": 
                exitProgram(scanner); 
                break;
            default:
                System.out.println("\nOpción inválida. Por favor, seleccione una opción válida.");
        }
    }

    private static void addWord(Dictionary dictionary, Scanner scanner) {

        System.out.println();
        String wordToAdd = InputProcessor.requestWord(scanner);

        try {
            dictionary.addWord(wordToAdd);
            System.out.println("La palabra se ha agregado correctamente al diccionario.");
        } catch (DictionaryException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void removeWord(Dictionary dictionary, Scanner scanner) {

        System.out.println();
        String wordToRemove = InputProcessor.requestWord(scanner);

        try {
            dictionary.removeWord(wordToRemove);
            System.out.println("La palabra se ha eliminado correctamente del diccionario.");
        } catch (DictionaryException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkWord(Dictionary dictionary, Scanner scanner) {

        System.out.println();
        String wordToCheck = InputProcessor.requestWord(scanner);

        boolean exists = dictionary.containsWord(wordToCheck);

        if (exists) {
            System.out.println("La palabra '" + wordToCheck + "' existe en el diccionario.");
        } else {
            System.out.println("La palabra '" + wordToCheck + "' no existe en el diccionario.");
        }
    }

    private static void showInitials(Dictionary dictionary) {

        System.out.println();
        System.out.println("Letras iniciales presentes en el diccionario:");

        System.out.println(dictionary.getInitials());
    }

    private static void showWordsByInitial(Dictionary dictionary, Scanner scanner) {

        System.out.println();
        char initial = InputProcessor.requestLetter(scanner);

        System.out.println("Palabras asociadas con '" + initial + "':");
        System.out.println(dictionary.getWordsByInitial(initial));
    }

    private static void exitProgram(Scanner scanner) {
        
        System.out.println("\nSaliendo del programa. Gracias por su visita.");

        scanner.close();
        System.exit(0);
    }
}
