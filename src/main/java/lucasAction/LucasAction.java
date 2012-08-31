package lucasAction;

import interfaces.PlayerAction;

public class LucasAction implements PlayerAction{
    @Override
    public void run() {
        System.out.println("Lucas拉开防守准备接球");
    }

    @Override
    public void getTheBall() {
        System.out.println("Lucas顺利接到皮球");
    }

    @Override
    public void aimTheTarget() {
        System.out.println("Lucas瞄准球迷左上角准备起脚打门");
    }

    @Override
    public void shot() {
        System.out.println("射门！");
    }

    @Override
    public void cry() {
        System.out.println("射门居然打到了角旗杆上。。。");
    }

    @Override
    public void celebrate() {
        System.out.println("GOAL！！！！射门打中横梁弹进网窝，Lucas疯狂庆祝！！");
    }
}
