package io.hornet.service;

import io.hornet.entity.WordEntity;
import io.hornet.repository.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class WordService {

    private final WordRepository wordRepository;

    public WordEntity create(WordEntity word) {
        return wordRepository.save(word);
    }

    public WordEntity get(UUID id) {
        return wordRepository.findById(id).orElseThrow();
    }

    public List<WordEntity> getAll() {
        return wordRepository.findAll();
    }

    public WordEntity update(UUID id, WordEntity updated) {
        WordEntity existing = wordRepository.findById(id).orElseThrow();
        existing.setValue(updated.getValue());
        return wordRepository.save(existing);
    }

    public void delete(UUID id) {
        wordRepository.deleteById(id);
    }
}
