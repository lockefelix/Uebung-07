package p2;

public class P2_main {
    public static void main(String[] args) {
        LetterGame game = new LetterGame();

        String s = "UNI";
        int[] a = {14, 2, 0, 0, 19, 19};

        game.findCode(s);
        game.setWord(game.a);
        System.out.println(game);
    }
}