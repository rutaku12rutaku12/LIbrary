package Library.view;

import Library.controller.MemberController;
import Library.model.dto.LoanDto;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberView {
    // 1) 싱글톤
    private MemberView(){}
    private static final MemberView instance = new MemberView();
    public static MemberView getInstance(){
        return instance;
    }

    // 2) controller 싱글톤 가져오기
    private MemberController memberController = MemberController.getInstance();

    private Scanner scan = new Scanner(System.in);

    // 프로그램 최초 화면
    public void index(){
        for( ; ; ){
            System.out.println("=========== 도서관리 시스템  ===========");
            System.out.println("  1.회원가입 | 2.로그인");
            System.out.println("==========================================");
            System.out.println("선택 > ");
            int choose = scan.nextInt();
            if( choose == 1 ){}
            else if(choose == 2){login();}
        } // 무한루프 end

    } // index()end

    // 3 등록 입출력 구현
    public void login(){
        // 1. 안내와 입력받기
        System.out.println("아이디: "); String mId = scan.next();
        System.out.println("비밀번호: "); String mPwd = scan.next();
        // 2. controller 에게 입력받은 값 인수로 전달 후 결과(리턴)받기
        int result = memberController.login( mId , mPwd );
        // 3. 결과/리턴에 따른 출력문
        if( result == 1 ) {System.out.println("[안내] 로그인 성공");
        }else if ( result == 2 ) {System.out.println("[관리자] 로그인 성공");
        }else if ( result == 0 ) {System.out.println("[경고] 로그인 실패");}
    } // func end



    // 사용자별 대출 현황
    public void loanPrint(){
        int choose = scan.nextInt(); // 지워질 예정
        if( choose == 4 ) {

            System.out.println("--- 나의 대출 현황 ---");
            System.out.println("");
        }
}

    // 로그아웃
    public void logout(){
        index();
    }

} // class end
