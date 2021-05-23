package au.com.cacheinvest.survey.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "survey_reply_detail")
public class SurveyReplyDetail extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="survey_question_id", nullable=false)
    private SurveyQuestion surveyQuestion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="survey_choice_id", nullable=false)
    private SurveyChoice surveyChoice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="survey_reply_id", nullable=false)
    private SurveyReply surveyReply;

}
