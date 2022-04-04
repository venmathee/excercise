// Java program to add two complex numbers
import java.util.Scanner;
class Complex {

	
	int real, image;
      public Complex(int real, int image)
	{
		this.real = real;
		this.image = image;
	}
      public void display()
	{
		System.out.print(this.real + "+i" + this.image);
	}

	// function for adding two complex numbers
	public static Complex add(Complex n1,Complex n2)
	{
        Complex result = new Complex(0, 0);

		// adding real parts of both complex numbers
		result.real = n1.real + n2.real;

		// adding imaginary parts of both complex numbers
		result.image = n1.image + n2.image;
            return result;
	}

	public static void main(String arg[])
	{

		// object creation for two complex numbers
		Complex c1 = new Complex(8, 9);
		Complex c2 = new Complex(15, 3);
            System.out.print("first Complex number: ");
		c1.display();
		System.out.print("\nSecond Complex number: ");
		c2.display();
            Complex result= add(c1, c2);
		System.out.println("\nAddition of two complex numbers is :");
		result.display();
	}
}
