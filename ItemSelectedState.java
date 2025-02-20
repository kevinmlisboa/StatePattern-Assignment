public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected.");
    }
    
    @Override
    public void insertCoin(VendingMachine machine, double amount) {
        System.out.println("Coin inserted: " + amount);
        machine.addBalance(amount);

        if (machine.hasSufficientBalance()) {
            System.out.println("Sufficient balance. Dispensing item...");
            machine.setState(new DispensingState());
        } else {
            System.out.println("Insufficient balance. Please insert more coins.");
        }
    }
    
    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Insert a coin first.");
    }
    
    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Vending machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}
