public class Cooking extends AbstractState<Bob> {

    public Cooking(Bob bob) {
        super(bob);
    }

    @Override
    public void enter() {
        System.out.println("Hora de Bob cozinhar!");
    }

    @Override
    public void execute() {
        getCharacter().addFoodAtHome(2);
        getCharacter().addFilth(1);
        System.out.println("Bob está cozinhando...");

        if (getCharacter().getFoodAtHome() >= 10) {
            if (getCharacter().getFilth() > 10) getCharacter().setState(new Cleaning(getCharacter()));
            else getCharacter().setState(new WatchTV(getCharacter()));
        }
    }

    public void leave() {
        System.out.println("Bob terminou de cozinhar! Yummers!");
    }
}



