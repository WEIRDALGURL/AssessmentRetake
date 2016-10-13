import java.util.ArrayList;

/**
 * Created by lrterry on 10/13/16.
 */
public class Question8 {
    // Copy the array list from the previous question to this one.
    // Iterate over the ArrayList and print out each element.
    public static void main(String[] args) {
        ArrayList<String> myCats = new ArrayList<>();
        myCats.add("Nemo");
        myCats.add("Psy");
        myCats.add("Spike");
        myCats.add("Lola");
        myCats.add("I need a new cat");

        for(int i = 0; i <myCats.size(); ++i)
        System.out.println(myCats.get(i));
    }

}

