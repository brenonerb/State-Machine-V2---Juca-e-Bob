public class Main {
    public static void main(String[] args) {
        Bob bob = new Bob();
        Juca juca = new Juca(bob);
        while(true) {
            System.out.println("");
            System.out.println("==============================================================================");
            juca.update();
            System.out.println("");
            bob.update();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}