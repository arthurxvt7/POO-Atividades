public class Quadrado {
    //Atributos da classe quadrado:
    double lado;
    double area;
    double perimetro;

    //Métodos
    //Método construtor
    Quadrado(double lado) {
        this.lado = lado;
        this.area = lado * lado;
        this.perimetro = lado * 4;
    }

    // Métodos próprios
    void calcularArea() {
        this.area = lado * lado;
    }

    void calcularPerimetro() {
        this.perimetro = lado * 4;
    }

    void imprimir() {
        System.out.println("Lado: " + lado);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}
}
