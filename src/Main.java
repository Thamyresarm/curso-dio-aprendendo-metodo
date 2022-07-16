import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite o nº 1: ");
        a = scan.nextInt();
        System.out.printf("Digite o n° 2: ");
        b = scan.nextInt();

        soma(a, b);
        subtracao(a, b);
        multiplicacao(a, b);
        divisao(a, b);

        //System.out.println("Hello world!");
    }

    public static void soma(int a, int b) {
        System.out.println("Soma " + (a + b));
    }

    public static void subtracao(int a, int b) {
        System.out.println("Subtração " + (a - b));
    }

    public static void multiplicacao(int a, int b) {
        System.out.println("Multiplicacao " + (a * b));
    }

    public static void divisao(double a, double b) {
        System.out.println("Divisao " + (a / b));
    }

}