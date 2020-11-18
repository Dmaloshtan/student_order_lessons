package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.domain.children.AnswerChildren;
import edu.javacourse.studentorder.domain.register.AnswerCityRegister;
import edu.javacourse.studentorder.domain.student.AnswerStudent;
import edu.javacourse.studentorder.domain.wedding.AnswerWedding;
import edu.javacourse.studentorder.mail.MailSender;
import edu.javacourse.studentorder.validator.ChildrenValidator;
import edu.javacourse.studentorder.validator.CityRegisterValidator;
import edu.javacourse.studentorder.validator.StudentValidator;
import edu.javacourse.studentorder.validator.WeddingValidator;

import java.util.LinkedList;
import java.util.List;

/*
Класс, который проверяет заявку
 */

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterVal;
    private WeddingValidator weddingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSender;
/*
Конструктор, который создает объекты и присваивает данные переменным, которые объявлены выше
 */
    public StudentOrderValidator() {
        cityRegisterVal = new CityRegisterValidator();
        weddingVal = new WeddingValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        mailSender = new MailSender();
    }

    public static void main(String[] args) {
        StudentOrderValidator sov = new StudentOrderValidator();
        sov.checkAll();
    }

    /*
    Метод, который проверяет заявки
    ------------------------------------------------------------------------------------
     */
    public void checkAll() {
        List<StudentOrder> soList = readStudentOrders();  //Передаём массив заявок

//        for(int c = 0; c< soArray.length; c++){
//            System.out.println();
//            checkOneOrder(soArray[c]);
//        }

        for (StudentOrder so: soList){             //проверяем каждую заявку
            System.out.println();
            checkOneOrder(so);
        }
    }

/*+
----------------------------------------------------------------------------------------
 */

    public List<StudentOrder> readStudentOrders() {
        List<StudentOrder> soList = new LinkedList<>();

        for (int c = 0 ;c < 5; c++ ){
            StudentOrder so = SaveStudentOrder.buildStudentOrder(c);
            soList.add(so);
        }


        return soList;
    }

    /*
    Проверка одной заявки
    -----------------------------------------------------------------------------------
     */
    public void checkOneOrder(StudentOrder so){
        AnswerCityRegister cityAnswer = checkCityRegister(so);
//        AnswerWedding wedAnswer = checkWedding(so);
//        AnswerChildren childAnswer = checkChildren(so);
//        AnswerStudent studentAnswer = checkStudent(so);

//        sendMail(so);
    }

/*
-----------------------------------------------------------------------
 */


    public AnswerCityRegister checkCityRegister(StudentOrder so) {

        return cityRegisterVal.checkCityRegister(so);
    }

    public AnswerWedding checkWedding(StudentOrder so) {
        return weddingVal.checkWedding(so);

    }

    public AnswerChildren checkChildren(StudentOrder so) {

        return childrenVal.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so) {

        return studentVal.checkStudent(so);
    }

    public void sendMail(StudentOrder so) {
        mailSender.sendMail(so);

    }
}
