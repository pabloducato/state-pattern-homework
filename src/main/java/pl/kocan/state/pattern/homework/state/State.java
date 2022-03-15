package pl.kocan.state.pattern.homework.state;

public interface State {

    void insertTheCoin(SlotMachine context);
    void pushTheLever(SlotMachine context);
    void collectTheWinnings(SlotMachine context);
    void currentState(SlotMachine context);
}
