//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Example 1

        int[] age = {12, 4, 5, 2, 5};

        System.out.println("Accessing Elements of an Array: ");
        System.out.println("First El: " + age[0]);
        System.out.println("Second El: " + age[1]);
        System.out.println("Third El: " + age[2]);
        System.out.println("Fourth El: " + age[3]);
        System.out.println("Fifth El: " + age[4]);


        //Example 2
        int[] ages = {29, 28, 25};

        System.out.println("Using for loop:");
        for (int i = 0; i < age.length; i++){
            System.out.println(ages[i]);
        }


    }
}