public class Pet {
    private int id;
    private String name;
    private String type;
    private int age;
    private boolean adopted;
    public Pet(int id, String name, String type, int age) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.age = age;
        this.adopted = false;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getAge() {
        return age;
    }
    public boolean isAdopted() {
        return adopted;
    }
    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }
    public boolean isSameAge(Pet other) {
        return this.age == other.age;
    }
    public void displayInfo() {
        System.out.println("Pet ID: " + id +
                ", Name: " + name +
                ", Type: " + type +
                ", Age: " + age +
                ", Adopted: " + adopted);
    }
    @Override
    public String toString() {
        return "Pet{id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", adopted=" + adopted +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return this.id == pet.id;
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

}
