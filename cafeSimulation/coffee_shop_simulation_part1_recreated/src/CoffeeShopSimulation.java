import java.util.*;

public class CoffeeShopSimulation {
    static final int MAX_CAPACITY = 3;
    static final List<Customer> capacityList = new ArrayList<>();
    static final Queue<Customer> orderQueue = new LinkedList<>();
    static final Map<Customer, Boolean> orderStatus = new HashMap<>();

    public static void main(String[] args) {
        // Start the barista
        new Thread(new Barista()).start();

        // Start 10 customers
        for (int i = 1; i <= 10; i++) {
            Customer customer = new Customer(i);
            new Thread(customer).start();
        }
    }

    static class Customer implements Runnable {
        int id;

        Customer(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            log("Customer " + id + " starting");

            // Enter coffee shop if not full
            synchronized (capacityList) {
                while (capacityList.size() >= MAX_CAPACITY) {
                    try {
                        capacityList.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                capacityList.add(this);
                log("Customer " + id + " entered coffee shop");
                capacityList.notifyAll();
            }

            // Place order
            synchronized (orderQueue) {
                orderQueue.add(this);
                log("Customer " + id + " placed order");
                orderQueue.notifyAll();
            }

            // Wait for order to be ready
            synchronized (orderStatus) {
                orderStatus.put(this, false);
            }

            synchronized (orderStatus) {
                while (!orderStatus.get(this)) {
                    try {
                        orderStatus.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                log("Customer " + id + " received order");
            }

            // Leave shop
            synchronized (capacityList) {
                capacityList.remove(this);
                log("Customer " + id + " left coffee shop");
                capacityList.notifyAll();
            }
        }
    }

    static class Barista implements Runnable {
        @Override
        public void run() {
            while (true) {
                Customer customer = null;
                synchronized (orderQueue) {
                    while (orderQueue.isEmpty()) {
                        try {
                            orderQueue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    customer = orderQueue.poll();
                    log("Barista is preparing order for Customer " + customer.id);
                }

                // Simulate preparation time
                try {
                    Thread.sleep(1000); // 1 second to prepare order
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (orderStatus) {
                    orderStatus.put(customer, true);
                    orderStatus.notifyAll();
                }

                log("Barista completed order for Customer " + customer.id);
            }
        }
    }

    static void log(String message) {
        System.out.println("[" + Thread.currentThread().getName() + "] " + message);
    }
}
