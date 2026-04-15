//import Scanner
package scanner;

import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {

        // See Learn the Part for the complete instructions.

        Scanner scanner = new Scanner(System.in);
        // set up scanner.

        System.out.println("Hello. What is your name?");
        String name = scanner.nextLine();
        // Pick up user's name and store it.

        // add new a line before asking next question.
        System.out.println(String.format("\nHi %s! I'm Javabot. Where are you from?", name));
        String home = scanner.nextLine();
        // Pick up user's home and store it.

        // add new a line before asking next question.
        System.out.println(String.format("\nI hear it's beautiful at %s! I'm from a place called Oracle", home));
        System.out.println("How old are you?");
        // Pick up age and store it.

        // add new a line before asking next question.
        System.out.println("So you're <age>, cool! I'm 400 years old.");
        System.out.println("This means I'm <divide 400 by age> times older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        // Pick up language and store it.

        // add new a line here.
        System.out.println("<language>, that's great! Nice chatting with you <name>. I have to log off now. See ya!");

        // close scanner.
        scanner.close();

    }
}
