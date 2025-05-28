public class App {
    public static void main(String[] args) {
        Peca pecaComum = new Peca("Roda", 50.0, 20.0);
        pecaComum.exibir();
        PecaImportada pecaImportada = new PecaImportada("Motor", 200.0, 100.0, 30.0, 20.0);
        pecaImportada.exibir();
    }
}