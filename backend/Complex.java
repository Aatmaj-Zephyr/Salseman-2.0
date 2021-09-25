import java.lang.Math;
public class complex{
    //Class complex is used here to store coordinates as complex numbers.
    double real; //real part
    double imaginary; //imaginary part
    
    complex(double a, double b){
        //Default constructor
        real=a;
        imaginary=b;
    }
    
    static double dist(complex a, complex b){
        //distance between two complex coordinates.
        return complex.abs(complex.sub(a,b));
    }
    
    static complex sub(complex a, complex b){
        //subracting two complex numbers.
        return new complex(a.real-b.real,a.imaginary-b.imaginary);
    }
    static double abs(complex a){
        //absolute value of complex numbers.
        return Math.sqrt(Math.abs(a.real*a.real+a.imaginary*a.imaginary));
    }
    
    static boolean equals(complex a, complex b){
        //Method to check if two complex numbers are equal or not.
        //We cannot directly equate as they are interpreted as instances of objects.
        if(a.real==b.real&&a.imaginary==b.imaginary){
            return true;
        }
        else{
            return false;
        }
    }
}
