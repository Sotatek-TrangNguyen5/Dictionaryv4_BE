package dictionaryv4.Repository;

import dictionaryv4.Entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends JpaRepository<Word,  Short> {

}

