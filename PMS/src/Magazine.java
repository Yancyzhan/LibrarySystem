
public class Magazine extends Document {
private int magId;
private String company;

public Magazine(String name, String autName, String date,int price,int num,String com){
	super(name, autName,date,price);
	magId = num;
	company = com;
}

public int getMagId() {
	return magId;
}

public void setMagId(int magId) {
	this.magId = magId;
}

public String getCompany() {
	return company;
}

public void setCompany(String company) {
	this.company = company;
}
}
