public class Main {
    public static void main(String[] args) {

        University university = University.getInstance();

        ProgramFactory programFactory = new ProgramFactory();
        Program program = programFactory.createProgram("учене");

        Program decoratedProgram = new SoloExecution(program);

        ExecutionStrategy executionStrategy = new CafeExecution();
        executionStrategy.executeProgram(decoratedProgram);
    }
}
