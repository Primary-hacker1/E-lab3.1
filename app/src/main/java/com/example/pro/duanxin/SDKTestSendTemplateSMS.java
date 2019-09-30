package com.example.pro.duanxin;


import java.util.HashMap;
import java.util.Set;

/**
 * 短信接收
 *
 */

public class SDKTestSendTemplateSMS {
	public static void main(String[] args) {
		HashMap<String, Object> result = null;
		CCPRestSDK restAPI = new CCPRestSDK();
		restAPI.init("app.cloopen.com", "8883");
		// 初始化服务器地址和端口，生产环境配置成app.cloopen.com，端口是8883.
		restAPI.setAccount("8a216da86d5c0d37016d60d997ee041a", "6f06fea4203d4def911a1f66ecdfe562");
		// 初始化主账号名称和主账号令牌，登陆云通讯网站后，可在控制首页中看到开发者主账号ACCOUNT SID和主账号令牌AUTH TOKEN。
		restAPI.setAppId("8a216da86d5c0d37016d60d998510421");
		// 请使用管理控制台中已创建应用的APPID。
		result = restAPI.sendTemplateSMS("17887245083","1" ,new String[]{"3456","测试"});
		System.out.println("SDKTestGetSubAccounts result=" + result);
		if("000000".equals(result.get("statusCode"))){
			//正常返回输出data包体信息（map）
			HashMap<String,Object> data = (HashMap<String, Object>) result.get("data");
			Set<String> keySet = data.keySet();
			for(String key:keySet){
				Object object = data.get(key);
				System.out.println(key +" = "+object);
			}
		}else{
			//异常返回输出错误码和错误信息
			System.out.println("错误码=" + result.get("statusCode") +" 错误信息= "+result.get("statusMsg"));
		}
	}
}
