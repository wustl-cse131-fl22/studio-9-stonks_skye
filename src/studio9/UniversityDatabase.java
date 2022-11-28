package studio9;

import assignment7.Student;
import java.util.Map;
import java.util.HashMap;


public class UniversityDatabase {
	//TODO: Complete this class according to the studio instructions
	private final Map<String, Student> database;
	
	public UniversityDatabase() {
		database = new HashMap<>();
	}
	
	public void addStudent(String accountName, Student student) {
		this.database.put(accountName, student);
	}

	public int getStudentCount() {
		return this.database.size();
	}

	public String lookupFullName(String accountName) {
		if(this.database.get(accountName) == null) {
			return null;
		}
		return this.database.get(accountName).getFullName();
	}

	public double getTotalBearBucks() {
		double total = 0;
		for(Map.Entry<String, Student> temp: this.database.entrySet()) {
			total += temp.getValue().getBearBucksBalance();
		}
		return total;
	}
}
