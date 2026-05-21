package sec06.Practice;

public class Mabang {
    public static void main(String[] args) {
        int n = 5; // 5x5 마방진
        int[][] arr = new int[n][n];

        int r = 0; // 시작 행 (첫 번째 행)
        int c = n / 2; // 시작 열 (가운데 열)

        for (int i = 1; i <= n * n; i++) {
            arr[r][c] = i;

            // 다음 위치 계산 (위로 한 칸, 오른쪽으로 한 칸)
            int nextR = r - 1;
            int nextC = c + 1;

            // 행이 위로 벗어나는 경우, 맨 아래 행으로 이동
            if (nextR < 0) {
                nextR = n - 1;
            }
            // 열이 오른쪽으로 벗어나는 경우, 맨 왼쪽 열로 이동
            if (nextC == n) {
                nextC = 0;
            }

            // 다음 위치에 이미 숫자가 있는 경우, 현재 위치에서 아래로 한 칸 이동
            if (arr[nextR][nextC] != 0) {
                r = r + 1;
            } else {
                // 비어 있다면 다음 위치로 이동
                r = nextR;
                c = nextC;
            }
        }

        // 결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}