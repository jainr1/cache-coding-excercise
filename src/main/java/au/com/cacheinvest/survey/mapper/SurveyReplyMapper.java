package au.com.cacheinvest.survey.mapper;

import au.com.cacheinvest.survey.dto.ChoiceDto;
import au.com.cacheinvest.survey.dto.QuestionDto;
import au.com.cacheinvest.survey.dto.QuestionReplyDto;
import au.com.cacheinvest.survey.dto.SurveyReplyDto;
import au.com.cacheinvest.survey.entity.SurveyChoice;
import au.com.cacheinvest.survey.entity.SurveyQuestion;
import au.com.cacheinvest.survey.entity.SurveyReply;
import au.com.cacheinvest.survey.entity.SurveyReplyDetail;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SurveyReplyMapper {

    public static SurveyReplyDto toSurveyReplyDto(SurveyReply surveyReply) {

        SurveyReplyDto surveyReplyDto = new SurveyReplyDto();
        surveyReplyDto.setId(surveyReply.getId());
        surveyReplyDto.setRepliedBy(surveyReply.getRepliedBy());
        surveyReplyDto.setQuestionReplies(toQuestionReplyDto(surveyReply.getSurveyReplyDetails()));
        return surveyReplyDto;
    }

    public static SurveyReply toSurveyReply(SurveyReplyDto surveyReplyDto) {

        SurveyReply surveyReply = new SurveyReply();
        surveyReply.setRepliedBy(surveyReplyDto.getRepliedBy());
        surveyReply.setSurveyReplyDetails(toSurveyReplyDetails(surveyReplyDto.getQuestionReplies()));
        return surveyReply;
    }

    private static Set<SurveyReplyDetail> toSurveyReplyDetails(List<QuestionReplyDto> questionReplyDtoList) {

        Set<SurveyReplyDetail> surveyReplyDetails = new HashSet<>();
        for (QuestionReplyDto questionReplyDto: questionReplyDtoList) {
            SurveyChoice surveyChoice = new SurveyChoice();
            surveyChoice.setId(questionReplyDto.getChoice().getId());
            SurveyQuestion surveyQuestion  = new SurveyQuestion();
            surveyQuestion.setId(questionReplyDto.getQuestion().getId());
            SurveyReplyDetail surveyReplyDetail  = new SurveyReplyDetail();
            surveyReplyDetail.setSurveyChoice(surveyChoice);
            surveyReplyDetail.setSurveyQuestion(surveyQuestion);
            surveyReplyDetails.add(surveyReplyDetail);
        }
        return  surveyReplyDetails;
    }

    protected static List<QuestionReplyDto> toQuestionReplyDto(Set<SurveyReplyDetail> surveyReplyDetails) {

        List<QuestionReplyDto> questionReplyDtoList = new ArrayList<>();
        for (SurveyReplyDetail surveyReplyDetail : surveyReplyDetails) {
            QuestionDto questionDto = new QuestionDto(surveyReplyDetail.getSurveyQuestion().getId(),surveyReplyDetail.getSurveyQuestion().getQuestion(), null);
            ChoiceDto choiceDto   = new ChoiceDto(surveyReplyDetail.getSurveyChoice().getId(), surveyReplyDetail.getSurveyChoice().getLabel());
            questionReplyDtoList.add(new QuestionReplyDto(surveyReplyDetail.getId(), questionDto, choiceDto));
        }
        return questionReplyDtoList;
    }
}
