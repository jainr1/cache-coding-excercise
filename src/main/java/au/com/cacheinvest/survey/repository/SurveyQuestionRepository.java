package au.com.cacheinvest.survey.repository;

import au.com.cacheinvest.survey.entity.SurveyQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyQuestionRepository extends JpaRepository<SurveyQuestion, Long> {
}
