package struct.composite;

import java.util.List;

/**
 * 文件节点的抽象
 * 1、为所有对象定义统一的抽象接口：公共方法和属性
 * 2、提供管理子节点对象的接口方法
 * 3、（可选）提供管理父节点对象的接口方法
 *
 * @author Karl Jin
 * @create 2019-05-30 21:01
 */

public interface IFile {

    public void display();// 显示文件或者文件夹名称

    public boolean add(IFile iFile);// 添加

    public boolean remove(IFile iFile);

    public List<IFile> getChilds();
}
