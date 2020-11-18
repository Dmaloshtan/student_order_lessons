package edu.javacourse.studentorder.validator;

import com.sun.jdi.connect.TransportTimeoutException;
import edu.javacourse.studentorder.domain.register.CityRegisterResponse;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.exception.CityRegisterException;
import edu.javacourse.studentorder.exception.TransportException;

public interface CityRegisterChecker {

    CityRegisterResponse checkPerson(Person person) throws CityRegisterException, TransportException;  // Здесь писать public не нужно, т.к. в интерфейсе автоматом все методы должны быть public

}
