package SingleDimentionsArray;
// 1. In this program we will see how we can create an array.
// 2. How  we can create array using 'new' key word
// 3. What is the class type  of every array object
public class ArrayCreateationDemo2 {
    public static void main(String[] args) {
        // 1. In this program we will see how we can create an array.
        // 2. How  we can create array using 'new' key word
        int[] a = new int[3];

        // 3. What is the class type  of every array object
//        for every array type corresponding classes are available & these classes are part of java language & not
//        available to the programming level
        System.out.println(a.getClass()); // class [I , it means the class name for this array is 'class [I'
        System.out.println(a.getClass().getName()); // [I, it means the class name for this array is '[I'

        int[][] b = new int[3][2];
        System.out.println(b.getClass()); // class [I , it means the class name for this array is 'class [[I'
        System.out.println(b.getClass().getName()); // [I, it means the class name for this array is '[[I'

        // for double type array corresponding class
        double[] d = new double[4];
        System.out.println(d.getClass().getName());// [D,it means the class name for this array of type double is '[D'

        // for short type array  corresponding class
        short[] s = new short[4];
        System.out.println(s.getClass().getName());// [S,it means the class name for this array of type double is '[S'

        // for byte type array corresponding class
        byte[] bt = new byte[3];
        System.out.println(bt.getClass().getName());// [B,it means the class name for this array of type double is '[B'

        // for  boolean type array corresponding class
        boolean[] bool = new boolean[2];
        System.out.println(bool.getClass().getName());// [Z,it means the class name for this array of type double is '[Z'


    }
}
