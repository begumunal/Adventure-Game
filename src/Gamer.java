
public class Gamer extends Character{
	
	public void characterResult(String characterVote){
		
		switch (characterVote) {
		
		case "s":
			id=1;
            damage=5;
            bell=21;
            money=15;
            break;
		case "o":
			id=2;
            damage=7;
            bell=18;
            money=20;
            break;
		case "þ":
			id=3;
            damage=8;
            bell=24;
            money=5;
            break;
		}

        

    }

    
    
}