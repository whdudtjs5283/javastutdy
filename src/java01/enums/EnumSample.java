package java01.enums;

public enum EnumSample {

    one(1, "일", "one"),
    two(2,"이","two"),
    three(3, "삼", "three");

    final int number;
    final String korean;
    final String english;

    EnumSample(int number, String korean, String english) {
        this.number = number;
        this.korean = korean;
        this.english = english;
    }

}
