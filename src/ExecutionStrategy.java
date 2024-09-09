interface ExecutionStrategy {
    void executeProgram(Program program);
}

class CafeExecution implements ExecutionStrategy {
    @Override
    public void executeProgram(Program program) {
        System.out.println(program.getDescription() + " се изпълнява в кафенето.");
    }
}

class CorridorExecution implements ExecutionStrategy {
    @Override
    public void executeProgram(Program program) {
        System.out.println(program.getDescription() + " се изпълнява в коридора.");
    }
}

class HomeExecution implements ExecutionStrategy {
    @Override
    public void executeProgram(Program program) {
        System.out.println(program.getDescription() + " се изпълнява вкъщи.");
    }
}
