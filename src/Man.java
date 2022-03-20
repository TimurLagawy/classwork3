public class Man {
    /*
    String name;
    Child[] children;

    Man(String name, Child[] children) {
        this.name = name;
        this.children = children;

    }

    void say() {
        System.out.println("My name is " + this.name +". And I have " + children.length + " children.");

        for (int i = 0; i < children.length; i++) {
            System.out.print(children[i].name + " " +children[i].age +" " +children[i].sex);
            System.out.println();

        }
    }
}
*//*
    String name;
    Child[] children;

    Man(String name, Child[] children) {
        this.name = name;
        this.children = children;

    }

    void say() {
        System.out.println("My name is " + this.name +". And I have " + children.length + " children.");

        for (int i = 0; i < children.length; i++) {
            if (children[i].age<18){


                System.out.print(children[i].name + " " +children[i].age +" " +children[i].sex);
        }
    }
}}
*/
    String name;
    int age;

    Man(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void say() {
        System.out.println("My name is " + this.name + ". And I am  " + age);
    }
}
