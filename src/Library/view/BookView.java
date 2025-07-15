package Library.view;

import Library.controller.BookController;

public class BookView {
    // 1) 싱글톤
    private BookView(){}
    private static final BookView instance = new BookView();
    public static BookView getInstance(){
        return instance;
    }

    // 2) controller 싱글톤 가져오기
    private BookController bookController = BookController.getInstance();

    // 프로그램 최초 하면
    public void index(){
        for( ; ; ){
            System.out.println("=========== 도서관리 시스템  ===========");
            System.out.println("  1.회원가입 | 2.로그인");
            System.out.println("==========================================");
            System.out.println("선택 > ");

        }
    }
}
