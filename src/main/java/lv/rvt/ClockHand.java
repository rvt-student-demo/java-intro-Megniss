package lv.rvt;

public class ClockHand {
        private int value;
        private int limit;
    
        public ClockHand(int limit) {
            this.limit = limit;
            this.value = 0;
        }
    
        public void advance() {
            this.value = (this.value + 1) % this.limit;
        }
    
        public int getValue() {
            return this.value;
        }
    
        @Override
        public String toString() {
            return String.format("%02d", this.value);
        }
    
}
