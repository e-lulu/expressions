package Structure.binary;

import Structure.Expression;
import Visitor.Visitor;


public class Plus extends Binary{
	public Plus (Expression e1, Expression e2){
		super(e1,e2);
	}

	public void accept(Visitor visitor) {}
}