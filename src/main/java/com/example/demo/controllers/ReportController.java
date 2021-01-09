package com.example.demo.controllers;

import com.example.demo.models.Company;
import com.example.demo.models.Person;
import com.example.demo.models.Report;
import com.example.demo.repositories.CompanyRepository;
import com.example.demo.repositories.PersonRepository;
import com.example.demo.repositories.ReportRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class ReportController {

    @Resource
    private ReportRepository reportRepo;

    @Resource
    private PersonRepository personRepo;

    @Resource
    private CompanyRepository companyRepo;

    @RequestMapping("/bi-monthly-report")
    public String displayBiMonthlyReport() {
        return "biMonthlyReport";
    }

    @RequestMapping("/all-reports")
    public String displayAllReports(Model model) {
        model.addAttribute("allReports", reportRepo.findAll());
        return "allReports";
    }




    @PostMapping("/add-report")
    public String addABiMonthlyReport(@RequestParam String firstName, String lastName, String company, int durationOfUse, int likelyToRecommend, int whatIfYouCouldntUse,
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

        Company companyToFind = companyRepo.findByCompanyName(company);
        Person personToFind = companyToFind.findByFirstAndLastName(firstName, lastName);

        Report reportToAdd = new Report(personToFind, durationOfUse, likelyToRecommend, whatIfYouCouldntUse,
                effortDuringADayWithSuit, effortWhileWearing, effortDuringHeaviestLift,
                rightShoulderDiscomfortWearing, leftShoulderDiscomfortWearing, upperBackDiscomfortWearing,
                lowerBackDiscomfortWearing, rightHipDiscomfortWearing, leftHipDiscomfortWearing,
                rightThighDiscomfortWearing, leftThighDiscomfortWearing, rightKneeDiscomfortWearing,
                leftKneeDiscomfortWearing, comfortWhileWorking, comfortWhileWalking, comfortWhileSteppingUpDown,
                comfortWhileDriving, comfortDuringBreaks, reducesDiscomfort, feelsHot, lightEnoughForFullShift,
                fullRangeOfMotion, wouldLikeToUseFrequently, tooComplex, easyToUse, wouldNeedTechnicalPerson,
                suitIsWellIntegrated, tooMuchInconsistency, mostWouldFindEasy, tooCumbersome, iFeltConfident,
                neededToLearnALot, hasBeenUseful, idLikeToContinueWearing, feelSafe, canMoveNaturally,
                useToolsNormally, wouldUseDaily, easyToPutOn, easyToTakeOff, reducesWorkFatigue,
                improvesWorkPerformance, preventLowBackInjury, reliableAndDurable, allOrSomeTasks,
                whichTasks, daysToGetUsedToIt, longTermEffects, whatDoYouLikeAboutIt,
                whatDoYouHateAboutIt, additionalNotes);

        reportRepo.save(reportToAdd);
        personToFind.addReport(reportToAdd);
        return "redirect:/all-reports";
    }
}

