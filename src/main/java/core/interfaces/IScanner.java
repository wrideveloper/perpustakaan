package core.interfaces;

public interface IScanner {
    public String getNonEmptyString(String prompt, String errorMessage);
    public String getStringWithLength(String prompt, int minLength, int maxLength, String errorMessage);
}
