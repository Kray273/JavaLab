package Day108.Board;

class OneBoard { //Board 패키지 안에서만 사용가능
    //게시물 1개 정보 저장 객체!
    private int seq;
    //private로 변수의 접근을 제한해 객체에 직접적인 접근을 제한
    private String title;
    private String content;
    private String writer;
    private int viewCount;

    //setter(저장 수정)
    public void setSeq(int seq) {
        //외부에서 setSeq매서드를 사용하여 객체 변수에 정보 전달
        this.seq = seq; //구현 외부 오픈X
    }
    //getter(조회_읽기전용)
    public int getSeq(){
        return seq; // 객체변수에 저장되어 있는 변수값(값 or 주소)을 전달.
    }
}
