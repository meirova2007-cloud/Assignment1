public class Adopter extends Person {
    private String phoneNumber;
    public Adopter(int id, String fullName, String phoneNumber) {
        super(id, fullName);   // constructor of Person
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void adoptPet(Pet pet) {
        if (!pet.isAdopted()) {
            pet.setAdopted(true);
            System.out.println(fullName + " adopted " + pet.getName());
        } else {
            System.out.println("Pet is already adopted.");
        }
    }
    @Override
    public String getRole() {
        return "Adopter";
    }
    @Override
    public String toString() {
        return "Adopter{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adopter)) return false;
        Adopter adopter = (Adopter) o;
        return this.getId() == adopter.getId();
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(getId());
    }
}
