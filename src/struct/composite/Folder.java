package struct.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Karl Jin
 * @create 2019-05-30 21:14
 */

public class Folder implements IFile {
    private String name;
    private List<IFile> children;

    public Folder(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    @Override
    public void display() {
        System.out.println("文件夹名字：" + name);
    }

    @Override
    public boolean add(IFile iFile) {
        return children.add(iFile);
    }

    @Override
    public boolean remove(IFile iFile) {
        return children.remove(iFile);
    }

    @Override
    public List<IFile> getChilds() {
        return children;
    }
}
