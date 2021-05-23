package au.com.cacheinvest.survey.repository;

import au.com.cacheinvest.survey.entity.SurveyReply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyReplyRepository extends JpaRepository<SurveyReply, Long> {
}
