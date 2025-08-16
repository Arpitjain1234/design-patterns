public class Main {
    public static void main(String[] args) {
        Directory d = new Directory("Movies");
        File f = new File("F1");
        Directory d1 = new Directory("Comedy Movies");
        File f1 = new File("3 Idiots");
        Directory d2 = new Directory("Thriller+Comedy");


        d.addFileSystem(f);
        d.addFileSystem(d1);
        d1.addFileSystem(f1);
        d1.addFileSystem(d2);


        d.ls();
    }
}