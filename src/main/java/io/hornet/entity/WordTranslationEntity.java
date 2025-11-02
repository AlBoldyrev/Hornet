package io.hornet.entity;

import java.util.*;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.*;

@Entity
@Table(name = "word_translations_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WordTranslationEntity {

    @Id
    @UuidGenerator
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "word_id", nullable = false)
    private WordEntity word;

    @Column(name = "language_code")
    private String languageCode;

    private String value;
}
