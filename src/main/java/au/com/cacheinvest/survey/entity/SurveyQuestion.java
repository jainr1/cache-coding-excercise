package au.com.cacheinvest.survey.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "survey_question")
@Getter
@Setter
public class SurveyQuestion extends BaseEntity {

    @Column
    private String question;

    @OneToMany(
            mappedBy="surveyQuestion",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true)
    private Set<SurveyChoice> choices;
}
