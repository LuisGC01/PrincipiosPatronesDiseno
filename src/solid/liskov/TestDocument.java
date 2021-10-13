package solid.liskov;

public class TestDocument
{
    public static void main(String[] args) {
        Project project = new Project();
        Document actaProyecto = new Document("actaProyecto");
        Document especificacionRequerimientos = new WritableDocument("especificacionRequerimientos");
        Document especificacionArquitectonica = new WritableDocument("especificacionArquitectonica");

        project.addDocument(actaProyecto);
        project.addDocument(especificacionArquitectonica);
        project.addDocument(especificacionRequerimientos);
        project.openAll();
        project.saveAll();
    }
}
