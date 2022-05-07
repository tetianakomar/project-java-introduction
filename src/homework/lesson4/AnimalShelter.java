package homework.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnimalShelter {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number of cats: ");
        int catsNumber = Integer.parseInt(reader.readLine());
        System.out.println("Input number of dogs: ");
        int dogsNumber = Integer.parseInt(reader.readLine());
        int massOfPortion = 50;
        int portionsPrice = 2;
        int numberOfMeals = 3;
        int dayInMonth = 30;
        System.out.println("Cats food per month: " + calculatePetFood(massOfPortion, numberOfMeals, catsNumber, dayInMonth) + " gram");
        System.out.println("Dogs food per month: " + calculatePetFood(massOfPortion, numberOfMeals, dogsNumber, dayInMonth) + " gram");
        System.out.println("Price of pets food per month: " + calculateMonthsPrice(massOfPortion, numberOfMeals, portionsPrice, dayInMonth, catsNumber, dogsNumber) + " $");

    }

    public static int calculatePetFood(int massOfPortion, int numberOfMeals, int petsNumber, int dayInMonth) {
        return massOfPortion * numberOfMeals * petsNumber * dayInMonth;
    }

    public static int calculateMonthsPrice(int massOfPortion, int numberOfMeals, int portionPrice, int dayInMonth, int catsNumber, int dogsNumber) {
        return (catsNumber + dogsNumber) * massOfPortion * numberOfMeals * portionPrice * dayInMonth;
    }

}




