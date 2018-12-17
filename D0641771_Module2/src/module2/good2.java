package module2;

public class good2 {

	public static void main(String[] args) {
		String song = "One little, two little, three little Indians, Four little, five little, six little Indians, Seven little, eight little, nine little Indians, Ten little Indian boys.";
		int times = 0;//初始化times
		int loca = 0;//初始化loca
		for(;;) {
			if(song.indexOf("little", loca) == -1) { //判斷是否找完了
				break;
			}
			loca = song.indexOf("little", loca) + 1; //找到的是當前位子所以要加1
			times = times + 1; //紀錄器
		}
		
		System.out.println("The word \"little\" appears " + times + " times"); //印出結果
		
		times = 0;//初始化
		loca = 0;//初始化
		//和找little
		//一樣
		for(;;) {	 
			if(song.indexOf("Indians", loca) == -1) {  //判斷是否找完了
				break;
			}
			loca = song.indexOf("Indians", loca) + 1; //找到的是當前位子所以要加1
			times = times + 1; //紀錄器
		}
		
		System.out.println("The word \"Indians\" appears " + times + " times");
		
		String rep = song.replace("Indians", "Taiwaneses");
		System.out.println(" \"" + rep + " \"");
		String re = song.replace("little", "big");
		System.out.println(" \"" + re + " \"");
	}	

}
