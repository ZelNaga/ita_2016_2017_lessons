package lesson2.pets;

import sun.misc.Cache;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by asv on 01.12.16.
 */
public class MainInPets {

    public static void main(String[] args) {
        List<Pet> pets = new LinkedList();

        pets.add(new Rat());
        pets.add(new Fox());
        pets.add(new Cat());

        pets.forEach(Pet::makeVoice);
    }
}
