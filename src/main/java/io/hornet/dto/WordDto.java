package io.hornet.dto;

import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class WordDto {

    /**
     * UUID string. Unique identifier for the word.
     */
    private String id;

    /**
     * Raw value of the word (e.g. "home").
     */
    private String value;

    /**
     * All available translations for the word.
     */
    private List<WordTranslationDto> translations;
}
