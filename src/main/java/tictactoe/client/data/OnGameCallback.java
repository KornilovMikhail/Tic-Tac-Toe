package tictactoe.client.data;

public interface OnGameCallback {

    void getOpponentTurn(int column, int row);

    void setResult(String result);
}
