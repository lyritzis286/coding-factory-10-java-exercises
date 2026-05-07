package gr.aueb.cf.ch6;

public class SwapWithArray {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int[] arr = {10, 20};

        swap(arr);
        System.out.println("arr[0] = " +arr[0] + "arr[1] = "+ arr[1]);

       // swap(a, b);
        //System.out.println("a : " + a + "b : "+ b);


    }

    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

    public static void swap(int[] arr) {
        if (arr == null) return;
        if (arr.length !=2) return;

      int tmp = arr[0];
      arr[0] = arr[1];
      arr[1] = tmp;
    }
}
