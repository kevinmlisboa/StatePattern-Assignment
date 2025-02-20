public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(2);
        
        // First transaction
        machine.selectItem();
        machine.insertCoin(1);
        machine.dispenseItem();
        System.out.println();

        // Insert without Selecting Item first
        machine.insertCoin(1);
        System.out.println();

        // Dispense without selecting
        machine.dispenseItem();

        //Selecting and dispensing without inserting
        machine.selectItem();
        machine.dispenseItem();
        System.out.println();

        // Second transaction
        machine.selectItem();
        machine.insertCoin(1);
        machine.dispenseItem();
        System.out.println();

        machine.selectItem();
        System.out.println();

        // Manually setting out of order
        machine.setOutOfOrder();
        System.out.println();

        machine.selectItem();
        System.out.println();

        machine.selectItem();
        machine.insertCoin(1);
        machine.dispenseItem();
    }
}
