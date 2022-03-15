package pl.kocan.state.pattern.homework;

import pl.kocan.state.pattern.homework.state.SlotMachine;

public class Main {

    public static void main(String[] args) {

        SlotMachine slotMachine = new SlotMachine();

        slotMachine.insertTheCoin();
        slotMachine.currentState();
        slotMachine.pushTheLever();
        slotMachine.currentState();
        slotMachine.collectTheWinnings();
        slotMachine.currentState();

    }
}
