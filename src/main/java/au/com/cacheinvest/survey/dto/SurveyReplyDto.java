package au.com.cacheinvest.survey.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class SurveyReplyDto {

    private Long id;

    private String repliedBy;

    private List<QuestionReplyDto> questionReplies;
}
