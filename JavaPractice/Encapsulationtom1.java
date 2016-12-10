

package JavaPractice;

// This is an example of ENCAPSULATION.....................
// It's main class is Encapsulationjerry1    
class Encapsulationtom1{
	private int employeeId;
	
	private String employeeName;
	
	private String designation;
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	// employeeId at right side of equals are same and are different from 
	// the left sides.
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}	
}		
