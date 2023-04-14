import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Problema3 {

    public static void main(String[] args) {

        try{

            BufferedWriter scriitor = new BufferedWriter(new FileWriter("output.txt"));
            scriitor.write("i like pizza");
            scriitor.close();

            BufferedReader cititor = new BufferedReader(new FileReader("output2.txt"));
            BufferedReader cititor2 = new BufferedReader(new FileReader("output.txt"));
            String linie1;
            String linie2 = cititor2.readLine(); // linia de la tastatura
            int k = 0;

            while((linie1 = cititor.readLine()) != null){
                if(linie1.equals(linie2)){
                    k++;
                }

            }
            System.out.println("Linia data de la tastatura se repeta de " + k + " ori in fisier");

            cititor.close();

        } catch (IOException e){
            e.printStackTrace();





        }
    }
}
