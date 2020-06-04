package cn.kevi.study.design.action.State;

public class StateTest {

    public static void main(String[] args){
        GameTime time = new GameTime();
        WeekDay weekDay = new WeekDay(time);
        time.setUse("NS");
        weekDay.play();
        time.setUse("PS4");
        weekDay.play();
        time.setUse("XBOX");
        weekDay.play();
    }

}
