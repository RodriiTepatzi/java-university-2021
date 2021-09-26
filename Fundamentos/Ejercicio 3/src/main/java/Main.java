public class Main {
    public static void main(String[] args) {
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("Union = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j); // se realiza la suma de numeros
        System.out.println(i + j + usuario); // Evaluación de izq a derecha, realiza suma
        System.out.println(usuario + i + j); // contexto cadena, todo es una cadena
        System.out.println(usuario + (i + j)); // uso de paretensis modifican la prioridad de la evaluación
    }
}
