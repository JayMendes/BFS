package bfs;

public class BFS {

    public static void main(String[] args) {
        
        Estado a = new Estado("a");
        Estado b = new Estado("b");
        Estado c = new Estado("c");
        Estado d = new Estado("d");
        Estado e = new Estado("e");
        
        //vizinhos do estado a
        a.addVizinhos(b);
        a.addVizinhos(c);
        
        //vizinhos do estado b
        b.addVizinhos(a);
        b.addVizinhos(c);
        
        //vizinhos do estado c
        c.addVizinhos(a);
        c.addVizinhos(b);
        c.addVizinhos(d);
        c.addVizinhos(e);
        
        //executar o algoritmo
        Algoritmo largura = new Algoritmo();
    }
    
}
