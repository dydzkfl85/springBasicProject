//오버로드는 똑같은 메소드,클래스에다가 같은 값을 가지고 있되, 매개변수가 다른 경우를 말한다.오버라이드는 클래스에서 상속받아서 쓴다.
package proj200211.di.entity;

public class JwBmiModule implements BmiModule {
	
	private String name;
	private float weight;
	private float height;
	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public JwBmiModule() {
		
	}
	

	@Override
	public float outputBMI() {
		// TODO Auto-generated method stub
		return weight/(height*height);
	}
	@Override
	public String outputName() {
		// TODO Auto-generated method stub
		return name;
	}

}
