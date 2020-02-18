package proj200211.di.ui;

import proj200211.di.entity.BmiModule;

public class YsConsole implements Console {
	
		private BmiModule bmiModule;
		
		public YsConsole() {		
		}
		
	public YsConsole(BmiModule bmiModule) {
			super();
			this.bmiModule = bmiModule;
		}

	@Override
	public void print() {
		System.out.println("Ys 콘솔입니다!");
		System.out.printf("%s 님의 BMI 수치는 %f 입니다!",bmiModule.outputName(),bmiModule.outputBMI());
	}

}
