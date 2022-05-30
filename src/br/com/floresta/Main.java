package br.com.floresta;

import br.com.floresta.animal.Passaro;
import br.com.floresta.animal.Peixe;

public class Main {

    public static void main(String[] args) {

        Floresta floresta = Floresta.getInstancia();

        Peixe peixe = new Peixe();
        Passaro passaro = new Passaro();

        floresta.listarAnimais();

        floresta.addAnimal(passaro);
        floresta.addAnimal(peixe);

        floresta.moverAnimais();
    }
}
