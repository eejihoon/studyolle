package com.studyolle.modules.tag;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@EqualsAndHashCode(of = "id")
@Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor
@Entity
public class Tag {

    @Id @GeneratedValue
    private Long id;

    @Column(unique = true, nullable = false)
    private String title;
}