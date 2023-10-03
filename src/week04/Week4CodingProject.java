package week04;

import java.util.Arrays;

public class Week4CodingProject {

    public static void main(String[] args) {
//1a
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        int arrayLength = ages.length;
        int result = ages[arrayLength - 1] - ages[0];
        System.out.println(result);

//1b
        int[] extendedAges = new int[arrayLength + 1];
        for (int i = 0; i < arrayLength; i++) {
            extendedAges[i] = ages[i];
        }
        int result2 = extendedAges[0] - extendedAges[arrayLength];
        System.out.println(result2);

//1c
        int sumAges = 0;
        for (int age : ages) {
            sumAges += age;
        }
        double averageAge = (double) sumAges / arrayLength;
        System.out.println(averageAge);

//2a&b
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        int totalLetters = 0;
        String concatenatedNames = "";
        for (String name : names) {
            totalLetters += name.length();
            concatenatedNames += name + " ";
        }
        double averageLetters = (double) totalLetters / names.length;
        System.out.println(averageLetters);
        System.out.println(concatenatedNames);

//3 You access the last element of an array using arrayLength - 1
        int lastElement = ages[arrayLength - 1];
        System.out.println(lastElement);

//4 You access the first element of the array using position 0
        int firstElement = ages[0];
        System.out.println(firstElement);

//5 This enhanced for loop iterates over the nameLengths array and prints out each name length to the console in String form
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }
        System.out.println(Arrays.toString(nameLengths));

//6 I used an enhanced for loop to add each length in nameLengths and added that to sumOfNameLengths.
        int sumOfNameLengths = 0;
        for (int length : nameLengths) {
            sumOfNameLengths += length;
        }
        System.out.println(sumOfNameLengths);
//7 I created the "concatenateWord" method outside of the main method so I could call on it within the main method, I used StringBuilder because it is mutable which is necessary because this method could have different strings passed through it to concatenate any number of times (n)    
        String word = "Hello";
        int n = 3;
        System.out.println(concatenateWord(word, n));
//8 returnFullName method created outside of main method, returns firstName, empty space, and last name
      String firstName = "Alex";
      String lastName = "Popovich";
      System.out.println(returnFullName(firstName, lastName));
//9  I used the isGreaterThan100 method I created below to determine if the sum of ages was greater than 100, which returned "true"
    System.out.println(isGreaterThan100(ages));
//10 I created a new array of doubles to pass in to my calculateAverage method and got back the average of the numbers within the array, in the method I iterated through each number in the array, added it to the sum, and divided it by the length of the array. The method also returns 0.0 for an empty array.
    double[] numbers2 = {11.1, 50.4, 9.9, 6.9, 200.0};
    System.out.println(calculateAverage(numbers2));
//11 This returns true because the method created determines only if array 1 is greater than array 2, it doesn't return WHICH is greater, even though that is a given because only 2 arguments are needed; also, I reused a method already created to determine the averages
    double[] array1 = {10.0, 5.5, 1.1};
    double[] array2 = {9.0, 1.1, 2.5};
    System.out.println(isAverageGreaterThan(array1, array2));
//12 This returns true because it is hot outside and there is more than 10.50 in pocket
    boolean isHotOutside = true;
    double moneyInPocket = 20.00;
    System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
//13 Will I pass class? This method determines whether I'll pass a class where the requirements are to be smart and to have a grade higher than 70.
    boolean isSmart = true;
    double grade = 70.1;
    System.out.println(willPassClass(isSmart, grade));
    }
    
//7 concatenateWord() method
    public static String concatenateWord(String word, int n) {
        if (n <= 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word);
        }
        return result.toString();
    }
//8 returnFullName() method
    public static String returnFullName(String firstName, String lastName) {
    	return firstName + " " + lastName;
    }
//9 isGreaterThan100() method
    public static boolean isGreaterThan100(int[] numbers) {
    	int sum = 0;
    	for (int num : numbers) {
    		sum += num;
    	}
    	return sum > 100;
    }
//10 calculateAverage() method
    public static double calculateAverage(double[] numbers2) {
    	if (numbers2.length == 0) {
    		return 0.0;
    	}
    	double sum = 0.0;
    	for (double num : numbers2) {
    		sum += num;
    	}
    	return sum / numbers2.length;
    }
//11 isAverageGreaterThan() method
    public static boolean isAverageGreaterThan(double[] array1, double [] array2) {
    	double average1 = calculateAverage(array1);
    	double average2 = calculateAverage(array2);
    	
    	return average1 > average2;
    }
//12 willBuyDrink() method
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    	return isHotOutside && moneyInPocket > 10.50;
    }
 //13 willPassClass() method
    public static boolean willPassClass(boolean isSmart, double grade) {
    	return isSmart && grade > 70.0;
    }
}
