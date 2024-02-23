import Helper.Findlmpl;

import java.util.Scanner;

public class Finder implements Findlmpl {
    public String checkEvenOrOdd() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = input.nextInt();
        if (number % 2 == 0) {
            return "EVEN";
        } else return "ODD";
    }

    public String checkAge() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = input.nextInt();
        if (age >= 18) {
            return "You are an adult";
        } else if (age <= 0) {
            return "Enter a valid age";

        } else
            return "You are a minor";
    }

    public String findLeapYear() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year to check it's leap or not:");
        int year = input.nextInt();
        int remainder = year % 100;
        if (remainder % 4 == 0) {
            return "Leap year";
        } else return "It is not a leap year";
    }

    public int findDayOfTheWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of the week:");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter valid number!");
        }
        return day;
    }

    public String checkGrade() {
        char[] grades = {'A', 'B', 'C', 'D', 'F'};
        String[] messages = {"Excellent!", "Good job!", "Average!", "Needs improvement!", "Fail!"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade:");
        char grade = sc.next().charAt(0);
        for (int i = 0; i < grades.length; i++) {
            if (grade == grades[i]) {
                System.out.println("Your grade:" + grades[i]);
                System.out.println("Message:" + messages[i]);
            }

        }
        return "enter valid grade";
    }

    public int findMaxNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = input.nextInt();
        System.out.println("Enter 3rd number:");
        int num3 = input.nextInt();

        int max = 0;
        if (num1 > max) {
            max = num1;
        }
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;

    }

    public String checkCharacter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character:");
        char caracter = sc.next().charAt(0);
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
            return "vowel";
        }
        if (caracter == ';' || caracter == ',' || caracter == '=' || caracter == '"') {
            return "not vowel or consonant";
        } else return "consonant";

    }

    public int findNumberOfDays() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] monthNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of month:");
        int numberOfMonth = input.nextInt();
        for (int i = 0; i < monthNumber.length; i++) {
            if (numberOfMonth == monthNumber[i]) {
                System.out.println("Month:" + monthNumber[i]);
                System.out.println("Number of the days:" + numberOfDays[i]);
            }

        }
        return 0;
    }

    @Override
    public boolean checkNumber() {
        boolean isPositive = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if (number > 0) {
            isPositive = true;
            System.out.println("Entered number is positive");
        } else if (number < 0) {
            isPositive = false;
            System.out.println("Entered number is negative");
        } else return isPositive = false;
        return isPositive;
    }

    public String findTriangleType() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of left side:");
        int leftSide = sc.nextInt();
        System.out.print("Enter length of right side:");
        int rightSide = sc.nextInt();
        System.out.print("Enter length of down side:");
        int downSide = sc.nextInt();
        if (leftSide == rightSide && rightSide == downSide) {
            System.out.println("Triangle is equilateral");
        } else if ((leftSide == rightSide || rightSide == downSide || leftSide == downSide)){
            System.out.println("Triangle is isosceles");
        }
       else System.out.println("Triangle is scalene");


        return "";
    }
}
