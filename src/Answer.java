
public class Answer extends Thread {

	private Semaphore _semaphore;
	private String _message;
	
	public Answer(Semaphore semaphore, String message) {
		_semaphore = semaphore;
		_message = message;
	}
	
	@Override
	public void run() {
		_semaphore.down();
		System.out.println(_message);
	}
	
}
