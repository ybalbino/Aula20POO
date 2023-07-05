package Exercicio2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Declarando o Array de 5 dimenções
        Forma[] formas = new Forma[5];

        //Random está sendo para criar um numero de determminada forma para ser atribuido do Array.
        Random random = new Random(3);

        //Criando for para percorrer o Array
        for (int i = 0; i < formas.length; i++){
            int tipoForma = random.nextInt();
            if (tipoForma == 0){
                float lado = random.nextFloat()*10;
                float altura = random.nextFloat()*10;
                formas[i] = new Retangulo(lado,altura);
            } else if (tipoForma == 1) {
                float raio = random.nextFloat()*10;
                formas[i] = new Circulo(raio);
            }else {
                float lado = random.nextFloat()*10;
                formas[i] = new Quadrado(lado);
            }
        }
        for (Forma forma : formas){
            float area = forma.calcularArea();
            float perimetro = forma.calcularPerimetro();

            System.out.printf("Área: %.2f\n", area);
            System.out.printf("Perimetro: %.2f\n" , perimetro);

        }
    }
}
