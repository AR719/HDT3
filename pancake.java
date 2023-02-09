import java.io.IOException;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Arrays;


public class pancake<E extends Comparable<E>> {

    public ArrayList<E> flip_array( ArrayList<E>  data, int i) {
        E temp;
        int beg = 0;
        while (beg < i) {
            temp = data.get(beg);
            data.set(beg,data.get(i));
            data.set(i, temp);
            beg++;
            i--;
         }
         return data;
        
    }

    public int find_index(ArrayList<E>  data,int n) {
        int max_ele, i;
        for (max_ele = 0, i = 0; i < n; ++i)
        ///my_arr[i]>my_arr[max_ele]
           if (data.get(i).compareTo(data.get(max_ele)) >0 ){
                max_ele = i;
           }
           
        return max_ele;
     }

     public  ArrayList<E> pancake_sort(ArrayList<E> arr,int n) {
        for (int curr_size = n; curr_size > 1; --curr_size) {
           int max_ele = find_index(arr,curr_size);
           if (max_ele != curr_size - 1) {
              arr=flip_array(arr,max_ele);
              arr=flip_array(arr,curr_size - 1);
           }
        }
        return arr;
     }

}
