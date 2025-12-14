
import java.util.ArrayList;

public class IntroArrayList {

    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(6);
        // add method helps to add at the end of the list

        System.out.println(list);

        list.set(2, 78);
        // set method helps to edit value at in index

        System.out.println(list);

        list.remove(1);
        list.remove(2);
        // remove method removes value at index and shifts after index list towards left

        System.out.println(list);

        
    }
}