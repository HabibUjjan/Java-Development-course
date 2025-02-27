public class Main{
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Hamster();
        
        for (int i = 0; i < rodents.length; i++) {
            rodents[i].eat();
            rodents[i].sleep();
            rodents[i].sound();
            System.out.println();
        }
    }
}
