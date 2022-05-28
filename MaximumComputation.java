package max.com;

public class MaximumComputation {
    public static void findMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer maximumNumber;

        if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
            maximumNumber = firstNumber;
        }
        else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
            maximumNumber = secondNumber;
        }
        else {
            maximumNumber = thirdNumber;
        }

        System.out.println("The maximum number is: " + maximumNumber);
    }


    public static void main(String[] args) {

        System.out.println("----- Welcome To Computing Maximum Of Three Numbers Using Java Generics ------");

        Integer firstNumber = 15, secondNumber = 20, thirdNumber = 25;
        findMaximum(firstNumber, secondNumber, thirdNumber);

    }

}
