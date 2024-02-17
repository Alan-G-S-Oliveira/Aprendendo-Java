package exercicios.java.idade;

public class Idade {

    public int anos, meses, dias;

    Idade(int anos, int meses, int dias){

        this.anos = anos;
        this.meses = meses;
        this.dias = dias;

    }

    int converteEmDias(){

        return (anos * 365 + meses * 30 + dias);

    }
    
}
