package Library.controller;

import Library.model.dao.MemberDao;
import Library.model.dto.MemberDto;

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

    // 3) 등록 기능 구현
    public int login( String mId , String mPwd ){
        int result = 0;
        MemberDto memberDto = new MemberDto ( );


        //  성공시 result에 성공의 의미 "1" 반환
        result = 1 ;

        return result;
    } // func end



    // 회원코드반환 코드 :
    public int getMcode( String mId ) {// 로그인정보를 받아서 아이디를 회원코드로 반환  // 매개변수 아이디 // 리턴 int
        int result = 0;
        ArrayList<MemberDto> memberList = memberDao.returnMemberDB();
        for (int i = 0; i < memberList.size(); i++){
            if(memberList.get(i).getmId().equals(mId)){
                 result = memberList.get(i).getmCode();
                 break;
            }
        }
        return result;
    } //func end

} // class end
