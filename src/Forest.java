
public class Forest extends Place{

	public Forest() {
		System.out.println("Vampir ile savaþacaksýnýz.");
	}
	 
	int vampireBell=14;
	int vampireDamage=4;
	int vampireMoney=7;
	
    Character character=new Character();
    
    @Override
	public String article() {
		
		return "odun";
	}
    
	@Override
	public int war() {
		if(vampireBell>character.bell) {
    		System.out.println("kaybettiniz.");
    		
    	}
    	else if(vampireBell<character.bell) {
    		System.out.println("kazandýklarýnýz:");
    		System.out.println(vampireMoney + "ve" + article());
    	}
        
		return 0;
	}

	

}
