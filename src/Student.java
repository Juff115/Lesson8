public class Student {

    //instance variables
    //these are the properties of a student

    	private String name;
    
	//turn this into an array///////////////
    	private int test[]= new int[3]; 


 //constructor methods - 3 ways you can make a student


	//Additonal Constructor
	public Student(String nm, int t[]) {
		name = nm;
		test=t;
	}
        
        public Student(Student other){
		this(other.name, other.test);
	}

    /*
    other methods
    these give our object more abilities
    */


    public void setName(String nm) {
    	name = nm;
    }

    public void setMark(int i, int score){
    	test[i-1] =score;
    }

    public int getAverage() {
    	int average = (test[0] + test[1] + test[2]) / 3;
    	return average;
    }


    public int getMark(int i) {
	return test[i-1];
    }

//    public int getHighscore() {
//    	if (mark1 > mark2 && mark1 > mark3) {
//    		return mark1;
//    	}
//    	else if (mark2 > mark1 && mark2 > mark3){
//    		return mark2;
//
//    	} else {
//    		return mark3;
//    	}
//    }

    public String toString() {
    	String result = "Name:\t\t" + name+ "\n";
    	result+= ""+getAverage();
    	return result;
    }

    public String getName() {
    	return name;
    }
    
    //validate data
    public String validateData() {
    	String message = null;
    	//check if name is entered
    	if (name.length() <2) 
    		message += "\nName is required\nPlease re-enter all data";
    	
	if (test[0] < 0 || test[0] > 100 || test[1] < 0 || test[1] > 100 || test[2] < 0 || test[2] > 100) 
    		message += "\nAt least one mark is out of range, please re-enter all data";
	if (message !=null)
            message+=("\n Please re-enter all data. ");
	return message;
    	}
 }

