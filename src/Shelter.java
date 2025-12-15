import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Shelter {
    private String shelterName;
    private String location;
    private List<Pet> pets;
    public Shelter(String shelterName, String location) {
        this.shelterName = shelterName;
        this.location = location;
        this.pets = new ArrayList<>();
    }
    public String getShelterName() {
        return shelterName;
    }
    public String getLocation() {
        return location;
    }
    public void showShelterInfo() {
        System.out.println("Shelter: " + shelterName + ", Location: " + location);
    }
    public void addPet(Pet pet) {
        pets.add(pet);
    }
    public Pet findPetById(int id) {
        for (Pet pet : pets) {
            if (pet.getId() == id) {
                return pet;
            }
        }
        return null;
    }
    public List<Pet> getAvailablePets() {
        List<Pet> result = new ArrayList<>();
        for (Pet pet : pets) {
            if (!pet.isAdopted()) {
                result.add(pet);
            }
        }
        return result;
    }
    public void sortPetsByAge() {
        pets.sort(Comparator.comparingInt(Pet::getAge));
    }
    public void showAllPets() {
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }
}
