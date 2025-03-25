package aggregation_one_to_many_CRUD;

public class User {
	String uName;
	Post[] post;
	static int count=0;
	
	public User(int size, String uName) {
		this.post = new Post[size];
		this.uName = uName;
	}
	public void addPost(Post p) {
		if(count<post.length) {
			post[count++] = p;
			System.out.println("Post added");
		}
		else {
			System.out.println("Post cannot be added, array is full");
		}
	}
	public void displayPost() {
		for(int i=0;i<count;i++) {
			Post p1 = post[i];
			if(post[i]==null) {
				continue;
			}
			System.out.println("Post is: "+p1.pName+" "+"\nID is: "+p1.pID);
		}
	}
	public void updatePost(int post_ID, int newID) {
		for(int i=0;i<count;i++) {
			Post p2 = post[i];
			if(p2.pID == post_ID) {
				p2.pID = newID;
				
			}
		}
	}
	public void removePost(int post_ID) {
		for(int i =0;i<count;i++) {
			Post p3 = post[i];
			if(p3.pID == post_ID) {
				post[i]=null;
				System.out.println("User is removed by id: "+post_ID);
			}
		}
	}
}