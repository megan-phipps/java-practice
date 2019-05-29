package java_Day_48;

public class Value {
	  private int val;
	  
	  //constructors
	  public Value(int val){
		  
	  }
	  public Value(){
		  
	  }
	  
	  //methods
	  public void setVal(int num){
	    this.val = num;
	  }
	  public boolean wasModified(){
	    if(val != getVal()){
	      return true;
	    }
	    return false;
	  }
	  public int getVal(){
	    if(wasModified()){
	      return val;
	    }else if(!wasModified()){
	      return val;
	  }
	  return 0;
	}


	}

