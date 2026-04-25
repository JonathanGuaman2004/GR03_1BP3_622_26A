package ec.edu.epn;

enum Operation {
    ADD, SUBTRACT, MULTIPLICATION, DIVISION
}

public class Main {
    public static void main(String[] args) {
        String saludo = "Hola y Bienvenido" +
                "Esta es una pequeña app en la que se mostrará el funcionamiento de una mini calculadora";
        String despedida = "Gracias por usar esta app, espero que te haya sido de ayuda";

        System.out.println(saludo);
        operaciones();
        System.out.println(despedida);
        System.exit(0);
    }

    private static void operaciones() {
        System.out.println("Realizando operaciones...");
        imprimirResultado(Operation.ADD, 5, 3);
        imprimirResultado(Operation.SUBTRACT, 5, 3);
        imprimirResultado(Operation.MULTIPLICATION, 5, 8);
        imprimirResultado(Operation.DIVISION, 30, 3);
    }

    private static void imprimirResultado(Operation o, int x, int y) {
        calculator calc = new calculator();
        switch (o) {
            case ADD:
                System.out.println("Suma de " + x + " + " + y);
                calculando();
                System.out.println("Resultado de la suma de los números "+ x + " y "+ y+ " es de" + calc.addition(x, y));
                break;
            case SUBTRACT:
                System.out.println("Resta de " + x + " - " + y);
                calculando();
                System.out.println("Resultado de la resta de los números "+ x + " y "+ y+ " es de" + calc.subtraction(x, y));
                break;
            case MULTIPLICATION:
                System.out.println("Multiplicación de " + x + " * " + y);
                calculando();
                System.out.println("Resultado de la multiplicación de los números "+ x + " y "+ y+ " es de" + calc.multiplication(x, y));
                break;
            case DIVISION:
                System.out.println("Division de " + x + " / " + y);
                calculando();
                System.out.println("Resultado de la división de los números "+ x + " y "+ y+ " es de" + calc.division(x, y));
                break;
        }
        System.out.println("---------------------------------------------");
    }


    private static void calculando() {
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(10);
                System.out.print("\rCalculando " + i + "%");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nCarga completa ✔");
    }


}