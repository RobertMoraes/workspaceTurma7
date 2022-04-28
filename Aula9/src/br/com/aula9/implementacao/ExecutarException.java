package br.com.aula9.implementacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExecutarException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Dig VL1:");
            int vl1 = s.nextInt();
            System.out.println("Dig VL2:");
            int vl2 = s.nextInt();

            System.out.println("Divisão: " + vl1 / vl2);
        } catch (InputMismatchException ex) {
            System.out.println("Valor deve ser NUMERICO");
        } catch (ArithmeticException ex) {
            System.out.println("Não é possivel dividir por ZERO..");
        } catch (Exception ex) {
            System.out.println("Ocorreu erro...");
            System.out.println(ex.getClass());
            System.out.println(ex.getMessage());
        }


    }

}
