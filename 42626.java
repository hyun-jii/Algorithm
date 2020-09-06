public static int solution(int[] scoville, int K) {
        int count = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int number : scoville) {
            priorityQueue.add(number);
        }

        if(priorityQueue.element() < K) {
            while(priorityQueue.element() < K) {
                if(priorityQueue.size() == 1 && priorityQueue.element() < K) {
                    return -1;
                }

                int scovilNum = priorityQueue.poll();
                int scovilNum2 = priorityQueue.poll();

                int mixScovilNum = scovilNum + (scovilNum2 * 2);
                count++;

                priorityQueue.add(mixScovilNum);
            }
        }
        else {
            return 0;
        }

        return count;
    }
