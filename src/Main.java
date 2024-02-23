public class Main {
    public static void main(String[] args) {

        Finder find = new Finder();

        System.out.println(find.checkEvenOrOdd());

        System.out.println(find.checkAge());

        System.out.println(find.findLeapYear());

        find.findDayOfTheWeek();

        System.out.println(find.checkGrade());

        System.out.println("Max number:"+find.findMaxNumber());

        System.out.println(find.checkCharacter());

        System.out.println(find.findNumberOfDays());

        System.out.println(find.checkNumber());

        find.findTriangleType();
    }
}