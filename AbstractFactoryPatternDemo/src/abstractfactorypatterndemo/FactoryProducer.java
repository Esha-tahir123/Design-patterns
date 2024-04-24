/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypatterndemo;

/**
 *
 * @author SP21-BSE-008
 */
public class FactoryProducer {

   public static AbstractFactory getFactory(String type) {
      if (type.equalsIgnoreCase("rounded")) {
         return new RoundedShapeFactory();
      } else if (type.equalsIgnoreCase("bordered")) {
         return new BorderedShapeFactory();
      } else {
         return new ShapeFactory();
      }
   }
}
