package Command.tarea1;

public class Main {
    public static void main(String[] args) {
/*
        Ide intelliJ = new Ide("IntelliJ IDEA","2023","community","JB");
        CleanBuildFolder cleanCmd = new CleanBuildFolder(intelliJ);
        UnitTestExecution unitTestCmd = new UnitTestExecution(intelliJ);
        StandarizationReview standarCmd = new StandarizationReview(intelliJ);
        GenerateBuild buildCmd = new GenerateBuild(intelliJ);

        GenerateCommand makeBuildCMD = new GenerateCommand();
        makeBuildCMD.addNewCommand(cleanCmd);
        makeBuildCMD.addNewCommand(unitTestCmd);
        makeBuildCMD.addNewCommand(standarCmd);
        makeBuildCMD.addNewCommand(buildCmd);

        makeBuildCMD.run();
        makeBuildCMD.run();

 */
        Personaje personaje = new Personaje("Paul", "El Rompe Huesos", "Tekken");
        Atacar atacar = new Atacar(personaje);
        Correr correr = new Correr(personaje);
        Regeneracion regeneracion = new Regeneracion(personaje);
        ContraAtaque contraAtaque = new ContraAtaque(personaje);

        GenerateCommand generateAction = new GenerateCommand();

        generateAction.addNewCommand(correr);

        generateAction.addNewCommand(regeneracion);

        generateAction.addNewCommand(atacar);

        generateAction.addNewCommand(contraAtaque);

        generateAction.run();
    }
}
