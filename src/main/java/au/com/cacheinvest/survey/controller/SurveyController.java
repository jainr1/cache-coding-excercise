package au.com.cacheinvest.survey.controller;

import au.com.cacheinvest.survey.dto.SurveyDto;
import au.com.cacheinvest.survey.service.SurveyService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/survey")
public class SurveyController {

    private final Logger logger = LoggerFactory.getLogger(SurveyController.class);

    private final SurveyService surveyService;

    @GetMapping
    @ResponseBody
    public SurveyDto get() {
        logger.info("Survey fetch request");
        return surveyService.getSurvey();
    }
}
