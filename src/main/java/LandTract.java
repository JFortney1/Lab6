
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jfortney
 */
class LandTract {

    int length, width;

    int area() {

        return length * width;

    }

    public String toString() {

        return "Length: " + length + " | Width: " + width + " | Area: " + area();

    }

}

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LandTract one = new LandTract();

        System.out.print("Please enter length of first tract: ");

        one.length = sc.nextInt();

        System.out.print("Please enter width of first tract: ");

        one.width = sc.nextInt();

        LandTract two = new LandTract();

        System.out.print("Please enter length of second tract: ");

        two.length = sc.nextInt();

        System.out.print("Please enter width of second tract: ");

        two.width = sc.nextInt();

        System.out.println(one);

        System.out.println(two);

        if (one.area() == two.area()) {

            System.out.println("The tracts are of equal size");

        } else {

            System.out.println("The tracts are not of equal size");

        }

    }

}
