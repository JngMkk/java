class Box {
    private String conts;

    Box(String cont) {
        this.conts = cont;
    }
    public String toString() {
        return conts;
    }
}

class Array1 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        double[] arr2 = new double[7];
        float[] arr3 = new float[9];

        System.out.println("배열 arr1의 길이: " + arr1.length);
        System.out.println("배열 arr2의 길이: " + arr2.length);
        System.out.println("배열 arr3의 길이: " + arr3.length);

        Box[] arr4 = new Box[5];
        System.out.println("length: " + arr4.length);

        arr4[0] = new Box("First");
        arr4[1] = new Box("Second");
        arr4[2] = new Box("Third");
        System.out.println(arr4[0]);
        System.out.println(arr4[1]);
        System.out.println(arr4[2]);
    }
}