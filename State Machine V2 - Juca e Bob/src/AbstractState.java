public abstract class AbstractState<C> implements State<C> {
    protected C character;

    // Estabeleça de que personagem estamos falando aqui
    public AbstractState(C character) {
        this.character = character;
    }

    // Chama o personagem estabelecido logo acima
    @Override
    public C getCharacter() {
        return character;
    }

    @Override
    public void enter() {
    }

    @Override
    public void leave() {
    }
}
