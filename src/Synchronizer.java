
public class Synchronizer {

	public static void main(String[] args) {
		
		// synchronization semaphore (initialized to 0)
		final Semaphore semaphore = new Semaphore(0);
		final Question question = new Question(semaphore, "Hello, how are you?");
		final Answer answer = new Answer(semaphore, "I'm fine! and you?");
		
		answer.start();
		question.start();
		
	}

}
