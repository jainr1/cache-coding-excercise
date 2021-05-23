package au.com.cacheinvest.survey.mapper;

import au.com.cacheinvest.survey.dto.ChoiceDto;
import au.com.cacheinvest.survey.dto.QuestionDto;
import au.com.cacheinvest.survey.dto.SurveyDto;
import au.com.cacheinvest.survey.entity.SurveyChoice;
import au.com.cacheinvest.survey.entity.SurveyQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SurveyMapper {

    public static SurveyDto toSurveyDto(List<SurveyQuestion> surveyQuestions) {

        List<QuestionDto> questionDtoList = new ArrayList<>();
        for (SurveyQuestion surveyQuestion : surveyQuestions) {
            questionDtoList.add(
                            new QuestionDto(surveyQuestion.getId(),
                            surveyQuestion.getQuestion(),
                            toChoiceDto(surveyQuestion.getChoices())));
        }
        return  new SurveyDto(questionDtoList);
    }
    protected static List<ChoiceDto> toChoiceDto(Set<SurveyChoice> choices) {

        List<ChoiceDto> choiceDtoList  = new ArrayList<>();
        for (SurveyChoice surveyChoice : choices) {
            choiceDtoList.add(new ChoiceDto(surveyChoice.getId(), surveyChoice.getLabel()));
        }
        return choiceDtoList;
    }
}
