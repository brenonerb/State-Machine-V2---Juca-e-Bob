public class Juca {
    private int hunger = 0;
    private int fatigue = 0;

    private Bob bob;
    public Juca(Bob bob) {
        this.bob = bob;
    }

    public Bob getBob() {
        return bob;
    }

    // Variável de estados do Juca, que alterna à partir do setState()
    private State state = new Working(this);

    // Funções que são chamadas sempre que precisar pegar algum status do Juca
    public int getHunger() {
        return hunger;
    }
    public int getFatigue() {
        return fatigue;
    }

    // Adiciona aos estados sempre que essas funções são chamadas
    public void addHunger(int hunger) {
        this.hunger += hunger;
        this.hunger = Math.max(this.hunger, 0);
    }

    public void addFatigue(int fatigue) {
        this.fatigue += fatigue;
        this.fatigue = Math.max(this.fatigue, 0);
    }

    // Executa o estado
    public void update() {
        state.execute();
        printStats();
    }

    public void printStats() {
        System.out.println("Status do Juca:");
        System.out.println("Cansaço: " + getFatigue() + " | Fome: " + getHunger());
    }

    public void setState(State NewState) {
        this.state.leave();
        this.state = NewState;
        state.enter();
    }
}
