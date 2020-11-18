package edu.javacourse.studentorder.domain.register;
/*
возвращает ответ
 */
public class CityRegisterResponse {
    private boolean existing;    //существует регистрация или нет
    private Boolean temporal;     // временная или нет


    public boolean isExisting() {
        return existing;
    }

    public void setExisting(boolean existing) {
        this.existing = existing;
    }

    public Boolean getTemporal() {
        return temporal;
    }

    public void setTemporal(Boolean temporal) {
        this.temporal = temporal;
    }

    @Override
    public String toString() {
        return "CityRegisterCheckerResponse{" +
                "existing=" + existing +
                ", temporal=" + temporal +
                '}';
    }
}
