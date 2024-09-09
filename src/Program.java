interface Program {
    String getDescription();
}

class LearningWithUnderstanding implements Program {
    @Override
    public String getDescription() {
        return "Учене с разбиране";
    }
}

class CheatingForAdvanced implements Program {
    @Override
    public String getDescription() {
        return "Преписване за напреднали";
    }
}

class CrammingUntilExhaustion implements Program {
    @Override
    public String getDescription() {
        return "Зубрене до скъсване";
    }
}
