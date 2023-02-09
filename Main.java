import java.io.IOException;
import java.lang.Comparable;
import java.util.ArrayList;
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  
public class Main {

    public static void main(String[] args) throws IOException {
        
        //System.in.read();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1); 
        arr.add(300); 
        arr.add(500);
        arr.add(5); 
        arr.add(120); 
        arr.add(99);  
        BufferedReader br = new BufferedReader(new FileReader("test.csv"));  
        String line;
        ArrayList<String>  employee = new ArrayList<>();
        while ((line = br.readLine()) != null)   //returns a Boolean value  
        {  
            employee.add(line);
       
       


        }

        for (int i = 0; i < employee.size(); i++){

        }
        employee.remove(",");


        
      int arr_len = employee.size();
       pancake pan = new pancake<>();
       pan.pancake_sort(employee,arr_len);
       System.out.println(employee);

    
}

}
