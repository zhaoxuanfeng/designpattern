package cn.zxf.self.designall.factory.simple_strategy;

/**
 * @ClassName CashContext
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class CashContext {
    CashSuper cashSuper = null;

    public CashContext(String type){
        switch (type){
            case "正常收费":
                CashNormal cs0 = new CashNormal();
                cashSuper = cs0;
                break;
            case "满300返100":
                CashReturn cs1 = new CashReturn();
                cashSuper = cs1;
                break;
            case "打八折":
                CashRebate cs2 = new CashRebate();
                cashSuper = cs2;
                break;
        }


    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
