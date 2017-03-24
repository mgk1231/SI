package org.eclipse.leshan.server.onem2m.resources;

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.leshan.server.Constants;
import org.eclipse.leshan.server.api.Util;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SemanticDescriptor extends Resource{
	
	public SemanticDescriptor(){
		setShortName("smd");
		setRn("semanticDescriptor");
		setApi(Constants.BASIC_AE_NAME);
		resetLbl();
		setExpired();
	}
	
    // for create
    public JSONObject setForCreate() {

    	JSONObject body_wrap = new JSONObject();
    	JSONObject body = new JSONObject();
    	JSONArray lbl = new JSONArray();
    	
        try {
        	if( getLbl() != null ){
	            for(String label : getLbl()) {
	                lbl.put(label);
	            }
	            body.put("lbl", lbl);
        	}

            body.put("rn", getRn());
            body.put("et", getEt());
            body.put("dcrp", "application/rdf+xml:1");
            body.put("dsp", "PHJkZjpSREYNCiAgICB4bWxuczpwcm90ZWdlPSJodHRwOi8vcHJvdGVnZS5zdGFuZm9yZC5lZHUvcGx1Z2lucy9vd2wvcHJvdGVnZSMiDQogICAgeG1sbnM6dW5pdD0iaHR0cDovL2RhdGEubmFzYS5nb3YvcXVkdC9vd2wvdW5pdCMiDQogICAgeG1sbnM6ZGltPSJodHRwOi8vZGF0YS5uYXNhLmdvdi9xdWR0L293bC9kaW1lbnNpb24jIg0KICAgIHhtbG5zOnNzbj0iaHR0cDovL3B1cmwub2NsYy5vcmcvTkVUL3Nzbngvc3NuIyINCiAgICB4bWxuczpkY3Rlcm1zPSJodHRwOi8vcHVybC5vcmcvZGMvdGVybXMvIg0KICAgIHhtbG5zOmRjPSJodHRwOi8vcHVybC5vcmcvZGMvZWxlbWVudHMvMS4xLyINCiAgICB4bWxuczpiPSJodHRwOi8vd3d3Lm9uZW0ybS5vcmcvb250b2xvZ3kvQmFzZV9PbnRvbG9neSMiDQogICAgeG1sbnM6eHNwPSJodHRwOi8vd3d3Lm93bC1vbnRvbG9naWVzLmNvbS8yMDA1LzA4LzA3L3hzcC5vd2wjIg0KICAgIHhtbG5zOmRjYW09Imh0dHA6Ly9wdXJsLm9yZy9kYy9kY2FtLyINCiAgICB4bWxuczpza29zPSJodHRwOi8vd3d3LnczLm9yZy8yMDA0LzAyL3Nrb3MvY29yZSMiDQogICAgeG1sbnM6c3dybD0iaHR0cDovL3d3dy53My5vcmcvMjAwMy8xMS9zd3JsIyINCiAgICB4bWxuczpkdWw9Imh0dHA6Ly93d3cubG9hLWNuci5pdC9vbnRvbG9naWVzL0RVTC5vd2wjIg0KICAgIHhtbG5zOmhlcml0PSJodHRwOi8vaGVyaXQtaW4vaGVyaXQtY3NlLyINCiAgICB4bWxuczpvPSJodHRwOi8vd3d3LmlvdG9hc2lzLm9yZy9vbnRvbG9neS8iDQogICAgeG1sbnM6Y2M9Imh0dHA6Ly9jcmVhdGl2ZWNvbW1vbnMub3JnL25zIyINCiAgICB4bWxuczp4c2Q9Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvWE1MU2NoZW1hIyINCiAgICB4bWxuczpyZGY9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkvMDIvMjItcmRmLXN5bnRheC1ucyMiDQogICAgeG1sbnM6c3dybGI9Imh0dHA6Ly93d3cudzMub3JnLzIwMDMvMTEvc3dybGIjIg0KICAgIHhtbG5zOnJkZnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDEvcmRmLXNjaGVtYSMiDQogICAgeG1sbnM6cXVkdD0iaHR0cDovL3F1ZHQub3JnLzEuMS9zY2hlbWEvcXVkdCMiDQogICAgeG1sbnM6b2VjYz0iaHR0cDovL3d3dy5vZWdvdi5vcmcvbW9kZWxzL2NvbW1vbi9jYyMiDQogICAgeG1sbnM6cXVhbnRpdHk9Imh0dHA6Ly9kYXRhLm5hc2EuZ292L3F1ZHQvb3dsL3F1YW50aXR5IyINCiAgICB4bWxuczpvd2w9Imh0dHA6Ly93d3cudzMub3JnLzIwMDIvMDcvb3dsIyINCiAgICB4bWxuczpqLjA9Imh0dHA6Ly93d3cuaW90b2FzaXMub3JnL29udG9sb2d5LyMiDQogICAgeG1sbnM6cDE9Imh0dHA6Ly9wdXJsLm9yZy9kYy9lbGVtZW50cy8xLjEvIyINCiAgICB4bWxuczpmb2FmPSJodHRwOi8veG1sbnMuY29tL2ZvYWYvMC4xLyI+DQogIDxvd2w6Q2xhc3MgcmRmOm5vZGVJRD0iQTAiPg0KICAgIDxvd2w6dW5pb25PZj4NCiAgICAgIDxyZGZzOlJlc291cmNlPg0KICAgICAgICA8cmRmOnJlc3Q+DQogICAgICAgICAgPHJkZnM6UmVzb3VyY2U+DQogICAgICAgICAgICA8cmRmOnJlc3Q+DQogICAgICAgICAgICAgIDxyZGZzOlJlc291cmNlPg0KICAgICAgICAgICAgICAgIDxyZGY6cmVzdCByZGY6cmVzb3VyY2U9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkvMDIvMjItcmRmLXN5bnRheC1ucyNuaWwiLz4NCiAgICAgICAgICAgICAgICA8cmRmOmZpcnN0IHJkZjpyZXNvdXJjZT0iaHR0cDovL3B1cmwub2NsYy5vcmcvTkVUL3Nzbngvc3NuI0RlcGxveW1lbnQiLz4NCiAgICAgICAgICAgICAgICA8cmRmOnR5cGUgcmRmOnJlc291cmNlPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjTGlzdCIvPg0KICAgICAgICAgICAgICA8L3JkZnM6UmVzb3VyY2U+DQogICAgICAgICAgICA8L3JkZjpyZXN0Pg0KICAgICAgICAgICAgPHJkZjpmaXJzdCByZGY6cmVzb3VyY2U9Imh0dHA6Ly94bWxucy5jb20vZm9hZi8wLjEvQWdlbnQiLz4NCiAgICAgICAgICAgIDxyZGY6dHlwZSByZGY6cmVzb3VyY2U9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkvMDIvMjItcmRmLXN5bnRheC1ucyNMaXN0Ii8+DQogICAgICAgICAgPC9yZGZzOlJlc291cmNlPg0KICAgICAgICA8L3JkZjpyZXN0Pg0KICAgICAgICA8cmRmOmZpcnN0IHJkZjpyZXNvdXJjZT0iaHR0cDovL3d3dy5vbmVtMm0ub3JnL29udG9sb2d5L0Jhc2VfT250b2xvZ3kjVGhpbmciLz4NCiAgICAgICAgPHJkZjp0eXBlIHJkZjpyZXNvdXJjZT0iaHR0cDovL3d3dy53My5vcmcvMTk5OS8wMi8yMi1yZGYtc3ludGF4LW5zI0xpc3QiLz4NCiAgICAgIDwvcmRmczpSZXNvdXJjZT4NCiAgICA8L293bDp1bmlvbk9mPg0KICAgIDxyZGZzOnN1YkNsYXNzT2YgcmRmOnJlc291cmNlPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzAxL3JkZi1zY2hlbWEjUmVzb3VyY2UiLz4NCiAgICA8cmRmczpzdWJDbGFzc09mIHJkZjpub2RlSUQ9IkEwIi8+DQogICAgPHJkZjp0eXBlIHJkZjpyZXNvdXJjZT0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wMS9yZGYtc2NoZW1hI1Jlc291cmNlIi8+DQogICAgPHJkZjp0eXBlIHJkZjpyZXNvdXJjZT0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wMS9yZGYtc2NoZW1hI0NsYXNzIi8+DQogIDwvb3dsOkNsYXNzPg0KICA8b3dsOkNsYXNzIHJkZjpub2RlSUQ9IkExIj4NCiAgICA8b3dsOnVuaW9uT2Y+DQogICAgICA8cmRmczpSZXNvdXJjZT4NCiAgICAgICAgPHJkZjpyZXN0Pg0KICAgICAgICAgIDxyZGZzOlJlc291cmNlPg0KICAgICAgICAgICAgPHJkZjpyZXN0IHJkZjpyZXNvdXJjZT0iaHR0cDovL3d3dy53My5vcmcvMTk5OS8wMi8yMi1yZGYtc3ludGF4LW5zI25pbCIvPg0KICAgICAgICAgICAgPHJkZjpmaXJzdCByZGY6cmVzb3VyY2U9Imh0dHA6Ly93d3cub25lbTJtLm9yZy9vbnRvbG9neS9CYXNlX09udG9sb2d5I0RldmljZSIvPg0KICAgICAgICAgICAgPHJkZjp0eXBlIHJkZjpyZXNvdXJjZT0iaHR0cDovL3d3dy53My5vcmcvMTk5OS8wMi8yMi1yZGYtc3ludGF4LW5zI0xpc3QiLz4NCiAgICAgICAgICA8L3JkZnM6UmVzb3VyY2U+DQogICAgICAgIDwvcmRmOnJlc3Q+DQogICAgICAgIDxyZGY6Zmlyc3QgcmRmOnJlc291cmNlPSJodHRwOi8vd3d3Lm9uZW0ybS5vcmcvb250b2xvZ3kvQmFzZV9PbnRvbG9neSNGdW5jdGlvbmFsaXR5Ii8+DQogICAgICAgIDxyZGY6dHlwZSByZGY6cmVzb3VyY2U9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkvMDIvMjItcmRmLXN5bnRheC1ucyNMaXN0Ii8+DQogICAgICA8L3JkZnM6UmVzb3VyY2U+DQogICAgPC9vd2w6dW5pb25PZj4NCiAgICA8cmRmczpzdWJDbGFzc09mIHJkZjpyZXNvdXJjZT0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wMS9yZGYtc2NoZW1hI1Jlc291cmNlIi8+DQogICAgPHJkZnM6c3ViQ2xhc3NPZiByZGY6bm9kZUlEPSJBMSIvPg0KICAgIDxyZGY6dHlwZSByZGY6cmVzb3VyY2U9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDEvcmRmLXNjaGVtYSNSZXNvdXJjZSIvPg0KICAgIDxyZGY6dHlwZSByZGY6cmVzb3VyY2U9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDEvcmRmLXNjaGVtYSNDbGFzcyIvPg0KICA8L293bDpDbGFzcz4NCiAgPG93bDpDbGFzcyByZGY6bm9kZUlEPSJBMiI+DQogICAgPG93bDp1bmlvbk9mPg0KICAgICAgPHJkZnM6UmVzb3VyY2U+DQogICAgICAgIDxyZGY6cmVzdD4NCiAgICAgICAgICA8cmRmczpSZXNvdXJjZT4NCiAgICAgICAgICAgIDxyZGY6cmVzdCByZGY6cmVzb3VyY2U9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkvMDIvMjItcmRmLXN5bnRheC1ucyNuaWwiLz4NCiAgICAgICAgICAgIDxyZGY6Zmlyc3QgcmRmOnJlc291cmNlPSJodHRwOi8vd3d3LmxvYS1jbnIuaXQvb250b2xvZ2llcy9EVUwub3dsI0luZm9ybWF0aW9uT2JqZWN0Ii8+DQogICAgICAgICAgICA8cmRmOnR5cGUgcmRmOnJlc291cmNlPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjTGlzdCIvPg0KICAgICAgICAgIDwvcmRmczpSZXNvdXJjZT4NCiAgICAgICAgPC9yZGY6cmVzdD4NCiAgICAgICAgPHJkZjpmaXJzdCByZGY6cmVzb3VyY2U9Imh0dHA6Ly93d3cub25lbTJtLm9yZy9vbnRvbG9neS9CYXNlX09udG9sb2d5I1RoaW5nIi8+DQogICAgICAgIDxyZGY6dHlwZSByZGY6cmVzb3VyY2U9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkvMDIvMjItcmRmLXN5bnRheC1ucyNMaXN0Ii8+DQogICAgICA8L3JkZnM6UmVzb3VyY2U+DQogICAgPC9vd2w6dW5pb25PZj4NCiAgICA8cmRmczpzdWJDbGFzc09mIHJkZjpyZXNvdXJjZT0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wMS9yZGYtc2NoZW1hI1Jlc291cmNlIi8+DQogICAgPHJkZnM6c3ViQ2xhc3NPZiByZGY6bm9kZUlEPSJBMiIvPg0KICAgIDxyZGY6dHlwZSByZGY6cmVzb3VyY2U9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDEvcmRmLXNjaGVtYSNSZXNvdXJjZSIvPg0KICAgIDxyZGY6dHlwZSByZGY6cmVzb3VyY2U9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDEvcmRmLXNjaGVtYSNDbGFzcyIvPg0KICA8L293bDpDbGFzcz4NCiAgPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9Imh0dHA6Ly9oZXJpdC1pbi9oZXJpdC1jc2UvbHdtMm1faXBlL3NvdW5kX18tMTAyNC0xMi0zIj4NCiAgICA8ZGM6Y3JlYXRvciByZGY6cmVzb3VyY2U9Imh0dHA6Ly93d3cuaW90b2FzaXMub3JnL29udG9sb2d5L2hlcml0Ii8+DQogICAgPGR1bDpoYXNMb2NhdGlvbiByZGY6cmVzb3VyY2U9Imh0dHA6Ly93d3cuaW90b2FzaXMub3JnL29udG9sb2d5L2l0YnRfNjA2XzAwMSIvPg0KICAgIDxyZGY6dHlwZSByZGY6bm9kZUlEPSJBMCIvPg0KICAgIDxiOmhhc0NvbW1hbmQgcmRmOnJlc291cmNlPSJodHRwOi8vaGVyaXQtaW4vaGVyaXQtY3NlL2x3bTJtX2lwZS9zb3VuZF9fLTEwMjQtMTItMy93cml0ZSIvPg0KICAgIDxvOm5hbWU+TFdNMk0gQ2xpZW50KHJhc3BiZXJyeSkgLSBidXp6ZXI8L286bmFtZT4NCiAgICA8cmRmOnR5cGU+DQogICAgICA8b3dsOlJlc3RyaWN0aW9uIHJkZjpub2RlSUQ9IkEzIj4NCiAgICAgICAgPG93bDpvblByb3BlcnR5IHJkZjpyZXNvdXJjZT0iaHR0cDovL3d3dy5vbmVtMm0ub3JnL29udG9sb2d5L0Jhc2VfT250b2xvZ3kjY29uc2lzdHNPZiIvPg0KICAgICAgICA8b3dsOmFsbFZhbHVlc0Zyb20gcmRmOnJlc291cmNlPSJodHRwOi8vd3d3Lm9uZW0ybS5vcmcvb250b2xvZ3kvQmFzZV9PbnRvbG9neSNEZXZpY2UiLz4NCiAgICAgICAgPHJkZnM6c3ViQ2xhc3NPZiByZGY6cmVzb3VyY2U9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDEvcmRmLXNjaGVtYSNSZXNvdXJjZSIvPg0KICAgICAgICA8cmRmczpzdWJDbGFzc09mIHJkZjpub2RlSUQ9IkEzIi8+DQogICAgICAgIDxyZGY6dHlwZSByZGY6cmVzb3VyY2U9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDEvcmRmLXNjaGVtYSNSZXNvdXJjZSIvPg0KICAgICAgICA8cmRmOnR5cGUgcmRmOnJlc291cmNlPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzAxL3JkZi1zY2hlbWEjQ2xhc3MiLz4NCiAgICAgIDwvb3dsOlJlc3RyaWN0aW9uPg0KICAgIDwvcmRmOnR5cGU+DQogICAgPHJkZjp0eXBlIHJkZjpyZXNvdXJjZT0iaHR0cDovL3d3dy5vbmVtMm0ub3JnL29udG9sb2d5L0Jhc2VfT250b2xvZ3kjRGV2aWNlIi8+DQogICAgPHJkZjp0eXBlPkNscyhAQTIzXzBkOGNjOTUyXzViZWZfNDdmN184OTE0Xzk5YjRmNmE5NTgxYyk8L3JkZjp0eXBlPg0KICAgIDxyZGY6dHlwZSByZGY6cmVzb3VyY2U9Imh0dHA6Ly93d3cudzMub3JnLzIwMDIvMDcvb3dsI1RoaW5nIi8+DQogICAgPG86aGFzRGV2aWNlVHlwZSByZGY6cmVzb3VyY2U9Imh0dHA6Ly93d3cuaW90b2FzaXMub3JnL29udG9sb2d5L0FsYXJtXzkiLz4NCiAgICA8cmRmOnR5cGUgcmRmOnJlc291cmNlPSJodHRwOi8vd3d3Lm9uZW0ybS5vcmcvb250b2xvZ3kvQmFzZV9PbnRvbG9neSNJbnRlcndvcmtlZERldmljZSIvPg0KICAgIDxyZGY6dHlwZSByZGY6bm9kZUlEPSJBMiIvPg0KICAgIDxyZGY6dHlwZSByZGY6cmVzb3VyY2U9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDEvcmRmLXNjaGVtYSNSZXNvdXJjZSIvPg0KICAgIDxyZGY6dHlwZSByZGY6cmVzb3VyY2U9Imh0dHA6Ly93d3cub25lbTJtLm9yZy9vbnRvbG9neS9CYXNlX09udG9sb2d5I1RoaW5nIi8+DQogICAgPHNzbjpvblBsYXRmb3JtIHJkZjpyZXNvdXJjZT0iaHR0cDovL3d3dy5pb3RvYXNpcy5vcmcvb250b2xvZ3kvb2FzaXMyLjAiLz4NCiAgICA8cmRmOnR5cGUgcmRmOm5vZGVJRD0iQTEiLz4NCiAgICA8cmRmOnR5cGU+DQogICAgICA8b3dsOlJlc3RyaWN0aW9uIHJkZjpub2RlSUQ9IkE0Ij4NCiAgICAgICAgPG93bDpvblByb3BlcnR5IHJkZjpyZXNvdXJjZT0iaHR0cDovL3d3dy5vbmVtMm0ub3JnL29udG9sb2d5L0Jhc2VfT250b2xvZ3kjaGFzVGhpbmdSZWxhdGlvbiIvPg0KICAgICAgICA8b3dsOmFsbFZhbHVlc0Zyb20gcmRmOnJlc291cmNlPSJodHRwOi8vd3d3Lm9uZW0ybS5vcmcvb250b2xvZ3kvQmFzZV9PbnRvbG9neSNUaGluZyIvPg0KICAgICAgICA8cmRmczpzdWJDbGFzc09mIHJkZjpyZXNvdXJjZT0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wMS9yZGYtc2NoZW1hI1Jlc291cmNlIi8+DQogICAgICAgIDxyZGZzOnN1YkNsYXNzT2YgcmRmOm5vZGVJRD0iQTQiLz4NCiAgICAgICAgPHJkZjp0eXBlIHJkZjpyZXNvdXJjZT0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wMS9yZGYtc2NoZW1hI1Jlc291cmNlIi8+DQogICAgICAgIDxyZGY6dHlwZSByZGY6cmVzb3VyY2U9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDEvcmRmLXNjaGVtYSNDbGFzcyIvPg0KICAgICAgPC9vd2w6UmVzdHJpY3Rpb24+DQogICAgPC9yZGY6dHlwZT4NCiAgICA8cmRmOnR5cGU+Q2xzKEBBMjRfMGQ4Y2M5NTJfNWJlZl80N2Y3Xzg5MTRfOTliNGY2YTk1ODFjKTwvcmRmOnR5cGU+DQogICAgPGI6aGFzRnVuY3Rpb25hbGl0eSByZGY6cmVzb3VyY2U9Imh0dHA6Ly93d3cuaW90b2FzaXMub3JnL2hlcml0LWluL2hlcml0LWNzZS9sd20ybV9pcGUvc291bmRfXy0xMDI0LTEyLTMvTnVtYmVyb2ZIdW1hbipBbGFybUZ1bmN0aW9uYWxpdHkiLz4NCiAgPC9yZGY6RGVzY3JpcHRpb24+DQo8L3JkZjpSREY+");

            body_wrap.put(getNameSpace(this),body);

        } catch(JSONException jsone) {
            jsone.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return body_wrap;
    }
    
    public SemanticDescriptor makes(){
    	setResToJson(setForCreate());
    	return this;
    }
    
    /*
    
    // retrieve
    public JSONObject retrieveAE(FoundItem oicDevice) {

        JSONObject jsonResponse = new JSONObject();

        try {
            String strOrigin = "OIC-" + this.deviceId;

            client.openConnection();
            client.setRequestHeader(this.host, this.deviceId, this.deviceId, strOrigin, MemberType.AE, Constants.REQUEST_METHOD_TYPE.GET.Value());
            jsonResponse = client.getResponse();

        }catch(IOException ioe) {
            ioe.printStackTrace();
        }catch(JSONException jsone) {
            jsone.printStackTrace();
        }catch(Exception e) {
            e.printStackTrace();
        }

        return jsonResponse;
    }
    // delete
    public JSONObject deleteAE(FoundItem oicDevice) {

        JSONObject jsonResponse = new JSONObject();

        try {
            client.openConnection();
            client.setRequestHeader(this.host, this.deviceId, this.deviceId, oicDevice.getResourceUri(), MemberType.AE, Constants.REQUEST_METHOD_TYPE.DELETE.Value());

            jsonResponse = client.getResponse();

        }catch(IOException ioe) {
            ioe.printStackTrace();
        }catch(JSONException jsone) {
            jsone.printStackTrace();
        }catch(Exception e) {
            e.printStackTrace();
        }

        return jsonResponse;
    }
    */
}
