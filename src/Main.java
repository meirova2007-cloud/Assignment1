public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shelter shelter = new Shelter("Happy Paws Shelter", "Astana");

        System.out.print("Enter pet id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter pet name: ");
        String name = sc.nextLine();

        System.out.print("Enter pet type: ");
        String type = sc.nextLine();

        System.out.print("Enter pet age: ");
        int age = sc.nextInt();
        sc.nextLine();

        Pet pet = new Pet(id, name, type, age);
        shelter.addPet(pet);

        System.out.print("Enter adopter id: ");
        int adopterId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter adopter full name: ");
        String fullName = sc.nextLine();

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        Adopter adopter = new Adopter(adopterId, fullName, phone);

        Person person = adopter;
        System.out.println("Role: " + person.getRole());

        System.out.println("All pets:");
        shelter.showAllPets();

        System.out.println("Available pets BEFORE adoption:");
        System.out.println(shelter.getAvailablePets());

        System.out.println("Search by id:");
        System.out.println(shelter.findPetById(id));

        shelter.sortPetsByAge();
        System.out.println("After sorting by age:");
        shelter.showAllPets();
        adopter.adoptPet(pet);

        System.out.println("Available pets AFTER adoption:");
        System.out.println(shelter.getAvailablePets());

        sc.close();
    }
}
