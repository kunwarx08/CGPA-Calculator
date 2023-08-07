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
            // For simplicity, we'll return -1 for such cases.
            return -1;
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

         System.out.println("Enter Marks of Theory Subjects out of 100");  
         for(int i=0; i<numSubjects; i++)  
         {   
         System.out.println("Enter marks of subject "+(i+1)+":");
         marksArray[i]=sc.nextInt();  
         gradePointsArray[i] = calculateGradePoint(marksArray[i]);
         }  

          
         for(int i=0; i<numSubjects; i++)  
         {      
         System.out.println("Marks of Theory Subject: "+(i+1)+" = "+ marksArray[i]+" Grade Point: "+gradePointsArray[i]); 
         }
         sc.close();









    
     
    //  Scanner scan=new Scanner(System.in);
    //  System.out.println("Enter Number of Practical Subjects:");
    //  int x = scan.nextInt(); 

    //  int[] subjectp = new int[10];  
    //  System.out.println("Enter Marks of Practical Subjects");  
    //  for(int i=1; i<=x; i++)  
    //  {   
    //  subjectp[i]=scan.nextInt();  
    //  }  

      
    //  for(int i=1; i<=x; i++)  
    //  {      
    //  System.out.println("Marks of Pracical Subject: "+i+" = "+ subjectp[i]); 
    //  }
    


    } 
}