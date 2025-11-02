package io.hornet.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WordTranslationDto {

    /**
     * UUID string. Unique identifier for the translation.
     */
    private String id;

    /**
     * Language code of the translation (e.g. "en", "fi").
     */
    private String languageCode;

    /**
     * Translated value (e.g. "talo").
     */
    private String value;
}
