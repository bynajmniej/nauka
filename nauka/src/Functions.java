

public class Functions{
		
	    	    public double area ()
	    	    {
	    	        return 0;    }

	    	    public static void main(String[] args) {
	    	    	Functions s1 = new Circle (2.5);
	    	    	Functions s2 = new Rectangle (5.0, 4.0);
	    	        
	    	        System.out.println (s1.area());
	    	        System.out.println (s2.area());
	    	    }
	    	}


class Circle extends Functions {                    // class declaration
	    	    Circle (double diameter) {                  // constructor
	    	        this.diameter = diameter;
	    	    }
	    	    private static final double PI = Math.PI;   // constant
	    	    private double diameter;                    // instance variable
	    	    
	    	    public double area () {                     // dynamic method
	    	        double radius = diameter / 2.0;
	    	        return PI * radius * radius;
	    	    }

	    	}


class Rectangle extends Functions {
				private double b;
				private double a;

				Rectangle(double a, double b){
					this.a = a; this.b = b;}
				public double area () {
					return a*b;
				}}



