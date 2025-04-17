# Restaurant Simulation – Java Multithreaded Project
✅ Project Description:
The Restaurant Simulation is a Java-based project that uses multithreading to simulate how a real restaurant works. The key roles such as Customers, Chefs, and optionally Waiters, are each represented by separate threads.

Each customer thread places an order. Chef threads take orders from a shared queue and process (cook) them. This simulates a real-world restaurant flow and demonstrates the Producer-Consumer Pattern using BlockingQueue and Concurrent data structures.

🧱 Main Components:
Order

A simple class that represents a food order (e.g., order ID or meal type).

Customer (Producer)

A thread that creates an order and adds it to the shared order queue.

Chef (Consumer)

A thread that takes orders from the queue, "prepares" them, and prints a message once ready.

Waiter (Optional)

Could represent a thread that serves the order after it’s ready.

BlockingQueue

A thread-safe queue that holds the orders waiting to be processed.

⚙️ How It Works:
The program starts by creating a shared BlockingQueue to hold orders.

A number of Chef threads are started. They continuously look for orders in the queue.

Multiple Customer threads are created. Each customer puts an order into the queue.

Chefs take the order, simulate preparing it (e.g., using Thread.sleep()), and mark it as done.

(Optional) A Waiter thread can take the finished order and simulate delivery to the customer.

🔧 Technologies Used:
Thread, Runnable interfaces

BlockingQueue<Order> (e.g., LinkedBlockingQueue)

ExecutorService (optional for thread pooling)

synchronized, sleep(), ConcurrentHashMap (if needed for order tracking)

🧪 Example Behavior:
vbnet
Copy
Edit
Customer 1 placed order 1
Chef is preparing order 1
Customer 2 placed order 2
Chef finished order 1
Chef is preparing order 2
...
💡 Enhancement Ideas:
Add a Menu system with different meal types.

Simulate waiting times or order priorities.

Add statistics like total orders completed.

Add a GUI or Console-based Menu.

Use ExecutorService to manage thread pools for chefs and customers.
