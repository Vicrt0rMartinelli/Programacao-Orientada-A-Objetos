package ex001;

public abstract class Veiculo {
    //herança, tirei o chassi da moto de do carro e coloquei ele no veiculo
    // Tem que colocar um "extends veiculo" nas classes carro e moto

    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public abstract void ligar();
}
