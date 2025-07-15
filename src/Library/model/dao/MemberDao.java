package Library.model.dao;

import Library.model.dto.MemberDto;

import java.util.ArrayList;

public class MemberDao {
    // 1) 싱글톤
    private MemberDao(){}
    private static final MemberDao instance = new MemberDao();
    public static MemberDao getInstance(){
        return instance;
    }
    // 2) 여러개 게시물(DTO)들을 저장할 리스트 선언
    private ArrayList<MemberDto> memberDB = new ArrayList<>();
    public ArrayList<MemberDto> returnMemberDB(){
        return memberDB;
    }
    // 3) 등록 기능 구현
    public int login( String mId , String mPwd ){
        int result = 0;
        ArrayList<MemberDto> memberList = returnMemberDB();

        for (int i = 0 ; i < memberList.size(); i++){
            if(mId.equals("admin") &&
               memberList.get(i).getmPwd().equals(mPwd)){
                result = 2;
            }
            else if(memberList.get(i).getmId().equals(mId) &&
                    memberList.get(i).getmPwd().equals(mPwd)){
                result = 1;
                break;
            } // if end

        } // for end
        return result;

    } // func end

}
