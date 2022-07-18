//creating a class name course
public class Course {
    //declaring instance variables for Course class
     private String courseID;
     private String courseName;
     private int duration;
     private String courseLeader;
    //creating and defining paramaterized constructor    
     public Course(String courseID, String courseName, int duration) {
         this.courseID = courseID;
         this.courseName = courseName;
         this.duration = duration;
         this.courseLeader = " ";
     }
    //getter or accesssor method for courseID
     public String getCourseID() {
         return courseID;
     }
    //getter or acccessor method for courseName
     public String getCourseName() {
         return courseName;
     }
    //getter ir accessor method for duration
     public int getDuration() {
         return duration;
     }
    //getter or accessor method for courseLeader
     public String getCourseLeader() {
         return courseLeader;
     }
    //to set courseLeader/ Setter method for courseLeader
     public void setCourseLeader(String courseLeader) {
         this.courseLeader = courseLeader;
     }
    //To display the desired result or output
     public void display() {
         System.out.println("The courseID is" + courseID);
         System.out.println("The courseName is" + courseName);
         System.out.println("The duration is" + duration);
         if (courseLeader != "") {
             System.out.println("The courseLeader is" + courseLeader);
         }

     }
 }