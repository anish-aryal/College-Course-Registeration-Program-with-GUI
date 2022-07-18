import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class INGCollege implements ActionListener {
    JFrame frame;
    
    JLabel aTitle,aCourseID,aCourseName,aCourseLeader,aLecturerName,aLevel,aCredit,aStartingDate,aCompletionDate,aNoOfAssessment,aDuration,
           naTitle,naCourseID,naCourseName,naCourseLeader,naInstructorName,naPrerequisite,naExamDate,naStartingDate,naDuration,naCompletionDate;
           
    JTextField atCourseID,atCourseName,atCourseLeader,atLecturerName,atLevel,atCredit,atStartingDate,atCompletionDate,atNoOfAssessment,atDuration,
                natCourseID,natCourseName,natCourseLeader,natInstructorName,natPrerequisite,natExamDate,natStartingDate,natDuration,natCompletionDate;
    
    JButton btnacademic,btnnonacademic,
            aRegister,aAdd,aClear,aDisplay,
            naRegister,naAdd,naClear,naDisplay,naRemove;
    
    JPanel academic,nonacademic,shift;
    Font labelpoppins,titlepoppins;
    
    static AcademicCourse academicObject;
    
    static NonAcademicCourse nonacademicobj;
    
    ArrayList <Course>arraylist = new ArrayList<Course>();
    private String addCourseID,addCourseName,addDuration,addCourseLeader,
                    addLevel,addCredit,addNumberOfAssessment,addStartingDate,addCompletionDate,addLecturerName,
                    nonaddCourseID,nonaddCourseName,nonaddCourseLeader,nonaddPrerequisite,nonaddInstructorName,nonaddDuration,
                    nonaddStartingDate,nonaddCompletionDate,nonaddExamDate;
    private int add_Duration,add_NoOfAssessment,
                nonadd_Duration;
    
    
    INGCollege()
    {

        //Creating objects
         
        // Creating a new frame
        frame = new JFrame("Course Registeration Form");

        // Creating Panel for Academic Course and Non-Academic Course
        academic = new JPanel();
        nonacademic = new JPanel();
        shift = new JPanel();
        
        //-------------------------------Creating Labels------------------------------------------
        
        // Labels for Academic course
        aTitle = new JLabel("Academic  Course");
        aCourseID = new JLabel("Course ID");
        aCourseName = new JLabel("Course Name");
        aCourseLeader = new JLabel("Course Leader");
        aLecturerName = new JLabel("Lecturer Name");
        aLevel = new JLabel("Level");
        aCredit = new JLabel("Credit");
        aStartingDate = new JLabel("Starting Date");
        aCompletionDate = new JLabel("Completion Date");
        aNoOfAssessment = new JLabel("Number of Assessment");
        aDuration = new JLabel("Duration");
        
        // Labels for Non- Academic Course
        naTitle = new JLabel("Non-Academic Course");
        naCourseID = new JLabel("Course ID");
        naCourseName = new JLabel("Course Name");
        naCourseLeader = new JLabel("Course Leader");
        naInstructorName = new JLabel("Instructor Name");
        naPrerequisite = new JLabel("Prerequisite");
        naExamDate = new JLabel("Exam Date");
        naStartingDate = new JLabel("Starting Date");
        naDuration = new JLabel("Duration");
        naCompletionDate = new JLabel("Completion Date");
        
        //-------------------------------Creating Text Fields------------------------------------------
        
        // Text Field for Academic Course
        atCourseID = new JTextField();
        atCourseName = new JTextField();
        atCourseLeader = new JTextField();
        atLecturerName = new JTextField();
        atLevel = new JTextField();
        atCredit = new JTextField();
        atStartingDate = new JTextField();
        atCompletionDate = new JTextField();
        atNoOfAssessment = new JTextField();
        atDuration = new JTextField();
        
        // Text Field For Non-Academic Course
        natCourseID = new JTextField ();
        natCourseName = new JTextField();
        natCourseLeader = new JTextField();
        natInstructorName = new JTextField();
        natPrerequisite = new JTextField();
        natExamDate = new JTextField();
        natStartingDate = new JTextField();
        natDuration = new JTextField();
        natCompletionDate = new JTextField();
        
        
        //-------------------------------Setting Bounds------------------------------------------
        
        // Setting Bound for Labels of academic course
        aTitle.setBounds(46,0,298,36);
        aCourseID.setBounds(0,63,78,19);
        aCourseName.setBounds(198,63,104,19);
        aCourseLeader.setBounds(0,377,114,20);
        aLecturerName.setBounds(198,377,111,20);
        aLevel.setBounds(0,148,42,20);
        aCredit.setBounds(198,148,58,20);
        aStartingDate.setBounds(0,461,200,18);
        aCompletionDate.setBounds(197,461,133,19);
        aNoOfAssessment.setBounds(0,230,171,20);
        aDuration.setBounds(197,230,68,20);
        
        // Setting Bounds For TextFields of Academic Course
        atCourseID.setBounds(2,91,181,40);
        atCourseName.setBounds(200,91,181,40);
        atStartingDate.setBounds(2,490,181,40);
        atCompletionDate.setBounds(200,490,181,40);
        atLevel.setBounds(2,176,181,40);
        atCredit.setBounds(200,176,181,40);
        atCourseLeader.setBounds(2,407,181,40);
        atLecturerName.setBounds(200,407,181,40);
        atNoOfAssessment.setBounds(2,259,181,40);
        atDuration.setBounds(200,259,181,40);
        
        // Setting Bound for Labels of Non-academic course
        naTitle.setBounds(2,0,377,39);
        naCourseID.setBounds(0,63,78,20);
        naCourseName.setBounds(198,63,104,20);
        naCourseLeader.setBounds(0,293,109,20);
        naInstructorName.setBounds(198,293,200,20);
        naPrerequisite.setBounds(0,148,94,20);
        naExamDate.setBounds(0,462,103,20);
        naStartingDate.setBounds(0,377,103,20);
        naDuration.setBounds(198,148,69,20);
        naCompletionDate.setBounds(198,377,131,20);
         
        // Setting Bounds For TextFields of Non-Academic Course
        natCourseID.setBounds(2,91,181,40);
        natCourseName.setBounds(200,91,181,40);
        natCourseLeader.setBounds(2,320,181,40);
        natInstructorName.setBounds(200,320,181,40);
        natPrerequisite.setBounds(2,176,181,40);
        natExamDate.setBounds(1,490,181,40);
        natStartingDate.setBounds(2,405,181,40);
        natDuration.setBounds(200,176,181,40);
        natCompletionDate.setBounds(200,405,181,40);
        
        //-------------------------------Creating and Setting Buttons------------------------------------------
        Color btncolor = new Color(0,153,0);
        // Creating and Setting Bounds for Buttons for Academic Course
        // Creating Buttons
        aRegister = new JButton("Register");
        aAdd = new JButton("Add");
        aClear = new JButton("Clear");
        aDisplay = new JButton("Display");
        
        // Setting Bounds
        aRegister.setBounds(0,590,382,38);
        aRegister.setBackground(btncolor);
        aRegister.setForeground(Color.WHITE);
        aRegister.setOpaque(true);
        aRegister.setBorderPainted(false);
        aAdd.setBounds(0,320,382,38);
        aAdd.setBackground(btncolor);
        aAdd.setOpaque(true);
        aAdd.setForeground(Color.WHITE);
        aAdd.setBorderPainted(false);
        aClear.setBounds(0,544,383,38);
        aClear.setBackground(btncolor);
        aClear.setOpaque(true);
        aClear.setForeground(Color.WHITE);
        aClear.setBorderPainted(false);
        aDisplay.setBounds(0,635,382,38);
        aDisplay.setBackground(btncolor);
        aDisplay.setForeground(Color.WHITE);
        aDisplay.setOpaque(true);
        aDisplay.setBorderPainted(false);
        
        // Creating and Setting Bounds for Buttons For Non-Academic Course
        // Creating Buttons
        naRegister = new JButton("Register");
        naRemove = new JButton("Remove");
        naAdd = new JButton("Add");
        naClear = new JButton("Clear");
        naDisplay = new JButton("Display");

        // Setting Bounds
        naRegister.setBounds(0,589,382,38);
        naRegister.setBackground(btncolor);
        naRegister.setForeground(Color.WHITE);
        naRegister.setOpaque(true);
        naRegister.setBorderPainted(false);
        naRemove.setBounds(0,543,382,38);
        naRemove.setBackground(btncolor);
        naRemove.setForeground(Color.WHITE);
        naRemove.setOpaque(true);
        naRemove.setBorderPainted(false);
        naAdd.setBounds(0,236,382,38);
        naAdd.setBackground(btncolor);
        naAdd.setForeground(Color.WHITE);
        naAdd.setOpaque(true);
        naAdd.setBorderPainted(false);
        naClear.setBounds(201,490,181,40);
        naClear.setBackground(btncolor);
        naClear.setForeground(Color.WHITE);
        naClear.setOpaque(true);
        naClear.setBorderPainted(false);
        naDisplay.setBounds(0,635,382,38);
        naDisplay.setBackground(btncolor);
        naDisplay.setForeground(Color.WHITE);
        naDisplay.setOpaque(true);
        naDisplay.setBorderPainted(false);
        
        //---Adding button to shift between academic and non academic panel---
        //creating buttons
        btnacademic = new JButton("Academic");
        btnnonacademic = new JButton("Non-Academic");
        //setting Bounds
        btnacademic.setBounds(0,0,183,39);
        btnnonacademic.setBounds(196,0,183,39);
        btnnonacademic.setBorderPainted(false);
    
                
        //adding buttons to the shift panel
        shift.add(btnacademic);
        shift.add(btnnonacademic);
        
        
        //------------------------Adding to the panels----------------------------
        
        //  Adding components of Academic course to academic  panel 
        
        // Adding academic course labels to academic course panel
        academic.add(aTitle);
        academic.add(aCourseID);
        academic.add(aCourseName);
        academic.add(aCourseLeader);
        academic.add(aLecturerName);
        academic.add(aLevel);
        academic.add(aCredit);
        academic.add(aStartingDate);
        academic.add(aCompletionDate);
        academic.add(aNoOfAssessment);
        academic.add(aDuration);
        // Adding Academic Course Textfields to academic panel
        academic.add(atCourseID);
        academic.add(atCourseName);
        academic.add(atCourseLeader);
        academic.add(atLecturerName);
        academic.add(atLevel);
        academic.add(atCredit);
        academic.add(atStartingDate);
        academic.add(atCompletionDate);
        academic.add(atNoOfAssessment);
        academic.add(atDuration);
        // Adding Academic course Buttons to academic panels
        academic.add(aAdd);
        academic.add(aClear);
        academic.add(aRegister);
        academic.add(aDisplay);
        
        // Adding Components of Non Academmic Course to nonacademic panel
        
        // Adding Labels of Non-Academic Course to nonacademic panel
        nonacademic.add(naTitle);
        nonacademic.add(naCourseID);
        nonacademic.add(naCourseName);
        nonacademic.add(naCourseLeader);
        nonacademic.add(naInstructorName);
        nonacademic.add(naPrerequisite);
        nonacademic.add(naExamDate);
        nonacademic.add(naStartingDate);
        nonacademic.add(naDuration);
        nonacademic.add(naCompletionDate);
        // Adding Text Fields of Non-Academic course to nonacademic panel
        nonacademic.add(natCourseID);
        nonacademic.add(natCourseName);
        nonacademic.add(natCourseLeader);
        nonacademic.add(natInstructorName);
        nonacademic.add(natPrerequisite);
        nonacademic.add(natExamDate);
        nonacademic.add(natStartingDate);
        nonacademic.add(natDuration);
        nonacademic.add(natCompletionDate);
        // Adding Buttons of Non-Academic Course to nonacademic panel
        nonacademic.add(naAdd);
        nonacademic.add(naClear);
        nonacademic.add(naRegister);
        nonacademic.add(naRemove);
        nonacademic.add(naDisplay);
        
        
        //--------------------------Setting Fonts for all labels--------------------------------------------------------------
        
        //creating font by importing from files for all the labels
        try
        {
                    // load a custom font in your project folder
                labelpoppins = Font.createFont(Font.TRUETYPE_FONT, new File("Poppins-Regular.ttf")).deriveFont(14f);    
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Poppins-Regular.ttf")));            
        }
        catch(IOException | FontFormatException e){
                
        }
        try
        {
                // load a custom font in your project folder
                titlepoppins = Font.createFont(Font.TRUETYPE_FONT, new File("Poppins-ExtraBold.ttf")).deriveFont(29f);    
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Poppins-ExtraBold.ttf")));            
        }
            catch(IOException | FontFormatException e)
        {
                
        }
        //setting Fonts for label of Academic Course
        aTitle.setFont(titlepoppins);
        aCourseID.setFont(labelpoppins);
        aCourseName.setFont(labelpoppins);
        aCourseLeader.setFont(labelpoppins);
        aLecturerName.setFont(labelpoppins);
        aLevel.setFont(labelpoppins);
        aCredit.setFont(labelpoppins);
        aStartingDate.setFont(labelpoppins);
        aCompletionDate.setFont(labelpoppins);
        aNoOfAssessment.setFont(labelpoppins);
        aDuration.setFont(labelpoppins);
        
        // Setting Fonts for Labels of Non-academic course
        naTitle.setFont(titlepoppins);
        naCourseID.setFont(labelpoppins);
        naCourseName.setFont(labelpoppins);
        naCourseLeader.setFont(labelpoppins);
        naInstructorName.setFont(labelpoppins);
        naPrerequisite.setFont(labelpoppins);
        naExamDate.setFont(labelpoppins);
        naStartingDate.setFont(labelpoppins);
        naDuration.setFont(labelpoppins);
        naCompletionDate.setFont(labelpoppins);
        
        

        
        //-------------------------Adding Action listener--------------------------------
        btnacademic.addActionListener(this);
        btnnonacademic.addActionListener(this);
        aClear.addActionListener(this);
        naClear.addActionListener(this);
        aAdd.addActionListener(this);
        naAdd.addActionListener(this);
        aRegister.addActionListener(this);
        naRegister.addActionListener(this);
        aDisplay.addActionListener(this);
        naRemove.addActionListener(this);
        naDisplay.addActionListener(this);
        
        //-------------------------Giving Properties for all the three panels--------------------------------
        
        //setting width height and visibility for shift panel
        shift.setVisible(true);
        shift.setSize(381,39);
        shift.setLocation(63,14);
        shift.setLayout(null);
        
        // Setting properties for academic panel
        academic.setSize(382,674);
        academic.setLocation(63,74);
        academic.setLayout(null);
        academic.setVisible(true);
        
        // Setting properties for non academic panel
        nonacademic.setSize(382,674);
        nonacademic.setLocation(63,74);
        nonacademic.setLayout(null);
        nonacademic.setVisible(false);
        
    
        
        
        
        //-----------------------------Adding Panels to the Frame--------------------------------------
        //adding academic, non academic and shift panels to the frame
        frame.add(shift);
        frame.add(academic);
        frame.add(nonacademic);
        
        frame.setLayout(null);//to use absolute positioning
        frame.setSize(500,800);//setting size int width, int height
        frame.setMaximumSize(new Dimension(500, 900));
        frame.setVisible(true);/*default value is false so we need this
                                method as true to make the frame visible*/

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to ristrict the program to run in background after closing
        
        
    
    }
    
    //Action Performed Method for actionListener
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==aAdd)//Action event for add button of academic course
        {   
            addacademiccourse();//calling addacademiccourse method
        }
        else if (e.getSource()==naAdd)//action event for add button of non academic course
        {
            addnonacademiccourse();//calling addnonacademiccourse method
        }
        
        
        else if(e.getSource()==btnacademic)//action event for academic button which is used to shift to academic panel
        {
            btnacademic.setBorderPainted(true);
            btnnonacademic.setBorderPainted(false);
            
            academic.setVisible(true);
            nonacademic.setVisible(false);
        }
        else if(e.getSource()==btnnonacademic)//action event for academic button which is used to shift to non academic panel
        {
            btnacademic.setBorderPainted(false);
            btnnonacademic.setBorderPainted(true);
            
            academic.setVisible(false);
            nonacademic.setVisible(true); 
        }
        else if (e.getSource()==aClear)//action event to clear button of academic panel to clear all the textfields
        {
            atCourseID.setText(" ");
            atCourseName.setText(" ");
            atCourseLeader.setText(" ");
            atLecturerName.setText(" ");
            atLevel.setText(" ");
            atCredit.setText(" ");
            atStartingDate.setText(" ");
            atCompletionDate.setText(" ");
            atNoOfAssessment.setText(" ");
            atDuration.setText(" ");
        }
        else if(e.getSource()==naClear)//action event to clear button of nonacademic panel to clear all the textfields
        {
            natCourseID.setText(" ");
            natCourseName.setText(" ");
            natCourseLeader.setText(" ");
            natInstructorName.setText(" ");
            natPrerequisite.setText(" ");
            natExamDate.setText(" ");
            natStartingDate.setText(" ");
            natCompletionDate.setText(" ");
            natDuration.setText(" ");
        }
        
        else if (e.getSource()==aRegister)//action event for register button of academic panel to register a new course
        {
            academicregister(); //calling academic register method
        }
        else if(e.getSource()==naRegister)
        {
            nonacademicregister();//calling nonacademic register method
        }
        else if(e.getSource()==aDisplay)//action event for Display button of academic panel to displau the information of acaadimic course
        {
            displayacademic();//calling display academic method
        }
        else if(e.getSource()==naDisplay)//action event for display button of nonacademic panel to display the information of non academic course
        {
            displaynonacademic();//calling display nonacademic method
        }
        else if(e.getSource()==naRemove)// action event for remove button of nonacademic panel to remove a course
        {
            nonacademicremove();//calling nonacademic remove method
        }
    }
    
    /* creating a method nonacademiccourse() to assign 
     * certain task to its respective add button */
     
    public void addacademiccourse()
    {
        //try and catch block to handel the Number format exception
        try
            {
                /* assigning values to respective variables form text field of gui 
                   using get text method*/
                addCourseID= atCourseID.getText();
                addCourseName=atCourseName.getText();
                addCourseLeader=atCourseLeader.getText();
                addDuration=atDuration.getText();
                add_Duration = Integer.parseInt(addDuration);
                addLevel=atLevel.getText();
                addCredit=atCredit.getText();
                addNumberOfAssessment=atNoOfAssessment.getText();
                add_NoOfAssessment = Integer.parseInt(addNumberOfAssessment);
                
                boolean isadded =false;//creating boolean is added to value false
                for(Course academicObject:arraylist)//for each loop
                {
                    if (academicObject.getCourseID().equals(addCourseID))//checking is textfield value is equal to get courseID()
                    {
                        isadded=true;//set isadded to true
                        break;//break the loop
                    }  
                }
                if(isadded==false)
                {
                    academicObject = new AcademicCourse(addCourseID,addCourseName,
                                         add_Duration,addLevel,addCredit,add_NoOfAssessment);//creating object of academic course
                    arraylist.add(academicObject);//addingobject ot arraylist
                            
                    JOptionPane obj1 = new JOptionPane();//creating JOptionPane
                    String finalmsg= "CourseID: "+addCourseID+ "\n"+"CourseName"+addCourseName+ "\n"+"Duration: "
                                            +add_Duration+"\n"+"Level: "+addLevel+"\n"+"Credit: "+addCredit+"\n"+
                                            "Number of Assessment: "+add_NoOfAssessment+"\n"+"is added to Academic course";
                    //Displaying Message                         
                    obj1.showMessageDialog(academic, finalmsg);
                }
                else if(isadded==true)
                {
                    JOptionPane alreadyadded = new JOptionPane();//Creating JOptionPane
                    //Displaying Message
                    alreadyadded.showMessageDialog(academic,"Course with"+"\n"+ "CourseID:" +"\""+addCourseID+"\","+"\n"+"is already added.","Alert!!",alreadyadded.WARNING_MESSAGE);
                }
            }
        catch(NumberFormatException n)//handeling Exxception
        {
            JOptionPane numex = new JOptionPane();//creating JOptionPane
            //Displaying Message
            numex.showMessageDialog(academic,"Give Valid integer value to "+"\n"+ "Duration and Number of Assessment","Invalid Inputs!!",numex.WARNING_MESSAGE);
        }
    }
    
    /* creating a method addnonacademiccourse() to assign 
     * certain task to its respective add button */
    
    public void addnonacademiccourse()
    {
        try
        {
                nonaddCourseID= natCourseID.getText();
                nonaddCourseName=natCourseName.getText();
                nonaddCourseLeader=natCourseLeader.getText();
                nonaddDuration=natDuration.getText();
                nonadd_Duration = Integer.parseInt(nonaddDuration);
                nonaddPrerequisite=natPrerequisite.getText();
                     
        
                boolean nonisadded =false;//crreating nonisadded to false
                for(Course nonacademicObject:arraylist)//foreach loop
                {
                    if (nonacademicObject.getCourseID().equals(nonaddCourseID))//checking is textfield value is equal to get courseID()
                    {
                        nonisadded=true;//set nonisadded to true
                        break;//break the loop
                    }  
                }
                if(nonisadded==false)
                {
                    // Cunstructor of non Academic Course Class
                    nonacademicobj = new NonAcademicCourse(nonaddCourseID,nonaddCourseName,nonaddPrerequisite,nonadd_Duration);
                    arraylist.add(nonacademicobj);//add obj to the arraylist
                            
                    JOptionPane obj1 = new JOptionPane();//create JOptionPane
                    String finalmsg= "CourseID: "+nonaddCourseID+ "\n"+"CourseName: "+nonaddCourseName+ "\n"+"Prerequisite: "+nonaddPrerequisite+"\n"+
                                    "Duration: "+nonadd_Duration+"\n"+"is Sucessfully added to Non-Academic course";
                    //Displaying Message                        
                    obj1.showMessageDialog(nonacademic, finalmsg);
                }
                else if(nonisadded==true)
                {
                    JOptionPane alreadyadded = new JOptionPane();//CreateJOptionPane
                    //DisplayingMessage
                    alreadyadded.showMessageDialog(nonacademic,"Course with"+"\n"+ "CourseID:" +"\""+nonaddCourseID+"\","+"\n"+"is already added.","Alert!!",alreadyadded.WARNING_MESSAGE);
                }
        }
        catch(NumberFormatException n)//handeling Excepption
        {
            JOptionPane numex = new JOptionPane();//create JOptionPane
            //Displaying Message
            numex.showMessageDialog(nonacademic,"Give Valid integer value to Duration","Invalid Inputs!!",numex.WARNING_MESSAGE);
        }
    }
    
    /* creating a method nonacademicregister() to assign 
     * certain task to its respective register button */
     
    public void nonacademicregister()
    {
        try
        {
                //initializing values to variables
                nonaddCourseID= natCourseID.getText();
                nonaddCourseName=natCourseName.getText();
                nonaddCourseLeader=natCourseLeader.getText();
                nonaddInstructorName=natInstructorName.getText();
                nonaddExamDate=natExamDate.getText();
                nonaddPrerequisite=natPrerequisite.getText();
                nonaddStartingDate=natStartingDate.getText();
                nonaddCompletionDate = natCompletionDate.getText();
                nonaddDuration=natDuration.getText();
                nonadd_Duration=Integer.parseInt(nonaddDuration);
                
                boolean isreg=false;//creating isreg boolean as value false
                for(Course nonacademicObject:arraylist)//foreachloop
                {
                    if(nonacademicObject.getCourseID().equals(nonaddCourseID))//checking ig value of text field is equal to getCourseId()
                    {
                        NonAcademicCourse nonobj = (NonAcademicCourse)nonacademicObject; //Downcasting object of Course class"Parent Class" to Academic Course"Child Class"
                        if(nonobj.getIsRegistered())
                        {
                            JOptionPane obj1 = new JOptionPane();//Creating JOption pane
                            String regmsg= "This course is alredy registered with"+"\n"+"Instructor as: "+nonaddInstructorName+"\n"+
                                            "Starting form: "+nonaddStartingDate+"\n"+"will Complete on: "+nonaddCompletionDate+"\n"+
                                            "PLEASE REGISTER A NEW COURSE";
                            //Displaying Message           
                            obj1.showMessageDialog(nonacademic, regmsg,"Alert!!",obj1.WARNING_MESSAGE);
                            isreg=true;//Setting is reg to true
                        }
                        else
                        {
                            nonobj.register(nonaddCourseLeader,nonaddInstructorName,nonaddStartingDate,nonaddCompletionDate,nonaddExamDate);
                            JOptionPane obj1 = new JOptionPane();//creating JOptionpane
                            String regmsg="New Course with,"+"\n"+"Course ID: "+nonaddCourseID+"\n"+"Course Leader: "+nonaddCourseLeader+"\n"+
                                            "Instructor as: "+nonaddInstructorName+"\n"+"Starting form: "+nonaddStartingDate+"\n"+"will Complete on: "+nonaddCompletionDate+
                                            "\n"+"Exam on: "+nonaddExamDate+"\n"+"is Sucessfully Registered.";
                            //Displaying Message
                            JOptionPane.showMessageDialog(nonacademic,regmsg);
                            isreg = true;//setting isreg to true
                            break;
                        }
                    }
                }
                if (isreg == false)
                {
                     JOptionPane.showMessageDialog(nonacademic, "*Course NOT ADDED !!!!!!!"+"\n"+"Please Add the Course First","Alert!!",JOptionPane.WARNING_MESSAGE);
                }
        }
        
        catch(NumberFormatException n)//handeling exception
        {
            JOptionPane.showMessageDialog(nonacademic,"Please enter valid value to Duration","Invalid Inputs!!",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    /* creating a method academiccourse() to assign 
     * certain task to its respective add button */
    
    public void academicregister()
    {
        try//try and catch block
        {
                //initializing values to variables
                addCourseID= atCourseID.getText();
                addCourseName=atCourseName.getText();
                addCourseLeader=atCourseLeader.getText();
                addLecturerName=atLecturerName.getText();
                addLevel=atLevel.getText();
                addCredit=atCredit.getText();
                addStartingDate=atStartingDate.getText();
                addCompletionDate = atCompletionDate.getText();
                addNumberOfAssessment=atNoOfAssessment.getText();
                addDuration=atDuration.getText();
                add_Duration=Integer.parseInt(addDuration);
                add_NoOfAssessment = Integer.parseInt(addNumberOfAssessment);
                
                boolean isreg=false;//creating isreg boolean with false value
                for(Course academicObject:arraylist)//Using for eachloop
                {
                    if(academicObject.getCourseID().equals(addCourseID))
                    {
                        AcademicCourse obj = (AcademicCourse)academicObject; //Downcasting object of Course class"Parent Class" to Academic Course"Child Class"
                        obj.getIsRegistered(); //calling getIsRegisteredMethod
                        if(obj.getIsRegistered()==true)
                        {
                            JOptionPane obj1 = new JOptionPane();
                            String regmsg= "This course is alredy registered with"+"\n"+"Lecturer as: "+addLecturerName+"\n"+
                                            "Starting form: "+addStartingDate+"\n"+"will Complete on: "+addCompletionDate+"\n"+
                                            "PLEASE REGISTER A NEW COURSE";
                                            
                            obj1.showMessageDialog(nonacademic, regmsg,"Alert!!",obj1.WARNING_MESSAGE);
                            isreg=true;//setting is reg to true
                        }
                        else if(obj.getIsRegistered()==false)
                        {
                            
                            obj.register(addCourseLeader,addLecturerName,addStartingDate,addCompletionDate);//passing values to register's parameter
                            JOptionPane obj1 = new JOptionPane();//creating j option pane
                            String regmsg="New Course with,"+"\n"+"Course ID: "+addCourseID+"\n"+"Course Leader: "+addCourseLeader+"\n"+
                                            "Lecturer as: "+addLecturerName+"\n"+"Starting form: "+addStartingDate+"\n"+"will Complete on: "+addCompletionDate+
                                            "is Sucessfully Registered.";
                            JOptionPane.showMessageDialog(academic,regmsg);//displaying message
                            isreg = true;//setting is reg to true
                            break;// breaking the loop
                        }
                    }
                }
                if (isreg == false)
                {
                    //displaying message
                     JOptionPane.showMessageDialog(academic, "*Course NOT ADDED !!!!!!!"+"\n"+"Please Add the Course First","Alert!!",JOptionPane.WARNING_MESSAGE);
                }
        }
        
        catch(NumberFormatException n)
        {
            //displaying message
            JOptionPane.showMessageDialog(academic,"Please enter valid value","Invalid Inputs!!",JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    /* creating a method academiccourse() to assign 
     * certain task to its respective add button */
     
    public void nonacademicremove()
    {
        try
        {
            nonaddCourseID= natCourseID.getText();
            
            boolean isremov=false; //initializing boolean is remove
            for(Course nonacademicObject:arraylist)//using foreach loop
            {
                if(nonacademicObject.getCourseID().equals(nonaddCourseID))//checking if the textfield's value i equal to getCourseID
                {
                    NonAcademicCourse nonobj = (NonAcademicCourse)nonacademicObject; //Downcasting object of Course class"Parent Class" to Academic Course"Child Class"
                    nonobj.getIsRemoved();
                    if(nonobj.getIsRemoved()==true)
                    {
                        //Displaying Messsage
                        JOptionPane.showMessageDialog(nonacademic,"The Course is already removed","Alert!!",JOptionPane.WARNING_MESSAGE);
                        isremov=true;//setting is remov to true
                    }
                    else
                    {
                        nonobj.remove();//calling remove method
                        //displaying message
                        JOptionPane.showMessageDialog(nonacademic,"The Course is removed Sucessfully");
                        isremov=true;//setting isremov to true
                    }
                }
            }
            if(isremov==false)
            {
                //displaying message
                JOptionPane.showMessageDialog(nonacademic,"Please Register the Course First","Alert!!",JOptionPane.WARNING_MESSAGE);   
            }   
        }
        catch(Exception na)//handeling exception
        {
            //displaying message
            JOptionPane.showMessageDialog(nonacademic,"Please enter the valid Course ID  to remove","Invalid Inputs!!",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    /* creating a method displayacademic() to assign 
     * certain task to its respective Display button */
    
    public void displayacademic()
    {
        for(Course academicObject:arraylist)//foreach loop for arraylist and obj
        {
            AcademicCourse acaddisplay = (AcademicCourse)academicObject;//downcasting obj of parent class to child class's bobject
            acaddisplay.display();//calling display method
            
        }
    }
    
    /* creating a method displaynonacademic() to assign 
     * certain task to its respective Display button */
    
    public void displaynonacademic()
    {
            for(Course nonacademicobj:arraylist)
            {
                //downcasting the object of Course class to ("Parent Class")NonAcademicCourse Class("Child class")
                NonAcademicCourse nonacaddisplay = (NonAcademicCourse)nonacademicobj;
                //calling display method of NonAcademicCourse class
                nonacaddisplay.display();
                
                
           
        }
    }
    /* creating a main method method and calling out the constructor*/
    
    public static void main(String args[])
    {
        new INGCollege();//calling the constructor
    }
}
