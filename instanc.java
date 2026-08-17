public class instanc {
    int age;
    String name;

    public static void main(String[] args) {
        instanc s1 = new instanc();
        s1.age = 20;
        s1.name = "amit";
        instanc s2 = new instanc();
        s2.age = 30;
        s2.name = "vishal";
        System.out.println("age of s1 is" + s1.age + "name of s1 is" + s1.name);
        System.out.println("age of s2 is" + s2.age + "name of s2 is" + s2.name);

    }
}
