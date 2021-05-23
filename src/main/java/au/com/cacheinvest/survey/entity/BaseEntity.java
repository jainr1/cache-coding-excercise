package au.com.cacheinvest.survey.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Version;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
public class BaseEntity {

    @Id
    @Setter
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Version
    private int version;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime dateCreated;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime dateUpdated;

    @PreUpdate
    public void preUpdate() {
        dateUpdated = LocalDateTime.now();
    }

    @PrePersist
    public void prePersist() {
        dateCreated = LocalDateTime.now();
        dateUpdated = dateCreated;
    }
}
