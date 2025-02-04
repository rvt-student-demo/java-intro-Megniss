package lv.rvt;

public class Warehouse {
        private double capacity;
        private double balance;
    
        public Warehouse(double capacity) {
            this.capacity = Math.max(capacity, 0);
            this.balance = 0;
        }
    
        public double getBalance() {
            return balance;
        }
    
        public double getCapacity() {
            return capacity;
        }
    
        public double howMuchSpaceLeft() {
            return capacity - balance;
        }
    
        public void addToWarehouse(double amount) {
            if (amount > 0) {
                balance = Math.min(balance + amount, capacity);
            }
        }
    
        public double takeFromWarehouse(double amount) {
            if (amount > 0) {
                double taken = Math.min(amount, balance);
                balance -= taken;
                return taken;
            }
            return 0;
        }
    
        @Override
        public String toString() {
            return "balance = " + balance + ", space left " + howMuchSpaceLeft();
        }
}
