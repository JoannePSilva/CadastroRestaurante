package ATP37.view;

import ATP37.controller.PratosQuentesController;
import ATP37.controller.SobremesasController;
import ATP37.model.PratosQuentes;
import ATP37.model.Sobremesas;

public class Main {
    public static void main(String[] args) {
        PratosQuentesController pqc = new PratosQuentesController();
        SobremesasController sc = new SobremesasController();

        PratosQuentes pq = new PratosQuentes();
        pq.prato = "Massas";
        pq.massas = "Spaghetti";
        pq.sopas = "capeletti";
        pq.valor = 123.45;

        Sobremesas s = new Sobremesas();
        s.bolos = "Petit Gateau";
        s.sorvetes_especiais.artesanal = "Morango";
        s.sorvetes_especiais.natural = "leite";
        s.valor = 25.66;

        System.out.println(pq);
        pqc.create(pq);
        pqc.contains(pq);
        pqc.listar(pqc.read(pq));
        pqc.delete(pq);
        pqc.delete(pq);
        pqc.read(pq);
        pqc.update(pq);
        System.out.println(pq);

        System.out.println(s);
        sc.create(s);
        sc.contains(s);
        sc.listar(sc.read(s));
        sc.delete(s);
        sc.delete(s);
        sc.read(s);
        sc.update(s);
        System.out.println(s);



    }

}