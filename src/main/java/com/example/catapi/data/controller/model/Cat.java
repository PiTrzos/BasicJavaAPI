package com.example.catapi.data.controller.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Cat")
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private Integer BreedTypeID;
    private String BreedName;
    private String CommonBreedIssues;
    private String Origin;
    private String CoatLength;
    private String CoatPattern;
    private String Description;
    private String MainCharacteristics;
    private String OriginDescription;
    private String PersonalityTraitsDescription;
    private String LifeSpan;
    private String GoodWith;
    private String SheddingAmmount;
    private String AffectionLevel;
    private String Playfulness;
    private String ActivityLevel;
    private String TendencyToVocalize;
    private String ExerciseNeeds;
    private String ImgSrc;
    public Cat() {

    }

    @Id
    public Integer getID() {
        return ID;
    }

    public void setID(Integer id) {
        this.ID = id;
    }

    public Integer getBreedTypeID() {
        return BreedTypeID;
    }

    public void setBreedTypeID(Integer breedTypeID) {
        BreedTypeID = breedTypeID;
    }

    public String getBreedName() {
        return BreedName;
    }

    public void setBreedName(String breedName) {
        BreedName = breedName;
    }

    public String getCommonBreedIssues() {
        return CommonBreedIssues;
    }

    public void setCommonBreedIssues(String commonBreedIssues) {
        CommonBreedIssues = commonBreedIssues;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getCoatLength() {
        return CoatLength;
    }

    public void setCoatLength(String coatLength) {
        CoatLength = coatLength;
    }

    public String getCoatPattern() {
        return CoatPattern;
    }

    public void setCoatPattern(String coatPattern) {
        CoatPattern = coatPattern;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getMainCharacteristics() {
        return MainCharacteristics;
    }

    public void setMainCharacteristics(String mainCharacteristics) {
        MainCharacteristics = mainCharacteristics;
    }

    public String getOriginDescription() {
        return OriginDescription;
    }

    public void setOriginDescription(String originDescription) {
        OriginDescription = originDescription;
    }

    public String getPersonalityTraitsDescription() {
        return PersonalityTraitsDescription;
    }

    public void setPersonalityTraitsDescription(String personalityTraitsDescription) {
        PersonalityTraitsDescription = personalityTraitsDescription;
    }

    public String getLifeSpan() {
        return LifeSpan;
    }

    public void setLifeSpan(String lifeSpan) {
        LifeSpan = lifeSpan;
    }

    public String getGoodWith() {
        return GoodWith;
    }

    public void setGoodWith(String goodWith) {
        GoodWith = goodWith;
    }

    public String getSheddingAmmount() {
        return SheddingAmmount;
    }

    public void setSheddingAmmount(String sheddingAmmount) {
        SheddingAmmount = sheddingAmmount;
    }

    public String getAffectionLevel() {
        return AffectionLevel;
    }

    public void setAffectionLevel(String affectionLevel) {
        AffectionLevel = affectionLevel;
    }

    public String getPlayfulness() {
        return Playfulness;
    }

    public void setPlayfulness(String playfulness) {
        Playfulness = playfulness;
    }

    public String getActivityLevel() {
        return ActivityLevel;
    }

    public void setActivityLevel(String activityLevel) {
        ActivityLevel = activityLevel;
    }

    public String getTendencyToVocalize() {
        return TendencyToVocalize;
    }

    public void setTendencyToVocalize(String tendencyToVocalize) {
        TendencyToVocalize = tendencyToVocalize;
    }

    public String getExerciseNeeds() {
        return ExerciseNeeds;
    }

    public void setExerciseNeeds(String exerciseNeeds) {
        ExerciseNeeds = exerciseNeeds;
    }

    public String getImgSrc() {
        return ImgSrc;
    }

    public void setImgSrc(String imgSrc) {
        ImgSrc = imgSrc;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "ID=" + ID +
                ", BreedTypeID=" + BreedTypeID +
                ", BreedName='" + BreedName + '\'' +
                ", CommonBreedIssues='" + CommonBreedIssues + '\'' +
                ", Origin='" + Origin + '\'' +
                ", CoatLength='" + CoatLength + '\'' +
                ", CoatPattern='" + CoatPattern + '\'' +
                ", Description='" + Description + '\'' +
                ", MainCharacteristics='" + MainCharacteristics + '\'' +
                ", OriginDescription='" + OriginDescription + '\'' +
                ", PersonalityTraitsDescription='" + PersonalityTraitsDescription + '\'' +
                ", LifeSpan='" + LifeSpan + '\'' +
                ", GoodWith='" + GoodWith + '\'' +
                ", SheddingAmmount='" + SheddingAmmount + '\'' +
                ", AffectionLevel='" + AffectionLevel + '\'' +
                ", Playfulness='" + Playfulness + '\'' +
                ", ActivityLevel='" + ActivityLevel + '\'' +
                ", TendencyToVocalize='" + TendencyToVocalize + '\'' +
                ", ExerciseNeeds='" + ExerciseNeeds + '\'' +
                ", ImgSrc='" + ImgSrc + '\'' +
                '}';
    }
}
