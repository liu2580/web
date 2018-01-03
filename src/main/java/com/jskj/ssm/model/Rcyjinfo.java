package com.jskj.ssm.model;

public class Rcyjinfo {
    private int id;
    private String fullName;
    private String gender;
    private String nativePlace;
    private String nation;
    private String dateOfBirth;
    private String nationality;
    private String politicalStatus;
    private String healthCondition;
    private String maritalCondition;
    private String height;
    private String highestEducation;
    private String foreignLanguageSituation;
    private String contactInfo;
    private String IDCardNo;
    private String application;
    private String locationOfFile;
    private String education;
    private String experience;

    public Rcyjinfo() {

    }

    public Rcyjinfo(int id, String fullName, String gender, String nativePlace, String nation, String dateOfBirth, String nationality, String politicalStatus, String healthCondition, String maritalCondition, String height, String highestEducation, String foreignLanguageSituation, String contactInfo, String IDCardNo, String application, String locationOfFile, String education, String experience) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.nativePlace = nativePlace;
        this.nation = nation;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.politicalStatus = politicalStatus;
        this.healthCondition = healthCondition;
        this.maritalCondition = maritalCondition;
        this.height = height;
        this.highestEducation = highestEducation;
        this.foreignLanguageSituation = foreignLanguageSituation;
        this.contactInfo = contactInfo;
        this.IDCardNo = IDCardNo;
        this.application = application;
        this.locationOfFile = locationOfFile;
        this.education = education;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public String getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }

    public String getMaritalCondition() {
        return maritalCondition;
    }

    public void setMaritalCondition(String maritalCondition) {
        this.maritalCondition = maritalCondition;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation;
    }

    public String getForeignLanguageSituation() {
        return foreignLanguageSituation;
    }

    public void setForeignLanguageSituation(String foreignLanguageSituation) {
        this.foreignLanguageSituation = foreignLanguageSituation;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getIDCardNo() {
        return IDCardNo;
    }

    public void setIDCardNo(String IDCardNo) {
        this.IDCardNo = IDCardNo;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getLocationOfFile() {
        return locationOfFile;
    }

    public void setLocationOfFile(String locationOfFile) {
        this.locationOfFile = locationOfFile;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Rcyjinfo{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", nativePlace='" + nativePlace + '\'' +
                ", nation='" + nation + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", nationality='" + nationality + '\'' +
                ", politicalStatus='" + politicalStatus + '\'' +
                ", healthCondition='" + healthCondition + '\'' +
                ", maritalCondition='" + maritalCondition + '\'' +
                ", height='" + height + '\'' +
                ", highestEducation='" + highestEducation + '\'' +
                ", foreignLanguageSituation='" + foreignLanguageSituation + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", IDCardNo='" + IDCardNo + '\'' +
                ", application='" + application + '\'' +
                ", locationOfFile='" + locationOfFile + '\'' +
                ", education='" + education + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}
