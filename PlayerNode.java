// ListNode.java

class PlayerNode{
   BaseballPlayer data;
   PlayerNode next;

   PlayerNode(BaseballPlayer d){//node constructor where next is null used mostly for inserting into an empty list
   
      data = d;
      next = null;
   }  // constructor
   
   public  BaseballPlayer getData(){
	   return data;
   }
   
	public PlayerNode (BaseballPlayer d, PlayerNode n){//node constructor specifying next
		data = d; 
		next = n;
	}
	

	public PlayerNode getNext() {return next;}
	
	public void setNext(PlayerNode n) {next = n;}
	
}  // class PlayerNode

