package com.example.demo.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Collection;

@Entity
public class Report {

    @Id
    @GeneratedValue
    private Long id;
    private Instant timestamp;

    @ManyToOne
    private Person person;

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
    private int iFeltConfident;
    private int neededToLearnALot;
    private int hasBeenUseful;
    private int idLikeToContinueWearing;
    private int feelSafe;
    private int canMoveNaturally;
    private int useToolsNormally;
    private int wouldUseDaily;
    private int easyToPutOn;
    private int easyToTakeOff;
    private int reducesWorkFatigue;
    private int improvesWorkPerformance;
    private int preventLowBackInjury;
    private int reliableAndDurable = 5;
    private int allOrSomeTasks = 6;

    private String whichTasks;
    private int daysToGetUsedToIt;
    private String longTermEffects;
    private String whatDoYouLikeAboutIt;
    private String whatDoYouHateAboutIt;
    private String additionalNotes;

    @Transient
    private Collection<Integer> listOfAttributes;


    public Long getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public int getDurationOfUse() {
        return durationOfUse;
    }

    public int getLikelyToRecommend() {
        return likelyToRecommend;
    }

    public int getWhatIfYouCouldntUse() {
        return whatIfYouCouldntUse;
    }

    public int getEffortDuringADayWithSuit() {
        return effortDuringADayWithSuit;
    }

    public int getEffortWhileWearing() {
        return effortWhileWearing;
    }

    public int getEffortDuringHeaviestLift() {
        return effortDuringHeaviestLift;
    }

    public int getRightShoulderDiscomfortWearing() {
        return rightShoulderDiscomfortWearing;
    }

    public int getLeftShoulderDiscomfortWearing() {
        return leftShoulderDiscomfortWearing;
    }

    public int getUpperBackDiscomfortWearing() {
        return upperBackDiscomfortWearing;
    }

    public int getLowerBackDiscomfortWearing() {
        return lowerBackDiscomfortWearing;
    }

    public int getRightHipDiscomfortWearing() {
        return rightHipDiscomfortWearing;
    }

    public int getLeftHipDiscomfortWearing() {
        return leftHipDiscomfortWearing;
    }

    public int getRightThighDiscomfortWearing() {
        return rightThighDiscomfortWearing;
    }

    public int getLeftThighDiscomfortWearing() {
        return leftThighDiscomfortWearing;
    }

    public int getRightKneeDiscomfortWearing() {
        return rightKneeDiscomfortWearing;
    }

    public int getLeftKneeDiscomfortWearing() {
        return leftKneeDiscomfortWearing;
    }

    public int getComfortWhileWorking() {
        return comfortWhileWorking;
    }

    public int getComfortWhileWalking() {
        return comfortWhileWalking;
    }

    public int getComfortWhileSteppingUpDown() {
        return comfortWhileSteppingUpDown;
    }

    public int getComfortWhileDriving() {
        return comfortWhileDriving;
    }

    public int getComfortDuringBreaks() {
        return comfortDuringBreaks;
    }

    public int getReducesDiscomfort() {
        return reducesDiscomfort;
    }

    public int getFeelsHot() {
        return feelsHot;
    }

    public int getLightEnoughForFullShift() {
        return lightEnoughForFullShift;
    }

    public int getFullRangeOfMotion() {
        return fullRangeOfMotion;
    }

    public int getWouldLikeToUseFrequently() {
        return wouldLikeToUseFrequently;
    }

    public int getTooComplex() {
        return tooComplex;
    }

    public int getEasyToUse() {
        return easyToUse;
    }

    public int getWouldNeedTechnicalPerson() {
        return wouldNeedTechnicalPerson;
    }

    public int getSuitIsWellIntegrated() {
        return suitIsWellIntegrated;
    }

    public int getTooMuchInconsistency() {
        return tooMuchInconsistency;
    }

    public int getMostWouldFindEasy() {
        return mostWouldFindEasy;
    }

    public int getTooCumbersome() {
        return tooCumbersome;
    }

    public int getiFeltConfident() {
        return iFeltConfident;
    }

    public int getNeededToLearnALot() {
        return neededToLearnALot;
    }

    public int getHasBeenUseful() {
        return hasBeenUseful;
    }

    public int getIdLikeToContinueWearing() {
        return idLikeToContinueWearing;
    }

    public int getFeelSafe() {
        return feelSafe;
    }

    public int getCanMoveNaturally() {
        return canMoveNaturally;
    }

    public int getUseToolsNormally() {
        return useToolsNormally;
    }

    public int getWouldUseDaily() {
        return wouldUseDaily;
    }

    public int getEasyToPutOn() {
        return easyToPutOn;
    }

    public int getEasyToTakeOff() {
        return easyToTakeOff;
    }

    public int getReducesWorkFatigue() {
        return reducesWorkFatigue;
    }

    public int getImprovesWorkPerformance() {
        return improvesWorkPerformance;
    }

    public int getPreventLowBackInjury() {
        return preventLowBackInjury;
    }

    public int getReliableAndDurable() {
        return reliableAndDurable;
    }

