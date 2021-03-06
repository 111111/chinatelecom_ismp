
package com.chinatelecom.ismp.sp;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-21T11:35:41.809+08:00
 * Generated source version: 3.0.1
 * 
 */
public final class IsmpSpEngine_IsmpSpEngine_Client {

    private static final QName SERVICE_NAME = new QName("http://sp.ismp.chinatelecom.com", "IsmpSpEngineService");

    private IsmpSpEngine_IsmpSpEngine_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = IsmpSpEngineService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        IsmpSpEngineService ss = new IsmpSpEngineService(wsdlURL, SERVICE_NAME);
        IsmpSpEngine port = ss.getIsmpSpEngine();  
        
        {
        System.out.println("Invoking spWithdrawSubscription...");
        com.chinatelecom.ismp.sp.req.SPWithdrawSubscriptionReq _spWithdrawSubscription_spWithdrawSubscriptionReqPara = null;
        com.chinatelecom.ismp.sp.rsp.Response _spWithdrawSubscription__return = port.spWithdrawSubscription(_spWithdrawSubscription_spWithdrawSubscriptionReqPara);
        System.out.println("spWithdrawSubscription.result=" + _spWithdrawSubscription__return);


        }
        {
        System.out.println("Invoking orderRelationUpdateNotify...");
        com.chinatelecom.ismp.sp.req.OrderRelationUpdateNotifyReq _orderRelationUpdateNotify_orderRelationUpdateNotifyReq = null;
        com.chinatelecom.ismp.sp.rsp.Response _orderRelationUpdateNotify__return = port.orderRelationUpdateNotify(_orderRelationUpdateNotify_orderRelationUpdateNotifyReq);
        System.out.println("orderRelationUpdateNotify.result=" + _orderRelationUpdateNotify__return);


        }
        {
        System.out.println("Invoking serviceConsumeNotify...");
        com.chinatelecom.ismp.sp.req.ServiceConsumeNotifyReq _serviceConsumeNotify_serviceConsumeNotifyReqPara = null;
        com.chinatelecom.ismp.sp.rsp.Response _serviceConsumeNotify__return = port.serviceConsumeNotify(_serviceConsumeNotify_serviceConsumeNotifyReqPara);
        System.out.println("serviceConsumeNotify.result=" + _serviceConsumeNotify__return);


        }
        {
        System.out.println("Invoking notifyManagementInfo...");
        com.chinatelecom.ismp.sp.req.NotifyManagementInfoReq _notifyManagementInfo_notifyManagementInfoReq = null;
        com.chinatelecom.ismp.sp.rsp.NotifyManagementInfoRsp _notifyManagementInfo__return = port.notifyManagementInfo(_notifyManagementInfo_notifyManagementInfoReq);
        System.out.println("notifyManagementInfo.result=" + _notifyManagementInfo__return);


        }

        System.exit(0);
    }

}
