import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Species speciesFourthTry = new Species();
        System.out.println("enter number of years to project");
        Scanner keyboard = new Scanner(System.in);
        int numberOfYears = keyboard.nextInt();
//        speciesFourthTry.readInput();
//        speciesFourthTry.writeOutput();
//        int futurePoopulation = speciesFourthTry.getPopulation(numberOfYears);
//        System.out.println("in: "+ numberOfYears +" the population will be: " + futurePoopulation);

        speciesFourthTry.setSpecies("ox123", 10, 15);
        speciesFourthTry.writeOutput();
        int population = speciesFourthTry.getPopulation(numberOfYears);
        System.out.println("in: "+ numberOfYears +" the populatin will be: " + population);
        String name = speciesFourthTry.getName();
        int pop = speciesFourthTry.getPopulation();
        double g = speciesFourthTry.getGrowthRate();
        System.out.println("name: "+ name +" population: "+ pop +" growthrate: "+ g);


    }
}
