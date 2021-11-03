package ATP37.model;

public class Sobremesas extends Menu{
    public Sorvetes sorvetes_especiais;
    public String bolos;

    public Sobremesas(){
        this.sorvetes_especiais = new Sorvetes();
    }

    @Override
    public String toString() {
        return "\nSobremesas\n" +
                "Sorvetes:" + sorvetes_especiais +
                "Bolos='" + bolos;
    }
}
