/**
 * �˿�����
 * @author integrate
 */
public class PlayCards {
	/**
	 * ��ɫ
	 */
    private static String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

    /**
     * �ȼ�
     */
    private static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    /**
     * ���ƺ�
     */
    private static int[] cards = {
    	1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
    	14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
    	27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
    	40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52
    };

    /**
     * ��ȡ��ɫ
     * @return
     */
    public static String getSuit(int number)
    {
    	int suit = 0;
    	if (number > 40) {
    		suit = 3;
    	} else if (number > 27) {
    		suit = 2;
    	} else if (number > 14) {
    		suit = 1;
    	}
    	return suits[suit];
    }

    /**
     * ��ȡ����ֵ
     * @param number
     * @return
     */
    public static String getRank(int number)
    {
    	int rank = (number - 1) % 13;
    	return ranks[rank];
    }

    /**
     * ��ȡ
     * @param number
     * @return
     */
    public static String getSuitAndRank(int number)
    {
    	return String.format("%s 0f %s", getRank(number), getSuit(number));
    }

    /**
     * ��ȡ�����л��ҵĿ���
     */
    public static int[] getShuffleCards()
    {
    	int[] shuffleCards = cards;
        for (int i = 0; i < shuffleCards.length; ++ i) {
        	int randomIndex = (int) (Math.random() * shuffleCards.length);
            int temp = shuffleCards[randomIndex];
        	shuffleCards[randomIndex] = shuffleCards[i];
            shuffleCards[i] = temp;
        }
    	return shuffleCards;
    }

    /**
     * ��ȡ˳��Ƭ
     * @return
     */
    public static int[] getSerialCards()
    {
    	return cards;
    }
}
