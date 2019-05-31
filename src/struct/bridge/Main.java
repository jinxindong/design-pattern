package struct.bridge;

/**
 * 桥接模式
 * 解释：将抽象化和实现化脱耦，使得两者独立变化
 *
 *
 * @author Karl Jin
 * @create 2019-05-31 09:26
 *
 * 例子：
 * 1、有mac linux   window操作系统
 * 2、要实现JPG  PNG在三个系统的显示
 *
 * 传统思路要实现macJPG linuxJPG  windowsJPG  macPNG  linuxPNG  windowsPNG
 * 每次新增1个操作系统 就要多新增2个图像实现类
 * 每次新增1个图片 就要多新增3个图像实现类
 *
 * 改进：
 *  如果让图象类持有操作系统类
 * 每次新增1个操作系统 就要在每个多新增2个方法 如：给s系统画jpg图 给s系统画png图
 * 每次新增1个图片 就要多新增3个方法 如：给mac画gif 给linux画gif 给window画gif
 *
 * 再次改进：
 *  定义图像抽象类 持有操作系统接口，在抽象具体类中实现画图
 *  每次新增1个操作系统  无需改动代码 只要传入该系统即可
 *  每次新增1个图片  无需改动代码  只要他接收一个系统即可
 *
 *  这里的难点在parseFile方法，如何才能兼容扩展的类。
 *
 *  场景：发送消息
 *  分为普通消息 加急消息 特急消息 --抽象类 -一般内部构造功能
 *  分为系统内  手机  邮件 --接口 -一般外面给过来的订好的
 *
 */

public class Main {
    public static void main(String[] args) {
        /**
         * 这里的操作系统和格式 可以分别在配置文件中配置
         * 然后通过反射实现 更具有灵活性，连代码都不用动
         */
        SystemOp linuxSystemOp = new LinuxSystem();
        SystemOp macSystem = new MacSystem();
        SystemOp windowsSystem = new WindowsSystem();

        Image JPGLinux = new JPGImage(linuxSystemOp);
        JPGLinux.parseFile();
        System.out.println();
        System.out.println();
        Image PNGMac = new PNGImage(macSystem);
        PNGMac.parseFile();

    }
}
