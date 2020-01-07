import java.util.Scanner;

public class Species
{
    private String name;
    private int population;
    private double growthRate;

    public void readInput()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name of the species: ");
        this.name = keyboard.nextLine();
        System.out.println("Enter population of the species: ");
        this.population = keyboard.nextInt();
        System.out.println("Enter growthRate of the populaiton: ");
        this.growthRate =keyboard.nextDouble();

    }
    public void writeOutput()
    {
        System.out.println("name: "+ name);
        System.out.println("population: "+ population);
        System.out.println("GrowthRate: " + growthRate);
    }
    public int getPopulation(int counter)
    {
        int result = 0;
        double amountPopulation = population;
        int count = counter;
        while ((count >0)&&(amountPopulation >0))
        {
            amountPopulation = amountPopulation +((growthRate/100)*amountPopulation);
            count--;
        }
        if(amountPopulation >0)
            result =(int)amountPopulation;
        return result;

    }
    public void setSpecies(String newName, int newPopulation, double newGrowthRate)
    {
        name = newName;
        if(newGrowthRate >= 0)
            population = newPopulation;
        else
            System.out.println("Wrong parameter entered for population");
        growthRate = newGrowthRate;
    }
    public String getName()
    {
        return name;
    }
    public int getPopulation()
    {
        return population;
    }
    public double getGrowthRate()
    {
        return growthRate;
    }







}
