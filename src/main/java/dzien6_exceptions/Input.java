package dzien6_exceptions;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public int readNumber() {
        Scanner scanner = new Scanner(System.in);
        boolean active = true;
        int number = 0;

        try {
            System.out.println("wpisz numer");
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Pobrano litery nie można przekonwertować na tekst");
        }

        return number;
    }


//    public int readFile() {
//        Scanner scanner = new Scanner(new File(C:\Users\marci\IdeaProjects\JavaZaawansowane\src\main\java\dzien6_exceptions));
//        boolean active = true;
//        int number = 0;
//
//        try {
//            System.out.println("wpisz numer");
//            number = scanner.nextInt();
//        } catch (InputMismatchException e) {
//            System.out.println("Pobrano litery nie można przekonwertować na tekst");
//        }
//
//        return number;
//    }


//    public static void main(String[] args) {
//        Input input = new Input();
//        int number = input.readNumber();
//        System.out.println("Podano " + number);
//        System.out.println("................");
//
//        String fileText = s
//    }


}
