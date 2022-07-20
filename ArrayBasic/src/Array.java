import java.sql.Struct;
import java.util.ArrayList;

public class Array {

    //Functions of an array
    //memory allocation
    //construct
    //insert
    //delete
    //print
    //search


    Integer [] data;
    int size;

    //constructor
    public Array(int size) {
        this.size = size;
        this.data = new Integer[size];
    }

    //insert at any position (begin, end, middle)
    //parameters(element, index)
    boolean insert(int index, int element) {
        //failure
        if(index < 0 || index >= this.size) {
            System.out.printf("Index out of bound. Array is of size = " + this.size);
            return false;
        }

        boolean success = false;

        for (int i = 0; i < this.size; i++) {
            if(this.data[i] == null) {
                success = true;
            }
        }
        if(!success) {
            System.out.println("Overflow! Array is already full.");
            return false;
        }

        //success

        //empty
        if(this.data[index] == null) {
            this.data[index] = element;
            return true;
        }

        //non-empty
        //array from the left of index should not change

        //if right side has space
        boolean canInsert = false;
        for (int i = index; i < this.size; i++) {
            if(this.data[i] == null) {
                canInsert = true;
            }
        }

        //homework : think of the cases.

        if(canInsert) {

        } else {

        }

        return false;
    }
}
