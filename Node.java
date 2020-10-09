public class Node{
	
			public char exp;
			public Node leftchild,rightchild;
			public int val;	
	
			public Node(char exp) {
				this.exp=exp;
				if(!(exp=='+'||exp=='-'||exp=='/'||exp=='*')){
			
						this.val=Character.getNumericValue(exp);
					}
					else
						this.val=0;
				
			this.leftchild=null;
			this.rightchild=null;
			}
			
            public int getVal() {
				return val;
			}

			public void setVal(int val) {
				this.val = val;
			}

			public char getExp() {
				return exp;
			}
			public void setExp(char exp) {
				this.exp = exp;
			}
			public Node getLeftchild() {
				return leftchild;
			}
			public void setLeftchild(Node leftchild) {
				this.leftchild = leftchild;
			}
			public Node getRightchild() {
				return rightchild;
			}
			public void setRightchild(Node rightchild) {
				this.rightchild = rightchild;
			}
		
			@Override
			public String toString() {
				return "exp=" + exp +" leftchild=" + leftchild + " rightchild=" + rightchild +"";
		
			}

			 }


 