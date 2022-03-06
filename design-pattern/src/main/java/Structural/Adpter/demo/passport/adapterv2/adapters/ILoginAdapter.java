package Structural.Adpter.demo.passport.adapterv2.adapters;


import Structural.Adpter.demo.passport.ResultMsg;

/**
 * Created by Tom.
 */
public interface ILoginAdapter {
    boolean support(Object object);
    ResultMsg login(String id, Object adapter);
}
