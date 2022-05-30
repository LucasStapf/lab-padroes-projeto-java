package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.strategy.*;

public class Main {

    public static void main(String[] args) {

        // Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento normalDefensivo = new ComportamentoDefensivo();
        Comportamento normalAgressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(normalAgressivo);
        robo.mover();
        robo.setComportamento(normalDefensivo);
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Lucas", "1234567");
    }
}
