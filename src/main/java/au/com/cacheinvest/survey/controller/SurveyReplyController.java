package au.com.cacheinvest.survey.controller;

import au.com.cacheinvest.survey.dto.SurveyReplyDto;
import au.com.cacheinvest.survey.service.SurveyReplyService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/survey/replies")
@RequiredArgsConstructor
public class SurveyReplyController {

    private final Logger logger = LoggerFactory.getLogger(SurveyReplyController.class);

    private final SurveyReplyService surveyReplyService;

    @PostMapping
    @ResponseBody
    public SurveyReplyDto post(@RequestBody SurveyReplyDto surveyReply) throws JsonProcessingException {
        logger.info("Survey reply post request");
        return surveyReplyService.createSurveyReply(surveyReply);
    }
}
