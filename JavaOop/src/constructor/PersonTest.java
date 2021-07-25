package constructor;

public class PersonTest {
    public static void main(String[] args){
        Person personKim = new Person();
        personKim.name = "김유신";
        personKim.weight = 85.5f; //그냥 하면 double이라서 f단다나봐
        personKim.setHeight(182); //정수는 넣으면 알아서 해주나봐

        Person personLee = new Person("이순신", 175, 72);

        System.out.println(personLee.weight);
        System.out.println(personKim.getHeight());
    }
    
}