    public int getAllOrSomeTasks() {
        return allOrSomeTasks;
    }

    public String getWhichTasks() {
        return whichTasks;
    }

    public int getDaysToGetUsedToIt() {
        return daysToGetUsedToIt;
    }

    public String getLongTermEffects() {
        return longTermEffects;
    }

    public String getWhatDoYouLikeAboutIt() {
        return whatDoYouLikeAboutIt;
    }

    public String getWhatDoYouHateAboutIt() {
        return whatDoYouHateAboutIt;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public Report() {
    }

    public Report(Person person, int durationOfUse, int likelyToRecommend, int whatIfYouCouldntUse,
                  int effortDuringADayWithSuit, int effortWhileWearing, int effortDuringHeaviestLift,
                  int rightShoulderDiscomfortWearing, int leftShoulderDiscomfortWearing, int upperBackDiscomfortWearing,
                  int lowerBackDiscomfortWearing, int rightHipDiscomfortWearing, int leftHipDiscomfortWearing,
                  int rightThighDiscomfortWearing, int leftThighDiscomfortWearing, int rightKneeDiscomfortWearing,
                  int leftKneeDiscomfortWearing, int comfortWhileWorking, int comfortWhileWalking, int comfortWhileSteppingUpDown,
                  int comfortWhileDriving, int comfortDuringBreaks, int reducesDiscomfort, int feelsHot, int lightEnoughForFullShift,
                  int fullRangeOfMotion, int wouldLikeToUseFrequently, int tooComplex, int easyToUse, int wouldNeedTechnicalPerson,
                  int suitIsWellIntegrated, int tooMuchInconsistency, int mostWouldFindEasy, int tooCumbersome, int iFeltConfident,
                  int neededToLearnALot, int hasBeenUseful, int idLikeToContinueWearing, int feelSafe, int canMoveNaturally,
                  int useToolsNormally, int wouldUseDaily, int easyToPutOn, int easyToTakeOff, int reducesWorkFatigue,
                  int improvesWorkPerformance, int preventLowBackInjury, int reliableAndDurable, int allOrSomeTasks,
                  String whichTasks, int daysToGetUsedToIt, String longTermEffects, String whatDoYouLikeAboutIt,
                  String whatDoYouHateAboutIt, String additionalNotes) {

        this.timestamp = Instant.now();
        this.person = person;
        this.durationOfUse = durationOfUse;
        this.likelyToRecommend = likelyToRecommend;
        this.whatIfYouCouldntUse = whatIfYouCouldntUse;
        this.effortDuringADayWithSuit = effortDuringADayWithSuit;
        this.effortWhileWearing = effortWhileWearing;
        this.effortDuringHeaviestLift = effortDuringHeaviestLift;
        this.rightShoulderDiscomfortWearing = rightShoulderDiscomfortWearing;
        this.leftShoulderDiscomfortWearing = leftShoulderDiscomfortWearing;
        this.upperBackDiscomfortWearing = upperBackDiscomfortWearing;
        this.lowerBackDiscomfortWearing = lowerBackDiscomfortWearing;
        this.rightHipDiscomfortWearing = rightHipDiscomfortWearing;
        this.leftHipDiscomfortWearing = leftHipDiscomfortWearing;
        this.rightThighDiscomfortWearing = rightThighDiscomfortWearing;
        this.leftThighDiscomfortWearing = leftThighDiscomfortWearing;
        this.rightKneeDiscomfortWearing = rightKneeDiscomfortWearing;
        this.leftKneeDiscomfortWearing = leftKneeDiscomfortWearing;
        this.comfortWhileWorking = comfortWhileWorking;
        this.comfortWhileWalking = comfortWhileWalking;
        this.comfortWhileSteppingUpDown = comfortWhileSteppingUpDown;
        this.comfortWhileDriving = comfortWhileDriving;
        this.comfortDuringBreaks = comfortDuringBreaks;
        this.reducesDiscomfort = reducesDiscomfort;
        this.feelsHot = feelsHot;
        this.lightEnoughForFullShift = lightEnoughForFullShift;
        this.fullRangeOfMotion = fullRangeOfMotion;
        this.wouldLikeToUseFrequently = wouldLikeToUseFrequently;
        this.tooComplex = tooComplex;
        this.easyToUse = easyToUse;
        this.wouldNeedTechnicalPerson = wouldNeedTechnicalPerson;
        this.suitIsWellIntegrated = suitIsWellIntegrated;
        this.tooMuchInconsistency = tooMuchInconsistency;
        this.mostWouldFindEasy = mostWouldFindEasy;
        this.tooCumbersome = tooCumbersome;
        this.iFeltConfident = iFeltConfident;
        this.neededToLearnALot = neededToLearnALot;
        this.hasBeenUseful = hasBeenUseful;
        this.idLikeToContinueWearing = idLikeToContinueWearing;
        this.feelSafe = feelSafe;
        this.canMoveNaturally = canMoveNaturally;
        this.useToolsNormally = useToolsNormally;
        this.wouldUseDaily = wouldUseDaily;
        this.easyToPutOn = easyToPutOn;
        this.easyToTakeOff = easyToTakeOff;
        this.reducesWorkFatigue = reducesWorkFatigue;
        this.improvesWorkPerformance = improvesWorkPerformance;
        this.preventLowBackInjury = preventLowBackInjury;
        this.reliableAndDurable = reliableAndDurable;
        this.allOrSomeTasks = allOrSomeTasks;
        this.whichTasks = whichTasks;
        this.daysToGetUsedToIt = daysToGetUsedToIt;
        this.longTermEffects = longTermEffects;
        this.whatDoYouLikeAboutIt = whatDoYouLikeAboutIt;
        this.whatDoYouHateAboutIt = whatDoYouHateAboutIt;
        this.additionalNotes = additionalNotes;



        this.listOfAttributes.add(durationOfUse);
        this.listOfAttributes.add(likelyToRecommend);
        this.listOfAttributes.add(whatIfYouCouldntUse);
        listOfAttributes.add(effortDuringADayWithSuit);
        listOfAttributes.add(effortWhileWearing);
        listOfAttributes.add(effortDuringHeaviestLift);
        listOfAttributes.add(rightShoulderDiscomfortWearing);
        listOfAttributes.add(leftShoulderDiscomfortWearing);
        listOfAttributes.add(upperBackDiscomfortWearing);
        listOfAttributes.add(lowerBackDiscomfortWearing);
        listOfAttributes.add(rightHipDiscomfortWearing);
        listOfAttributes.add(leftHipDiscomfortWearing);
        listOfAttributes.add(rightThighDiscomfortWearing);
        listOfAttributes.add(leftThighDiscomfortWearing);
        listOfAttributes.add(rightKneeDiscomfortWearing);
        listOfAttributes.add(leftKneeDiscomfortWearing);
        listOfAttributes.add(comfortWhileWorking);
        listOfAttributes.add(comfortWhileWalking);
        listOfAttributes.add(comfortWhileSteppingUpDown);
        listOfAttributes.add(comfortWhileDriving);
        listOfAttributes.add(comfortDuringBreaks);
        listOfAttributes.add(reducesDiscomfort);
        listOfAttributes.add(feelsHot);
        listOfAttributes.add(lightEnoughForFullShift);
        listOfAttributes.add(fullRangeOfMotion);
        listOfAttributes.add(wouldLikeToUseFrequently);
        listOfAttributes.add(tooComplex);
        listOfAttributes.add(feelsHot);
        listOfAttributes.add(easyToUse);
        listOfAttributes.add(wouldNeedTechnicalPerson);
        listOfAttributes.add(suitIsWellIntegrated);
        listOfAttributes.add(tooMuchInconsistency);
        listOfAttributes.add(mostWouldFindEasy);
        listOfAttributes.add(tooCumbersome);
        listOfAttributes.add(iFeltConfident);
        listOfAttributes.add(neededToLearnALot);
        listOfAttributes.add(hasBeenUseful);
        listOfAttributes.add(idLikeToContinueWearing);
        listOfAttributes.add(feelSafe);
        listOfAttributes.add(canMoveNaturally);
        listOfAttributes.add(useToolsNormally);
        listOfAttributes.add(wouldUseDaily);
        listOfAttributes.add(easyToPutOn);
        listOfAttributes.add(easyToTakeOff);
        listOfAttributes.add(reducesWorkFatigue);
        listOfAttributes.add(improvesWorkPerformance);
        listOfAttributes.add(preventLowBackInjury);
        listOfAttributes.add(reliableAndDurable);
        listOfAttributes.add(allOrSomeTasks);
        listOfAttributes.add(daysToGetUsedToIt);
    }

    public int[] attributeList() {

        return new int[]{durationOfUse, likelyToRecommend, whatIfYouCouldntUse,
                effortDuringADayWithSuit, effortWhileWearing, effortDuringHeaviestLift,
                rightShoulderDiscomfortWearing, leftShoulderDiscomfortWearing, upperBackDiscomfortWearing,
                lowerBackDiscomfortWearing, rightHipDiscomfortWearing, leftHipDiscomfortWearing,
                rightThighDiscomfortWearing, leftThighDiscomfortWearing, rightKneeDiscomfortWearing,
                leftKneeDiscomfortWearing, comfortWhileWorking, comfortWhileWalking, comfortWhileSteppingUpDown,
                comfortWhileDriving, comfortDuringBreaks, reducesDiscomfort, feelsHot, lightEnoughForFullShift,
                fullRangeOfMotion, wouldLikeToUseFrequently, tooComplex, easyToUse, wouldNeedTechnicalPerson,
                suitIsWellIntegrated, tooMuchInconsistency, mostWouldFindEasy, tooCumbersome, iFeltConfident, neededToLearnALot,
                hasBeenUseful, idLikeToContinueWearing, feelSafe, canMoveNaturally,
                useToolsNormally, wouldUseDaily, easyToPutOn, easyToTakeOff, reducesWorkFatigue,
                improvesWorkPerformance, preventLowBackInjury, reliableAndDurable, allOrSomeTasks,
                daysToGetUsedToIt};
    }


}


