/**
      @author       Marco Martinez
      @fileName     ComplexNumberSystem.java
      @version      1.0
      @description  This program will create and manipulate ComplexNumberSystem objects.
 
      Classes
 	      ComplexNumber
 	      ComplexNumberSystem
 	      AppDriver
 
      Associations
 	      AppDriver --- 1 : 1 ---> ComplexNumberSystem
 	      ComplexNumberSystem --- 2 : 3 ---> ComplexNumber
 
      ComplexNumberSystem
            (-) ComplexNumber a, b, result
            (-) int isInverse
            (-) String whatAction
 	      (+) ComplexNumberSystem()		
 	      (+) ComplexNumberSystem(ComplexNumber aComplex)	
 	      (+) ComplexNumberSystem(ComplexNumber aComplex, ComplexNumber bComplex)	
 	      (+) ComplexNumberSystem(double realA)
            (+) ComplexNumberSystem(double realA, double imaginaryA)	
            (+) ComplexNumberSystem(double realA, double imaginaryA, double realB)
            (+) ComplexNumberSystem(double realA, double imaginaryA, double realB, double imaginaryB)
            (+) ComplexNumberSystem(double realA, double imaginaryA, ComplexNumber bComplex)
            (+) ComplexNumberSystem(double realA, ComplexNumber bComplex)
            (+) ComplexNumberSystem(double realA, double imaginaryA, ComplexNumber bComplex)
            (+) ComplexNumberSystem(ComplexNumber aComplex, double realB)
 	      (+) ComplexNumberSystem(ComplexNumber aComplex, double realB, double imaginaryB)
 	      (+) ComplexNumberSystem(ComplexNumberSystem anotherComplexNumberSystem)
 	      (+) add()
            (+) sub() 
            (+) mult() 
            (+) div()
            (+) mod()
            (+) invertA()
            (+) invertB()
 	      (+) getA()
 	      (+) getB()
 	      (+) getResult()
 	      (+) toString()
 
      @date         9/21/2018
 
         Program Change Log 
         ==================
         Name        Date     Description
         Marco       10/1     Create baseline for ComplexNumberSystem.
         Marco       10/4     Add finishing touches to ComplexNumberSystem.
 */
 
public class ComplexNumberSystem
{
   // INSTANCE VARIABLE DECLARATION
   private ComplexNumber a,                                   // First number input as x in (x, y)
                         b,                                   // Second number input as y in (x, y)
                         result;                              // Storage container for processes between a and b
   private String        whatAction = new String("");         // Keeps track of action performed
   private int           isInverse = 0;                       // Confirms inverse  

   // CLASS CONSTRUCTORS
   // (+) ComplexNumberSystem()
   public ComplexNumberSystem()
   {
     this.a = new ComplexNumber();
     this.b = new ComplexNumber();
     this.result = new ComplexNumber();
   }

   // (+) ComplexNumberSystem(ComplexNumber aComplex)	
   public ComplexNumberSystem(ComplexNumber aComplex)
   {
      this.a = new ComplexNumber(aComplex);
      this.b = new ComplexNumber();
      this.result = new ComplexNumber();
   }
    
   // (+) ComplexNumberSystem(ComplexNumber aComplex, ComplexNumber bComplex)	
   public ComplexNumberSystem(ComplexNumber aComplex, ComplexNumber bComplex)
   {
      this.a = new ComplexNumber(aComplex);
      this.b = new ComplexNumber(bComplex);
      this.result = new ComplexNumber();
   }
    
   // (+) ComplexNumberSystem(double realA)
   public ComplexNumberSystem(double realA)
   {
      this.a = new ComplexNumber(realA);
      this.b = new ComplexNumber();
      this.result = new ComplexNumber();
   }
    
   // (+) ComplexNumberSystem(double realA, double imaginaryA)
   public ComplexNumberSystem(double realA, double imaginaryA)
   {
      this.a = new ComplexNumber(realA, imaginaryA);
      this.b = new ComplexNumber();
      this.result = new ComplexNumber(0);
   }
    
   // (+) ComplexNumberSystem(double realA, double imaginaryA, double realB)
   public ComplexNumberSystem(double realA, double imaginaryA, double realB)
   {
      this.a = new ComplexNumber(realA, imaginaryA);
      this.b = new ComplexNumber(realB);
      this.result = new ComplexNumber();
   }
    
   // (+) ComplexNumberSystem(double realA, double imaginaryA, double realB, double imaginaryB)
   public ComplexNumberSystem(double realA, double imaginaryA, double realB, double imaginaryB)
   {
      this.a = new ComplexNumber(realA, imaginaryA);
      this.b = new ComplexNumber(realB, imaginaryB);
      this.result = new ComplexNumber();
   }
    
   // (+) ComplexNumberSystem(double realA, ComplexNumber bComplex)
   public ComplexNumberSystem(double realA, ComplexNumber bComplex)
   {
      this.a = new ComplexNumber(realA);
      this.b = new ComplexNumber(bComplex);
      this.result = new ComplexNumber();
   }
    
   // (+) ComplexNumberSystem(double realA, double imaginaryA, ComplexNumber bComplex)
   public ComplexNumberSystem(double realA, double imaginaryA, ComplexNumber bComplex)
   {
      this.a = new ComplexNumber(realA, imaginaryA);
      this.b = new ComplexNumber(bComplex);
      this.result = new ComplexNumber();
   }
    
   // (+) ComplexNumberSystem(ComplexNumber aComplex, double realB)
   public ComplexNumberSystem(ComplexNumber aComplex, double realB)
   {
      this.a = new ComplexNumber(aComplex);
      this.b = new ComplexNumber(realB);
      this.result = new ComplexNumber();
   }
    
