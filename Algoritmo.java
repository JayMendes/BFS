package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class Algoritmo {

    Estado no_inicial, no_objetivo;

    public Estado bfs(Estado no_inicial) {

        Queue<Estado> fila = new LinkedList<>();                  //Fila
        ArrayList<Estado> explorados = new ArrayList<>();          //Lista de Explorados

        if (this.no_inicial.equals(no_objetivo)) {
            System.out.println(no_inicial);
        } else {
            fila.add(this.no_inicial);
            explorados.add(no_inicial);

            while (!fila.isEmpty()) {
                Estado atual = fila.remove();
                if (atual.equals(this.no_objetivo)) {
                    System.out.println(explorados);
                } else {
                    if (atual.getListaVizinhos().isEmpty());
                    System.out.println("Nao ha vizinhos");
                }
                explorados.add(atual);
            }

        }

        return no_inicial;
    }

}
