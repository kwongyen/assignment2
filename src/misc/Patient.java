package misc;

import treatment.Treatment;
import java.util.ArrayList;

public class Patient {

    private String firstName;
    private String lastName;
    private int patientId;
    private int age;
    private int height;
    private float weight;
    private String gender;
    private ArrayList<Treatment> requiredTreatments = new ArrayList<>();

    public Patient(String firstName, String lastName, int age, int height, float weight, String gender) {
        this.patientId = generatePatientId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    private int generatePatientId() {
        return 1;
    }

    public float calculateBMI(){
        return weight/((float)height*(float)height);
    }

    public ArrayList<Treatment> getRequiredTreatments() {
        return requiredTreatments;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRequiredTreatments(Treatment requiredTreatment) {
        this.requiredTreatments.add(requiredTreatment);
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        patientId = patientId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
