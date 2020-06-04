package cn.kevi.study.design.action.State;

public class WeekDay {

    private GameTime gameTime;

    public WeekDay(GameTime gameTime){
        this.gameTime = gameTime;
    }

    public GameTime getGameTime() {
        return gameTime;
    }

    public void setGameTime(GameTime gameTime) {
        this.gameTime = gameTime;
    }

    public void play(){
        if (gameTime.getUse().equals("NS")){
            gameTime.playNS();
        }else if (gameTime.getUse().equals("PS4")){
            gameTime.playPS4();
        }else if (gameTime.getUse().equals("XBOX")){
            gameTime.playXBOX();
        }
    }

}
