class Vehicle {

    int passageiros;
    int combustivel;
    int consumo;

    Vehicle(int x, int y, int z){

        passageiros = x;
        combustivel = y;
        consumo = z;

    }
    
    int distancia(){

        return combustivel * consumo;

    }

    double combustivel_necessario(int quilometros){

        return (double) quilometros / consumo;

    }
    
}

public class TesteClasses {

    public static void main(String[] args) {
        
        Vehicle minivan = new Vehicle(7, 34, 7);

        System.out.println("A minivan pode percorrer " + minivan.distancia() + " quilometros.");
        
        System.out.printf("É necessário %.2f litros para percorrer 20 quilômetros.\n"
        , minivan.combustivel_necessario(20));

    }

}