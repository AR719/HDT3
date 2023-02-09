import java.io.IOException;
import java.lang.Comparable;
import java.util.ArrayList;
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
       int arr_len = arr.size();
       pancake pan = new pancake<>();
       pan.pancake_sort( arr,arr_len);
       System.out.println(arr);
       


    }
    
}
