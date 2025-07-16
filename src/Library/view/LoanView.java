package Library.view;

import Library.controller.LoanController;
import Library.model.dto.LoanDto;

import java.util.ArrayList;

public class LoanView {
    // 1) 싱글톤
    private LoanView(){}
    private static final LoanView instance = new LoanView();
    public static LoanView getInstance(){
        return instance;
    }

    // 2) controller 싱글톤 가져오기
    private LoanController loanController = LoanController.getInstance();

    // 3)
    public ArrayList<LoanDto> loanPrint(String mId ) {
        // dao 에게 요청후 로그인한 사용자 회원코드와 일치하는 대출목록 반환
        return loanController.loanPrint(mId);
    }
}
