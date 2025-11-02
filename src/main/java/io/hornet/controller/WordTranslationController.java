package io.hornet.controller;

import io.hornet.entity.WordTranslationEntity;
import io.hornet.service.WordTranslationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/translations")
@RequiredArgsConstructor
public class WordTranslationController {

    private final WordTranslationService translationService;

    @PostMapping
    public WordTranslationEntity create(@RequestBody WordTranslationEntity translation) {
        return translationService.create(translation);
    }

    @GetMapping("/{id}")
    public WordTranslationEntity get(@PathVariable UUID id) {
        return translationService.get(id);
    }

    @GetMapping
    public List<WordTranslationEntity> getAll() {
        return translationService.getAll();
    }

    @PutMapping("/{id}")
    public WordTranslationEntity update(@PathVariable UUID id, @RequestBody WordTranslationEntity updated) {
        return translationService.update(id, updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        translationService.delete(id);
    }
}
