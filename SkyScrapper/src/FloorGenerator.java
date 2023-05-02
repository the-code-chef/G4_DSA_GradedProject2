import java.util.Scanner;

public class FloorGenerator {

    int[] arr;
    int num;

    void insertFloors() {
        System.out.println("Enter the total no of floors in the building: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        arr = new int[num + 1];

        for (int i = 1; i <= num; i++) {
            System.out.println("Enter the floor size given on day : " + i);
            int n = sc.nextInt();
            arr[n] = i;
        }
        sc.close();
    }

    void calculateFloors() {
        int j = num;
        boolean flag;

        System.out.println("The order of construction is as follows");
        for (int i = 1; i <= num; i++) {
            flag = false;
            System.out.println("Day: " + i);
            while (j >= 1 && arr[j] <= i) {
                flag = true;
                System.out.print(j + " ");
                j--;
            }
            if (flag) {
                System.out.println();
            }
        }
    }
}
