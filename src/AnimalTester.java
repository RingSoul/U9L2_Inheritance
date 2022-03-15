public class AnimalTester {
    public static void main(String[] args) {
        // Animal tester
        Animal a = new Animal("Liked", 80, true, 123.3);
        a.adopt();
        a.feed();
        a.touch();
        System.out.println("Name: " + a.getName());
        System.out.println("Age: " + a.getAge());
        System.out.println("Vaccinated?: " + a.isVaccinated());
        System.out.println("Weight: " + a.getWeight());

        System.out.println("---------------------------------------");

        // Dog tester
        Dog d = new Dog("Doggy", 18, true, 98.3, "Undefined");
        System.out.println("Walked?: " + d.hasBeenWalked());
        d.walk();
        System.out.println("Now, walked?: " + d.hasBeenWalked());
        d.bark();
        System.out.println("Name: " + d.getName());
        System.out.println("Age: " + d.getAge());
        System.out.println("Vaccinated?: " + d.isVaccinated());
        System.out.println("Weight: " + d.getWeight());
        System.out.println("Again, walked?: " + d.hasBeenWalked());
        System.out.println("Dog type: " + d.getDogType());

        System.out.println("---------------------------------------");

        // Cat tester
        Cat c = new Cat("Kit", 19, false, 13.2, "Definedfeline");
        System.out.println("Played?: " + c.hasPlayedWith());
        c.play();
        System.out.println("Now, played?: " + c.hasPlayedWith());
        c.meow();
        System.out.println("Name: " + c.getName());
        System.out.println("Age: " + c.getAge());
        System.out.println("Vaccinated?: " + c.isVaccinated());
        System.out.println("Weight: " + c.getWeight());
        System.out.println("Again, walked?: " + c.hasPlayedWith());
        System.out.println("Dog type: " + c.getCatType());
    }
}
