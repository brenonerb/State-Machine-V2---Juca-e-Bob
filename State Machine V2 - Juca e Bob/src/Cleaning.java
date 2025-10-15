public class Cleaning extends AbstractState<Bob> {

    public Cleaning(Bob bob) {
        super(bob);
    }

    @Override
    public void enter() {
        System.out.println("Hora de Bob limpar!");
    }

    @Override
    public void execute() {
        getCharacter().addFilth(-5);
        System.out.println("Bob está limpando...");

        if (getCharacter().getFilth() <= 0) {
            if (getCharacter().getFoodAtHome() < 5) getCharacter().setState(new Cooking(getCharacter()));
            else getCharacter().setState(new WatchTV(getCharacter()));
        }
    }

    @Override
    public void leave() {
        System.out.println("Bob terminou a faxina! Bom trabalho, cara!");
    }
}
