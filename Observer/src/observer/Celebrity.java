package observer;

import java.util.ArrayList;

import java.util.List;

public class Celebrity implements Observable {
	
	private String name;
	private Photo photo;
	
	private List<Follower> followers = new ArrayList<>();
	private List<Photo> photos = new ArrayList<>();

	public Celebrity(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;		
	}
	
	@Override
	public void follow(Follower follower) {
		followers.add(follower);
	}
	
	@Override
	public void unfollow(Observer follower) {
		followers.remove(follower);
	}
	
	@Override
	public void notifyFollowers() {
		for(Observer follower : followers) {
			follower.update();
			System.out.println("' " + this.photo.getDescription() + " '");
			System.out.println();
		}
	}
	
	@Override
	public void upload(Photo photo, String description) {
		photos.add(photo);
		photo.setDescription(description);
		this.photo = photo;
		notifyFollowers();
	}
	
}
