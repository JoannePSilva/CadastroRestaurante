package ATP37.model;

public class Menu extends Base_id{
    public String prato;
    public double valor;

    @Override
    public String toString() {
        return "Prato: " + prato + "| Valor=" + valor;
    }
}
