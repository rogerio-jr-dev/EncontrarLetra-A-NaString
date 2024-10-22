package application;

import entities.BuscarLetra;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BuscarLetra bl = new BuscarLetra();

        try {
            System.out.print("Digite uma string: ");
            String letra = sc.nextLine();

            int count = bl.contarLetra(letra);

            if (count > 0) {
                System.out.printf("A letra 'a' (maiúscula ou minúscula) aparece %d vez(es) na string.", count);
            } else {
                System.out.println("A letra 'a' (maiúscula ou minúscula) não aparece na string.");
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            System.out.println(); // Pular linha
            System.out.println("Fim de programa, obrigado!");
            System.out.println("Desenvolvido por Rogério de Oliveira ");
            sc.close();
        }
    }


}
