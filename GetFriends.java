package Graphics;
public class GetFriends {


	public static void main(String[] args){
    	//3. Create an instance of Classmate for each person in your class.
   	 Classmate mate = new Classmate();
   	 Classmate.isStudent = false;
   	 
   	 Classmate Keith = new Classmate();
   	 Classmate eli = new Classmate();
   	 eli.isStudent = true;
   	 Classmate Eli = new Classmate();
   	 System.out.println(Classmate.isStudent);
    	//4. set descriptions for each Classmate
   	 mate.setDescription("Tall");
   	 Keith.setDescription("teacher");
   	 eli.setDescription("brown hair");
   	 Eli.setDescription("not eli");
   	 	//5. Use your getter to print out each description
   	 System.out.println(mate.getDescription());
   	 System.out.println(Keith.getDescription());
   	 System.out.println(eli.getDescription());
   	 System.out.println(Eli.getDescription());
	}





}
class Classmate{
	static boolean isStudent = true;
	String description;
    
	//1. create a setter that sets a description for this person
	public String getDescription(){
		return description;
	}
	public void setDescription(String d){
		description = d;
	}
	//2. create a getter that gets a description of this person

}

