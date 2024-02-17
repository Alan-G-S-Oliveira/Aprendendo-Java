class Vehicle {

    private int passageiros, combustivel, consumo;

    Vehicle(int x, int y, int z){

        passageiros = x;
        combustivel = y;
        consumo = z;

    }

    void setpassageiros(int x) {

        passageiros = x;

    }

    void setcombustivel(int x) {

        combustivel = x;

    }

    void setconsumo(int x) {

        consumo = x;

    }

    int getpassageiros() {

        return passageiros;

    }

    int getcombustivel() {

        return combustivel;

    }

    int getconsumo() {

        return consumo;

    }

    int distancia() {

        return combustivel * consumo;

    }

    double combustivel_necessario(int x) {

        return ((double) x / consumo);

    }

}

class Truck extends Vehicle {

    public int carga;

    Truck(int w, int x, int y, int z){

        super(w, x, y);

        carga = z;

    }

    void setcarga(int x) {

        carga = x;

    }

    int getcarga() {

        return carga;

    }

}

public class TruckDemo {
    
    public static void main(String[] args) {
        
        Truck caminhão = new Truck(10, 8, 6, 76);

        System.out.printf("O caminhão tem %d passageiros.\n", caminhão.getpassageiros());
        System.out.printf("A carga do caminhão é de %d.\n\n", caminhão.getcarga());

    }

}
