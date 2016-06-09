
public class SingleObject {

	private static SingleObject instance;
	
	private SingleObject(){
		
	}
	
	public static SingleObject getInstance(){
		if (SingleObject.instance==null){
			SingleObject.instance = new SingleObject();
		}
		
		return instance;
	}
	
	public void showMessage(){
		System.out.println("Hello world");
	}
	
	
}
