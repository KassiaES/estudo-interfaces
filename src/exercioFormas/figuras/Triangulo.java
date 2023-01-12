package exercioFormas.figuras;

public class Triangulo extends Figura {

    private double base;
    private double altura;

    private double area;

    public Triangulo() {
        this.base = getBase();
        this.altura = getAltura();
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", area=" + area +
                ", cor='" + cor + '\'' +
                '}';
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area () {
        area = (base*altura)/2;
        return area;
    }


}
