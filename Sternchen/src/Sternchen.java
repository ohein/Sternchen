
public class Sternchen {
	
	static char stern = '*';
	static char blank = ' ';
	static int groesse = 5;
	static char[][] sternchen;

	public static void main(String[] args) {

	    // Statische Initialisierung
	    sternchen=new char[5][5];
	    for (int i=0;i<groesse;i++)
	    	for (int j=0;j<groesse;j++)
	    		if (j<=i)
	    			sternchen[i][j]=stern;
	            else
	            	sternchen[i][j]=blank;
	    ausgabeNormal();
        System.out.println();
        spiegelHoriz();
        System.out.println();
        spiegelVert();
        System.out.println();
        dreh();
	}
	
	public static void ausgabeNormal() {
		for (int i=0; i<sternchen.length; i++) {
			System.out.println();
	        for (int j=0;j<sternchen[i].length; j++)
	        	System.out.print(sternchen[i][j]);
	     	}
	    }
	    
	public static void spiegelHoriz() {
		for (int i=sternchen.length-1; i>=0; i--) {
			System.out.println();
	        for (int j=0;j<sternchen[i].length; j++)
	        	System.out.print(sternchen[i][j]);
		}
	}
	    
	public static void spiegelVert() {
		for (int i=0; i<sternchen.length; i++) {
			System.out.println();
	        for (int j=sternchen[i].length-1; j>=0; j--)
	        	System.out.print(sternchen[i][j]);
		}
	}

	public static void dreh() {
		for (int i=sternchen.length-1; i>=0; i--) {
			System.out.println();
	        for (int j=sternchen[i].length-1; j>=0; j--)
	        	System.out.print(sternchen[i][j]);
	    }
	}   
}