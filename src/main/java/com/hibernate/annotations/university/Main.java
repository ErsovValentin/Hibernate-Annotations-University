package com.hibernate.annotations.university;

import java.util.ArrayList;

public class Main {

    public static void printAllGroups()
    {
        for(Groups g:Factory.getInstance().getGroupsDAO().getAllGroups())
        {
            System.out.println(g);
        }
    }

    public static void printAllProfessors()
    {
        for (Professors p:Factory.getInstance().getProfessorsDAO().getAllProfessors())
        {
            System.out.println(p);
        }
    }

    public static void printAllStudents()
    {
        for (Students s:Factory.getInstance().getStudentsDAO().getAllStudents())
        {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        GroupsDAO groupsDAO = Factory.getInstance().getGroupsDAO();
        ProfessorsDAO professorsDAO = Factory.getInstance().getProfessorsDAO();
        StudentsDAO studentsDAO = Factory.getInstance().getStudentsDAO();

        //CRUDE - Groups

        /*System.out.println("Adding Group...");
        Groups groupAdd = new Groups();
        groupAdd.setName("FL996");
        groupAdd.setFaculty(Faculty.Languages);
        groupsDAO.addGroup(groupAdd);

        Main.printAllGroups();

        System.out.println("Updating Group...");
        Groups groupUpdate = groupsDAO.getGroupById(3);
        groupUpdate.setName("FL2996");
        groupsDAO.updateGroup(groupUpdate);
        Main.printAllGroups();

        System.out.println("Deleting group...");
        groupsDAO.deleteGroup(groupsDAO.getGroupById(3));
        Main.printAllGroups();

        System.out.println("Showing groups by professor...");
        ArrayList<Groups> groupsByProfessor = groupsDAO.getGroupsByProfessor(professorsDAO.getProfessorById(2));
        for(Groups g : groupsByProfessor)
        {
            System.out.println(g);
        }*/

//        Main.printAllGroups();


        //CRUDE PROFESSORS

        /*Professors professorAdd = new Professors();
        professorAdd.setName("Mariana NAZIMA");
        professorAdd.setExperience(19);
        professorsDAO.addProfessor(professorAdd);
        Main.printAllProfessors();

        Professors professorUpdate = professorsDAO.getProfessorById(1);
        professorUpdate.setName("Pavel Emelianovich");
        professorsDAO.updateProfessor(professorUpdate);
        Main.printAllProfessors();

        professorsDAO.deleteProfessor(professorsDAO.getProfessorById(4));
        Main.printAllProfessors();

        ArrayList<Professors> professorsByGroup = professorsDAO.getProfessorsByGroup(groupsDAO.getGroupById(1));
        for(Professors p : professorsByGroup)
        {
            System.out.println(p);
        }*/

//          Main.printAllProfessors();


        ///CRUDE Students

        /*Students studentAdd = new Students();
        studentAdd.setName("Malocca Rihteshtein");
        studentAdd.setDateOfBirth("1999-01-15");
        studentAdd.setGroup(groupsDAO.getGroupById(2));
        studentsDAO.addStudent(studentAdd);
        Main.printAllStudents();

        Students studentUpdate = studentsDAO.getStudentById(4);
        studentUpdate.setName("Avraham Licoln");
        studentsDAO.updateStudent(studentUpdate);
        Main.printAllStudents();

        studentsDAO.deleteStudent(studentsDAO.getStudentById(3));
        Main.printAllStudents();

        for(Students s: studentsDAO.getStudentsByGroup(groupsDAO.getGroupById(2)))
        {
            System.out.println(s);
        }*/

//        Main.printAllStudents();



    }
}
