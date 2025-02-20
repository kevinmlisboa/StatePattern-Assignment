public class VendingMachine {
    private VendingMachineState state;
    private Integer inventory;
    private Double balance;
    private final Double PRICE = 1.0; 
    
    public VendingMachine(Integer inventory) {
        this.inventory = inventory;
        this.balance = 0.0;
        this.state = new IdleState();
    }
    
    public void setState(VendingMachineState state) {
        this.state = state;
    }
    
    public void selectItem() {
        state.selectItem(this);
    }
    
    public void insertCoin(double amount) {
        state.insertCoin(this, amount);
    }
    
    public void dispenseItem() {
        state.dispenseItem(this);
    }
    
    public void setOutOfOrder() {
        state.setOutOfOrder(this);
    }

    public boolean isOutOfStock() {
        return inventory <= 0;  
    }
    
    public void decreaseInventory() {
        if (inventory > 0) {
            inventory--; 
        }
    }
    
    public int getInventory() {
        return inventory;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double amount) {
        this.balance += amount;
    }

    public void deductBalance() {
        if (balance >= PRICE) {
            balance -= PRICE;
        }
    }

    public boolean hasSufficientBalance() {
        return balance >= PRICE;
    }

    public void transitionAfterDispense() {
        if (isOutOfStock()) {
            setState(new OutOfOrderState());
        } else {
            setState(new IdleState());
        }
    }
}
