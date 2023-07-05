package Exercicio2;

public class Retangulo extends Forma {
    private float lado;
    private float altura;

    //Contrutor
    public Retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return this.lado * this.altura;
    }

    @Override
    public float calcularPerimetro() {
        return 2 * (this.lado + altura);
    }
}
