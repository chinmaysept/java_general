package design.pattern.facade;

public class ClientFacade {
public static void main(String[] args) {
ShapeMaker shapeMaker = new ShapeMaker();
shapeMaker.drawCircle();
shapeMaker.drawRectangle();
shapeMaker.drawSquare();
}
}
