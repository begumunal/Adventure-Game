import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Lutfen karakter se�iniz.");
        System.out.println("Samuray se�mek i�in s, ok�u se�mek i�in o, �ovalye se�mek i�in � 'yi tu�lay�n�z.");
        Scanner girdi1 = new Scanner(System.in);
        String characterVote = girdi1.next();
        Gamer gamer=new Gamer();
        gamer.characterResult(characterVote);
		
		
		SafeHome safeHome=new SafeHome();
		
		
		System.out.println("Gitmek istedi�iniz mekan� se�iniz.");
    	System.out.println("ma�araya gitmek isterseniz m, ormana gitmek isterseniz o, nehire gitmek isterseniz n'yi tu�lay�n�z.");
    	Scanner girdi2 = new Scanner(System.in);
    	String placeVote = girdi2.next();
    	
    	
    	safeHome.placeChoose(placeVote);

	}

}
