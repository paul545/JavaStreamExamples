
//@author Paul Bosonetto

public class SectionInfo {
    String department ;
    int number ;
    int section ;
    Integer limit ;

    public SectionInfo() {
	department = "" ;
	number = 0 ;
	section = 0 ;
	limit = 0 ;
    }	

    public SectionInfo(String department, int number, int section, Integer limit) {
	this.department = department ;
	this.number = number ;
	this.section = section ;
	this.limit = limit ;
    }

    public String toString() {
	return String.format("%-4s %3d.%03d %3d",
			     department, number, section, limit) ;
    }

    public void setDepartment(String department) {
	this.department = department ;
    }

    public String getDepartment() {
	return department ;
    }    

    public void setNumber(int number) {
	this.number = number ;
    }

    public int getNumber() {
	return number ;
    }    

    public void setSection(int section) {
	this.section = section ;
    }

    public int getSection() {
	return section ;
    }    
    
    public void setLimit(Integer limit) {
	this.limit = limit ;
    }

    public Integer getLimit() {
	return limit ;
    }    
    
}
