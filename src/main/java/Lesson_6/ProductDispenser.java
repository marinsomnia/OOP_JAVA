package Lesson_6;

public class ProductDispenser {
    private HotDrink hotDrink;

    public ProductDispenser(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public void dispense() {
        System.out.println("Take your beverage " + hotDrink.getName());
    }
}