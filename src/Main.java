import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*1.Write a Java program to test if the first and the last element of an array of
        integers are same. The length of the array must be greater than or equal to
        2 Test Data:
        array = 50, -20, 0, 30, 40, 60, 10*/
        ArrayList<Integer> firstLast = new ArrayList<>();
        int numbersToEnter;
        do {
            System.out.println("Enter a number or 999 to quit");
            numbersToEnter = input.nextInt();
            if(numbersToEnter!=999)
                firstLast.add(numbersToEnter);
            else if (firstLast.size()<2) {
                System.out.println("you need at least two numbers");
                numbersToEnter=0;
            }
        }while (numbersToEnter!=999);
        System.out.println((firstLast.getFirst()==firstLast.getLast()) ? "First and last are equals":"First and last are not equals");


        /*2.Write a Java program to find the numbers greater than the average of the
        numbers of a given array.*/
        ArrayList<Integer> allNumbers = new ArrayList<>();
        ArrayList<Integer> greaterAverage=new ArrayList<>();
        int allNumbersToEnter;
        int sum=0;

        do {
            System.out.println("Enter a number or 999 to quit");
            allNumbersToEnter = input.nextInt();
            if (allNumbersToEnter!=999){
                allNumbers.add(allNumbersToEnter);
                sum+=allNumbersToEnter;
            }
        }while (allNumbersToEnter!=999);
        int average = sum/allNumbers.size();
        for (int a : allNumbers){
            if(a>average)
                greaterAverage.add(a);
        }
        System.out.println("The average is: " +average);
        System.out.println("Numbers greater than average are: "+greaterAverage);

        /*3.Write a Java program to get the larger value between first and last
        element of an array of integers.*/
        ArrayList<Integer> greaterFirstLast=new ArrayList<>();
        int numbersGreaterFirstLast;

        do {
            System.out.println("Enter a number or 999 to quit");
            numbersGreaterFirstLast = input.nextInt();
            if(numbersGreaterFirstLast!=999)
                greaterFirstLast.add(numbersGreaterFirstLast);
        }while (numbersGreaterFirstLast!=999);

        System.out.println((greaterFirstLast.getFirst()>greaterFirstLast.getLast())? "Larger value between first and last element: "+greaterFirstLast.getFirst():"Larger value between first and last element: " +greaterFirstLast.getLast());


        /*4.Write a Java program to swap the first and last elements of an array and
        create a new array.*/
        System.out.println("How many numbers are in your array?");
        int arrayLimit= input.nextInt();
        int[] swappingArr= new int[arrayLimit];

        for (int i = 0; i < arrayLimit; i++) {
            System.out.println("Please enter a number");
            swappingArr[i]=input.nextInt();
        }
        int newFirst=swappingArr[arrayLimit-1];
        swappingArr[arrayLimit-1]=swappingArr[0];
        swappingArr[0]=newFirst;

        System.out.print("New array after swapping the first and last elements: ");
        for (int s : swappingArr)
            System.out.print(s + " ");
        System.out.println();

        /*5. Write a program that places the odd elements of an array before the
        even elements.*/

        ArrayList<Integer> oddEven = new ArrayList<>();
        oddEven.add(2);
        oddEven.add(3);
        oddEven.add(40);
        oddEven.add(1);
        oddEven.add(5);
        oddEven.add(9);
        oddEven.add(4);
        oddEven.add(10);
        oddEven.add(7);
        ArrayList<Integer>evens=new ArrayList<>();

        for (int i = 0; i < oddEven.size(); i++) {
            if(oddEven.get(i)%2==0){
                evens.add(oddEven.get(i));
            }
        }
        oddEven.removeAll(evens);
        oddEven.addAll(evens);
        System.out.println(oddEven);


        /*6. Write a program that test the equality of two arrays.*/
        int[] firstArr = {2,3,6,6,4};
        int[] secondArr = {2,3,6,6,4};
        boolean equals=true;
        for (int i = 0; i < firstArr.length; i++) {
            if(firstArr[i]!=secondArr[i]){
                equals=false;
                break;
            }
        }
        System.out.println((equals)?"They are equals":"They are not equals");
    }
}