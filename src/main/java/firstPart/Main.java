package firstPart;

public class Main {
    public static void main(String[] args) {

        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.add(4);
        System.out.println(myHashSet);
        System.out.println("------------------------------------");

        myHashSet.remove(2);
        System.out.println(myHashSet);

        System.out.println("------------------------------------");

        myHashSet.forEach(System.out::println);

    }
}


