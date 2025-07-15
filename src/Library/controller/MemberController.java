package Library.controller;

import Library.model.dao.MemberDao;

import java.util.ArrayList;

public class MemberController {
    // 1) 싱글톤
    private MemberController(){}
    private static final MemberController instance = new MemberController();
    public static MemberController getInstance(){
        return instance;
    }

    // 2) dao 싱글톤 가져오기
    private MemberDao memberDao = MemberDao.getInstance();

//    public int getMcode( String mID ){// 로그인정보를 받아서 아이디를 회원코드로 반환  //매개변수 아이디 // 리턴 int
//        ArrayList<> memberList = memberDao.
//    }
}
