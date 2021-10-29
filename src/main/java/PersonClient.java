public class PersonClient {
    public static void main(String[] args) {
        // Write some very very basic testing code here
        // Create a Person and then call each of the
        // methods on the Person

        Student s = new Student("Nathan", "Lin", 2025);
        Student s2 = new Student("Nathan", "Lin");
        Student s3 = new Student();
        NinthGrader n = new NinthGrader();
        System.out.println(n);
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);

    }
}