
public class Question extends Thread {

	private Semaphore _semaphore;
	private String _message;
	
	public Question(Semaphore semaphore, String message) {
		_semaphore = semaphore;
		_message = message;
	}
	
	@Override
	public void run() {
		System.out.println(_message);
		_semaphore.up();
	}
}
