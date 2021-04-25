package observer;

public class CelebrityGram {

	public static void main(String[] args) {
		
		Observable INNA = new Celebrity("INNA");
		Photo uploadedPhoto = new Photo();
		
		Follower follower1 = new Follower("x0x_ivan");
		Follower follower2 = new Follower("sweer_angel");
		Follower follower3 = new Follower("n1k0ization");
		Follower follower4 = new Follower("ivanina_16");
		Follower follower5 = new Follower("brad.peterson");
		Follower follower6 = new Follower("ivanPetrov");
		Follower follower7 = new Follower("zahariZahar4e13");

		INNA.follow(follower1);
		INNA.follow(follower2);
		INNA.follow(follower3);
		INNA.follow(follower4);
		INNA.follow(follower5);
		INNA.follow(follower6);
		INNA.follow(follower7);

		
		INNA.unfollow(follower6); 
		
		
		follower1.followCelebrity(INNA);
		follower2.followCelebrity(INNA);
		follower3.followCelebrity(INNA);
		follower4.followCelebrity(INNA);
		follower5.followCelebrity(INNA);
		follower6.followCelebrity(INNA);
		follower7.followCelebrity(INNA);
		
		INNA.upload(uploadedPhoto,"Beautiful summer");

	}

}
