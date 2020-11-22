/**
 * ��ϰ 7.29: ��Ϸ: ѡ��������
 */
public class MyPractise729 extends AbstractPratiseImpl {

	/**
	 * ��ȡʵ�ʳ���
	 * @param excludeCards
	 * @return
	 */
	private int getExcludeCardsLength(int [] excludeCards)
	{
		int length = 0;
		for (int i = 0; i < excludeCards.length; ++ i) {
			if (excludeCards[i] > 0) {
				++ length; 
			}
		}
		return length;
	}
	
	/**
	 * ���������Ƶĺ�
	 * @param excludeCards
	 * @return
	 */
	private int getSumOfExcludeCards(int [] excludeCards)
	{
		int sum = 0, cardValue = 0;
		for (int i = 0; i < excludeCards.length; ++ i) {
			cardValue = ((excludeCards[i] % 13 == 0) ? 13 : (excludeCards[i] % 13));
			sum += cardValue;
		}
		return sum;
	}
	
	/**
	 * ��鿨����ֵ�Ƿ��ڲ���ѡ�����������
	 * @param excludeCards
	 * @return
	 */
	private boolean checkExists(int cardValue, int [] excludeCards)
	{
		boolean isExists = false;
		for (int i = 0; i < excludeCards.length; ++ i) {
			if (cardValue == excludeCards[i]) {
				isExists = true;
				break;
			}
		}
        return isExists;
	}
	
	// �ҳ�һ����, ���Ƶ���ֵ��������
	// ��ʣ�µ�����ֵ������ѡ�ڶ�����
	
	/**
	 * ʹ�õݹ���㿨��
	 * @param cards
	 * @param exclureCards
	 */
	public void takeCards(int[] cards, int[] excludeCards)
	{
		int length = getExcludeCardsLength(excludeCards);
		if (length == 4) {
			if (getSumOfExcludeCards(excludeCards) == 24) {
				printFormatLine("(%s, %s, %s, %s)", 
						PlayCards.getSuitAndRank(excludeCards[0]), PlayCards.getSuitAndRank(excludeCards[1]),
						PlayCards.getSuitAndRank(excludeCards[2]), PlayCards.getSuitAndRank(excludeCards[3]));
			}
		} else {
			for (int i = 0; i < cards.length; ++ i) {
				if (checkExists(cards[i], excludeCards)) {
					continue;
				} else {
					// ���ú���λ��
					for (int j = 0; j < excludeCards.length; ++ j) {
						if (j > length - 1) {
							excludeCards[j] = 0;
						}
					}
                	excludeCards[length] = cards[i];
                	takeCards(cards, excludeCards);
				}
			}
		}
	}
	
	@Override
	public void run()
	{
		int[] cards = PlayCards.getSerialCards();
		int[] excludeCards = {0, 0, 0, 0};
		takeCards(cards, excludeCards);
	}
}
