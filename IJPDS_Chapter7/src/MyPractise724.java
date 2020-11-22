/**
 * ��ϰ 7.24: ����: �Ż�ȯ�ռ�����
 */
public class MyPractise724 extends AbstractPratiseImpl {

	@Override
	public void run()
	{
		int numberOfPicks = 0;
        int [] cards = PlayCards.getShuffleCards();
        int [] suitCount = {0, 0, 0, 0};

        for (int i = 0; i < cards.length; ++ i) {
        	String suit = PlayCards.getSuit(cards[i]);

        	// ��ɫͳ��
        	if (suit.compareTo("Spades") == 0) {
            	suitCount[0] ++;
            } else if (suit.compareTo("Hearts") == 0) {
            	suitCount[1] ++;
            } else if (suit.compareTo("Diamonds") == 0) {
            	suitCount[2] ++;
            } else if (suit.compareTo("Clubs") == 0) {
            	suitCount[3] ++;
            }

        	printFormatLine("%s", PlayCards.getSuitAndRank(cards[i]));
        	
            // �������еĻ�ɫ������
        	if (suitCount[0] > 0 &&suitCount[1] > 0
        	&& suitCount[2] > 0 && suitCount[3] > 0 ) {
        		numberOfPicks = i + 1;
        		break;
        	}
        }
        printFormatLine("Number of picks: %d", numberOfPicks);
	}
}
