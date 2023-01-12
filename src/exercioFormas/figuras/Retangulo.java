package exercioFormas.figuras;

public class Retangulo extends Figura {

    //Atributos
    protected double lado1;
    protected double lado2;
    protected static double area;

    //Construtor
    public Retangulo(double lado1, double lado2, String cor) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.cor = cor;
    }
    public Retangulo() {
    }

    //Métodos
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double area() {
        area = lado1*lado2;
        return area;
    }


    @Override
    public String toString() {
        return "Retangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", cor='" + cor + '\'' +
                ", area=" + area +
                '}';
    }
}
