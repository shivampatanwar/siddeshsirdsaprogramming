package queue;

public class QueueProgram {

	int[] queue;
	int topOfQueue;
	int beginingOfQueue;

	public QueueProgram(int size) {
		queue = new int[size];
		topOfQueue = -1;
		beginingOfQueue = -1;
	}

	public boolean isFull() {
		return topOfQueue == queue.length - 1;
	}

	public boolean isEmpty() {
		return topOfQueue == -1 || beginingOfQueue == queue.length;
	}

	public void enQueue(int value) {

		if (isFull()) {
			System.out.println("Queue is Full");

		} else if (isEmpty()) {
			beginingOfQueue = 0;
			topOfQueue++;
			queue[topOfQueue] = value;
			System.out.println("The value " + value + " is Inserted");
		} else {
			topOfQueue++;
			queue[topOfQueue] = value;
			System.out.println("The value " + value + " is Inserted");
		}

	}

	public void deQueue() {

		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			int[] queus = new int[queue.length];
			int j = 0;
			for (int i = 1; i < queue.length; i++) {
				queus[j++] = queue[i];
			}
			queue = queus;
			topOfQueue--;
		}

	}
	
	
	public void showQueue() {

		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			for (int i = 0; i <= topOfQueue; i++) {
				System.out.println("The value " + queue[i] + " is Inserted and waiting is " + (i + 1));
			}
		}

	}

}
