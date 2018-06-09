//https://bbs.csdn.net/topics/390840879
public class SwapTest1 {
    public static void main(String[] args) {
        Integer a = 20;
        Integer b = 40;

        // 传递进去的是拷贝，方法内是将拷贝的值改变了
        // 但不影响原来的参数a 和 b
        // change(a,b);
        Integer temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

        a = 20;
        b = 40;
        //方法二:把值放在数组里面
        int[] arrNew = change(a, b);
        System.out.println("a = " + arrNew[0] + " b = " + arrNew[1]);
    }

    private static int[] change(int a, int b) {
        /*int[] arr = new int[2];
        int temp = a;
        a = b;
        b = temp;
        arr[0] = a;
        arr[1] = b;
        return arr;*/
//        我的方法
        return new int[]{b, a};
    }
}
