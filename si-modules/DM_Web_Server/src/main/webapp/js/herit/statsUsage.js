
// - 페이지 로딩시 1회 수행
function initUI() {
	console.log("initUI called");

	$("#btnSearch").click(function() {
		search();
	});
	
	$("#selSearchType").change(function() {
		updateDatePicker();
	});

    $("#dpStart").datepicker({dateFormat: "yy-mm-dd"});
    $("#dpEnd").datepicker({dateFormat: "yy-mm-dd"});
    
	updateDatePicker();
}

function updateDatePicker() {

	var searchType = $("#selSearchType").val();
	if (searchType == "day") {
		
		var endDay = new Date();
		var startDay = new Date();
		startDay.setMonth(endDay.getMonth()-1);

	    $("#dpStart").datepicker("option", "dateFormat", "yy-mm-dd");
	    $("#dpStart").datepicker("setDate", startDay);
	    $("#dpEnd").datepicker("option", "dateFormat", "yy-mm-dd");
	    $("#dpEnd").datepicker("setDate", endDay);
	    
	} else if (searchType == "month") {
		
		var endMonth = new Date();
		var startMonth = new Date();
		startMonth.setFullYear(endMonth.getFullYear()-1);

	    $("#dpStart").datepicker("option", "dateFormat", "yy-mm");
	    $("#dpStart").datepicker("setDate", startMonth);
	    $("#dpEnd").datepicker("option", "dateFormat", "yy-mm");
	    $("#dpEnd").datepicker("setDate", endMonth);
	    
	}
}

function search() {
	var start = $("#dpStart").val();
	var end = $("#dpEnd").val();
	console.log("search called - start:"+start +", end:"+ end);

	var searchType = $("#selSearchType").val();
	if (searchType == "day") {
		var context = {"param":{"start":start, "end":end}, 
						"handler": searchResultHandler };
		hdb_get_stat_usage_day(context, false);
	} else if (searchType == "month") {
		var context = {"param":{"start":start+"-1", "end":end+"-1"}, 
						"handler": searchResultHandler };
		hdb_get_stat_usage_month(context, false);
	}
}

function searchResultHandler(msg, context) {
	console.log("searchResultHandler called");
	console.log("context: "+JSON.stringify(context));
	console.log("msg: "+JSON.stringify(msg));

	var ths = $("#stat_table thead th");
	var histBody = $("#stat_table tbody");
	
	histBody.empty();
	
	// 목록 표시
	var period = $("#selSearchType").val() == "day" ? "statDate" : "statMonth";
	var total = {"error":0, "control":0, "fw":0};
	for (var i=0; i<msg.content.list.length; i++) {
		var hist = msg.content.list[i];
		total['error'] += hist['errorCount'];
		total['control'] += hist['controlCount'];
		total['fw'] += hist['fwCount'];
		var tr = $("<tr></tr>");
		tr.append($("<td>"+hist[period]+"</td>"+
				"<td>"+hist["errorCount"]+"</td>"+
				"<td>"+hist["controlCount"]+"</td>"+
				"<td>"+hist["fwCount"]+"</td>"));
		histBody.append(tr);
	}
	if (msg.content.list.length == 0) {
		var tr = $("<tr></tr>");
		tr.append($("<td colspan='"+ths.length+"'>통계 없음</td>"));
		histBody.append(tr);
	}
	
	// total
	var tr = $("<tr></tr>");
	tr.append($("<td class='total'>TOTAL</td>"+
			"<td class='total'>"+total["error"]+"</td>"+
			"<td class='total'>"+total["control"]+"</td>"+
			"<td class='total'>"+total["fw"]+"</td>"));
	histBody.append(tr);

}