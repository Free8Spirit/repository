//Author: Vert, David   9/6/2018
//sub
package myclassroom;

public class NewKid {
    String name;
    int age;
    String gender;
    String food;
    
    public void introduce() {
        System.out.printf("Hello, my name is %s, it is nice to meet you all. I am %d and a %s.\n", name, age, gender);
    }
    
    public void eat(int nuum) {
        System.out.printf("%s goes and sits at an empty desk and eats %d %s.\n", name, nuum, food);
    }
}
