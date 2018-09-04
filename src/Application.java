import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int[] array= new int[10];
        array[1] = 12;
        array[2] = 5;
        array[3] = 9;
        array[4] = 22;
        array[5] = 16;

        System.out.println("Mang ban dau la: ");
        show_array(array);

        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap vao phan tu can chen:");
        int element = sc.nextInt();
        System.out.println("Nhap vao vi tri chen:");
        int index = sc.nextInt();
        if (index <= 1 && index >= array.length - 1) {
            System.out.println("Khong chen duoc phan tu vao mang!");
        } else {
            for (int i = array.length-1; i >=index; i--) {
                array[i] = array[i-1];
            }
            array[index] = element;
        }

        System.out.println("Mang sau khi chen la: ");
        show_array(array);
    }
    static void show_array(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t" + array[i]);
        }
    }
}
