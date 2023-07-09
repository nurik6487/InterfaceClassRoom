public class Parrot implements CanFly {
    private String name;
    private int age;

    public Parrot() {
    }

    public Parrot(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Parrot: " + "\n" +
                "name: " + name + "\n" +
                "age: " + age ;
    }

    @Override
    public void can() {
        System.out.println("The parrot can maneuver");
    }
}
