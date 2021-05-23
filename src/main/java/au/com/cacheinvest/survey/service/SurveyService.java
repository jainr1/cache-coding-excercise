package au.com.cacheinvest.survey.service;

import au.com.cacheinvest.survey.dto.SurveyDto;
import au.com.cacheinvest.survey.entity.SurveyQuestion;
import au.com.cacheinvest.survey.mapper.SurveyMapper;
import au.com.cacheinvest.survey.repository.SurveyQuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SurveyService {

    private final SurveyQuestionRepository repository;

    public SurveyDto getSurvey() {
        List<SurveyQuestion> surveyQuestions = repository.findAll();
        return SurveyMapper.toSurveyDto(surveyQuestions);
    }
}
