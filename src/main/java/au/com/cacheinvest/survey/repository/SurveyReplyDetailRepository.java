package au.com.cacheinvest.survey.repository;

import au.com.cacheinvest.survey.entity.SurveyReplyDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyReplyDetailRepository extends JpaRepository<SurveyReplyDetail, Long> {
}
