package application;
import java.time.LocalDate;

public class Student {
    private String studentId;
    private String fullName;
    private String gender;
    private LocalDate dateOfBirth;
    private String arrayLevel;
    private String yearOfStudy;
    private String email;
    private String phone;

    public Student(String studentId, String fullName, String gender, LocalDate dateOfBirth, String arrayLevel, String yearOfStudy, String phone, String email) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.arrayLevel = arrayLevel;
        this.yearOfStudy = yearOfStudy;
        this.email = email;
        this.phone = phone;
    }

    public String getStudentId() {return studentId; }
    public String getFullName() { return fullName; }
    public String getGender() { return gender; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public String getArrayLevel() { return arrayLevel; }
    public String getYearOfStudy() { return yearOfStudy; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }

}
