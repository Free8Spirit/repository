//Author: Vert, David   9/6/2018
package myclassroom;

public class MyClassroom {

    public static void main(String[] args) {
        
        NewKid student0 = new NewKid();
        student0.name = "Zero";
        student0.age = 21;
        student0.gender = "UNKNOWN";
        student0.food = "pizzas";
        
        NewKid student1 = new NewKid();
        student1.name = "Hachiman";
        student1.age = 17;
        student1.gender = "male";
        student1.food = "sandwiches";
        
        NewKid student2 = new NewKid();
        student2.name = "Touka";
        student2.age = 20;
        student2.gender = "ghoul";
        student2.food = "fingers";
        
        NewKid student3 = new NewKid();
        student3.name = "Kaneki";
        student3.age = 19;
        student3.gender = "half-ghoul";
        student3.food = "spare ribs";
        
        NewKid student4 = new NewKid();
        student4.name = "Lawliet";
        student4.age = 19;
        student4.gender = "detective";
        student4.food = "donuts";
        
        NewKid student5 = new NewKid();
        student5.name = "Kira";
        student5.age = 18;
        student5.gender = "shinigami";
        student5.food = "apples";
        
        NewKid student6 = new NewKid();
        student6.name = "Toradora";
        student6.age = 17;
        student6.gender = "tiger";
        student6.food = "rice balls";
        
        NewKid student7 = new NewKid();
        student7.name = "Stitch";
        student7.age = 626;
        student7.gender = "lab experiment";
        student7.food = "lollipop";
        
        NewKid student8 = new NewKid();
        student8.name = "Kaori";
        student8.age = 18;
        student8.gender = "lady";
        student8.food = "pickles";
        
        student0.introduce();
        student0.eat(8);
        
        student1.introduce();
        student1.eat(7);
        
        student2.introduce();
        student2.eat(6);
        
        student3.introduce();
        student3.eat(5);
        
        student4.introduce();
        student4.eat(4);
        
        student5.introduce();
        student5.eat(3);
        
        student6.introduce();
        student6.eat(2);
        
        student7.introduce();
        student7.eat(1);
        
        student8.introduce();
        student8.eat(0);
    }
    
}
