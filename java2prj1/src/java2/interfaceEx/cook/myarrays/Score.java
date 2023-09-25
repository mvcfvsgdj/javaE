package java2.interfaceEx.cook.myarrays;

public class Score implements MyComparable{
int kor;
int eng;
public int getKor() {
	return kor;
}
public void setKor(int kor) {
	this.kor = kor;
}
public int getEng() {
	return eng;
}
public void setEng(int eng) {
	this.eng = eng;
}

@Override
public String toString() {
	return "Score [kor=" + kor + ", eng=" + eng + "]";
}
public Score(int kor, int eng) {
	super();
	this.kor = kor;
	this.eng = eng;
}
public Score() {
	// TODO Auto-generated constructor stub
}

@Override
public int compareTo(Object other) {
	Score s1 = (Score)other;
	return this.eng-s1.eng;
}
}
