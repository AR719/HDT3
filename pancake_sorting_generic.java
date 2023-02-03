import java.io.IOException;
import java.lang.Comparable;
import java.util.ArrayList;
public class pancake_sorting_generic <E extends Comparable<E>> {
    protected ArrayList<E> data;

    public ArrayList<E> StackArrayList(E[]  lista)

	{
		 data = new ArrayList<E>();
        for( E item :  lista){

            data.add(item);
        }
        return data;
	}
    
}
