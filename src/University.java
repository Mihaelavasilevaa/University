class University {
    private static University instance;

    private University() {
        System.out.println("Добре дошли в единствения университет!");
    }

    public static University getInstance() {
        if (instance == null) {
            instance = new University();
        }
        return instance;
    }
}
