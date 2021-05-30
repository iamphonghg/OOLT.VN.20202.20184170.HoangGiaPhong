import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nhap vao chieu cao cua thap hinh sao: ");
        int numberOfStars = keyboard.nextInt();
        for (int i = 0; i < numberOfStars; i++) {
            for (int j = 0; j < 2 * numberOfStars; j++) {
                if (j < numberOfStars - i - 1) {
                    System.out.print(" ");
                } else if (numberOfStars - i - 1 <= j && j < numberOfStars + i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
