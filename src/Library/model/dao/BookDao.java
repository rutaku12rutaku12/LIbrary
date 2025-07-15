package Library.model.dao;

import Library.model.dto.BookDto;
import Library.model.dto.MemberDto;

import java.util.ArrayList;

public class BookDao {
    // 1) 싱글톤
    private BookDao(){}
    private static final BookDao instance = new BookDao();
    public static BookDao getInstance(){
        return instance;
    }
    // 2) 여러개 게시물(DTO)들을 저장할 리스트 선언
    private ArrayList<BookDto> bookDB = new ArrayList<>();

    // 3) 등록 기능 구현


} // class end
