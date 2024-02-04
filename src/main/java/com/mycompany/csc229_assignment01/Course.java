/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID 

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).


 */

package com.mycompany.csc229_assignment01;

import javax.xml.namespace.QName;

/**
 *
 * @author Ricky Wang
 */
// instance variables
public class Course {
    private String name;
    private String code;
    private int id;

    // Default constructor
    public Course() {
        id = 0;
        name = "Intro Course";
        code = "2000";
    }

    // Overloaded constructor
    public Course(int id, String name, String code ) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    // Getters and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // Getter and setter for id
    public int getID(){
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }
    // Getter and setter for code
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
