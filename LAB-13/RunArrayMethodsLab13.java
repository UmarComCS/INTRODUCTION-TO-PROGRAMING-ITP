import java.util.Scanner;

public class RunArrayMethodsLab13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("++++++ Question # 1 +++++");
        System.out.print("Enter a Number  :         ");
        int num = read.nextInt();
        System.out.print("Enter the Size for Array  :         ");
        int lengthOfTheArrayToFindTheNumGreater = read.nextInt();
        int[] arr = new int[lengthOfTheArrayToFindTheNumGreater];
        arr = ArrayMethodsLab13.populateArray(arr);
        System.out.print("\nNumbers that are greater than " + num + " are these :  ");
        ArrayMethodsLab13.largerThanTheNumber(arr, num);
        System.out.println("\n++++++ Question # 2 +++++");
        System.out.print("Enter a Number  :         ");
        int numFor2nIndex = read.nextInt();
        System.out.print("Enter the Size for Array  :         ");
        int lengthOfTheArrayToFindThe2ndIndex = read.nextInt();
        int[] arrFor2ndIndex = new int[lengthOfTheArrayToFindThe2ndIndex];
        arrFor2ndIndex = ArrayMethodsLab13.populateArray(arrFor2ndIndex);
        System.out.println("\n2nd Index of the Number " + numFor2nIndex + " was found on index number : " + ArrayMethodsLab13.getSecondIndex(arrFor2ndIndex, numFor2nIndex));
        System.out.println("\n++++++ Question # 3 +++++");
        System.out.print("Enter a Number  :         ");
        int numToFindTheNthOccurence = read.nextInt();
        System.out.print("Enter the Occurrence  :         ");
        int occurence = read.nextInt();
        System.out.print("Enter the Size for Array  :         ");
        int lengthOfTheArrayToFindTheNthIndex = read.nextInt();
        int[] arrForNthIndex = new int[lengthOfTheArrayToFindTheNthIndex];
        arrForNthIndex = ArrayMethodsLab13.populateArray(arrForNthIndex);
        System.out.println("\nOccurence " + occurence + " of the Value " + numToFindTheNthOccurence + " in the entered Array is at Index Number " + ArrayMethodsLab13.getNthIndex(arrForNthIndex, occurence, numToFindTheNthOccurence));
        System.out.println("\n++++++ Question # 4 +++++");
        System.out.print("Enter the Size for the Array :        ");
        int lengthOfTheArrayForSmallLarge = read.nextInt();
        int[] arrayForSmallestAndLargest = new int[lengthOfTheArrayForSmallLarge];
        arrayForSmallestAndLargest = ArrayMethodsLab13.populateArray(arrayForSmallestAndLargest);
        System.out.print("\nType -- S for Smallest && L for Largest --- :        ");
        char typeOfValue = read.next().charAt(0);
        String type = "";
        if (typeOfValue == 'L') {
            type = "Largest";
        } else {
            type = "Smallest";
        }
        System.out.println("Index of the " + type + " Value in the Entered Array is at Index " + ArrayMethodsLab13.getSLIndex(arrayForSmallestAndLargest, typeOfValue));
        System.out.println("\n++++++ Question # 5 +++++");
        System.out.print("Enter the Size for Array  :         ");
        int lengthOfTheArrayToCountEvenOdd = read.nextInt();
        int[] arrForCountEvenOdd = new int[lengthOfTheArrayToCountEvenOdd];
        arrForCountEvenOdd = ArrayMethodsLab13.populateArray(arrForCountEvenOdd);
        ArrayMethodsLab13.countEvenOddIntegers(arrForCountEvenOdd);
        System.out.println("\n++++++ Question # 6 +++++");
        System.out.print("Enter the Size for Array  :         ");
        int lengthOfTheArrayToReverse = read.nextInt();
        int[] arrToBeReversed = new int[lengthOfTheArrayToReverse];
        arrToBeReversed = ArrayMethodsLab13.populateArray(arrToBeReversed);
        System.out.println("Printing the Reverse of the Entered Array...");
        ArrayMethodsLab13.copyReverseArray(arrToBeReversed, lengthOfTheArrayToReverse);
        System.out.println("\n++++++ Question # 7 +++++");
        System.out.print("Enter the Size for Array  :         ");
        int lengthOfTheArrayToManiuplate = read.nextInt();
        int[] arrToBeManiuplate = new int[lengthOfTheArrayToManiuplate];
        arrToBeManiuplate = ArrayMethodsLab13.populateArray(arrToBeManiuplate);
        System.out.print("\nElements at the Even Index of the Entered Arrays are these :  ");
        ArrayMethodsLab13.printElementsAtEvenIndex(arrToBeManiuplate);
        System.out.print("\nElements that are Even in the Entered Arrays are these :  ");
        ArrayMethodsLab13.printEvenElements(arrToBeManiuplate);
        System.out.print("\nPrinting Elements of the Entered Arrays in Reverse Order :  ");
        ArrayMethodsLab13.reversePrint(arrToBeManiuplate);
        System.out.println("\n++++++ Question # 8 +++++");
        System.out.print("Enter the Size for Integer Array  :         ");
        int lengthOfTheIntegerArrayToSort = read.nextInt();
        int[] intArrToSort = new int[lengthOfTheIntegerArrayToSort];
        intArrToSort = ArrayMethodsLab13.populateArray(intArrToSort);
        ArrayMethodsLab13.sortIArray(intArrToSort);
        System.out.print("\nEnter the Size for String Array  :         ");
        int lengthOfTheStringArrayToSort = read.nextInt();
        String[] strArrToSort = new String[lengthOfTheStringArrayToSort];
        strArrToSort = ArrayMethodsLab13.populateStringArray(strArrToSort);
        ArrayMethodsLab13.sortSArray(strArrToSort);
        System.out.print("\nEnter the Size for Double Array  :         ");
        int lengthOfTheDoubleArrayToSort = read.nextInt();
        double[] doubleArrToSort = new double[lengthOfTheDoubleArrayToSort];
        ArrayMethodsLab13.populateDoubleArray(doubleArrToSort);
        ArrayMethodsLab13.sortDArray(doubleArrToSort);
        System.out.println("\n++++++ Question # 9 +++++");
        System.out.print("\nEnter the Size for String Array  :         ");
        int lengthOfTheStringWord = read.nextInt();
        String[] word = new String[lengthOfTheStringWord];
        word = ArrayMethodsLab13.populateStringArray(word);
        System.out.print("Enter the Character you want to Find in the String :      ");
        char character = read.next().charAt(0);
        ArrayMethodsLab13.findStringByCharacter(word, character);
        System.out.println("\n++++++ Question # 10 +++++");
        System.out.print("\nEnter the Size for String Array  :         ");
        int lengthOfTheStringName = read.nextInt();
        String[] names = new String[lengthOfTheStringName];
        names = ArrayMethodsLab13.populateStringArray(names);
        System.out.print("Valid Names in the Entered String Arrays are these :       ");
        ArrayMethodsLab13.printValidNames(names);
        read.close();
    }
}
