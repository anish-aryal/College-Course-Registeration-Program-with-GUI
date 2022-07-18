//creating a subclass NonAcademicCourse of main class Course
public class NonAcademicCourse extends Course{
    private String instructorName;//declaring all the variables
    private String startDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    /*creating a parameterized constructor NonAcademicCourse and Initializing 
      the variables */
    public NonAcademicCourse(String courseID, String courseName, String prerequisite, int duration){
        super(courseID, courseName, duration);
        this.instructorName = instructorName;
        this.startDate ="";
        this.completionDate="";
        this.examDate = "";
        this.prerequisite = prerequisite;
        this.isRegistered = false;
        this.isRemoved = false;     
    }
    //creating a getter or accessor method for instructorName
     public String getInstructorName(){
        return instructorName;
    }
    //creating a getter or accessor method for Prerequisite
    public String getPrerequisite(){
        return prerequisite;
    }
    //creating a getter or accessor method for startDate
    public String getStartDate(){
        return startDate;
    }
    //creating a getter or accessor method for completionDate
    public String getCompletionDate(){
        return completionDate;
    }
    //creating a getter or accessor method for examDate
    public String getExamDate(){
        return examDate;
    }
    //creating a getter or accessor method for isRegistered
    public boolean getIsRegistered(){
        return isRegistered;
    }
    //creating a getter or accessor method for isRemoved
    public boolean getIsRemoved(){
        return isRemoved;
    }
    /*using a setter methof for instructorName that accepts instructorName as
      the parameter*/
    public void setInstructorName(String instructorName){
        this.instructorName = instructorName;
        if(isRegistered ==false){
            this.instructorName = instructorName;
        }
        else{
            System.out.println("The instructor is already registered and cannot be changed");//display the msg
        }
    }
    /* creating a method register with five parameters to register the 
       Non academic course if it is not already registered */
    public void register(String courseLeader, String instructorName, String startDate, String completionDate, String examDate){
        if(isRegistered == false){
        super.setCourseLeader(courseLeader);
        setInstructorName(instructorName);
        this.startDate=startDate;
        this.completionDate=completionDate;
        this.examDate=examDate;
        this.isRegistered = true;
        }
        else{
            System.out.println("Non Academic Course is already registered");
        }
    }
    //creating a method remove to remove the registered course if any condition arises
    public void remove(){
             if(isRemoved==true){
            System.out.println("Non-Academic Course is removed");
        }
         else{
            super.setCourseLeader("");
            this.instructorName="";
            this.startDate="";
            this.completionDate="";
            this.examDate="";
            this.isRegistered=false;
            this.isRemoved=true;
         }
    }
    //to display the desired result or output
    public void display(){
        super.display();
        if(isRegistered==true){
            System.out.println("Instructor Name "+this.instructorName);
            System.out.println("Start Date "+this.startDate);
            System.out.println("Completion Date "+this.completionDate);
            System.out.println("Exam Date "+this.examDate);
        }
    }
}