package Library.controller;

import Library.model.dao.MemberDao;

public class MemberController {
    // 1) 싱글톤
    private MemberController(){}
    private static final MemberController instance = new MemberController();
    public static MemberController getInstance(){
        return instance;
    }

    // 2) dao 싱글톤 가져오기
    private MemberDao memberDao = MemberDao.getInstance();
}
