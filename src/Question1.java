import java.util.ArrayList;

/**
 * Created by lrterry on 10/13/16.
 */
public class Question1{
    public static void main(String[] args){
        // Create an array list with numbers 1 - 10
        // Print out size of array list

        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 1; i < 11; ++i)
            numList.add(i);
        System.out.println(numList.size());


    }

}