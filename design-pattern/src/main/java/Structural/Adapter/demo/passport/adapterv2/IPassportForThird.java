package Structural.Adapter.demo.passport.adapterv2;


import Structural.Adapter.demo.passport.ResultMsg;

/**
 * Created by Tom.
 */
public interface IPassportForThird {

    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWechat(String openId);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelphone(String phone, String code);

}
