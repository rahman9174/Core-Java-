package SingleDimentionsArray;
// In this programm we will see, what are the rules we have to follow regarding
// array size,max array size in java, what type  of array we can create and etc.
public class ArrayRulesDemo3 {
    public static void  main(String[] args){
        // rule 1/ conclusion :
        //at  the time of array decleration, cumpulsurly specify the size of an array, otherwise will get compile
        // time error
        int[] x = new int[6]; // it is valid
        System.out.println(x.length);

//        int[] y = new int[]; // CE: array dimention missing error
//        System.out.println(y);

//        rule 2 / conclusion:
//        it is legal to have an array with size 0(zero)
        int[] z = new  int[0]; // it is valid with size 0(zero)
        System.out.println(z.length);// 0

//        rule 3 / conclusion:
//        if we want to specify the array size with negative will get run time exception 'NegativeArraySizeException'
//        int[] a = new int[-4];// RE: java.lang.NegativeArraySizeException
//        System.out.println(a.length);

//        rule 4 / conclusion:
//        TO specify array size, allowed data types are - byte, short , char, int
//            if we are trying  to specify any other type we will get compile time error
        int[] ab = new int[10];
        System.out.println(ab);
        int[] bc = new int['a']; // with the size 97, acsi of 'a'  is  97
        System.out.println(bc);
        byte b = 20;
        System.out.println(b);
        int[]  c = new int[b];
        System.out.println(c.length);
        short s = 30;
        System.out.println(s);
        int[] d = new int[s];
        System.out.println(d.length);
//        int[] dz = new int[10l]; // Runtime exception - incompatible type: possible lossy conversion from long to int

//        rule 5 / conclusion :
//        the maximum  allowed array size in java is '2147483647', which is a maximum value of int data type.
        int[] maxArrsize = new int[2147483647]; //case 1,
        System.out.println(maxArrsize.length);
//        int[] maxArSizeError = new int[2147483648]; //case 2 : CE : integer number too large: 2147483648
//        note : even in the case1 we may get runtime exception if sufficient memory is not
//               available 'java.lang.OutOfMemoryError: Requested array size exceeds VM limit'



    }
}
