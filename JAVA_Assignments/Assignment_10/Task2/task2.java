import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        System.out.println("Size: " + list.size());

        System.out.println("Item at index 2: " + list.get(2));

    }
}

//Output
// [10, 20, 30, 40]
// Size: 4
// Item at index 2: 30