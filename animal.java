

public class animal {
    public static void main(String[] args) {
        puppy p= new puppy();
        p.eat();
        p.sound();
        p.cutesound();
    }
}
class animl{
    public void eat(){
        System.out.println("animal is eating");
    }
}
 class dog extends animl{

public void sound(){
    System.out.println("dog is barking");
}

    }

    class puppy extends dog{
        public void cutesound(){
            System.out.println("puppy make cute sound");
        }
    }

