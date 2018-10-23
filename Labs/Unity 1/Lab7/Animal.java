public class Animal {
	
    private int id;
	private String name, type;
	private boolean food;
	
	public Animal (){
		id = 1;
		name = "Snappy";
		type = "Dog";
		food = true;
	}
	
	public Animal(int id, String name, String type, boolean food){
		
	}
	public void feed(){
		
		food = true;
	
	}
	
	public void print(){
		System.out.println ("The Animal name is" + name + ",is a:" +
		 type + ", it ate" + food);
	}
	
	public void unFeed (){
		
	     food = false;	
	
	}
}