package com.lcsw.background.domain;

/**
 * @program: PayProject
 * @description: MerchantParamDto
 * @author: WK
 * @create: 2019-07-07 15:46
 **/
public class MerchantParamDto extends MerchantParam {

    //商户编号
    private String merchantid;

    public String getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid;
    }

    @Override
    public String toString() {
        return "MerchantParamDto{" +
                "merchantid='" + merchantid + '\'' +
                "} " + super.toString();
    }
}
