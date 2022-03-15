public class Dog extends Animal {
    private boolean walked;
    private String dogType;

    public Dog(String name, int age, boolean vaccinated, double weight, String dogType)
    {
        super(name, age, vaccinated, weight);
        this.walked = false;
        this.dogType = dogType;
    }

    public void walk()
    {
        System.out.println("You just walked this dog.");
        walked = true;
    }

    public boolean hasBeenWalked()
    {
        return walked;
    }

    public void bark()
    {
        System.out.println("Bark bark, I'm a dog");
    }

    public String getDogType()
    {
        return dogType;
    }
}
