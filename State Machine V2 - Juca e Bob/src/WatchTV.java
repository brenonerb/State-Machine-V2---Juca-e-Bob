import java.util.Random;

public class WatchTV extends AbstractState<Bob> {

    public WatchTV(Bob bob) {
        super(bob);
    }

    @Override
    public void enter() {
        System.out.println("Não tem nada pra fazer. Bob vai assistir TV!");
    }

    @Override
    public void execute() {
        Random rand = new Random();
        int TextToDisplay = rand.nextInt(0, 4); // RNG! O bound é o número que não vai passar.
            switch (TextToDisplay) {
            case 0: System.out.println("Bob disse que É HORA! DA! T! V!"); break;
            case 1: System.out.println("Bob pensa que finalmente é hora de maratonar One Piece de novo..."); break;
            case 2: System.out.println("Bob olha pra trás desesperado! Mas não tem nada pra fazer, então relaxa por enquanto..."); break;
            case 3: System.out.println("Um salgadinho dentro do sofá! Bob o come sem que ninguém desconfie."); break;
        }

        if (getCharacter().getFoodAtHome() < 5) getCharacter().setState(new Cooking(getCharacter()));
        else if (getCharacter().getFilth() > 10) getCharacter().setState(new Cleaning(getCharacter()));
    }

    @Override
    public void leave() { System.out.println("Bob tem trabalho à fazer!...");}
}
