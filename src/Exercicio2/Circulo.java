package Exercicio2;

public class Circulo extends Forma{
    private float raio;

    //Construtor
    public Circulo(float raio) {
        this.raio = raio;
    }
    @Override
    public float calcularArea() {
        return (float) (Math.PI * raio * raio);
    }

    @Override
    public float calcularPerimetro() {
        return (float) (2 * Math.PI * raio);
    }
}

