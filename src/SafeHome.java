
public class SafeHome {
	
	
    public SafeHome(){
        //can yenilenme
    	System.out.println("G�venli evdesiniz");
    	
    }
    
    public void placeChoose(String placeVote){ //yer se�imi
    	System.out.println(placeVote);
    	switch (placeVote){
    		case "m":
    			Cavern cavern=new Cavern();
        		cavern.war();
    			break;
    		case "o":
    			Forest forest=new Forest();
        		forest.war();
    			break;
    		case "n":
    			River river=new River();
        		river.war();
    			break;	
    	}
    	
    	
    }

	
}

