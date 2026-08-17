public class stati {
    static String college = "abc";
    String name;

    public static void main(String[] args) {
        stati s1 = new stati();
        s1.name = "amit";
        stati s2 = new stati();
        s2.name = "vishal";
        System.out.println("s1 name is" + s1.name);
        System.out.println("s2 name is" + s2.name);
        System.out.println(stati.college);
    }

}