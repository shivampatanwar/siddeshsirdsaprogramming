package printfile;

public class MainClass {
	
	public static void main(String[] args) {
		
		PrintFile pf = new PrintFile();
		
		pf.addfile(new Files("java", 5));
		pf.addfile(new Files("Css", 3));
		pf.addfile(new Files("Resume", 2));
		
		pf.printFile();
	}

}
