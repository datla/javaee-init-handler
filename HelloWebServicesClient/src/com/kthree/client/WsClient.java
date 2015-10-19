package com.kthree.client;

import com.kthree.ws.ServerInfo;
import com.kthree.ws.ServerInfoService;

public class WsClient {

	public static void main(String[] args) {
		ServerInfoService sis = new ServerInfoService();
		ServerInfo si = sis.getServerInfoPort();
		System.out.println(si.getServerName());

	}

}
