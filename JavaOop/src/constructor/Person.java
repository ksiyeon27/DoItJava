package constructor;

public class Person {
    String name;
    private float height;
    float weight;

    public Person() {}

    public Person(String pname) {
        name = pname;
    }

    public Person(String pname, float pheight, float pweight){
        name = pname;
        height = pheight;
        weight = pweight;
    }

    public float getHeight(){
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
