package ATP37.controller;

import java.util.ArrayList;

public abstract class Base_controller<T> {
    ArrayList<T> pratos;

    public Base_controller() {
        this.pratos = new ArrayList<>();
    }
    //CRUD

    public void create(T p) {
        this.pratos.add(p);
    }

    public ArrayList<T> read(T p) {
        return this.pratos;
    }

    public void listar(ArrayList<T> pratos) {
        for (T t : pratos) {
            System.out.println(t);
        }
    }

    public boolean contains(T p) {
        return this.pratos.contains(p);
    }

    public void update(T p) {
        if (contains(p)) {
            this.delete(p);
            this.create(p);
        }

    }

    public void delete(T p) {
        this.pratos.remove(p);
    }
}


