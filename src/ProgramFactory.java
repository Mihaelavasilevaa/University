class ProgramFactory {
    public Program createProgram(String type) {
        switch (type) {
            case "учене":
                return new LearningWithUnderstanding();
            case "преписване":
                return new CheatingForAdvanced();
            case "зубрене":
                return new CrammingUntilExhaustion();
            default:
                throw new IllegalArgumentException("Невалидна програма");
        }
    }
}
