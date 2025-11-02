package io.hornet.entity;

import java.util.*;

import jakarta.persistence.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Table;
import lombok.*;
import lombok.extern.slf4j.*;
import org.hibernate.annotations.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "words_table")
@Slf4j
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WordEntity {

    @Id
    @UuidGenerator
    private UUID id;

    @Column(name = "value")
    private String value;

    @OneToMany(mappedBy = "word", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WordTranslationEntity> translations = new ArrayList<>();
}
