/**
      @author       Marco Martinez
      @fileName     ComplexNumber.java
      @version      1.0
      @description  A complete overhaul of original "mathobjects" concept with redesigned class layout.
 
                  Classes
                  -------
                  Number
                  NumberSystem
 	            AppDriver
 
                  Associations
                  ------------
 	            AppDriver --- 1 : 1 ---> ComplexNumberSystem
 	            ComplexNumberSystem --- 2 : 3 ---> Number
 
                  ComplexNumber
                  -------------
 	            (-) Number realPart
                  (-) Number imagPart
                  (+) ComplexNumber() 
                  (+) ComplexNumber(double rP) 
                  (+) ComplexNumber(double rP, double iP)
 	            (+) ComplexNumber(ComplexNumber anotherComplexNumber)
 	            (+) setReal(double rP)
                  (+) setImag(double iP)
 	            (+) getReal()
                  (+) getImag()
 	            (+) toString()
                  
      @date         10/1/2018
 
   Program Change Log 
   ==================
   Name     Date     Description
   Marco    10/1     Redesign with AppDriver -> ComplexNumberSystem -> ComplexNumber relationship; baseline for ComplexNumber class.
   Marco    10/4     Add finishing touches to ComplexNumber.
 */
 
public class ComplexNumber
{
   // INSTANCE VARIABLE DECLARATIONS
   private double realPart,
                  imagPart;

   //CLASS CONSTRUCTORS
   // (+) ComplexNumber() 
   public ComplexNumber()
   {
      this.realPart = 0.00;
      this.imagPart = 0.00;
   }
    
   // (+) ComplexNumber(double rP) 
   public ComplexNumber(double rP)
   {
      if (rP != 0.00) this.realPart = rP;
      else this.realPart = 0.00;
      this.imagPart = 0.00;
   }
    
   // (+) ComplexNumber(double rP, double iP)
   public ComplexNumber(double rP, double iP)
   {
      if (rP != 0.00) this.realPart = rP;
      else this.realPart = 0.00;
      if (iP != 0.00) this.imagPart = iP;
      else this.imagPart = 0.00;
   }
    
   // (+) ComplexNumber(ComplexNumber anotherComplexNumber)
   public ComplexNumber(ComplexNumber anotherComplexNumber)
   {
      this.realPart = anotherComplexNumber.getReal();
      this.imagPart = anotherComplexNumber.getImag();
   } 
    
   // CHANGE STATE SERVICES
   // (+) setReal(double rP)
   public void setReal(double rP)
   {
      if (rP != 0.00) this.realPart = rP;
      else this.realPart = 0.00;
   }
    
   // (+) setImag(double iP)
   public void setImag(double iP)
   {
      if (iP != 0.00) this.imagPart = iP;
      else this.imagPart = 0.00;
   }

   // READ STATE SERVICES
   // (+) getReal()
   public double getReal()
   {
      return this.realPart;
   }
    
   // (+) getImag()
   public double getImag()
   {
      return this.imagPart;
   }
    
   // (+) toString()
   public String toString()
   {
      if (this.imagPart > 0) return Double.toString(this.realPart) + " + " + Double.toString(this.imagPart) + "i";
      else if (this.imagPart == 0) return Double.toString(this.realPart);
      else if (this.imagPart < 0) return Double.toString(this.realPart) + " - " + Double.toString(Math.abs(this.imagPart)) + "i";
      return "";
   }      
}
