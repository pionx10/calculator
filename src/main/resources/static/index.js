function calculate(){
    let a = parseInt(document.getElementById("a").value,10);
    let b = parseInt(document.getElementById("b").value,10);
    let action = document.getElementById("action").value;

    let link = "/api/" + action;
    let xhReq = new XMLHttpRequest();

    xhReq.open("POST", link, false);

    let data = {
        a: a,
        b: b
    };

    xhReq.setRequestHeader("Content-Type", "application/json");
    xhReq.send(JSON.stringify(data));

    document.getElementById('answer').innerHTML = JSON.parse(xhReq.responseText);
}

function showHistory(){
    let link = "/api/history";
    let xhReq = new XMLHttpRequest();
    xhReq.open("GET", link, false);
    xhReq.send(null);
    let jsonObject = JSON.parse(xhReq.responseText);
    document.getElementById('historyTable').innerHTML = JSON.stringify(jsonObject);
}