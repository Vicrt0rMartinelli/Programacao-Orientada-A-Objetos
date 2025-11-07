package ex001;

public class Autodromo {
    static void main(String[] args) {
        Carro BmwM3 = new Carro();
        BmwM3.setChassi("90uf8e8f");
       // BmwM3.ligar();

        Moto Cbr1000RR = new Moto();
       // Cbr1000RR.ligar();
        Cbr1000RR.setChassi("niauyd7iadi");

        Veiculo coringa = Cbr1000RR;
        coringa.ligar();


    }
}
