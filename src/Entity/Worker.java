package Entity;

public class Worker {
	private static int counter = 0;
	private int UID;
    private String name;
    private User user;
    private boolean isAvailable = true;
    
    public Worker(String name) {
		this.name = name;
		counter++;
		this.UID = counter;
	}
	public int getWorkerId() {
        return UID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
