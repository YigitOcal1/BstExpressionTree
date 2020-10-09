public class AlgExpreessionTreeTester {

	public static void main(String[] args) {
		
		
		AlgExpressionTree T1 = new AlgExpressionTree("+*3x5");
		AlgExpressionTree T2 = new AlgExpressionTree("++y9z");
		AlgExpressionTree T3 = new AlgExpressionTree("/-21xy");
		
		T1.displayTree();
		
		T1.setVariable('x', 0);
		System.out.println("Result for x = 0 : " + T1.evaluate());
		
		T1.setVariable('x', 8);
		T1.displayTree();
		System.out.println("Result for x = 8 : " + T1.evaluate());
	
		T1.setVariable('x', 6);

		System.out.println("Result for x = 6 : " + T1.evaluate());
		
		
		System.out.println("Postfix form of T1; ");
		
		T1.displayPostfix();
		
		
		T2.setVariable('y', 10);
		
		System.out.println("Result for y = 10 : " + T2.evaluate());
	    T2.displayTree();
		System.out.println("Postfix form: ");
		System.out.println("Postfix form of T2; ");
		T2.displayPostfix();
	
		T2.setVariable('z', 10);
		
		System.out.println("Result for z = 10 : " + T2.evaluate());
		
		T2.setVariable('y', 3);
		System.out.println("Result for y = 3 : " + T2.evaluate());
		
		T2.displayPostfix();
		
		T3.displayTree();
		System.out.println("Postfix form of T3; ");
		T3.displayPostfix();
		
		T3.setVariable('x',11);
		
		
		System.out.println("Result for x = 11  " + T3.evaluate());
	   T3.displayTree();	
	
	 
	}

}
