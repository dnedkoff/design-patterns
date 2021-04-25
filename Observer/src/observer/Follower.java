package observer;

public class Follower implements Observer {
	
	private String name;
	private Observable celebrity;
	

	public Follower(String name) {
		super();
		this.name = name;
	}


	@Override
	public void update() {
		System.out.println("Hello "+ name + ", " +celebrity.getName() + " just uploaded a photo!");
	} 
	
	@Override
	public void followCelebrity(Observable cel) {
		this.celebrity = cel;
	}
}
