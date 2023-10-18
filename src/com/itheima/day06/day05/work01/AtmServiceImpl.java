package com.itheima.day06.day05.work01;

import java.math.BigDecimal;

/**
 * Atm业务类
 * @author admin
 */
public class AtmServiceImpl {

    public AtmServiceImpl() {
    }

    /**
     * 校验取钱金额并取钱
     * @param accouna 银行账户对象
     * @param money 取钱金额
     * @return 返回余额
     */
    public  boolean drawMoney(Accouna accouna, double money){
        if (money < 0 ){
//            throw new NumericalAnomalyException("输入的取钱金额不合法!");
            System.out.println("输入的取钱金额不合法!");
            return false;
        }
        BigDecimal balance = accouna.getBalance();
        BigDecimal bigDecimal = BigDecimal.valueOf(money);
        if (bigDecimal.compareTo(balance) > 0) {
//            throw new InsufficientBalanceException("账户余额不足!");
            System.out.println("输入的取钱金额不合法!");
            return false;
        }

        return true;
    };


}
