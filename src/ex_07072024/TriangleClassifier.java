package ex_07072024;

import java.util.Scanner;

public class TriangleClassifier {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Three Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b && a == c && b == c) {
            System.out.println("Triangle is equilateral");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triangle is isosceles");
        } else {
            System.out.println("Triangle is scalene");
        }
    }
}
