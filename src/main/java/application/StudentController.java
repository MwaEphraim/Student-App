package application;

import java.time.LocalDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class StudentController {

    @FXML private TextField studentIdField;
    @FXML private TextField fullNameField;
    @FXML private ComboBox<String> genderComboBox;
    @FXML private DatePicker dobPicker;
    @FXML private TextField arrayLevelField;
    @FXML private TextField yearOfStudyField;
    @FXML private TextField emailField;
    @FXML private TextField phoneField;
    @FXML private Label statusLabel;

    @FXML private TableView<Student> studentTable;
    @FXML private TableColumn<Student, String> colStudentId;
    @FXML private TableColumn<Student, String> colFullName;
    @FXML private TableColumn<Student, String> colGender;
    @FXML private TableColumn<Student, LocalDate> colDob;
    @FXML private TableColumn<Student, String> colArrayLevel;
    @FXML private TableColumn<Student, String> colYear;
    @FXML private TableColumn<Student, String> colEmail;
    @FXML private TableColumn<Student, String> colPhone;

    private final ObservableList<Student> studentList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        genderComboBox.setItems(FXCollections.observableArrayList("Male", "Female"));

        colStudentId.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        colFullName.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        colGender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        colDob.setCellValueFactory(new PropertyValueFactory<>("dateOfBirth"));
        colArrayLevel.setCellValueFactory(new PropertyValueFactory<>("arrayLevel"));
        colYear.setCellValueFactory(new PropertyValueFactory<>("yearOfStudy"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colPhone.setCellValueFactory(new PropertyValueFactory<>("phone"));

        studentTable.setItems(studentList);
    }

    @FXML
    private void handleRegister() {
        if (studentIdField.getText().isEmpty() || fullNameField.getText().isEmpty()) {
            statusLabel.setText("Error: Student ID and Full Name are required.");
            return;
        }

        Student student = new Student(
                studentIdField.getText().trim(),
                fullNameField.getText().trim(),
                genderComboBox.getValue(),
                dobPicker.getValue(),
                arrayLevelField.getText().trim(),
                yearOfStudyField.getText().trim(),
                emailField.getText().trim(),
                phoneField.getText().trim()
        );

        studentList.add(student);
        statusLabel.setText("Student registered successfully.");
        handleClear();
    }

    @FXML
    private void handleClear() {
        studentIdField.clear();
        fullNameField.clear();
        genderComboBox.setValue(null);
        dobPicker.setValue(null);
        arrayLevelField.clear();
        yearOfStudyField.clear();
        emailField.clear();
        phoneField.clear();
    }
}