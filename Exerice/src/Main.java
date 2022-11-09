import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int CUR_YEAR = 2022;
        System.out.print("Enter Your BirthYear : ");
        int birthYear = scan.nextInt();
//        System.out.println("The Number you entered is :  " + birthYear);
        final int DATE = CUR_YEAR - birthYear;

        System.out.println("Your Age Is :-  " + DATE);
    }
}