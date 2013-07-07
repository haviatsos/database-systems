package finalProject;

public class Airline {
  public String abbreviation;
	public String name;
	public String headquarter;
	
	public Airline(String abbreviation, String name, String headquarter){
		super();
		this.abbreviation = abbreviation;
		this.name = name;
		this.headquarter = headquarter;
		
	}
	public String getAbbreviation(){
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation){
		this.abbreviation = abbreviation;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getHeadquarter(){
		return headquarter;
	}
	public void setHeadquarter(String headquarter){
		this.headquarter = headquarter;
	}

}
