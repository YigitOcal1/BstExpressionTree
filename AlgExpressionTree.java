import java.util.Stack;

 class AlgExpressionTree {
	
	 public Node root;

	 public AlgExpressionTree() {
		 root=null;
	 }

	Node tree(char [] pre) {
	    	Stack<Node> exp = new Stack<Node>();		 	 
		 	Node temp=root;
		 	for(int i=pre.length-1;i>=0;i--) {
		 		if(pre[i]=='+'||pre[i]=='-'||pre[i]=='*'||pre[i]=='/') {
		 			temp=new Node(pre[i]);
		 			Node temp1=exp.pop();
		 			Node temp2=exp.pop();
		 			temp.rightchild=temp2;
		 			temp.leftchild=temp1;
		 			exp.push(temp);
		 		}else {
		 			temp=new Node(pre[i]);
		 			exp.push(temp);
		 		}
		 	}
		 	
	   root=exp.peek();
	   exp.pop();	  
	   return root;
	    }

	
	    public AlgExpressionTree(String expression) {
	    char []a=new char[expression.length()];
	    for(int i=0;i<expression.length();i++) {
	    	a[i]=expression.charAt(i);
	    }
	         tree(a);
	
	    }

void print(Node a) {
	if(a!=null) {
		Node b=a.leftchild.rightchild;
	    Node c=a.rightchild;
	    Node d=a.rightchild.rightchild;
	    Node e=a.leftchild.leftchild;
		
	    System.out.println("       "+" "+a.exp);
		System.out.println("      /   \\");
		
			a=a.leftchild;
			
			System.out.println("     "+a.exp+"     "+c.exp);
			System.out.println("    / \\");
			System.out.println("   "+e.exp+"   "+b.exp);}
	
		
	}
	
void displayTree() {
	System.out.println("\r");
	print(root);

}

	void displayPostfix() {
		postfix(root);
	}
	
	 public String postfix(Node a) {
		 String post=" ";
		 if(a!=null) {
			 
			 post+= postfix(a.getLeftchild());
			 post+=postfix(a.getRightchild());
			 post+=a.getExp()+" ";			
			 System.out.print(a.getExp()+"");		
		
		 }
	return post;
	 }
	 
	
	    void setVariable(char varName, int varValue) {
	        Node temp = findnode(root, varName);
	         temp.val= varValue;    
	    }
	 
	  public Node findnode(Node a,char b) {
		  if(a!=null) {
		  if(a.exp==b)
			  return a;		  	  
		  else {
			  Node temp=findnode(a.leftchild,b);
			  if(temp==null) {
				  temp=findnode(a.rightchild,b);
			  }
		  return temp;
		  }}
		  else {
			  return null;
		  } 		  	  	  
	  }
	 
	    double evaluate()
	    {
	    
	    	return evanode(root);
	    }

	   double evanode(Node a) {
	
		   double result=0.0;
		   if(a.getLeftchild()==null&&a.getRightchild()==null) {
			   return ((double)a.getVal());
		   }
		   else {
			  
			   double leftchild=evanode(a.leftchild);
			   double rightchild=evanode(a.rightchild);
			   String b=(""+a.getExp());
			
			   switch(b) {
			   case "+":
                   result = leftchild + rightchild;
                   break;
               case "-":
                   result = leftchild - rightchild;
                   break;
               case "*":
                   result = leftchild * rightchild;
                   break;
               case "/":
                   result = leftchild / rightchild;
                   break;

			   }		
		   }
		   System.out.print("\n");
		   return result;
		}
		
 
 
 
 }		
			
		
				

	
