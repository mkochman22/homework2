// Mary Kochmanski
// CIS 221, Tuesdays and Thursdays at 2:10PM
public class Main {
  // class attributes
  int x;
  int y;

 
  public Main(int z) {						//constructor takes parameter to set the values of x and y
  	x = z;
    y = z + 2;
  }

  public static void main(String[] args) {	
    Main myObj = new Main(5);				//create object of class and calls the constructor 
    System.out.println("x = " + myObj.x);	//outputs value of x
    System.out.println("y = " + myObj.y);	//outouts value of y
  }
}
