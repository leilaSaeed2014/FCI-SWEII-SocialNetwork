package com.FCI.SWE.Services;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.json.simple.JSONObject;

import com.FCI.SWE.Models.Chat;



@Path("/chat")
public class ChatServices {
	private String status = "Status";
	private String ok     = "OK";
	private String failed = "Failed";
	
	@POST
	@Path("/send")
	public String send(@FormParam("sender")String sender,
						@FormParam("receiver")String receiver,
						@FormParam("text")String text){
		JSONObject obj = new JSONObject();
		Chat.send(sender,receiver,text);
		obj.put(status, ok);
		
		return obj.toString();
	}
	

}