function calculate(){

}

function showHistory(){
    var link = "/api/history";
    var xhReq = new XMLHttpRequest();
    xhReq.open("GET", link, false);
    xhReq.send(null);
    var jsonObject = JSON.parse(xhReq.responseText);
    document.getElementById('historyTable').innerHTML = JSON.stringify(jsonObject);
}