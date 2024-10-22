package printfile;

import java.util.LinkedList;
import java.util.Queue;

public class PrintFile {
	
	Queue<Files> queue;
	
	
	public PrintFile() {
		queue = new LinkedList<Files>();
	}
	
	
	public void addfile(Files file) {
		queue.add(file);
		System.out.println(file.fileName + " is added to print and pages are : " + file.getPages());
	}
	
	
	
	public void printFile() {
		
		while(!queue.isEmpty()) {
			
			Files file = queue.poll();
			System.out.println("Processing :  " + file);
			
			try {
				Thread.sleep(file.getPages()*1000);
				
			}catch(Exception e){
				e.printStackTrace();
				
			}
			System.out.println("Completed : " + file.getFileName());
			
		}
		
		System.out.println("All Files are printed");
	}
	
	
	

}
