//creating a sub class AcademicCourse of the main class course
public class AcademicCourse extends Course{
    private String lecturerName;//declearing all the variables of AcademicCourse
    private String level;
    private String credit;
    private String StartingDate;
    private String completionDate;
    private int NumberOfAssessment;
    private boolean isRegistered;
    //creating parameterized constructor names as AcademicCourse and instance variables are initialized
    public AcademicCourse(String courseID,String courseName,int duration, String level, String credit, 
    int NumberOfAssessment){ 
            super(courseID,courseName,duration);
            this.lecturerName="";
            this.level = level;
            this.credit = credit;
            this.StartingDate = "";
            this.completionDate= "";
            this.isRegistered = false;
            this.NumberOfAssessment=NumberOfAssessment;
    } 
    //creating a getter or accessor method for lecturerName
    public String getLecturerName(){
                return lecturerName;
    }
    //creating a getter or accessor method for level
    public String getLevel(){
                return level;
    }
    //creating a getter or accessor method for credit
    public String getCredit(){
                return credit;
    }
    //creating a getter or accessor method for startingDate
    public String getStartingDate(){
                return StartingDate;
    }
    //creating a getter or accessor method for completionDate
    public String  getCompletionDate(){
                return completionDate;
    }
    //creating a getter or accessor method for isRegistered
    public boolean getIsRegistered(){
                return isRegistered;
    }
    //creating a getter or accessor method for NumberOfAssessment
    public int getNumberOfAssessment(){
                return NumberOfAssessment;
    }
    //setter or mutator method for lecturerName
    public void  setLecturerName (String lecturerName){
                this.lecturerName = lecturerName;
    }
    //setter or mutator method for NumberOfAssessment
    public void  setNumberOfAssessment( int NumberOfAssessment){
                this.NumberOfAssessment = NumberOfAssessment;
    }
    //creating a method register with with four parameters to register the Academic course        
    public void register(String courseLeader, String lecturerName, String StartingDate, String CompletionDate){
        if(isRegistered== true){
                System.out.println("Corser Leader "+super.getCourseLeader()+ "has started at "+StartingDate +"and completed at" +CompletionDate);
                }
        else{
            super.setCourseLeader(courseLeader);
            this.lecturerName = lecturerName;
            this.StartingDate = StartingDate;
            this.completionDate =CompletionDate;
            this.isRegistered = true;
            }
    }
    //to display the required output or result
    public void display(){ 
        super.display();
        if(isRegistered==true){
            System.out.println("lecturerName "+this.lecturerName);
            System.out.println("Level : "+this.level);
            System.out.println("Credit : "+this.credit);
            System.out.println("StartingDate: "+this.StartingDate);
            System.out.println("CompletionDate: "+this.completionDate);
        }
    }
}


 