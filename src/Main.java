import java.util.Random;
import java.util.Scanner;

public   class Main {
    public static void main(String args[]) {
        /*
        int [] array= {1};
        try {
            array[1] = 1;
        }catch (IndexOutOfBoundsException ex) {
            System.out.println("Вышли за пределы массива, максимальный индекс " + (array.length - 1));
        }finally {

            System.out.println("Блок всегда отработает");

        }
    }
} *//*
        int [] array= {1};
        try {
            throw  new MyException("Своё исключение");
        }catch (MyException ex) {
            System.out.println(ex.getMessage());
        }finally {

            System.out.println("Блок всегда отработает");

        }
    }
}
*//*
        Random random = new Random();
        int[] array = new int[5];
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            array[i] = random.nextInt(20);
            sum=sum + array[i];
            System.out.println( array[i]);
        } try {
                if (sum>=10)
                    throw new MyException("Сумма массива не может быть больше 10");
            }catch(MyException ex){
                System.out.println(ex.getMessage());
            }finally{

                System.out.println(sum);

            }
        }
    }
*//*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число детей мужика");
        Random random=new Random();
        int childCount = scanner.nextInt();
        Child[] children = new Child[childCount];
        for (int i = 0; i < children.length; i++) {
            children[i] = new Child(generateRandomString(), random.nextInt(50), random.nextBoolean());

        }
        Man man=new Man("Max", children);
        man.say();
    }
    public static String generateRandomString(){
                return " ";
    }
}
*//*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число детей мужика");
        Random random=new Random();
        int childCount = scanner.nextInt();

        Child[] children = new Child[childCount];
        for (int i = 0; i < children.length; i++) {
            children[i] = new Child(generateRandomString(), random.nextInt(50), random.nextBoolean());

        }
        Man man=new Man("Max", children);
        man.say();
    }
    public static String generateRandomString(){
        Random random=new Random();
        int n = 3;
        String[] array={"A", "B", "C", "D", "E", "F", "J", "K", "L", "M"};
        String result= " ";
        for (int i = 0; i <= n; i++) {
            result +=array[random.nextInt(array.length)];

        }
        return result;
    }
}
*/
        Man man = new Man("Max",32);
        System.out.println(man);
    }
}
Man@eed1f14

