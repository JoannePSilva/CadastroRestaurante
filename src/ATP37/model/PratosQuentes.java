package ATP37.model;

public class PratosQuentes extends Menu{
    public String massas;
    public String sopas;

    @Override
    public String toString() {
        return super.toString() + "PratosQuentes" +
                "Massas: " + massas +
                "Sopas: " + sopas;
    }
}
