public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Dispensing in progress. Please wait.");
    }
    
    @Override
    public void insertCoin(VendingMachine machine, double amount) {
        System.out.println("Cannot insert coins while dispensing.");
    }
    
    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Item dispensed. Returning to idle state.");
        machine.decreaseInventory();
        machine.transitionAfterDispense(); 

    }
    
    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Cannot change state while dispensing.");
    }
}
