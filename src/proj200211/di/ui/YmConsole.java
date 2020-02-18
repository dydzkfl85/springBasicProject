package proj200211.di.ui;

import proj200211.di.entity.BmiModule;

public class YmConsole implements Console {
	
private BmiModule bmiModule;

public YmConsole() {		
}

public YmConsole(BmiModule bmiModule) {
	this.bmiModule = bmiModule;
}

@Override
public void print() {
System.out.println("Ym 콘솔입니다!");
System.out.printf("%s 님의 BMI 수치는 %f 입니다!",bmiModule.outputName(),bmiModule.outputBMI());
}

public BmiModule getBmiModule() {
	return bmiModule;
}

public void setBmiModule(BmiModule bmiModule) {
	this.bmiModule = bmiModule;
}


}
