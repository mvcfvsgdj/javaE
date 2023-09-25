package java2prj1.generic.printer;

//제네릭클래스만들기 , <>: 다이아몬드연산자
//제한된 제네릭 클래스 만들기 
//Material 클래스를 상속한 클래스만 담을수있도록 제한
public class GThreeDPrinter2<T> {

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	public void print() {
		System.out.println("3D print"+ material);
	}
}
