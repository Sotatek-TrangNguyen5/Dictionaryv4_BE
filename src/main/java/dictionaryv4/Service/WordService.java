package dictionaryv4.Service;

import dictionaryv4.Entity.Word;
import dictionaryv4.Repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordService {
    @Autowired
    private WordRepository wordRepo;
    public List<Word>  listWord(){
        return wordRepo.findAll();
    }
}
