class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int N = matrix.length;
        int M = matrix[0].length;

        List<Integer> result = new ArrayList<>();
        boolean[][] visit = new boolean[N][M];
        visit[0][0] = true;
        result.add(matrix[0][0]);

        int[] dx = {0, 1, -0, -1};
        int[] dy = {1, 0, -1, 0};
        int cx = 0;
        int cy = 0;

        int d = 0;
        while (result.size() < N * M) {
            d = d % 4;

            if (cx+dx[d] < N && cy+dy[d] < M && cx+dx[d] >= 0 && cy+dy[d] >= 0 && !visit[cx+dx[d]][cy+dy[d]]) {

                cx += dx[d];
                cy += dy[d];
                visit[cx][cy] = true;
                result.add(matrix[cx][cy]);

            } else d++;
        }
        return result;
    }
}