/**
      @author       Marco Martinez
      @fileName     AppDriver.java
      @version      1.0
      @description  This program will test the functionality of the classes ComplexNumber and ComplexNumberSystem.
      @date         10/1/2018
 
      Program Change Log 
      ==================
      Name     Date     Description
      Marco    10/1     Create baseline for AppDriver.
 */
 
public class AppDriver
{
   public static void main(String[] args) 
   {
      ComplexNumber cNumberTest1 = new ComplexNumber();
      System.out.println("ComplexNumber(): " + cNumberTest1.toString());
      
      ComplexNumber cNumberTest2 = new ComplexNumber(10.5);
      System.out.println("ComplexNumber(Double): " + cNumberTest2.toString());
        
      ComplexNumber cNumberTest3 = new ComplexNumber(20.0, 3.5);
      System.out.println("ComplexNumber(Double, Double): " + cNumberTest3.toString()); 
      
 	ComplexNumber cNumberTest4 = new ComplexNumber(cNumberTest3);
      System.out.println("ComplexNumber(ComplexNumber): " + cNumberTest4.toString()); 
      
      ComplexNumberSystem cSystemTest1 = new ComplexNumberSystem();
      System.out.println("ComplexNumberSystem(): " + cSystemTest1.toString());
      
 	ComplexNumberSystem cSystemTest2 = new ComplexNumberSystem(cNumberTest1);
      System.out.println("ComplexNumberSystem(ComplexNumber): " + cSystemTest2.toString());
       	
 	ComplexNumberSystem cSystemTest3 = new ComplexNumberSystem(cNumberTest3, cNumberTest2);
      System.out.println("ComplexNumberSystem(ComplexNumber, ComplexNumber): " + cSystemTest3.toString());
       	
 	   ComplexNumberSystem cSystemTest4 = new ComplexNumberSystem(5.5);
      System.out.println("ComplexNumberSystem(Double): " + cSystemTest4.toString());
       
      ComplexNumberSystem cSystemTest5 = new ComplexNumberSystem(5.5, 2);
      System.out.println("ComplexNumberSystem(Double, Double): " + cSystemTest5.toString());
       
      ComplexNumberSystem cSystemTest6 = new ComplexNumberSystem(8, 4.5, 2);
      System.out.println("ComplexNumberSystem(Double, Double, Double): " + cSystemTest6.toString());
       
      ComplexNumberSystem cSystemTest7 = new ComplexNumberSystem(15, 4, 5, 6);
      System.out.println("ComplexNumberSystem(Double, Double, Double, Double): " + cSystemTest7.toString()); 
      
      ComplexNumberSystem cSystemTest9 = new ComplexNumberSystem(12, cNumberTest1);
      System.out.println("ComplexNumberSystem(Double, ComplexNumber): " + cSystemTest9.toString());
       
      ComplexNumberSystem cSystemTest10 = new ComplexNumberSystem(12, 6, cNumberTest3);
      System.out.println("ComplexNumberSystem(Double, Double, ComplexNumber): " + cSystemTest10.toString()); 
      
      ComplexNumberSystem cSystemTest11 = new ComplexNumberSystem(cNumberTest3, 20);
      System.out.println("ComplexNumberSystem(ComplexNumber, Double): " + cSystemTest11.toString()); 
      
 	ComplexNumberSystem cSystemTest12 = new ComplexNumberSystem(cNumberTest4, 20, 2);
      System.out.println("ComplexNumberSystem(ComplexNumber, Double, Double): " + cSystemTest12.toString()); 
      
 	ComplexNumberSystem test = new ComplexNumberSystem(cSystemTest12);
      System.out.println("ComplexNumberSystem(ComplexNumberSystem): " + test.toString()); 
      
      cNumberTest1.setReal(10);
      System.out.println("SetReal(): " + Double.toString(cNumberTest1.getReal()));
      
      cNumberTest1.setImag(4.5);
      System.out.println("SetImag(): " + Double.toString(cNumberTest1.getImag()));
      
      System.out.println("GetReal(): " + Double.toString(cNumberTest1.getReal()));
      
      System.out.println("GetImag(): " + Double.toString(cNumberTest1.getImag()));
      
      test.invertA();
      System.out.println("InvertB(): " + test.toString());
      
      test.invertB();
      System.out.println("InvertA(): " + test.toString());
      
      test.add();
      System.out.println("Add(): " + test.toString());
      
      test.sub();
      System.out.println("Sub(): " + test.toString());
      
      test.mult();
      System.out.println("Mult(): " + test.toString());
      
      test.div();
      System.out.println("Div(): " + test.toString());
      
      test.mod();
      System.out.println("Mod(): " + test.toString());
      
      test.setA();
      System.out.println("SetA(): " + test.toString());
      
      test.setA(40);
      System.out.println("SetA(Double): " + test.toString());
      
      test.setA(30, 10);
      System.out.println("SetA(Double, Double): " + test.toString());
      
      test.setA(numberTest1);
      System.out.println("SetA(ComplexNumber): " + test.toString());
      
      test.setA(cSystemTest12);
      System.out.println("SetA(ComplexNumberSystem): " + test.toString());
      
      test.setB();
      System.out.println("SetB(): " + test.toString());
      
      test.setB(40);
      System.out.println("SetB(Double): " + test.toString());
      
      test.setB(30, 10);
      System.out.println("SetB(Double, Double): " + test.toString());
      
      test.setB(cNumberTest1);
      System.out.println("SetB(ComplexNumber): " + test.toString());
      
      test.setB(cSystemTest12);
      System.out.println("SetB(ComplexNumberSystem): " + test.toString());
      
      ComplexNumber testA = new ComplexNumber(test.getA());
      System.out.println("GetA(): " + testA.toString());
      
      ComplexNumber testB = new ComplexNumber(test.getB());
      System.out.println("GetB(): " + testB.toString());
      
      ComplexNumber testResult = new ComplexNumber(test.getResult());
      System.out.println("GetResult(): " + testResult.toString());
   }
}
