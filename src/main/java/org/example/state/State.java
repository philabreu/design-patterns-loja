package org.example.state;

public abstract class State {
    Player player;

    /**
     * O contexto passa pelo construtor de estado. Isso pode ajudar um estado a buscar alguns dados
     * de contexto úteis, se necessário.
     */
    public State(Player player) {
        this.player = player;
    }

    public abstract String onLock();

    public abstract String onPlay();

    public abstract String onNext();

    public abstract String onPrevious();
}