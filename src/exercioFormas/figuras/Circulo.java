package exercioFormas.figuras;

public class Circulo  extends Figura {

    protected double raio;
    protected double diametro;

    protected double area;

    public Circulo() {
        this.raio = raio;
        this.cor = cor;
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", diametro=" + diametro +
                ", area=" + area +
                ", cor='" + cor + '\'' +
                '}';
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return diametro;
    }

    public double area () {
        area = Math.PI * Math.pow(raio,2);
        return area;
    }

}
