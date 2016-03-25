
/**
 *PlayerList is a linked list that has three instance variables.
 *first, last and length
 */
public  class PlayerList {

 
   private PlayerNode first = new PlayerNode(null);// First node in linked list - dummy node 
   private PlayerNode last = first;//  Last node in linked list
   private int length = 0;//  Number of data items in the list.
    
  public int getLength(){ //get method for length
      return length; 
     }


   /**
    * Appends a baseball player to end of list
    * it will be used for unsorted list
    */
   public void append(BaseballPlayer d){
        PlayerNode n = new PlayerNode (d); //creates new node
	   last.next = n; // last points to n
	   last = n;//n is now last
	   length++;
	  }//append


   /**
    * Adds a Baseball player to Begining of list
    */
   public void prepend(BaseballPlayer d) { //place new data at the beginning of the linked list
	   PlayerNode n = new PlayerNode(d); //new node
	   n.next = first.next; //S
	   first.next = n; 
	   ++length; 
	   if (first == last) last = n; //if empty list
	  }  // method append(String)
   
   
   /**
   *  Prints the contents of the Linked list in nice format going through all nodes
   *
   */
   public String toString() {
      PlayerNode p = first.next;//look at first node
      String returnString = "";
      while (p != null) {//while we are not at end of list
         returnString += p.data+" ";//add data to return string data also has its own toString method
		 p = p.next;//next node
      }
      return returnString;
   }
  
  /**
   * Will add players in sorted order to a linked list
   * Will utilize to placeholder nodes front and behind for when we need to
   * insert a node in the middle of the list.
   * There are conditions for an empty list,where node needs to be placed first,last and in the middle
   * 
   */
   public void insertPlayer (BaseballPlayer d) {
	   if (first.next == null)//if empty list
		{
			first.next = new PlayerNode(d);	// make first node after dummy
		}
	   else{
	   if (d.getPlayerNumber() < first.next.getData().getPlayerNumber()){//compare player object to first item on list
           first.next = new PlayerNode(d,first.next); // stick in the beginning if number is less
       } 
	   else {
           PlayerNode front = first.next;//use as placeholder to look in front
           PlayerNode behind = first.next;//use as another placeholder will hold previous node we looked at or what in back of us
           while (front != null){// while we are not at end of list
               if(front.getData().getPlayerNumber()<d.getPlayerNumber()){//if our placeholder has smaller number
                   behind = front;//make current previous or what we are looking back at
                   front = front.next;//increment current to next on list
               }
               else {//if it was less that placeholder
                   behind.next= new PlayerNode(d, front); //insert object between previous and current nodes
                   break;
                } 
              } // while
           if (front == null){//if we go through whole list
               behind.next = new PlayerNode(d); //insert object as last node
           }
         }
      } 
    }//insertplayer
  }  // class PlayerList

