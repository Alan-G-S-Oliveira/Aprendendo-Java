package exercicios.java.idade;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Idade myAge;

        try (Scanner ler = new Scanner(System.in)) {
            int dias, meses, anos;

            System.out.println("Digite sua idade (Dias/Meses/Anos):");
            dias = ler.nextInt();
            meses = ler.nextInt();
            anos = ler.nextInt();

            myAge = new Idade(anos, meses, dias);

            System.out.println("Sua idade em dias é: " + myAge.converteEmDias());

        }

    }

}
