package BasicConcepts;

import java.util.Arrays;

public class ArrayAndList {
  public static void main(String[] args) {
    int[] intArray = new int[5]; // [0, 0, 0, 0, 0]
    System.out.println(Arrays.toString(intArray)); // NOTE: sout(array) returns an object hash. Arrays.toString() is needed for output
    intArray[4] = 185; // [0, 0, 0, 0, 185]   <-- remember that position 4 is the fifth because of zero
    // intArray[5] = 70;   <-- throws error: we cannot set 6th position on 5 length array
    int[] intArray2 = {1, 2, 3, 4}; // [1, 2, 3, 4]
    System.out.println(Arrays.toString(intArray2));
    // intArray = {1, 2, 3, 4}   <-- throws error: you cannot overwrite an existing array like this. Use for loop if you want to overwrite each

    String[] stringArray = new String[5]; // [null, null, null, null, null]
    System.out.println(Arrays.toString(stringArray));
    // NOTE: String & Object default null, boolean false, int 0
  }
}

// similarities to JavaScript:
// + .length

// differences:
// + type enforcement available within array - int, String, any
// - no implicit addition to new position with nulls filled in between.
// - cannot override array with new array
