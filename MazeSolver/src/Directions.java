public enum Directions {
    NORTH(-1, 0), SOUTH(1, 0), EAST(0, 1), WEST(0, -1);

    public final int dr, dc;

    Directions(int dr, int dc) {
        this.dr = dr;
        this.dc = dc;
    }

    public static Position move(Position pos, Directions dir) {
        return new Position(pos.row + dir.dr, pos.col + dir.dc);
    }
}
