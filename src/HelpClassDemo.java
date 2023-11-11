import java.io.IOException;

class Help{

    char escolha;

    void showMenu(){

        System.out.println("Help on:");
        System.out.println("    1. if");
        System.out.println("    2. switch");
        System.out.println("    3. for");
        System.out.println("    4. while");
        System.out.println("    5. do-while");
        System.out.println("    6. break");
        System.out.println("    7. continue\n");
        System.out.print("Choose one (q to quit): ");

    }

    boolean isValid(char x){

        if(x >= '1' & x <= '7'){

            escolha = x;
            return true;

        }

        return false;

    }

    void helpOn(){

        switch (escolha) {
            case '1':
                
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement");
                break;
            case '2':
                
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("    case constant:");
                System.out.println("        statement sequence");
                System.out.println("    break;");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            case '3':
                        
                System.out.println("The for:\n");
                System.out.println("for(init; condition; iteration)");
                System.out.println("    statement");
                break;
            case '4':
                        
                System.out.println("The while:\n");
                System.out.println("while(condition) statement");
                break;
            case '5':
                        
                System.out.println("The do-while:\n");
                System.out.println("do {");
                System.out.println("    statement");
                System.out.println("} while(condition);");
                break;
            case '6':

                System.out.println("the break:\n");
                System.out.println("break; or break Label;");
                break;
            case '7':

                System.out.println("The continue:\n");
                System.out.println("continue; or continue Label;");
                break;

        }

        System.out.println();

    }

}

public class HelpClassDemo {
    
    public static void main(String[] args) throws IOException {

        Help x = new Help();
        char letra, ignore;

        sair:
            for( ; ; ){
                do{

                    x.showMenu();
                    letra = (char) System.in.read();

                    do{

                        ignore = (char) System.in.read();

                    } while(ignore != '\n');

                    if(letra == 'q')
                        break sair;

                } while(!x.isValid(letra));

                x.helpOn();
            }
        
    }

}
