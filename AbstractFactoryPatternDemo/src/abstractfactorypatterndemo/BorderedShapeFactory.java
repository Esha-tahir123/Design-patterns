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
    public class BorderedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("SINGLE BORDERED TRIANGLE")) {
            return new SingleBorderedTriangle();
        } else if (shapeType.equalsIgnoreCase("DOUBLE BORDERED TRIANGLE")) {
            return new DoubleBorderedTriangle();
        }
        return null;
    }
}

