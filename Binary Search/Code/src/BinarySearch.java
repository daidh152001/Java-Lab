
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TASS
 */
public class BinarySearch {

    ArrayList<Integer> li = new ArrayList<>();
    Validator check = new Validator();

    /**
     *
     */
    public void menu() {
        System.out.println("======= Binary Search ========");
        System.out.print("Enter number of array: ");
        int numOfArray = check.getInt(1, 100000);
        //sort array : ascending
        getRandomArray(numOfArray);
        Collections.sort(li);
        //print out array
        System.out.print("Sorted Array: ");
        System.out.println(li.toString());
        System.out.print("Enter search value: ");
        int value = check.getInt(-100000, 100000);
        int index = search(value);
        if (index == -1) {
            System.err.println("Can not find " + value + " in Array !");
        } else {
            System.out.println("Found " + value + " at index: " + index);
        }

    }

    /**
     *
     * @param size
     */
    public void getRandomArray(int size) {
        Random rd = new Random();
        for (int i = 0; i < size; i++) {
            li.add(rd.nextInt(100));
        }
    }

    /**
     *
     * @param value
     * @return index
     */
    public int search(int value) {

        int head = 0, tail = li.size() - 1;
        while (head < tail) {
            int mid = (head + tail) / 2;
            if (value == li.get(mid)) {
                return mid;
            } else if (li.get(mid) > value) {
                tail = mid - 1;
            } else {
                head = mid + 1;
            }
        }
        //if head == tail
        if (value == li.get(head)) {
            return head;
        }

        //if value not in array
        return -1;

    }

}
