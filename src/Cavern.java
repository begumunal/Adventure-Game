
public class Cavern extends Place //ma�ara
{
	public Cavern() {
		System.out.println("Zombi ile sava�acaks�n�z.");
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
    		System.out.println("kazand�klar�n�z:");
    		System.out.println(zombieMoney + "ve" + article());
    	}
        return 0;
    }

	

    
   
}