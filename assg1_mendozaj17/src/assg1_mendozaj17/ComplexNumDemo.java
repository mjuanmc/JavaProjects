/**
 * @author Juan Mendoza 
 * Class to test ComplexNum class. 
 */
package assg1_mendozaj17;
public class ComplexNumDemo {

	public static void main(String[] args) {
				
				//Test the constructors
				ComplexNum r1 = new ComplexNum();
				ComplexNum r2 = new ComplexNum(2, 3);
				ComplexNum r3 = new ComplexNum(5, 9.2);
								
				ComplexNum i1 = new ComplexNum();
				ComplexNum i2 = new ComplexNum(0, 6);
				ComplexNum i3 = new ComplexNum(8, 1);
				
				ComplexNum c1 = new ComplexNum(4, 8);
				ComplexNum c2 = new ComplexNum(6, -4);
				Object o1 = new ComplexNum(4,8);
						
				//Test getReal method.
				System.out.println("getReal Test: r1 is: " + r1.getReal());
				System.out.println("getReal Test: r2 is: " + r2.getReal());
				System.out.println();
				
				//Test getImaginary method
				System.out.println("getImaginary Test: i1 is: " + i1.getImaginary() + "i");
				System.out.println("getImaginary Test: i2 is: " + i2.getImaginary() + "i");
				System.out.println();
				
				// Test setReal method
				r2.setReal(7);
				System.out.println("setReal Test: r2's new number: " + r2.getReal());
				System.out.println();
				
				// Test setImaginary method
				i2.setImaginary(7);
				System.out.println("setImaginary Test: i2's new number: " + i2.getImaginary()+"i");
				System.out.println();
				
				// Test add method
				System.out.print("Adding complex num c1: " + c1);
				System.out.print("Adding complex num c2: " + c2);
				ComplexNum n1 = c1.add(c2);
				System.out.println("Add test: The addition of the two complex numbers is: " + n1);
				
				// Test sub method
				System.out.print("Subtracting complex num c1: " + c1);
				System.out.print("Subtracting complex num c2: " + c2);
				ComplexNum n2 = c1.sub(c2);
				System.out.println("Sub Test: The subtraction of the two complex numbers is: "+ n2);
				
				// Test mul method
				System.out.print("Multiplying complex num c1: " + c1);
				System.out.print("Multiplying complex num c2: " + c2);
				ComplexNum n3 = c1.mul(c2);
				System.out.println("Mul Test: The multiplication of the two complex numbers is: "+ n3);
				
			   //  Test neg method
				System.out.print("Complex num c1 is: " + c1);
				System.out.print("Complex num c2 is: " + c2);
				ComplexNum n4 = c1.neg();
				ComplexNum n5 = c2.neg();
				System.out.print("Neg Test: The negation of c1 is: "+ n4);
				System.out.println("Neg Test: The negation of c2 is: " + n5);
				
				//Test toString method
				System.out.println("toString Test: r3's information:");
				System.out.println(r3.toString());
				
				System.out.println("toString Test: i3's information:");
				System.out.println(i3.toString());   
				
				//Test equals method
				if (r1.equals(i1)) 
					System.out.println("r1 and i2 are equal");
				else
					System.out.println("r1 and i2 are not equal");
				if (r2.equals(i2)) 
					System.out.println("r2 and i3 are equal");
				else
					System.out.println("r2 and i3 are not equal");
				if (c1.equals(o1)) 
					System.out.println("c1 and o1 are equal");
				else
					System.out.println("r3 and c4 are not equal");
				System.out.println();
	}

}
