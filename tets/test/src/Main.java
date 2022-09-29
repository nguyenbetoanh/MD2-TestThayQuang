import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int tong = 0;
        do {
            System.out.println("\n");
            System.out.println("***********MENU***********");
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. Hiển thị giá trị các phần tử mảng");
            System.out.println("3. In giá trị các phần tử là số nguyên tố trong mảng");
            System.out.println("4. In giá trị max, min các phần tử trong mảng");
            System.out.println("5. Sắp xếp mảng giảm dần");
            System.out.println("6. Thoát");

            System.out.println("Hãy chọn các số");
            int chose = Integer.parseInt(sc.nextLine());

            switch (chose) {
                case 1:
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print("Arr[" + i + "]" + " ");
                        arr[i] = Integer.parseInt(sc.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("Mảng Arr là: ");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    break;
                case 3:
                    boolean check = false;
                    System.out.println("các sô nguyên tố");
                    for (int i = 0; i < arr.length; i++) {
                        check = false;
                        if (arr[i] >= 2) {
                            for (int j = 2; j <= arr[i]; j++) {
                                if (arr[i] % j == 0) {
                                    check = true;
                                    break;
                                }if (!check) {
                                    System.out.print(arr[i] + " ");

                            }

                        }
                        }
                    }
                    break;
                case 4:
                    int min = arr[0];
                    int max = arr[0];
                    for (int i = 0; i < arr.length; i++) {
                        if (max < arr[i]) {
                            max = arr[i];
                        }
                        if (min > arr[i]) {
                            min = arr[i];
                        }
                    }
                    System.out.println("Giá trị lớn nhất của mang là : " + max);
                    System.out.print("Giá trị nho nhất của mang là : " + min);

                    break;
                case 5:
                    int soSanh = 0;
                    System.out.println("mảng đc sắp xếp theo giảm dần");
                    for (int i = 0; i < arr.length - 1; i++) {
                        for (int j = 0; j < arr.length; j++) {
                            if (arr[i] > arr[j]) {
                                soSanh = arr[i];
                                arr[i] = arr[j];
                                arr[j] = soSanh;
                            }
                        }
                    }
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");

                    }
                    break;
                case 6:
                    System.exit(0);
            }

        }
        while (true);

    }

}