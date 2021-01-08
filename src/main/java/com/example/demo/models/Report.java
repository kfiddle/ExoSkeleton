package com.example.demo.models;

import javax.persistence.*;

@Entity
public class Report {

    @Id
    @GeneratedValue
    private Long id;
    private int durationOfUse;
    private int likelyToRecommend;
    private int whatIfYouCouldntUse;
    private int effortDuringADayWithSuit;
    private int effortWhileWearing;
    private int effortDuringHeaviestLift;
    private int rightShoulderdiscomfortWearing;
    private int leftShoulderdiscomfortWearing;
    private int upperBackDiscomfortWearing;
    private int lowerBackDiscomfortWearing;
    private int rightHipDiscomfortWearing;
    private int leftHipDiscomfortWearing;
    private int rightThighDiscomfortWearing;
    private int leftThighDiscomfortWearing;
    private int rightKneeDiscomfortWearing;
    private int leftKneeDiscomfortWearing;






    @ManyToOne
    private Person person;


    public Long getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }




}