   // (+) ComplexNumberSystem(ComplexNumber aComplex, double realB, double imaginaryB)
   public ComplexNumberSystem(ComplexNumber aComplex, double realB, double imaginaryB)
   {
      this.a = new ComplexNumber(aComplex);
      this.b = new ComplexNumber(realB, imaginaryB);
      this.result = new ComplexNumber();
   }
    
   // (+) ComplexNumberSystem(ComplexNumberSystem anotherComplexNumberSystem)
   public ComplexNumberSystem(ComplexNumberSystem anotherComplexNumberSystem)
   {
      this.a = new ComplexNumber(anotherComplexNumberSystem.getA());
      this.b = new ComplexNumber(anotherComplexNumberSystem.getB());
      this.result = new ComplexNumber(anotherComplexNumberSystem.getResult());
   }
    
   // CHANGE STATE SERVICES
   // (+) setA()
   public void setA()
   {
      this.a.setReal(0.00);
      this.a.setImag(0.00);
      this.isInverse = 0;
   }
   
   // (+) setA(double rP)
   public void setA(double rP)
   {
      this.a.setReal(rP);
      this.a.setImag(0.00);
      this.isInverse = 0;
   }
   
   // (+) setA(double rP, double iP)
   public void setA(double rP, double iP)
   {
      this.a.setReal(rP);
      this.a.setImag(iP);
      this.isInverse = 0;
   }
   
   // (+) setA(ComplexNumber newA)
   public void setA(ComplexNumber newA)
   {
      this.a.setReal(newA.getReal());
      this.a.setImag(newA.getImag());
      this.isInverse = 0;
   }
   
   // (+) setA(ComplexNumberSystem newComplexNumberSystem)
   public void setA(ComplexNumberSystem newComplexNumberSystem)
   {
      ComplexNumber newA = new ComplexNumber(newComplexNumberSystem.getA());
      this.a.setReal(newA.getReal());
      this.a.setImag(newA.getImag());
      this.isInverse = 0;
   }
   
    // (+) setB()
   public void setB()
   {
      this.b.setReal(0.00);
      this.b.setImag(0.00);
      this.isInverse = 0;
   }
    
   // (+) setB(double rP)
   public void setB(double rP)
   {
      this.b.setReal(rP);
      this.b.setImag(0.00);
      this.isInverse = 0;
   }
   
   // (+) setB(double rP, double iP)
   public void setB(double rP, double iP)
   {
      this.b.setReal(rP);
      this.b.setImag(iP);
      this.isInverse = 0;
   }
   
   // (+) setB(ComplexNumber newB)
   public void setB(ComplexNumber newB)
   {
      this.b.setReal(newB.getReal());
      this.b.setImag(newB.getImag());
      this.isInverse = 0;
   }
   
   // (+) set(ComplexNumberSystem newComplexNumberSystem)
   public void setB(ComplexNumberSystem newComplexNumberSystem)
   {
      ComplexNumber newB = new ComplexNumber(newComplexNumberSystem.getB());
      this.a.setReal(newB.getReal());
      this.a.setImag(newB.getImag());
      this.isInverse = 0;
   }

   
   // (+) add()
   public void add()
   {
      this.result.setReal(this.a.getReal() + this.b.getReal());
      this.result.setImag(this.a.getImag() + this.b.getImag());
      this.whatAction = " + ";
      this.isInverse = 1;
   }
    
   // (+) sub()
   public void sub()
   {
      this.result.setReal(this.a.getReal() - this.b.getReal());
      this.result.setImag(this.a.getImag() - this.b.getImag());
      this.whatAction = " - ";
      this.isInverse = 1;    
   }
    
   // (+) mult()
   public void mult()
   {
      this.result.setReal(this.a.getReal() * this.b.getReal());
      this.result.setImag(this.a.getImag() * this.b.getImag());
      this.whatAction = " * ";
      this.isInverse = 1;
   }
    
   // (+) div()
   public void div()
   {
      this.result.setReal(this.a.getReal() / this.b.getReal());
      this.result.setImag(this.a.getImag() / this.b.getImag());
      this.whatAction = " / ";
      this.isInverse = 1;
   }
    
   // (+) mod()
   public void mod()
   {
      this.result.setReal(this.a.getReal() % this.b.getReal());
      this.result.setImag(this.a.getImag() % this.b.getImag());
      this.whatAction = " MOD ";
      this.isInverse = 1;
   }
    
   // (+) invertA()
   public void invertA()
   {
      this.result.setReal(this.a.getReal() * -1.0);
      this.result.setImag(this.a.getImag() * -1.0);
      this.isInverse = 2;
   }
    
   // (+) invertB()
   public void invertB()
   {
      this.result.setReal(this.b.getReal() * -1.0);
      this.result.setImag(this.b.getImag() * -1.0);
      this.isInverse = 3;
   }
    
   // READ STATE SERVICES
   // (+) getA()
   public ComplexNumber getA()
   {
      return this.a;
   }
    
   // (+) getB()
   public ComplexNumber getB()
   {
      return this.b;
   }
    
   // (+) getResult()
   public ComplexNumber getResult()
   {
      return this.result;
   }
    
   // (+) toString()
   public String toString()
   {
      if(this.isInverse == 1)
         return this.a.toString() + this.whatAction + this.b.toString() + " = " + this.result.toString();
      else if(this.isInverse == 2)
         return "-(" + this.a.toString() + ") = " + this.result.toString();
      else if(this.isInverse == 3)
         return "-(" + this.b.toString() + ") = " + this.result.toString();
      else return this.a.toString() + ", " + this.b.toString();
   }
}
