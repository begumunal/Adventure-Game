
public class River extends Place {
	public River() {
		System.out.println("Ayı ile savaşacaksınız.");
	}
	 
	int bearBell=20;
	int bearDamage=7;
	int bearMoney=12;
	
    Character character=new Character();

	@Override
	public String article() {
		
		return "su";
	}

	@Override
	public int war() {
		if(bearBell>character.bell) {
    		System.out.println("kaybettiniz.");
    		
    	}
    	else if(bearBell<character.bell) {
    		System.out.println("kazandıklarınız:");
    		System.out.println(bearMoney + "ve" + article());
    	}
        return 0;
	}

}
