package Library.model.dao;

import Library.controller.MemberController;
import Library.model.dto.LoanDto;

import java.util.ArrayList;

public class LoanDao {
    // 1) 싱글톤
    private LoanDao(){}
    private static final LoanDao instance = new LoanDao();
    public static LoanDao getInstance(){
        return instance;
    }
    // 2) 여러개 게시물(DTO)들을 저장할 리스트 선언
    private ArrayList<LoanDto> loanDB = new ArrayList<>();


    public ArrayList<LoanDto> loanPrint( String mId ){
        ArrayList<LoanDto> memLoan = new ArrayList<>();
        // dao 에게 요청후 로그인한 사용자 회원코드와 일치하는 대출목록 반환
        int lCode = MemberController.getInstance().getMcode( mId );
        for(int i =0 ; i< loanDB.size(); i++){
            if(loanDB.get(i).getlCode()==lCode){
            memLoan.add(loanDB.get(i));
            }
        }
        return memLoan;
    }

}

