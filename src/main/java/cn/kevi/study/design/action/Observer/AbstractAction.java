package cn.kevi.study.design.action.Observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractAction implements Action {

    private Vector<Looker> vector = new Vector<>();

    @Override
    public void add(Looker looker) {
        vector.add(looker);
    }

    @Override
    public void del(Looker looker) {
        vector.remove(looker);
    }

    @Override
    public void notifyLooker() {
        Enumeration<Looker> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            enumeration.nextElement().change();
        }
    }
}
