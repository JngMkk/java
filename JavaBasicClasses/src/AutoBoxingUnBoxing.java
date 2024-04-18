public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        Integer iObj = 10;      // Auto Boxing
        Double dObj = 3.14;     // Auto Boxing
        System.out.println(iObj);
        System.out.println(dObj);
        System.out.println();

        int num1 = iObj;        // Auto Unboxing
        double num2 = dObj;     // Auto Unboxing
        System.out.println(num1);
        System.out.println(num2);
    }
}
