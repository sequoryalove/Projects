public class Pet {

    //private data fields
    private String name;

    //public Constructor(s)
    public Pet() {
        setName("Pet Name");
    }

    //public set or mutator method for every private data field
    public void setName(String newName) {
        name = newName;
    }

    //public get or accessor method for every private data field
    public String getName() {
        return name;
    }

    //public toString method that prints out all of the object state
    public String toString() {
        String output = "Pet information:\n";
        output += "Name: " + name;
        return output;
    }

    public static void main(String[] args) {

        Pet p1 = new Pet();
        System.out.println(p1.toString());
        System.out.println();

        Pet p2 = new Pet();
        p2.setName("Buster");
        System.out.println(p2.toString());
    }
}