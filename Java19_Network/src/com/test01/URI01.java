package com.test01;

import java.net.URI;
import java.net.URISyntaxException;

public class URI01 {
	/*
	 * URI = URL + URL
	 * URL : Uniform Resource Locator 주소(위치)
	 * 		 URL은 특정 서버의 특정 리소스에 대한 구체적인 위치를 서술
	 * URN : Uniform Resource Name 대상(이름)
	 * 		 URN은 컨텐츠를 구성하는 한 리소스에 대해, 위치에 영향 받지 않은 유일무이한 이름
	 */
	public static void main(String[] args) throws URISyntaxException {
		URI u = new URI("https://www.google.com/search?q=%EC%82%AC%EA%B3%BC+&sca_esv=19ca41183bcca24c&sxsrf=ANbL-n5l2JlbVrayybPOogAogFUmHJAsVg%3A1778049191244&ei=p-D6acW_Dpqp2roPrqShqQo&biw=726&bih=721&ved=0ahUKEwiFr7-zhaSUAxWalFYBHS5SKKUQ4dUDCBE&uact=5&oq=%EC%82%AC%EA%B3%BC+&gs_lp=Egxnd3Mtd2l6LXNlcnAiB-yCrOqzvCAyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAESL8EUOgCWOgCcAF4AZABAJgBmgGgAZoBqgEDMC4xuAEDyAEA-AEBmAICoAKoAcICChAAGEcY1gQYsAOYAwCIBgGQBgqSBwMxLjGgB7IEsgcDMC4xuAeiAcIHAzItMsgHC4AIAQ&sclient=gws-wiz-serp");
		
		System.out.println(u.getScheme());
		System.out.println(u.getHost());
		System.out.println(u.getQuery());
	}
}
