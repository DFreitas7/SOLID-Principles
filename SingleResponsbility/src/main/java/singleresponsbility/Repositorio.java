package singleresponsbility;

import java.util.HashMap;

public class Repositorio<T> {
    private final HashMap<Integer, T> objetos;
    private static Repositorio instancia = null;
    
    public Repositorio() {
        this.objetos = new HashMap<>();
    }
    
    public static Repositorio getInstance() {
        if (instancia == null) {
            instancia = new Repositorio();
        }
        
        return instancia;
    }
    
    public T insert(T objeto) {
        return objetos.put(objeto.toString().hashCode(), objeto);
    }
    
    public T find(String key) {
        return objetos.get(key.hashCode());
    }
    
    public void list() {
        for (Integer key : objetos.keySet()) {
            System.out.println(key+": "+ objetos.get(key.hashCode()));
        }
    }
    
    public T delete(String key) {
        return objetos.remove(key.hashCode());
    }
}
