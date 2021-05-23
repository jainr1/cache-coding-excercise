package au.com.cacheinvest.survey.service;

import au.com.cacheinvest.survey.dto.SurveyReplyDto;
import au.com.cacheinvest.survey.entity.SurveyReply;
import au.com.cacheinvest.survey.entity.SurveyReplyDetail;
import au.com.cacheinvest.survey.mapper.SurveyReplyMapper;
import au.com.cacheinvest.survey.repository.SurveyReplyDetailRepository;
import au.com.cacheinvest.survey.repository.SurveyReplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SurveyReplyService {

    private final SurveyReplyRepository surveyReplyRepository;

    private final SurveyReplyDetailRepository surveyReplyDetailRepository;

    public SurveyReplyDto createSurveyReply(SurveyReplyDto surveyReplyDto) {
        SurveyReply surveyReply = SurveyReplyMapper.toSurveyReply(surveyReplyDto);
        SurveyReply surveyReplySaved = surveyReplyRepository.save(surveyReply);
        for (SurveyReplyDetail surveyReplyDetail : surveyReply.getSurveyReplyDetails()) {
            surveyReplyDetail.setSurveyReply(surveyReplySaved);
            surveyReplyDetailRepository.save(surveyReplyDetail);
        }
        return SurveyReplyMapper.toSurveyReplyDto(surveyReplyRepository.findById(surveyReplySaved.getId()).get());
    }
}
