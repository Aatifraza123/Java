class Student {
    int roll_no = 21;
    int roll_no1 = 22;
    String name_1 = "raza";
    String name = "Rohan";
}
    public class Main {
        public static void main(String[] args) {
            Student object1 = new Student();
            System.out.println(object1.roll_no);
            System.out.println(object1.name);

            Student object2 = new Student();
            System.out.println(object2.roll_no1);
            System.out.println(object2.name_1);
    }
}