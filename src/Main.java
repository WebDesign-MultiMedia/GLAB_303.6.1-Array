import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //Example 1
        System.out.println(" ");
        System.out.println("Example 1: ");
        int[] age = {12, 4, 5, 2, 5};

        System.out.println("Accessing Elements of an Array: ");
        System.out.println("First El: " + age[0]);
        System.out.println("Second El: " + age[1]);
        System.out.println("Third El: " + age[2]);
        System.out.println("Fourth El: " + age[3]);
        System.out.println("Fifth El: " + age[4]);



        //Example 2
        System.out.println(" ");
        System.out.println("Example 2: ");
        int[] ages = {29, 28, 25, 200};

        System.out.println("Using for loop:");
        for (int i = 0; i < ages.length; i++){
            System.out.println(ages[i]);
        }


        //Example 3
        System.out.println(" ");
        System.out.println("Example 3: ");
        String[] names = {"New York", "Dallas", "Las Vegas", "Florida"};

        for (String name : names){
            System.out.println(name);
        }




        //Example 4
        System.out.println(" ");
        System.out.println("Example 4: ");

        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 13};
        int sum = 0;
        double average;

        for (int number : numbers ){
            sum += number;
        }

        int arrayLength = numbers.length;

        average = ((double)sum / (double)arrayLength);
        System.out.println("sum = " + sum);
        System.out.println("Average = " + average);




        // Example 5
        System.out.println(" ");
        System.out.println("Example 5: ");

        int[] marks = {74, 43, 58, 60,90, 64, 70};
        int Sum = 0;
        int sumSq = 0;
        double mean, stdDev;

        for(int x = 0; x < marks.length; ++x){
            Sum += marks[x];
            sumSq += marks[x] * marks[x];
        }
        mean = (double) Sum/ marks.length;
        stdDev = Math.sqrt((double)sumSq / marks.length - mean * mean);

        System.out.printf("Mean is: %.2f%n", mean);
        System.out.printf("Standard deviation is: %.2f%n", stdDev);



        //Example 6
        System.out.println(" ");
        System.out.println("Example 6: ");

        int y, element;
        int[] arr = new int[11];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 10 Elements: ");
        for (y = 0; y < 10 ; y++) {
            arr[y] = scan.nextInt();
        }

        System.out.println("Enter an Element to Insert: ");
        element = scan.nextInt();
        arr[y] = element;

        System.out.println("\nNow the new array is: ");
        for ( y = 0; y < 11; y++) {
            System.out.println(arr[y] + " ");
        }

    }
}