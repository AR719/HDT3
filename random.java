import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

//https://springhow.com/java-write-csv/ copiado de
public class random {

    public static List<Integer> generateRandomArray(int n){
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();
        
        for (int i = 0; i < n; i++)
        {
            list.add(random.nextInt(1000));
        }
       return list;
    }  
    


public static void main(String[] args) throws IOException {
        
 
    FileWriter writer = new FileWriter("C:/Users/pablo/Desktop/Estructura de datos/Git/tarea3/random/valores.csv");

    List<Integer> test = generateRandomArray(3000);
    
    File file = new File("test.csv");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

       // bw.write("valores");
        bw.newLine();
        for(int i=0;i<test.size();i++)
        {
            bw.write(test.get(i+1)+","+test.get(i++));
            bw.newLine();
        }
      
        bw.close();
        fw.close();


}

}


