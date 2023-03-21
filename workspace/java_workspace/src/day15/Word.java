package day15;
public class Word {
	/*
	 * Word class 단어와 의미를 저장할수 있음 apple : 사과 => 1개의 word class 멤버변수 겟 셋 / ! sort !
	 * add,print word mean 추가 1. void addWord(Scanner scan); 2. void printWord() =>
	 * 생성된 word class 정렬 후 모두 출력 + 검색 단어수정 삭제 종료
	 */
	private String word;
	private String mean;
	public Word(String word, String mean) {
		super();
		this.word = word;
		this.mean = mean;
	}
	@Override
	public String toString() {
		return word + " : " + mean;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
}