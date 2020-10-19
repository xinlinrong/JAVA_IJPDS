/**
 * 练习 4.24 对三个城市进行排序
 * @author integrate
 */
public class MyPratise424 extends AbstractPratiseImpl {
	@Override
    public void run()
    {
		this.print("Enter the first city:");
		String city1 = in.nextLine();

		this.print("Enter the second city:");
		String city2 = in.nextLine();

		this.print("Enter the third city:");
		String city3 = in.nextLine();

        String[] cities = {city1, city2, city3};
        for (int i = 0; i < cities.length; ++ i) {
        	for (int j = i + 1; j < cities.length; ++ j) {
        		if (cities[i].compareTo(cities[j]) > 0) {
        			String tempStr = cities[j];
        			cities[j] = cities[i];
        			cities[i] = tempStr;
        		}
        	}
        }

        this.print("The three cities in aplahbetical order are %s, %s, %s", cities[0], cities[1], cities[2]);
    }
}
