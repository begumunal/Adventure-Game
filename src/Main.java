import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Lutfen karakter seçiniz.");
        System.out.println("Samuray seçmek için s, okçu seçmek için o, þovalye seçmek için þ 'yi tuþlayýnýz.");
        Scanner girdi1 = new Scanner(System.in);
        String characterVote = girdi1.next();
        Gamer gamer=new Gamer();
        gamer.characterResult(characterVote);
		
		
		SafeHome safeHome=new SafeHome();
		
		
		System.out.println("Gitmek istediðiniz mekaný seçiniz.");
    	System.out.println("maðaraya gitmek isterseniz m, ormana gitmek isterseniz o, nehire gitmek isterseniz n'yi tuþlayýnýz.");
    	Scanner girdi2 = new Scanner(System.in);
    	String placeVote = girdi2.next();
    	
    	
    	safeHome.placeChoose(placeVote);

	}

}
