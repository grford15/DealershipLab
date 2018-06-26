public abstract class Person {

    private final String name;
    private final int age;
    private final int wallet;

    public Person(String name, int age, int wallet) {
        this.name = name;
        this.age = age;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWallet() {
        return wallet;
    }
}
