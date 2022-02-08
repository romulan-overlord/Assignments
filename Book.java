public class Book extends Product{

	private String author;

	Book(){
		count++;
	}

	public void setAuthor(String str){
		author = str;
	}
	
	String getAuthor(){
		return author;
	}
}