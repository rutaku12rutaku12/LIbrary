package Library.view;

import Library.controller.MemberController;

public class MemberView {
    // 1) 싱글톤
    private MemberView(){}
    private static final MemberView instance = new MemberView();
    public static MemberView getInstance(){
        return instance;
    }

    // 2) controller 싱글톤 가져오기
    private MemberController memberController = MemberController.getInstance();
}
