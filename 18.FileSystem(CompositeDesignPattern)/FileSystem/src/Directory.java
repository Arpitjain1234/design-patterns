import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    String directoryName;
    List<FileSystem>fileSystemList = new ArrayList<>();
    public Directory(String directoryName){
        this.directoryName = directoryName;
    }
    public void ls() {
        System.out.println("Directory : "+directoryName);
        for(FileSystem fileSystemobj : fileSystemList){
            fileSystemobj.ls();
        }
    }
    public void addFileSystem(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }
}
