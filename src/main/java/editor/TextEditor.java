package editor;

public class TextEditor {
    SpellChecker spellChecker;

    {
        System.out.println("text editor created");
    }

    public TextEditor() {
    }

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("text editor created");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.spellCheck();
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
}
