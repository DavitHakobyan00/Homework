package classObject.animal;

class Animal {
     public String name;


    public static void main(String[] args) {
           Animal a1 = new Animal();
           Animal a2 = new Animal();
           Animal a3 = new Animal();
           a1.name = "Dog";
           a2.name = "Cat";
           a3.name = "Horse";

           System.out.println(a1.name);
           System.out.println(a2.name);
           System.out.println(a3.name);
    }
}
