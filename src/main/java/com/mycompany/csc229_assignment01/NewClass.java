
package com.mycompany.csc229_assignment01;

/**
 *
 * @author Ricky Wang
 */
public class NewClass {
    
     public static void main(String[] args) {
         // Default course
         Course defaultCourse = new Course();
         // Overloaded course
         Course overloadedCourse = new Course(789521, "Global History", "2875");
         // Prints out both courses
         System.out.println(defaultCourse);
         System.out.println(overloadedCourse);
         // Inputting info for default course
         defaultCourse.setID(9234);
         defaultCourse.setName("European History");
         defaultCourse.setCode("EH229");
         // prints out updated default course
         System.out.println(defaultCourse);
     }
}
