package io.hornet.controller;

import io.hornet.entity.WordEntity;
import io.hornet.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/words")
@RequiredArgsConstructor
public class WordController {

    private final WordService wordService;

    @PostMapping
    public WordEntity create(@RequestBody WordEntity word) {
        return wordService.create(word);
    }

    @GetMapping("/{id}")
    public WordEntity get(@PathVariable UUID id) {
        return wordService.get(id);
    }

    @GetMapping
    public List<WordEntity> getAll() {
        return wordService.getAll();
    }

    @PutMapping("/{id}")
    public WordEntity update(@PathVariable UUID id, @RequestBody WordEntity updated) {
        return wordService.update(id, updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        wordService.delete(id);
    }
}
