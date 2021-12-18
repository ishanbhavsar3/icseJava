import java.util.Scanner;

public class MakeString {
    public static void main(String[] args) {
        char[] data = {'C', 'O', 'M', 'P', 'U', 'T', 'E','R'};
        //prints the entire char array
        String st = new String(data);
        System.out.println(st);
        //prints index 1 & 2 ; OM is the output.
        st = new String(data, 1, 2);
        System.out.println(st);
        //prints index 3, 4, 5 ; PUT is the output.
        /*here, the string begins from 3,
        * and continues unto it reaches a total count of 3.
        */
        st = new String(data, 3, 3);
        System.out.println(st);

        byte[] value = {74, 65, 77, 69, 83, 32, 66, 79, 78, 68};
        //prints characters acc. to ASCII, output: JAMES BOND
        st = new String(value);
        System.out.println(st);
        //prints characters acc. to ASCII value, output: JAMES
        st = new String(data, 0, 5);
        System.out.println(st);
    }
}
