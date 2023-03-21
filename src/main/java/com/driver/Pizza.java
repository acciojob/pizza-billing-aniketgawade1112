package com.driver;

public class Pizza {

    public int cheesePrice;

    public int basePrice;

    public int toppingPrice;

    public int paperBagPrice;

    public String bill;

    public int totalPrice;

    boolean isCheeseAdded;

    // NOTE: benefits of this variable
    // 1. It prevents duplicate addition of the cheese if called multiple times
    // 2. It also tells which all things have been added

    boolean isToppingsAdded;

    boolean isPaperBagAdded;

    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        // constructor is used to initialize the attributes of any class

        if (isVeg) {
            basePrice = 300;
            toppingPrice = 70;
        }
        else {
            basePrice = 400;
            toppingPrice = 120;
        }

        paperBagPrice = 20;
        cheesePrice = 80;

        isCheeseAdded = false;
        isToppingsAdded = false;
        isPaperBagAdded = false;


        totalPrice = basePrice;
        bill = "Base Price Of The Pizza: " + basePrice + "\n";

    }

    public int getPrice(){
        return totalPrice;
    }

    public void addExtraCheese() {

        if (!isCheeseAdded) {
            totalPrice = totalPrice + cheesePrice;
            isCheeseAdded = true;   // prevent it from adding again
        }
    }

    public void addExtraToppings(){

        if (!isToppingsAdded) {
            totalPrice = totalPrice + toppingPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){

        if (!isPaperBagAdded) {
            totalPrice = totalPrice + paperBagPrice;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){

        if (!isBillGenerated) {

            if (isCheeseAdded) {
                bill = bill + "Extra Cheese Added: " + cheesePrice + "\n";
            }

            if (isToppingsAdded) {
                bill = bill + "Extra Toppings Added: " + toppingPrice + "\n";
            }

            if (isPaperBagAdded) {
                bill = bill + "Paperbag Added: " + paperBagPrice + "\n";
            }

            bill = bill + "Total Price: " + totalPrice + "\n";

            isBillGenerated = true;
        }

        return bill;
    }
}
