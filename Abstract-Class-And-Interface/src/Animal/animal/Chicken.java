package Animal.animal;

import Animal.edible.Edible;

public class Chicken extends Animal implements Edible {

    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
