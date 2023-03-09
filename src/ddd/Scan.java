package ddd;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = input.nextLine();
        System.out.println("Olá, " + nome);
        input.close();
    }
}
