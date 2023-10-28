package entities;

public class Bill {
        private long oldELectric;
        private long newElectric;
        private double price;
        private Customer customer;

        public Bill(long oldELectric, long newElectric, double price, Customer customer) {
            this.oldELectric = oldELectric;
            this.newElectric = newElectric;
            this.price = price;
            this.customer = customer;
        }

        @Override
        public String toString() {
            return "Bill{" +
                    "oldELectric=" + oldELectric +
                    ", newElectric=" + newElectric +
                    ", price=" + price +
                    ", customer=" + customer +
                    '}';
        }
}
