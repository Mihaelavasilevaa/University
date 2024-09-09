abstract class ProgramDecorator implements Program {
    protected Program program;

    public ProgramDecorator(Program program) {
        this.program = program;
    }

    @Override
    public String getDescription() {
        return program.getDescription();
    }
}

class TeamWork extends ProgramDecorator {
    public TeamWork(Program program) {
        super(program);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "работа в екип";
    }
}

class SoloExecution extends ProgramDecorator {
    public SoloExecution(Program program) {
        super(program);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " като соло изпълнител";
    }
}