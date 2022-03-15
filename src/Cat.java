public class Cat extends Animal {
    private boolean playedWith;
    private String catType;

    public Cat(String name, int age, boolean vaccinated, double weight, String catType)
    {
        super(name, age, vaccinated, weight);
        this.playedWith = false;
        this.catType = catType;
    }

    public void play()
    {
        System.out.println("You had fun playing with cat.");
        playedWith = true;
    }

    public boolean hasPlayedWith()
    {
        return playedWith;
    }

    public void meow()
    {
        System.out.println("Meow meow, I'm a cat");
    }

    public String getCatType()
    {
        return catType;
    }
}
