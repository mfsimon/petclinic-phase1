package com.example.petclinic;

import com.example.petclinic.controller.OwnerController;
import com.example.petclinic.controller.PetController;
import com.example.petclinic.controller.VisitController;
import com.example.petclinic.controller.VetController;
import com.example.petclinic.model.Owner;
import com.example.petclinic.model.Pet;
import com.example.petclinic.model.Visit;
import com.example.petclinic.model.Vet;
import com.example.petclinic.repository.OwnerRepository;
import com.example.petclinic.repository.PetRepository;
import com.example.petclinic.repository.VisitRepository;
import com.example.petclinic.repository.VetRepository;
import com.example.petclinic.service.OwnerService;
import com.example.petclinic.service.PetService;
import com.example.petclinic.service.VisitService;
import com.example.petclinic.service.VetService;

import java.util.List;


public class PetClinicDriver {

    public static void main(String[] args) {

        testApp();

    }

    private static void testApp() {

        // Owner 3-Tier setup using manual dependency injection (DI)
        OwnerRepository ownerRepository = new OwnerRepository();
        OwnerService ownerService = new OwnerService(ownerRepository);
        OwnerController ownerController = new OwnerController(ownerService);

        // Pet 3-Tier setup using manual dependency injection (DI)
        PetRepository petRepository = new PetRepository();
        PetService petService = new PetService (petRepository);
        PetController petController = new PetController(petService);

        // Visit 3-Tier setup using manual dependency injection (DI)
        VisitRepository visitRepository = new VisitRepository();
        VisitService visitService = new VisitService(visitRepository);
        VisitController visitController = new VisitController(visitService);

        // Vet 3-Tier setup using manual dependency injection (DI)
        VetRepository vetRepository = new VetRepository();
        VetService vetService = new VetService(vetRepository);
        VetController vetController = new VetController(vetService);

        // Owner test data //

        // create our owners
        Owner owner1 = new Owner(1L, "Homer Simpson", "742 Evergreen Terrace", "Springfield", "9395550113");
        Owner owner2 = new Owner(2L, "Marge Simpson", "743 Evergreen Terrace", "Springfield", "9395550114");
        Owner owner3 = new Owner(3L, "Lisa Simpson", "744 Evergreen Terrace", "Springfield", "9395550115");
        Owner owner4 = new Owner(4L, "Bart Simpson", "745 Evergreen Terrace", "Springfield", "9395550116");

        // save owners to database
        ownerController.add(owner1);
        ownerController.add(owner2);
        ownerController.add(owner3);
        ownerController.add(owner4);

        // get all owners from database and display them
        List<Owner> owners = ownerController.getAll();
        display(owners);


        // Pet test data //

        // create our owners
        Pet pet1 = new Pet(1L, "Fluffy", "Dog", "breed1", "5", "M");
        Pet pet2 = new Pet(2L, "Buddy", "Cat", "breed2", "15", "F");
        Pet pet3 = new Pet(3L, "Gerbil", "Bird", "breed3", "25", "M");
        Pet pet4 = new Pet(4L, "Horath", "Unknown", "breed4", ".5", "F");

        // save owners to database
        petController.add(pet1);
        petController.add(pet2);
        petController.add(pet3);
        petController.add(pet4);

        // get all owners from database and display them
        List<Pet> pets = petController.getAll();
        display(pets);

        // Visit test data //

        // create Visits
        Visit visit1 = new Visit(1L, "8-1-19", "3:00 PM", "Bob", "Chris");
        Visit visit2 = new Visit(2L, "1-1-19", "1:00 PM", "Rob", "Samantha");
        Visit visit3 = new Visit(3L, "2-3-19", "12:00 PM", "Tammy", "Todd");
        Visit visit4 = new Visit(4L, "5-8-19", "10:00 AM", "Susie", "Smith");

        // save owners to database
        visitController.add(visit1);
        visitController.add(visit2);
        visitController.add(visit3);
        visitController.add(visit4);

        // get all owners from database and display them
        List<Visit> visits = visitController.getAll();
        display(visits);


        // Vet test data
        // create our vets
        Vet vet1 = new Vet(1L, "Susie", "123-456-7890", "Cats");
        Vet vet2 = new Vet(2L, "Bob", "234-567-8901", "People");
        Vet vet3 = new Vet(3L, "Bob", "345-678-9012", "People");
        Vet vet4 = new Vet(4L, "Rob", "456-789-0124", "Horses");

        // save owners to database
        vetController.add(vet1);
        vetController.add(vet2);
        vetController.add(vet3);
        vetController.add(vet4);

        // get all owners from database and display them
        List<Vet> vets = vetController.getAll();
        display(vets);

    }

    /**
     * Convenience method to display results
     *
     * @param obj
     */
    private static void display(Object obj) {

        if (obj instanceof List) {

            List<?> list = (List) obj;
            for (Object o : list) {
                System.out.println("\t" + o);
            }

        } else {

            System.out.println(obj);

        }

        System.out.println();
    }
}
