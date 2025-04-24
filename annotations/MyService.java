package annotations;

public class MyService {
	@Info(name="FetchData", version = 1.5)
	public void fetchData() {
		System.out.println("Fetching data...");
	}
	@Info(name="SavaData")
	public void saveData(){
		System.out.println("Saving data...");
	}
}
