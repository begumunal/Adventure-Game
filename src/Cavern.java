
public class Cavern extends Place //mağara
{
	public Cavern() {
		System.out.println("Zombi ile savaşacaksınız.");
	}
	 
	int zombieBell=10;
	int zombieDamage=3;
	int zombieMoney=4;
	
    Character character=new Character();
    
    @Override
	public String article() {
		
		return "yemek";
	}
    
    @Override
    public int war() {

    	if(zombieBell>character.bell) {
    		System.out.println("kaybettiniz.");
    		
    	}
    	else if(zombieBell<character.bell) {
    		System.out.println("kazandıklarınız:");
    		System.out.println(zombieMoney + "ve" + article());
    	}
        return 0;
    }

	

    
   
}