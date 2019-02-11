import java.util.List ;
import java.util.ArrayList ;
import java.util.stream.Stream;

//@author Paul Bosonetto

public class SectionInfoRun {

    public static void main(String[] args) {
	List<SectionInfo> testList = generateSectionInfoList() ;
	
	//Print in original order
	testList.stream().forEach(e -> System.out.println(e));
	System.out.println("-----------------------------------------");
	
	//Print sorted by limit
	testList.stream().sorted((si1, si2)-> si1.getLimit()
			.compareTo(si2.getLimit()))
			.forEach(System.out::println);
			
	System.out.println("*************************************\n");
	
	//Print sum of enrollment limit of all classes
	System.out.println(
					testList.stream()
					.mapToInt(SectionInfo::getLimit).sum()
					+ " = total enrollment limit of all classes");
	
	//Print number of sections offered by CSCI Dept
	System.out.println(
			"\nCSCI: " + 
			testList.stream()
			.filter(SectionInfo -> SectionInfo.department.equals("CSCI"))
			.count()
			+ " sections"
	);
	
	//Print number of sections offered by NM Dept
	System.out.println(
			"NM: " + 
			testList.stream()
			.filter(SectionInfo -> SectionInfo.department.equals("NM"))
			.count()
			+ " sections\n"
	);
	
	//Print the sum of enrollment limit of all courses in both departments
	System.out.println(
				testList.stream()
				.filter(e -> e.department.equals("CSCI"))
				.mapToInt(SectionInfo::getLimit).sum()
				+ " = Total Enrollment limit of all CSCI classes.\n");

    
	//Print the sum of enrollment limit of all courses in both departments
	System.out.println(
				testList.stream()
				.filter(e -> e.department.equals("NM"))
				.mapToInt(SectionInfo::getLimit).sum()
				+ " = Total Enrollment limit of all NM classes.\n");

    }    


    static List<SectionInfo> generateSectionInfoList() {
	List<SectionInfo> returnMe = new ArrayList<>() ;
	returnMe.add(new SectionInfo("CSCI", 182, 001, 18)) ;
	returnMe.add(new SectionInfo("CSCI", 182, 002, 20)) ;
	returnMe.add(new SectionInfo("CSCI", 185, 002, 20)) ;
	returnMe.add(new SectionInfo("CSCI", 201, 001, 20)) ;
	returnMe.add(new SectionInfo("CSCI", 201, 002, 20)) ;
	returnMe.add(new SectionInfo("CSCI", 202, 001, 20)) ;
	returnMe.add(new SectionInfo("CSCI", 202, 002, 20)) ;
	returnMe.add(new SectionInfo("CSCI", 235, 001, 40)) ;
	returnMe.add(new SectionInfo("CSCI", 280, 001, 20)) ;
	returnMe.add(new SectionInfo("CSCI", 329, 001, 10)) ;
	returnMe.add(new SectionInfo("NM", 101, 001, 18)) ;
	returnMe.add(new SectionInfo("NM", 101, 002, 18)) ;
	returnMe.add(new SectionInfo("NM", 101, 003, 18)) ;
	returnMe.add(new SectionInfo("NM", 101, 004, 0)) ;
	returnMe.add(new SectionInfo("NM", 144, 001, 125)) ;
	returnMe.add(new SectionInfo("NM", 231, 001, 20)) ;
	returnMe.add(new SectionInfo("CSCI", 183, 001, 20)) ;
	returnMe.add(new SectionInfo("CSCI", 183, 002, 20)) ;
	returnMe.add(new SectionInfo("CSCI", 185, 001, 20)) ;
	returnMe.add(new SectionInfo("NM", 231, 002, 20)) ;
	returnMe.add(new SectionInfo("NM", 251, 001, 20)) ;
	returnMe.add(new SectionInfo("NM", 251, 002, 20)) ;
	returnMe.add(new SectionInfo("NM", 281, 001, 20)) ;
	returnMe.add(new SectionInfo("NM", 330, 001, 16)) ;
	returnMe.add(new SectionInfo("NM", 350, 001, 20)) ;
	returnMe.add(new SectionInfo("NM", 373, 001, 10)) ;
	returnMe.add(new SectionInfo("NM", 374, 001, 16)) ;
	returnMe.add(new SectionInfo("CSCI", 335, 001, 20)) ;
	returnMe.add(new SectionInfo("CSCI", 338, 001, 25)) ;
	returnMe.add(new SectionInfo("CSCI", 344, 001, 20)) ;
	returnMe.add(new SectionInfo("CSCI", 344, 002, 20)) ;
	returnMe.add(new SectionInfo("CSCI", 346, 001, 25)) ;
	returnMe.add(new SectionInfo("CSCI", 373, 001, 15)) ;
	returnMe.add(new SectionInfo("CSCI", 373, 002, 10)) ;
	return returnMe ;
    }
}
