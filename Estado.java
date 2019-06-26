package bfs;

import java.util.ArrayList;
import java.util.List;

public class Estado {
    private String nome;
    private Boolean visitados;
    private List<Estado> listaVizinhos;

    public Estado(String nome) {
        this.nome = nome;
        this.visitados = false;
        this.listaVizinhos = new ArrayList<>();
    }
    
    

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getVisitados() {
        return visitados;
    }

    public void setVisitados(Boolean visitados) {
        this.visitados = visitados;
    }

    public List<Estado> getListaVizinhos() {
        return listaVizinhos;
    }

    public void setListaVizinhos(List<Estado> listaVizinhos) {
        this.listaVizinhos = listaVizinhos;
    }
    
    public void addVizinhos(Estado vizinho) {
        this.listaVizinhos.add(vizinho);
    }

   
}
