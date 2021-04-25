package observer;

public interface Observable {

	String getName();

	void follow(Follower follower);

	void unfollow(Observer follower);

	void notifyFollowers();

	void upload(Photo photo, String description);

}