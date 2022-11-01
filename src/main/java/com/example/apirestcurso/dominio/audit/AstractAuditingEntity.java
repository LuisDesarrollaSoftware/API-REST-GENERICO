package com.example.apirestcurso.dominio.audit;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import static javax.persistence.TemporalType.TIMESTAMP;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class Audit {

    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    @CreatedDate
    private Date createdDate;

    @Column(name = "modified_date")
    @Temporal(TemporalType.DATE)
    @LastModifiedDate
    private Date modifiedDate;
}
