package au.com.cacheinvest.survey.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "survey_reply")
@Getter
@Setter
public class SurveyReply extends BaseEntity {

    @Column
    private String repliedBy;

    @OneToMany(
            mappedBy="surveyReply",
            fetch = FetchType.EAGER,
            orphanRemoval = true)
    private Set<SurveyReplyDetail> surveyReplyDetails;
}
