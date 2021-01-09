package com.example.demo.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Report {

    @Id
    @GeneratedValue
    private Long id;
    private Timestamp timestamp;
    private int durationOfUse;
    private int likelyToRecommend;
    private int whatIfYouCouldntUse;
    private int effortDuringADayWithSuit;
    private int effortWhileWearing;
    private int effortDuringHeaviestLift;

    private int rightShoulderDiscomfortWearing;
    private int leftShoulderDiscomfortWearing;
    private int upperBackDiscomfortWearing;
    private int lowerBackDiscomfortWearing;
    private int rightHipDiscomfortWearing;
    private int leftHipDiscomfortWearing;
    private int rightThighDiscomfortWearing;
    private int leftThighDiscomfortWearing;
    private int rightKneeDiscomfortWearing;
    private int leftKneeDiscomfortWearing;

    private int comfortWhileWorking;
    private int comfortWhileWalking;
    private int comfortWhileSteppingUpDown;
    private int comfortWhileDriving;
    private int comfortDuringBreaks;
    private int reducesDiscomfort;
    private int feelsHot;
    private int lightEnoughForFullShift;
    private int fullRangeOfMotion;
    private int wouldLikeToUseFrequently;
    private int tooComplex;
    private int easyToUse;
    private int wouldNeedTechnicalPerson;
    private int suitIsWellIntegrated;
    private int tooMuchInconsistency;
    private int mostWouldFindEasy;
    private int tooCumbersome;
    private int wouldNeedToLearnALot;
    private int hasBeenUseful;
    private int feelSafe;
    private int canMoveNaturally;
    private int useToolsNormally;
    private int wouldUseDaily;
    private int easyToPutOn;
    private int easyToTakeOff;
    private int reducesWorkFatigue;
    private int improvesWorkPerformance;
    private int preventLowBackInjury;
    private int reliableAndDurable;
    private int allOrSomeTasks;

    private String whichTasks;
    private int daysToGetUsedToIt;
    private String longTermEffects;
    private String whatDoYouLikeAboutIt;
    private String whatDoYouHateAboutIt;
    private String additionalNotes;





















    @ManyToOne
    private Person person;


    public Long getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }




}


