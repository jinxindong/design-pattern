package struct.composite;

import java.util.List;

/**
 * 组合设计模式
 * 解释：通过递归手段来构造树形对象结构，并通过一个对象来访问整个对象树
 * <p>
 * 优点：客户端可以一致的处理对象和对象容器。解耦客户端代码和复杂的对象容器结构
 * 缺点：使设计复杂，客户端需要花更多时间理清类之间的层次关系
 *
 * @author Karl Jin
 * @create 2019-05-30 20:53
 */

public class Main {

    public static void main(String[] args) {
        Folder folder = new Folder("c:");
        Folder beifengfolder = new Folder("beifeng");
        Folder beifengFile = new Folder("beifenng.txt");
        folder.add(beifengfolder);
        folder.add(beifengFile);

        diplayTree(folder, 0);
    }

    public static void diplayTree(IFile folder, int deep) {
        for (int i = 0; i < deep; i++) {
            System.out.println("---");
        }
        // 当前文件夹展示自身名字
        folder.display();
        // 获取子树
        List<IFile> children = folder.getChilds();
        // 遍历
        for (IFile file : children) {
            if (file instanceof FileLeaf) {
                for (int i = 0; i < deep; i++) {
                    System.out.println("---");
                }
                file.display();
            } else {
                diplayTree(file, deep + 1);
            }

        }


    }
}
