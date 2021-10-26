
public class Semaphore {
	
	private int _ticket = 0;
	
	public Semaphore(int ticket) {
		if (ticket >= 0) _ticket = ticket;
	}
	
	public synchronized void P() {
		while (_ticket == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();	
			}
		}
		_ticket--;
	}
	
	public synchronized void V() {
		_ticket++;
		notify();
	}
	
	// Alias
	public void down() {
		P();
	}
	
	public void up() {
		V();
	}
}
