package bookpack;

public class Book{

    String titulo;
    String autor;
    int data;

    public Book(String x, String y, int z){

        titulo = x;
        autor = y;
        data = z;

    }

    public void showBook(){

        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(data);
        System.out.println();

    }

}