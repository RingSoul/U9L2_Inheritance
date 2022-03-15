public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private double weight;

    public Animal(String name, int age, boolean vaccinated, double weight)
    {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.weight = weight;
    }

    public void adopt()
    {
        System.out.println("This animal has been adopted.");
    }

    public void feed()
    {
        System.out.println("You just fed calories to this animal.");
    }

    public void touch()
    {
        System.out.println("The animal replies: STOP TOUCHING ME");
    }

    // Accessor methods
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public boolean isVaccinated()
    {
        return vaccinated;
    }
    public double getWeight()
    {
        return weight;
    }
}
