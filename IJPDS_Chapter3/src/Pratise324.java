public class Pratise324 extends AbstractPratiseImpl {

	/**
	 * 获取牌面
	 * @param int serial
	 * @return String
	 */
	private String getCardNameBySerial(int serial)
	{
		String cardName = "";
		switch(serial) {
			case 1: cardName = "ACE"; break;
			case 2: cardName = "2"; break;
			case 3: cardName = "3"; break;
			case 4: cardName = "4"; break;
			case 5: cardName = "5"; break;
			case 6: cardName = "6"; break;
			case 7: cardName = "7"; break;
			case 8: cardName = "8"; break;
			case 9: cardName = "9"; break;
			case 10: cardName = "10"; break;
			case 11: cardName = "Jack"; break;
			case 12: cardName = "Queen"; break;
			case 13: cardName = "King"; break;
		}
		return cardName;
	}

	/**
	 * 获取花色
	 * @param int color
	 * @return String
	 */
	private String getCardColor(int color)
	{
		String cardColor = "";
		switch (color) {
		    case 0: cardColor = "Spades"; break;
		    case 1: cardColor = "Hearts"; break;
		    case 2: cardColor = "Clubs"; break;
		    case 3: cardColor = "Diamonds"; break;
		}
		return cardColor;
	}
	
	/**
	 * 随即生成牌面
	 * @return
	 */
	private int generateCardValue()
	{
		// 生成牌面值
		int cardValue = ((int)(Math.random() * 1000) % 13) + 1;
		int cardColor = ((int)(Math.random() * 1000) % 4);
        return (cardValue * 4 + cardColor);
	}
	
	/**
	 * 游戏:抽牌
	 */
    @Override
    public void run()
    {
    	int cardValue = generateCardValue();
    	print("The card you pick is %s of %s", getCardNameBySerial(cardValue/4), getCardColor(cardValue%4));
    }
}
