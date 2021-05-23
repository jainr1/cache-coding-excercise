package au.com.cacheinvest.survey.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionReplyDto {

    private Long id;

    private QuestionDto question;

    private ChoiceDto choice;
}
