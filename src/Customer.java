public class Customer {
        private int id;
        private static int idGen = 1;
        private String name;

        public Customer(String name) {
            this.id = idGen++;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Customer{id=" + id + ", name='" + name + "'}";
        }
    }

