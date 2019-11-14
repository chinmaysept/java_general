package design.pattern.visitor;

public class ClientVisitor {
public static void main(String[] args) {
	ComputerPart computer = new Computer();
	computer.accept(new ComputerPartDisplayVisitor());
	}
	
}
