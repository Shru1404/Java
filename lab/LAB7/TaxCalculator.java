//Develop a simple java application to calculate the tax for a particular employee based on his salary.

//Develop  a  class  named  “TaxCalculator“ with a method named calculateTax with the following method parameters,

//this method should return a double taxAmount.
//
// 
//
//The business logic for calculating the tax  is as follows, this has to be implemented inside the method,
//
// 
//
//If the employee is not a Indian
//
//   The calculator should throw a CountryNotValidException
//
// 
//
//If the employee name is null or empty
//
//   The calculator should throw a EmployeeNameInvalidException
//
// 
//
//If  empSal is greater than one lakh and isIndian true
//
//taxAmount =empSal *8/100
//
//Otherwise  If  empSal  is between 50K and 1lakh and isIndian true
//
//taxAmount =empSal *6/100
//
//Otherwise  If  empSal  is between 30 and 50 Thousand  and isIndian true
//
//taxAmount =empSal *5/100
//
//Otherwise  If  empSal  is between 10 and 30 Thousand  and isIndian true
//
// taxAmount =empSal *4/100
//
//Otherwise
//
//   The calculator should throw a TaxNotEligibleException.
//
// 
//
//Develop a main class CalculatorSimulator  , implement the following logic in main method
//
// 
//
//1.     Execute the calculateTax Method and print the tax amount as “Tax amount is “<Tax Amount>
//
//2.     In case the calculateTaxMethod throws exceptions, this method needs to catch the appropriate exception print the stack trace and display the following messages,
//
//a.     Country not valid:  “The employee should be an Indian citizen for calculating tax”
//
//b.    Employee name not valid:  “The employee name cannot be empty”
//
//c.     Not eligible for Tax calculation:  “The employee does not need to pay tax”
//
// 
//
//The following test cases to be executed, change the data in main method and run it and verify the output messages

package Lab7;

public class TaxCalculator {

	// This method calculates the tax amount based on the employee name, salary, and nationality
	public double calculateTax(String empName, boolean isIndian, double empSal)
			throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {

		// Initialize the tax amount to zero
		double taxAmount = 0.0;

		// Check if the employee is Indian, if not, throw an exception
		if (!isIndian) {
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
		}

		// Check if the employee name is empty, if yes, throw an exception
		if (empName == null || empName.isEmpty()) {
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		}

		// Calculate the tax based on the employee's salary
		if (empSal > 100000 && isIndian) {
			taxAmount = empSal * 8 / 100;
		} else if (empSal >= 50000 && empSal <= 100000 && isIndian) {
			taxAmount = empSal * 6 / 100;
		} else if (empSal >= 30000 && empSal < 50000 && isIndian) {
			taxAmount = empSal * 5 / 100;
		} else if (empSal >= 10000 && empSal < 30000 && isIndian) {
			taxAmount = empSal * 4 / 100;
		} else {
			throw new TaxNotEligibleException("The employee does not need to pay tax");
		}

		// Return the tax amount
		return taxAmount;

	}
}