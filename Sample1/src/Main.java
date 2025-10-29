//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("삼각형의 밑변을 입력하세요: ");
        double base = input.nextFloat();

        System.out.print("삼각형의 높이를 입력하세요 ");
        double height = input.nextDouble();

        double area = (base * height) / 2;
        System.out.printf("삼각형의 넓이는 %.2f 입니다.%n", area);

    }
}