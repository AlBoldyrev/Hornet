package io.hornet.service;

import io.hornet.entity.WordTranslationEntity;
import io.hornet.repository.WordTranslationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class WordTranslationService {

    private final WordTranslationRepository translationRepository;

    public WordTranslationEntity create(WordTranslationEntity translation) {
        return translationRepository.save(translation);
    }

    public WordTranslationEntity get(UUID id) {
        return translationRepository.findById(id).orElseThrow();
    }

    public List<WordTranslationEntity> getAll() {
        return translationRepository.findAll();
    }

    public WordTranslationEntity update(UUID id, WordTranslationEntity updated) {
        WordTranslationEntity wordTranslation = translationRepository.findById(id).orElseThrow();
        wordTranslation.setValue(updated.getValue());
        wordTranslation.setLanguageCode(updated.getLanguageCode());
        return translationRepository.save(wordTranslation);
    }

    public void delete(UUID id) {
        translationRepository.deleteById(id);
    }
}
