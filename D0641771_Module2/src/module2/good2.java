package module2;

public class good2 {

	public static void main(String[] args) {
		String song = "One little, two little, three little Indians, Four little, five little, six little Indians, Seven little, eight little, nine little Indians, Ten little Indian boys.";
		int times = 0;//��l��times
		int loca = 0;//��l��loca
		for(;;) {
			if(song.indexOf("little", loca) == -1) { //�P�_�O�_�䧹�F
				break;
			}
			loca = song.indexOf("little", loca) + 1; //��쪺�O��e��l�ҥH�n�[1
			times = times + 1; //������
		}
		
		System.out.println("The word \"little\" appears " + times + " times"); //�L�X���G
		
		times = 0;//��l��
		loca = 0;//��l��
		//�M��little
		//�@��
		for(;;) {	 
			if(song.indexOf("Indians", loca) == -1) {  //�P�_�O�_�䧹�F
				break;
			}
			loca = song.indexOf("Indians", loca) + 1; //��쪺�O��e��l�ҥH�n�[1
			times = times + 1; //������
		}
		
		System.out.println("The word \"Indians\" appears " + times + " times");
		
		String rep = song.replace("Indians", "Taiwaneses");
		System.out.println(" \"" + rep + " \"");
		String re = song.replace("little", "big");
		System.out.println(" \"" + re + " \"");
	}	

}
