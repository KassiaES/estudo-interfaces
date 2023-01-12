package exercioFormas;

import exercioFormas.figuras.Circulo;
import exercioFormas.figuras.Quadrado;
import exercioFormas.figuras.Retangulo;
import exercioFormas.figuras.Triangulo;

public class Teste {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();
        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo(32,12,"Rosa");




        System.out.println(quadrado);
        System.out.println(triangulo);
        System.out.println(circulo);
        System.out.println(retangulo);

    }
}
