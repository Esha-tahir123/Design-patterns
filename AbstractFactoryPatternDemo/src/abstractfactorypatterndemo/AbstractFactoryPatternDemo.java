/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypatterndemo;

/**
 *
 * @author sp21-bse-008
 */
public class AbstractFactoryPatternDemo {
   public static void main(String[] args) {
      // get shape factory
      AbstractFactory ShapeFactory = FactoryProducer.getFactory("Shape");
      // get an object of Shape Rectangle
      Shape shape1 = ShapeFactory.getShape("RECTANGLE");
      // call draw method of Shape Rectangle
      shape1.draw();
      // get an object of Shape Square
      Shape shape2 = ShapeFactory.getShape("SQUARE");
      // call draw method of Shape Square
      shape2.draw();
      // get an object of Shape Triangle
      Shape shape3 = ShapeFactory.getShape("TRIANGLE");
      // call draw method of Shape Triangle
      shape3.draw();
      System.out.println();
      // get shape factory
      AbstractFactory shapeFactory1 = FactoryProducer.getFactory("Rounded");
      // get an object of Shape Rectangle
      Shape shape4 = shapeFactory1.getShape("RECTANGLE");
      // call draw method of Shape Rectangle
      shape4.draw();
      // get an object of Shape Square
      Shape shape5 = shapeFactory1.getShape("SQUARE");
      // call draw method of Shape Square
      shape5.draw();
      Shape shape6 = shapeFactory1.getShape("TRIANGLE");
      // call draw method of Shape Square
      shape6.draw();
      System.out.println();
      // get shape factory
      AbstractFactory shapeFactory2 = FactoryProducer.getFactory("bordered");
      Shape shape7 = shapeFactory2.getShape("SINGLE BORDERED TRIANGLE");
      shape7.draw();
      Shape shape8 = shapeFactory2.getShape("DOUBLE BORDERED TRIANGLE");
      shape8.draw();
   }
}