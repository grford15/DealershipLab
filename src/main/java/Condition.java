public enum Condition {

    GOOD("Good"),
    BAD("Bad");


    private String conditionName;

    Condition(String conditionName) {

        this.conditionName = conditionName;
    }

    public String getConditionName() {
        return conditionName;
    }


}

