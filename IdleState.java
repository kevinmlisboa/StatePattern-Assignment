public class IdleState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        if (machine.isOutOfStock()) {  
            System.out.println("Out of stock! Cannot select an item.");
            machine.setState(new OutOfOrderState());  
        } else {
            System.out.println("Item selected.");
            machine.setState(new ItemSelectedState());
        }
    }
    
    @Override
    public void insertCoin(VendingMachine machine, double amount) {
        System.out.println("Please select an item first before inserting a coin.");
    }
    
    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("No item selected. Cannot dispense.");
    }
    
    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Vending machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}
