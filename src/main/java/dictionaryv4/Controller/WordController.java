package dictionaryv4.Controller;

import dictionaryv4.Entity.Word;
import dictionaryv4.Service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping(value = "words")
public class WordController {
    @Autowired
    private WordService wordService;

    @GetMapping
    public List<Word> getAllWord() {
        return wordService.listWord();
    }

    @PostMapping
    public void createNewWord(@RequestBody Word word) {
        wordService.createWord(word);
    }
    @PutMapping
    public void updateWord(@RequestBody Word word) {
        wordService.updateWord(word);
    }
    @DeleteMapping(value="/{id}")
    public void deleteWord(@PathVariable(name="id")short id,Word word) {
        wordService.deleteWord(id);
    }
    @GetMapping("/findByWorldTarget")
    public Word getDepartmentByName(@RequestParam("wordTarget") String wordTarget) {
        return wordService.getByWordTarget(wordTarget);
    }
}
