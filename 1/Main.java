import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Proszę podać swoje imię:");

        String name = input.next();

        System.out.println("Twoje imię to" + name);

        System.out.println("Proszę podać swój wiek: ");

        int age = input.nextInt();

        System.out.println("Twój wiek to: " + age);

        System.out.println("Proszę podać swoją pensję: ");

        double salary = input.nextDouble();

        System.out.println("Twoja pensja to:" + salary);
    }
}