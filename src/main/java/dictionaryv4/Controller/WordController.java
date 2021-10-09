package dictionaryv4.Controller;

import dictionaryv4.Entity.Word;
import dictionaryv4.Service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "words")
public class WordController {
    @Autowired
    private WordService wordService;

    @GetMapping
    public List<Word> getAllWord() {
        System.out.printf("aaaaaaaaaaaa");
        return wordService.listWord();
    }
}
