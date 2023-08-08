import java.util.*;  
class cgpagrade{ 

    public static int calculateGradePoint(int marks) {
        if (marks >= 90 && marks <= 100) {
            return 10;
        } else if (marks >= 80 && marks < 90) {
            return 9;
        } else if (marks >= 70 && marks < 80) {
            return 8;
        } else if (marks >= 60 && marks < 70) {
            return 7;
        } else if (marks >= 50 && marks < 60) {
            return 6;
        } else if (marks >= 45 && marks < 50) {
            return 5;
        } else if (marks >= 40 && marks < 45) {
            return 4;
        } else {
            // For marks below 40, you can define a suitable grade point.
            // For simplicity, we'll return 0 for such cases.
            return 0;
        }
    }


    public static int practicalGradePoint(int marks) {
        if (marks >= 45 && marks <= 50) {
            return 10;
        } else if (marks >= 40 && marks < 45) {
            return 9;
        } else if (marks >= 35 && marks < 40) {
            return 8;
        } else if (marks >= 30 && marks < 35) {
            return 7;
        } else if (marks >= 25 && marks < 30) {
            return 6;
        } else if (marks >= 20 && marks < 25) {
            return 5;
        } else if (marks >= 16 && marks < 20) {
            return 4;
        } else {
            // For marks below 16, user failed in internal of that subject.
            // For simplicity, we'll return 0 for such cases.
            return 0;
        }
    }



    public static void main(String args[])  
    {     
        //Taking number of subjects as input
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Number of Theory Subjects:");
         int numSubjects = sc.nextInt(); 
         

        //declaration of two arrays respectively of size of number of subjects
         int[] marksArray = new int[numSubjects]; 
         int[] gradePointsArray = new int[numSubjects];
         double totalCredits = 0;
         double totalGradePoint = 0;

         System.out.println("Enter Marks of Theory Subjects (out of 100)");  
         for(int i=0; i<numSubjects; i++)  
         {   
         System.out.println("Enter marks of subject "+(i+1)+":");
         marksArray[i]=sc.nextInt();  
         gradePointsArray[i] = calculateGradePoint(marksArray[i]);
         }  

         int[] creditArray = new int[numSubjects];
         for(int i=0; i<numSubjects; i++)  
         {   
         System.out.println("Enter credits of subject "+(i+1)+":");
         creditArray[i]=sc.nextInt();  
         totalGradePoint += gradePointsArray[i] * creditArray[i];
         totalCredits += creditArray[i];
         }


          
         for(int i=0; i<numSubjects; i++)  
         {      
         System.out.println("Marks of Theory Subject: "+(i+1)+" = "+ marksArray[i]+" Grade Point: "+gradePointsArray[i]+" Credit: "+creditArray[i]); 
         }
         //sc.close();









    
     
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter Number of Practical Subjects:");
     int pracSubjects = scan.nextInt(); 

     int[] pmarksArray = new int[pracSubjects];  
     int[] pracGradeArray = new int [pracSubjects];


     System.out.println("Enter Marks of Practical Subjects (out of 50)");  
     for(int i=0; i<pracSubjects; i++)  
     {   
     System.out.println("Enter marks of practical subject "+(i+1)+":");
     pmarksArray[i]=scan.nextInt();  
     pracGradeArray[i] = practicalGradePoint(pmarksArray[i]);
     }  

       int[] pcreditArray = new int[pracSubjects];
         for(int i=0; i<pracSubjects; i++)  
         {   
         System.out.println("Enter credits of practical subject "+(i+1)+":");
         pcreditArray[i]=sc.nextInt();
          totalGradePoint += pracGradeArray[i] * pcreditArray[i];
          totalCredits += pcreditArray[i];  
         }

     for(int i=0; i<pracSubjects; i++)  
     {      
     System.out.println("Marks of Practical Subject: "+(i+1)+" = "+ pmarksArray[i]+" Grade Point= "+pracGradeArray[i]+" Credit: "+ pcreditArray[i] ); 
     }
    
     Scanner scanner = new Scanner(System.in);

        System.out.print("Did you do a Minor or Major project in this semester? (yes/no): ");
        String projectChoice = scanner.next();
        if (projectChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter the marks for your minor project (out of 100): ");
            int projectMarks = scanner.nextInt();
            int projectGradePoint = calculateGradePoint(projectMarks);
            System.out.print("Enter the Credits for your Minor/Major project: ");
            int projectCredit = scanner.nextInt();
            totalGradePoint += projectGradePoint * projectCredit; // Add input credit variable for generalised project
            totalCredits += projectCredit;

            if (projectGradePoint != 0) {
                System.out.println("Your minor project marks: " + projectMarks);
                System.out.println("Your minor project grade point: " + projectGradePoint);
            } else {
                System.out.println("Invalid marks entered for the minor project.");
            }


        } else if (projectChoice.equalsIgnoreCase("no")) {
            int projectMarks = 0;
            int projectGradePoint = 0;
            System.out.println("No minor project done. Marks: " + projectMarks + ", Grade Point: " + projectGradePoint);
        } else {
            System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
        }



        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Did you had Mentoring Subject in this semester with credit? (yes/no): ");
        String mentoringChoice = scanner1.next();
        
        if (mentoringChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter the marks for your mpd (out of 100): ");
            int mentoringMarks = scanner1.nextInt();
            int mentoringGradePoint = calculateGradePoint(mentoringMarks);
            System.out.print("Enter the Credits for your Mentoring Subject: ");
            int mpdCredit = scanner.nextInt();

            totalGradePoint += mentoringGradePoint * mpdCredit; // Add input credit variable for generalised project
            totalCredits += mpdCredit;


            if (mentoringGradePoint != 0) {
                System.out.println("Your mpd marks: " + mentoringMarks);
                System.out.println("Your mpd grade point: " + mentoringGradePoint);
                System.out.println("Your mpd Credit: "+ mpdCredit);
            } else {
                System.out.println("Invalid marks entered for the minor project.");
            }
        } else if (mentoringChoice.equalsIgnoreCase("no")) {
            int mentoringMarks = 0;
            int mentoringGradePoint = 0;
            System.out.println("No minor project done. Marks: " + mentoringMarks + ", Grade Point: " + mentoringGradePoint);
        } else {
            System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
        }


    System.out.println("YOUR SGPA is::  "+ (totalGradePoint/totalCredits));

    } 
}