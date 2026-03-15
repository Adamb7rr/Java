import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String ADJECTIVE = "";
        String COLOR = "";
        String NOUN = "";
        String PLURAL_NOUN = "";
        String PERSONS_NAME = "";
        String PLACE = "";
        String ADVERB = "";
        String PLURAL_NOUN2 = "";
        String NOUN2 = "";
        String VERB = "";
        String PLURAL_NOUN3 = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("ADJECTIVE: ");
        ADJECTIVE = scanner.nextLine();
        System.out.print("COLOR: ");
        COLOR = scanner.nextLine();
        System.out.print("NOUN: ");
        NOUN = scanner.nextLine();
        System.out.print("PLURAL_NOUN: ");
        PLURAL_NOUN = scanner.nextLine();
        System.out.print("PERSONS_NAME: ");
        PERSONS_NAME = scanner.nextLine();
        System.out.print("PLACE: ");
        PLACE = scanner.nextLine();
        System.out.print("ADVERB: ");
        ADVERB = scanner.nextLine();
        System.out.print("PLURAL_NOUN: ");
        PLURAL_NOUN2 = scanner.nextLine();
        System.out.print("NOUN: ");
        NOUN2 = scanner.nextLine();
        System.out.print("VERB: ");
        VERB = scanner.nextLine();
        System.out.print("PLURAL_NOUN: ");
        PLURAL_NOUN3 = scanner.nextLine();
        scanner.close();

        System.out.println("One " + ADJECTIVE + " day, I was walking my "
                + COLOR + " pet " + NOUN + " when " + PLURAL_NOUN + " started flying from the sky! I called my friend "
                + PERSONS_NAME + " and she said one just landed right on her "
                + PLACE + " ! " + ADVERB + " , there was raining " + PLURAL_NOUN2 + " as well and they were just going everywhere! My " + NOUN2 + " started " + VERB + " and catching " + PLURAL_NOUN3 + " with his mouth to eat.");
    }
}