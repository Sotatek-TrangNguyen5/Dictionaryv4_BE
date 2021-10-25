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
    public List<Word>  listWord() { return wordRepo.findAll();}


    public Word getByWordTarget(String wordTarget) {
        return wordRepo.findWordByWordTarget(wordTarget);
    }

    public void createWord(Word word) {
        wordRepo.save(word);

    }
//
//    public void updateWord(short id, Word word) {
//        Word word1 = new Word();
//        word1.setId(id);
//        word1.setWordTarget(word.getWordTarget());
//        word1.setWordExplain(word.getWordExplain());
//        wordRepo.save(word1);
//    }

    public void updateWord(Word word) {
        wordRepo.save(word);

    }
    public void deleteWord(short id) {
        wordRepo.deleteById(id);

    }

    public void deleteWordByTargetWord(String wordTarget) {
        wordRepo.deleteWordsByWordTarget(wordTarget);

    }


    public boolean isWordExistsByWordTarget(String wordTarget) {
        return wordRepo.existsByWordTarget(wordTarget);
    }
}
