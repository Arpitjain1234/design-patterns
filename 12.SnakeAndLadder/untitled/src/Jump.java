public class Jump {
    JumpType jumpType;
    int start;
    int end;

    public Jump(int start, int end, JumpType jumpType){
        this.start = start;
        this.end = end;
        this.jumpType = jumpType;  // override the jump
    }
    public Jump(int start, int end) {
        this(start, end, JumpType.NONE); // reusing the first constructor
    }



}
