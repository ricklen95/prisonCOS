/* *****************************************************************************
 *  Name:    
 *
 *  Description: Sums up the number of students in a school by counting each one
 *
 **************************************************************************** */

public class Students {
    public static void main(String[] args) {
        

        int classes = 4;
        int studentsPerClass = 18;
        
        // initialize totalStudents to 0, because we haven't started counting yet
        int totalStudents = 0;
        
        for (int i = 0; i < classes; i++) {
            for (int j = 0; j < studentsPerClass; j++) {
                totalStudents = totalStudents + 1;
            }
        }
        
        System.out.println("The total number of students is: " + totalStudents);
        
    }
}
