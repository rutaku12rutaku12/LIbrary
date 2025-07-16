package Library.controller;

import Library.model.dao.LoanDao;
import Library.model.dto.LoanDto;
import Library.model.dto.MemberDto;

import java.util.ArrayList;

public class LoanController {
    // 1) 싱글톤
    private LoanController(){}
    private static final LoanController instance = new LoanController();
    public static LoanController getInstance(){
        return instance;
    }

    // 2) dao 싱글톤 가져오기
    private LoanDao loanDao = LoanDao.getInstance();

    // 3) 기능구현
    public ArrayList<LoanDto> loanPrint( String mId ){
        // dao 에게 요청후 로그인한 사용자 회원코드와 일치하는 대출목록 반환
     return loanDao.loanPrint(mId);
    }
}
