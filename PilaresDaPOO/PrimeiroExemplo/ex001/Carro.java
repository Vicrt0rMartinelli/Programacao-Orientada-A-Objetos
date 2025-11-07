
package ex001;

public class Carro extends Veiculo{

    public void ligar (){
        //Encapsulamento
        conferirCombustivel();
        conferirCambio();
        System.out.println("Carro Ligado");
    }
    private void conferirCambio(){
        System.out.println("Conferindo Cambio em Neutro");
    }
    private void conferirCombustivel(){
        System.out.println("Conferindo COmbustivel");
    }

}
