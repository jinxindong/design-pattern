package struct.composite;

import java.util.List;

/**
 * 文件节点  不是文件夹节点。
 * 文件不支持在下面增加、删除节点和获取文件列表
 *
 * @author Karl Jin
 * @create 2019-05-30 21:06
 */

public class FileLeaf implements IFile {

    private String name;

    public FileLeaf(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("文件" + name);
    }

    @Override
    public boolean add(IFile iFile) {
        return false;
    }

    @Override
    public boolean remove(IFile iFile) {
        return false;
    }

    @Override
    public List<IFile> getChilds() {
        return null;
    }
}
