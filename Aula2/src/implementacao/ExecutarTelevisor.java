package implementacao;

import beans.Televisor;

public class ExecutarTelevisor {
    public static void main(String[] args) {
        System.out.println("Usando a TV....");

        Televisor tv = new Televisor();

        //tv.setCanal(200);
        tv.ligar();
        tv.mostrarStatus();
        tv.aumentarVolume();
        tv.mostrarStatus();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.mostrarStatus();

        tv.aumentarCanal();
        tv.aumentarCanal();
        tv.mostrarStatus();
        tv.diminuirCanal();
        tv.diminuirCanal();
        tv.diminuirCanal();
        tv.diminuirCanal();

        tv.mostrarStatus();




    }
}
