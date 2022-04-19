import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Tiree");
        scottishIslands.add("Jura");
        scottishIslands.add("Islay");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");
        scottishIslands.add("Coll");

//        1. Add "Coll" to the end of the list

//        2. Add "Tiree" to the start of the list

//        3. Add "Islay" after "Jura" and before "Mull"

        // 1-3 can be completed using scottishIslands.add(INDEX, "");

//        4. Print out the index position of "Skye"

        System.out.println(scottishIslands.indexOf("Skye"));

//        5. Remove "Tresco" from the list by name

        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index

        scottishIslands.remove(5);

//        7. Print the number of islands in your arraylist

        System.out.println("Number of Scottish Islands: " + scottishIslands.size());

//        8. Sort the list alphabetically

        java.util.Collections.sort(scottishIslands);

//        9. Print out all the islands using a for loop

        for(int i=0; i < scottishIslands.size(); i++) {
            System.out.println(scottishIslands.get(i));
        }

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers

        for (int i=0; i < numbers.size(); i++) {
            if ((numbers.get(i)) % 2 == 0){
                System.out.println(numbers.get(i));
            }
        }

        // Could also solve by creating a NEW array list for evenNumbers and using evenNumbers.add(number). Then print evenNumbers.

//        2. Print the difference between the largest and smallest value

        Collections.sort(numbers);
        System.out.println(numbers.get((numbers.size() - 1)) - numbers.get(0));
        /*
        OR
        int maxNumber = Collections.max(numbers);
        int minNumber = Collections.min(numbers);
        System.out.println(maxNumber - minNumber);
         */

        System.out.println("");

//        3. Print true if the list contains a 1 next to a 1 somewhere
        for (int i = 0; i < numbers.size(); i++) {
            if ((numbers.get(i) == 1) && ((numbers.get(i+1) == 1) || (numbers.get(i-1) == 1))) {
                System.out.println(true);
            } else {
                System.out.println(numbers.get(i));
            }
        }
//        4. Print the sum of the numbers
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count
//          HINT - You will need to track the index throughout the loop

        int total = 0;
        System.out.println("actual numbers: " + numbers);
        for (int number : numbers){
            if (number == 13){
//                continue;
                // "continue" in an if statement basically means "skip this step"
                break;
            }
            total += number;
        }
        System.out.println(total);
// This solution works if we un-sort the ArrayList.
//          So [7, 13, 2] would have sum of 9.
    }

}
