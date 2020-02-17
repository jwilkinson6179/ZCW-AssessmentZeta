package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    String name;
    ArrayList<Pet> list = new ArrayList<Pet>();

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;

        if(pets != null)
        {
            for (Pet animal : pets) {
                animal.setOwner(this);
                list.add(animal);
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet)
    {
        list.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet)
    {
        list.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return list.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngestAge = Integer.MAX_VALUE;
        for(Pet animal : list)
        {
            if(animal.getAge() < youngestAge)
            {
                youngestAge = animal.getAge();
            }
        }

        return youngestAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldestAge = 0;
        for(Pet animal : list)
        {
            if(animal.getAge() > oldestAge)
            {
                oldestAge = animal.getAge();
            }
        }

        return oldestAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge()
    {
        Integer sum = 0;

        for(Pet animal : list)
        {
            sum += animal.getAge();
        }

        Float average = Float.valueOf(sum) / Float.valueOf(list.size());
        return average;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return list.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets()
    {
        if(list.size() == 0)
        {
            Pet[] emptyList = new Pet[1];
            emptyList[0] = null;

            return emptyList;
        }

        Pet pets[] = new Pet[list.size()];
        pets = list.toArray(pets);

        return pets;
    }
}
