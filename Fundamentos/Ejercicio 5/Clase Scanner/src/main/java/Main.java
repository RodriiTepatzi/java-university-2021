import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe tu nombre:");
        var usuario = scanner.nextLine();
        System.out.println("Usuario = " + usuario);
        System.out.println("Escribe el titulo: ");
        var titulo = scanner.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
    }
}
