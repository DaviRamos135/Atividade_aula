public class Carro {

    String marca;
    String modelo;
    int ano;

    public Carro(String marca,String modelo,int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }


    public void exibirDetalhe() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Chevrolet", "Onix",2020);
        meuCarro.exibirDetalhe();
    }
    }

