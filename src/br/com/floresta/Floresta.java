package br.com.floresta;

import br.com.floresta.animal.Animal;

import java.util.LinkedList;
import java.util.List;

public class Floresta {

    private static Floresta instancia = new Floresta();

    private List<Animal> animais;

    private Floresta() {
        super();
        animais = new LinkedList<>();
    }

    public static Floresta getInstancia() {
        return instancia;
    }

    public void addAnimal(Animal animal) {
        animais.add(animal);
    }

    public void removerAnimal(Animal animal) {
        animais.remove(animal);
    }

    public void listarAnimais() {

        if (animais.isEmpty()) {
            System.out.println("Nenhum animal encontrado...");
            return;
        }

        for(Animal animal: animais) System.out.println(animal);
    }

    public void moverAnimais() {
        for(Animal animal: animais) animal.mover();
    }
}
