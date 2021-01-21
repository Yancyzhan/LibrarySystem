
public class Document {
private String name;
private String authorName;
private String publishDate;
private int price;
public Document(String name, String autName, String date,int price){
	this.name = name;
	authorName = autName;
	publishDate = date;
	this.price = price;
}

public String getName(){
	return name;
}

public String getAutName(){
	return authorName;
}

public String getDate(){
	return publishDate;
}

public int getPrice(){
	return price;
}
}


