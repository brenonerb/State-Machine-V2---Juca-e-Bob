public class Bob {
    private int filth = 0;
    private int foodAtHome = 0;

    // Variável de estados do Bob, que alterna à partir do setState()
    private State state = new WatchTV(this);

    // Funções que são chamadas sempre que precisar pegar algum status do Bob
    public int getFilth() {
        return filth;
    }
    public int getFoodAtHome() {
        return foodAtHome;
    }

    // Modifique os valores
    public void addFilth(int dirtValue) {
        this.filth += dirtValue;
        this.filth = Math.max(this.filth, 0); // Math.max evita valor negativo
    }

    public void addFoodAtHome(int food) {
        this.foodAtHome += food;
        this.foodAtHome = Math.max(this.foodAtHome, 0);
    }

    // Executa o estado
    public void update() {
        state.execute();
        printStats();
    }

    public void printStats() {
        System.out.println("Status do Bob:");
        System.out.println("Sujeira: " + getFilth() + " | Comida em casa: " + getFoodAtHome());
    }

    // Troca de estados
    public void setState(State NewState) {
        this.state.leave();
        this.state = NewState;
        state.enter();
    }
}
