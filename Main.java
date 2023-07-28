package OOP_Task_1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Owner owner = new Owner("Сергей");
        cat.setName("Барсик");
        cat.setAge(2);
        cat.setOwnerName(owner);
        cat.greet();
    }
}