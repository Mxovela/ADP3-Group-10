package za.ac.cput.domain;

public class customer {
        private Long customerId;
        private String name;
        private String emailAddress;
        private String shippingAddress;
        private String billingAddress;
        private String payment;

        private customer() {
            // Private constructor for builder pattern
        }

        public Long getCustomerId() {
            return customerId;
        }

        public String getName() {
            return name;
        }

        public String getEmailAddress() {
            return emailAddress;
        }

        public String getShippingAddress() {
            return shippingAddress;
        }

        public String getBillingAddress() {
            return billingAddress;
        }

        public String getPayment() {
            return payment;
        }
}
