/**@author- Juan Mendoza
 * CSCI 2540 Assignment 1
 * This program will store and manipulate complex numbers
 */
package assg1_mendozaj17;
public class ComplexNum {

		//two variables defined.
		private double real;
		private double imaginary;
		
		/**
		 * Default Constructor
		 */
		 public ComplexNum() {
			this.real = 0;
			this.imaginary = 0;
		}
		 
		 /**
		  * Constructor with a given real
		  * @param n the given real
		  */
		 public ComplexNum(double real) {
			 this.real = real;
			 this.imaginary = 0;
		 }
		 
		 /**
		  * 
		  * @param real represents the real variable.
		  * @param imaginary represents the imaginary variable. 
		  */
		 public ComplexNum(double real, double imaginary) {
			 this.real = real;
			 this.imaginary = imaginary;
		 }
		 
		 /**
		  * retrieve the real number
		  * @return the real number.
		  */
		 public double getReal() {
			 return this.real;
		 }
		 
		 /**
		  * retrieve the imaginary number.
		  * @return the imaginary number. 
		  */
		 public double getImaginary() {
			 return this.imaginary;
		 }
		 
		 /**
		  * Modify the real number 
		  * @param newReal is the new real number. 
		  */
		 public void setReal(double newReal) {
			 this.real = newReal;
		 }
		 
		 /**
		  * Modify the imaginary number
		  * @param newImaginary is the new imaginary number. 
		  */
		 public void setImaginary(double newImaginary) {
			 this.imaginary = newImaginary;
		 }
		 
		 /**
		  * Adds the two numbers
		  * @param object 
		  * @return the new complex number. 
		  */
		 public ComplexNum add(ComplexNum object) {
			 double r = this.real + object.getReal();
			 double i = this.imaginary + object.getImaginary();
			 return new ComplexNum(r,i);
		 }
		 
		 /**
		  * subtracts the two complex numbers
		  * @param object is used to subtract from this. 
		  * @return the new complex number.
		  */
		 public ComplexNum sub(ComplexNum object) {
			 double r = this.real - object.getReal();
			 double i = this.imaginary - object.getImaginary();
			 return new ComplexNum(r,i);
		 }
		 
		 /**
		  * multiplies the two complex numbers. 
		  * @param object is used to subtract from this. 
		  * @return the new complex number. 
		  */
		 public ComplexNum mul(ComplexNum object) {
			 double r = this.real * object.getReal();
			 double i = this.imaginary * object.getImaginary();
			 return new ComplexNum(r,i);
		 }
		 
		 /**
		  * negates the complex number. 
		  * @return the complex number after negation. 
		  */
		 
		 public ComplexNum neg() {
			 double r = this.real;
			 double i = this.imaginary;
			 return new ComplexNum(-r,-i);
		 }
		 
		
		 @Override
		 /**
		  * returns a string equivalent of the ComplexNum object. 
		  */
		 public String toString() {
			 return "(" +String.valueOf(this.real)+ ", " + String.valueOf(this.imaginary)+ "i)\n";  
		 }
		 
		 @Override
		 /**
		  * Compares objects. 
		  * returns a boolean value
		  */
		 public boolean equals(Object obj) {
			 if (obj == null) 
					return false;
				if (obj instanceof ComplexNum) {
					ComplexNum temp = (ComplexNum)obj;
					return (this.real == temp.real);
				}
				else
					return false;
		 }
	}


