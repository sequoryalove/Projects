public class Pet {

    //private data fields
    private String name;
    private int age;
    private String type;

    //public Constructor(s)
    public Pet() {
        setName("Pet Name");
        setType("Animal");
        setAge(1);
    }
    public Pet(String newName, String newType, int newAge) {
        setName(newName);
        setType(newType);
        setAge(newAge);

    }
    //public set or mutator method for every private data field
    public void setName(String newName) {
        name = newName;
    }
    public void setAge(int newAge) {
        age = newAge;
    }
    public void setType(String newType) {
        type = newType;
    }
    //public get or accessor method for every private data field
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getType() {
        return type;
    }
    //public toString method that prints out all of the object state
    public String toString() {
        String output = "Pet information:\n";
        output += "Name: " + name + "\n";
        output += "Type: " + type + "\n";
        output += "Age: " + age + "\n";
        output += "Sound: " + speak();

        return output;
    }
    public String speak() {
        if (type.equalsIgnoreCase("Dog")) {
            return "Woof!";
        }
        else if (type.equalsIgnoreCase("Cat")) {
            return "Meow!";
        }
        else {
            return "The pet makes a sound.";
        }
    }
}