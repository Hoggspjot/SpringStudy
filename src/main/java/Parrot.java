public class Parrot {
    private String name;

    public String getName() {
        return name;
    }

    public Parrot() {
        System.out.println("Вызов конструктора попугая");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot : "+ name;
    }
}
