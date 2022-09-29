import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("nhạp sô hàng");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("nhạp sô cột");
        int col = Integer.parseInt(sc.nextLine());

        int[][] arr = new int[row][col];
        do {
            System.out.println("\n");
            System.out.println("***********MENU***********");
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. Hiển thị giá trị các phần tử mảng");
            System.out.println("3.In giá trị các phần tử nằm trên chéo chính, chéo phụ");
            System.out.println("4. . Sắp xếp mảng tăng dần theo cột");
            System.out.println("6. Thoát");

            System.out.println("Hãy chọn các số");
            int chose = Integer.parseInt(sc.nextLine());

            switch (chose) {
                case 1:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.print("Arr[" + i + "][" + j + "]");
                            arr[i][j] = Integer.parseInt(sc.nextLine());
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("Mảng Arr là: ");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.print("[" + arr[i][j] + "]" + "  ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:

                    int sum = 0;
                    int sum1 = 0;
                    if (col==row){


                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (i == j) {
                                System.out.print("[" + arr[i][j] + "]" + "  ");
                                sum += arr[i][j];
                            }
                        }
                    }
                    System.out.println("tổng chéo chính là :" + sum);
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (i + j == col - 1) {
                                System.out.print("[" + arr[i][j] + "]" + "  ");
                                sum1 += arr[i][j];
                            }
                        }
                    }
                    System.out.print("tổng chéo phụ là :" + sum1);
                    }else
                        System.out.print("row và col phải bàng nhau thì mới vuông đc, vi lòng nhập lại");
                    break;
                case 4:

                case 5:
                    System.exit(0);
            }
        }
        while (true);


    }
}