import org.w3c.dom.ls.LSOutput;

class Algebra{
    int a;
    int b;
    Algebra(int x, int y){
        System.out.println("Contructor of algebra class called");
        a = x;
        b = y;
    }
    int add(){

        return a + b;
    }
    int sub(){
        return a - b;
    }
    int product(){
        return a * b;
    }
}



public class Contructor {
    public static void main(String[] args) {
Algebra obj = new Algebra(7,9);
        System.out.println(obj.add());
        System.out.println(obj.product());
        System.out.println(obj.sub());

        Algebra obj_2 = new Algebra(2,5);
        System.out.println(obj_2.add());
        System.out.println(obj_2.sub());
        System.out.println(obj_2.product());
    }



}
