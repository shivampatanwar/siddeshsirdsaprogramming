package printfile;

public class Files {
	
	String fileName;
	int pages;
	
	
	public Files(String fileName, int pages) {
		super();
		this.fileName = fileName;
		this.pages = pages;
	}


	public String getFileName() {
		return fileName;
	}


	public int getPages() {
		return pages;
	}


	@Override
	public String toString() {
		return "fileName : " + fileName + ", pages : " + pages;
	}
	


}
