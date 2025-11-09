package org.example.models;

public class DeluxeBurger extends Hamburger {
    private String chips;
    private String drink;

    public DeluxeBurger() {
        super("Deluxe", "Sığır Eti", 19.10, "Beyaz Ekmek");
        this.chips = "Curvy";
        this.drink = "Coke";
    }

    public String getChips() {
        return chips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Deluxe Burger içerisine " + this.chips + " ve " + this.drink + " dahildir.");
        System.out.println("Toplam Deluxe Burger Ücreti: " + super.itemizeHamburger() + "$");
        return super.itemizeHamburger();
    }
}
