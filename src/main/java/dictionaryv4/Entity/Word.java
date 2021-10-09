package dictionaryv4.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Word", catalog = "test")
public class Word implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "Id")
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  short id;

    @Column(name = "WordTarget", nullable = false, unique = true)
    private String wordTarget;

    @Column(name = "WordExplain", nullable = false, unique = true)
    private String wordExplain;

    public String getWordExplain() {
        return wordExplain;
    }

    public void setWordExplain(String wordExplain) {
        this.wordExplain = wordExplain;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getWordTarget() {
        return wordTarget;
    }

    public void setWordTarget(String wordTarget) {
        this.wordTarget = wordTarget;
    }

    public Word() {
    }

    public Word(short id, String wordTarget, String wordExplain) {
        this.id = id;
        this.wordTarget = wordTarget;
        this.wordExplain = wordExplain;
    }

    @Override
    public String toString() {
        return "Word{" +
                "id=" + id +
                ", wordTarget='" + wordTarget + '\'' +
                ", wordExplain='" + wordExplain + '\'' +
                '}';
    }
}
