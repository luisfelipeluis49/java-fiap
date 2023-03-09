package ddd;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        float [] notas = new float[3];
        Scanner input = new Scanner(System.in);
        float avg = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a Nota " + (i + 1) + ": ");
            notas[i] = input.nextFloat();
            avg += notas[i];
        }

        avg /= notas.length;

        System.out.println("A média é: " + avg);

        input.close();
    }
}
