//Calcula o fatorial de um número inteiro de forma recursiva
class CalculaFatorial {

    int fatorial(int i){

        //Por definição fatorial de 0 é igual a 1
        if(i == 0)
            return 1;

        //Chamamos a recursão
        return fatorial(i - 1) * i;

    }

}

public class Fatorial {
    
    public static void main(String[] args) {
        
        CalculaFatorial fat = new CalculaFatorial();

        System.out.println(fat.fatorial(10));

    }

}
