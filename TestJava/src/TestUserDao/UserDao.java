package TestUserDao;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
	public static void main(String[] args) {
    new UserDao().printStar(9);
	}
	public void printStar(int n) 
	{
		int[][] sCount = new int[n][n];
		for(int i=0;i<n/2;i++) {
			for(int j=0;j<(n/2)-i;j++) {
				sCount[i][j] = 1;
				sCount[i][n-j-1] = 1;
				sCount[n-i-1][j] =1;
				sCount[n-i-1][n-j-1] =1;
			}
		}
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, " ");
		map.put(0, "*");
		for(int i=0;i<n;i++) {
			StringBuilder sb = new StringBuilder();
			for(int j=0;j<n;j++) {
				sb.append(map.get(sCount[i][j]));
			}
			System.out.println(sb);
		}
	}
}
