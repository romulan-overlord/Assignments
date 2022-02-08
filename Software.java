public class Software extends Product{

	String version;

	Software(){
		count++;
	}

	void setVersion(String str){
		version = str;
	}
	
	String getVersion(){
		return version;
	}
}