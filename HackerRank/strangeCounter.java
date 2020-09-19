static long strangeCounter(long t) {

        // 증가하는 블록의 시작 값 (3,6,12,....)
        long blockNum = 0;
        // 전체 블록의 개수
        long total = 0;
        long result = 0;


        while(true) {
            if(total == 0) {
                blockNum = 3;
            }
            else {
                blockNum *=2;
            }

            total += blockNum;

            if(t <= total) {
                break;
            }
        }

        long lineFirst = (total-blockNum) + 1;
        long diff = t - lineFirst;
        result = blockNum - diff ;
        
        return result;

    }
