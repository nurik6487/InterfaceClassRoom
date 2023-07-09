public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.setName("Sayrex");
        eagle.setAge(007);
        System.out.println(eagle);
        eagle.can();
        Parrot parrot = new Parrot();
        parrot.setName("Jeykob");
        parrot.setAge(6);
        System.out.println(parrot);
        parrot.can();
    }
}