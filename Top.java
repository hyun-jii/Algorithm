public class Top {
    public int[] solution(int[] heights) {
        int[] answer = {};
        int temp = 0;

        answer = new int[heights.length];

        for(int i=heights.length-1; i>0; i--)
        {
            for(int j=i-1; j>=0; j--) {
                if(heights[i] < heights[j]) {
                    answer[i] = j+1;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Top ob = new Top();
        int[] heights = {6,9,5,7,4};

        int[] result = ob.solution(heights);

        for (int a: result) {
            System.out.print(a + " ");
        }

    }
}
