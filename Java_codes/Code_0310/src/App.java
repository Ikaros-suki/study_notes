
public class App {
    public static void main(String[] args) throws Exception {
        Person wang = new Student();
        wang.getTarget();

        Object Li = new Student();
        System.out.println(Li.equals(wang));

        Object stu1 = wang;
        System.out.println(stu1.equals(wang));

        
    }
}
