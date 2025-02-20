package SingleDimentionsArray;

public class ArrayShorthandRepresentationDemo4 {
    public static void main(String[] args) {
        // first we will see the decleration, creating and initilization
        int[] x; // decleration
        x = new int[3]; // array creation
        x[0] = 10; // initilization
        x[1] = 20; // initilization
        x[2] = 30; // initilization
        System.out.println(x[0]);

        // now we will see the shortcut representation of above code
        int[] arr = {10,20,30}; // this is the short hand representation of array decleration,creation and initilization
        System.out.println(arr[0]);

    }
}
