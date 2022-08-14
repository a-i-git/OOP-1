package Inheritance;

public class co_POLY {
    public static void main(String[] args) {
         class My_Class{
            void draw(){
                System.out.println("Draw a shape");
            }
        }
        class Circle extends My_Class{
            void draw() {
                System.out.println("Draw a circle ");
            }
        }
        class Triangle extends My_Class{
            void draw() {
                System.out.println("Draw a Triangle ");
            }
        }
        class Rectangle extends My_Class{
            void draw() {
                System.out.println("Draw a rectangle ");
            }
        }
        My_Class cl=new My_Class();
         cl.draw();
         Circle cr =new Circle();
         cr.draw();
        Rectangle re =new Rectangle();
        re.draw();
        Triangle tr =new Triangle();
        tr.draw();
        //The same method (draw) is used for 4 classes.
        //First My_class and then to the classes that inherit the that particular class.


    }
}
