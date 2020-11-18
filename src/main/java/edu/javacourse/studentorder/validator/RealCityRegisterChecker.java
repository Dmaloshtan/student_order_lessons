package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.register.CityRegisterResponse;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.exception.CityRegisterException;
import edu.javacourse.studentorder.exception.TransportException;

/*
проверка персоны
 */
public class RealCityRegisterChecker implements CityRegisterChecker {        // implements это реализация методов из интерфейса

    public CityRegisterResponse checkPerson(Person person) throws CityRegisterException, TransportException {           // Так как мы проверяем Person, то его сюда и передаем

        return null;
    }


}
