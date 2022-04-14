package br.com.aula4.implementacao;

import br.com.aula4.beans.Motor;
import br.com.aula4.beans.Veiculo;

public class ExecutarVeiculo {
    public static void main(String[] args) {

        Veiculo fusca = new Veiculo();
        Veiculo kombi = new Veiculo();

        Motor motorVw = new Motor(90,4,"gasolina");
        Motor motorVw2 = new Motor(80,4,"gasolina");

        motorVw.ligar();
        motorVw.desligar();

        fusca.acelerar();
        fusca.setModelo("Fusca Itamar");
        fusca.setCategoria("Compact");
        fusca.setPlaca("ABC1234");
        fusca.setPortas(2);
        // precisa ter um obj MOTOR
        fusca.setMotorizacao(motorVw2);

        System.out.println("Usando o FUSCA:");
        System.out.println(fusca.getModelo() + " - " + fusca.getMotorizacao().getCombustivel() );
        System.out.println(fusca.getModelo() + " - " + fusca.getMotorizacao().toString() );

        kombi.setModelo("Kombi Surf");
        kombi.setMotorizacao(motorVw);
        System.out.println(kombi.getModelo() + " - " + kombi.getMotorizacao().toString());
    }
}
