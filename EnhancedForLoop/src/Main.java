class Box {
    private String contents;
    private int boxNum;

    Box(int num, String cont) {
        this.boxNum = num;
        this.contents = cont;
    }
    public int getBoxNum() {
        return this.boxNum;
    }
    public String toString() {
        return this.contents;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        for (int e : arr1) {
            System.out.print(e + " ");
        }
        System.out.print('\n');

        int sum = 0;
        for (int e: arr1) {
            sum += e;
        }
        System.out.println(sum);

        Box[] arr2 = new Box[5];
        arr2[0] = new Box(101, "Coffee");
        arr2[1] = new Box(202, "Computer");
        arr2[2] = new Box(303, "Apple");
        arr2[3] = new Box(404, "Banana");
        arr2[4] = new Box(505, "Desk");

        for (Box e : arr2) {
            if (e.getBoxNum() == 505) {
                System.out.println(e);
            }
        }
    }
}