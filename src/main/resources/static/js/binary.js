document.getElementById('decimalBtn').addEventListener('click', function() {
    document.getElementById('formDecimal').style.display = 'block';
    document.getElementById('formBinary').style.display = 'none';
    document.getElementById('formHexa').style.display = 'none';
})
document.getElementById('binaryBtn').addEventListener('click', function() {
    document.getElementById('formDecimal').style.display = 'none';
    document.getElementById('formBinary').style.display = 'block';
    document.getElementById('formHexa').style.display = 'none';
})
document.getElementById('hexaBtn').addEventListener('click', function() {
    document.getElementById('formDecimal').style.display = 'none';
    document.getElementById('formBinary').style.display = 'none';
    document.getElementById('formHexa').style.display = 'block';
})


function changeDecimal() {
    let num = $("#formDecimal").serialize();
    console.log(num);

    if (document.getElementById('decimalNum').value == "") {
        alert('>> Invalid Input. Please Do It Again <<');
    } else {
        $.ajax({
            type: "post",
            url: "/decimal",
            data: num,
            dataType: 'json',
            success: function (data) {
                console.log(data);

                if (data["check"]) {
                    document.getElementById('binary').innerText = data["binaryNum"];
                    document.getElementById('three').innerText = data["three"];
                    document.getElementById('four').innerText = data["four"];
                    document.getElementById('five').innerText = data["five"];

                    document.getElementById('six').innerText = data["six"];
                    document.getElementById('seven').innerText = data["seven"];
                    document.getElementById('eight').innerText = data["eight"];
                    document.getElementById('nine').innerText = data["nine"];
                    document.getElementById('ten').innerText = data["decimalNum"];

                    document.getElementById('eleven').innerText = data["eleven"];
                    document.getElementById('twelve').innerText = data["twelve"];
                    document.getElementById('thirteen').innerText = data["thirteen"];
                    document.getElementById('fourteen').innerText = data["fourteen"];
                    document.getElementById('fifthteen').innerText = data["fifthteen"];
                    document.getElementById('hexa').innerText = data["hexaDecimalNum"];
                } else {
                    alert(">> Invalid Input. Please Do It Again <<")
                }
            },
            error: function (request, status, error) {
                console.log("code:" + request.status + "\n" + "message:" + request.responseText + "\n" + "error:" + error);
            }
        });
    }
}

function changeBinary() {
    let num = $("#formBinary").serialize();
    console.log(num);

    if (document.getElementById('binaryNum').value == "") {
        alert('>> Invalid Input. Please Do It Again <<');
    } else {
        $.ajax({
            type: "post",
            url: "/binary",
            data: num,
            dataType: 'json',
            success: function (data) {
                console.log(data);
                if (data["check"]) {
                    document.getElementById('binary').innerText = data["binaryNum"];
                    document.getElementById('three').innerText = data["three"];
                    document.getElementById('four').innerText = data["four"];
                    document.getElementById('five').innerText = data["five"];

                    document.getElementById('six').innerText = data["six"];
                    document.getElementById('seven').innerText = data["seven"];
                    document.getElementById('eight').innerText = data["eight"];
                    document.getElementById('nine').innerText = data["nine"];
                    document.getElementById('ten').innerText = data["decimalNum"];

                    document.getElementById('eleven').innerText = data["eleven"];
                    document.getElementById('twelve').innerText = data["twelve"];
                    document.getElementById('thirteen').innerText = data["thirteen"];
                    document.getElementById('fourteen').innerText = data["fourteen"];
                    document.getElementById('fifthteen').innerText = data["fifthteen"];
                    document.getElementById('hexa').innerText = data["hexaDecimalNum"];
                } else {
                    alert(">> Invalid Input. Please Do It Again <<")
                }
            },
            error: function (request, status, error) {
                console.log("code:" + request.status + "\n" + "message:" + request.responseText + "\n" + "error:" + error);
            }
        });
    }
}

function changeHexa() {
    let num = $("#formHexa").serialize();
    console.log(num);

    if (document.getElementById('hexaDecimalNum').value == "") {
        alert('>> Invalid Input. Please Do It Again <<');
    } else {
        $.ajax({
            type: "post",
            url: "/hexaDecimal",
            data: num,
            dataType: 'json',
            success: function (data) {
                console.log(data);

                if (data["check"]) {
                    document.getElementById('binary').innerText = data["binaryNum"];
                    document.getElementById('three').innerText = data["three"];
                    document.getElementById('four').innerText = data["four"];
                    document.getElementById('five').innerText = data["five"];

                    document.getElementById('six').innerText = data["six"];
                    document.getElementById('seven').innerText = data["seven"];
                    document.getElementById('eight').innerText = data["eight"];
                    document.getElementById('nine').innerText = data["nine"];
                    document.getElementById('ten').innerText = data["decimalNum"];

                    document.getElementById('eleven').innerText = data["eleven"];
                    document.getElementById('twelve').innerText = data["twelve"];
                    document.getElementById('thirteen').innerText = data["thirteen"];
                    document.getElementById('fourteen').innerText = data["fourteen"];
                    document.getElementById('fifthteen').innerText = data["fifthteen"];
                    document.getElementById('hexa').innerText = data["hexaDecimalNum"];
                } else {
                    alert(">> Invalid Input. Please Do It Again <<")
                }
            },
            error: function (request, status, error) {
                console.log("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
            }
        });
    }
}

function pressDecimalEnter(event) {
    if (event.keyCode === 13) {
        event.preventDefault();
        changeDecimal();
    }
}

function pressBinaryEnter(event) {
    if (event.keyCode === 13) {
        event.preventDefault();
        changeBinary();
    }
}

function pressHexaDecimalEnter(event) {
    if (event.keyCode === 13) {
        event.preventDefault();
        changeHexa();
    }
}

document.getElementById('decimalNum').addEventListener('keypress', pressDecimalEnter)
document.getElementById('binaryNum').addEventListener('keypress',pressBinaryEnter)
document.getElementById('hexaDecimalNum').addEventListener('keypress', pressHexaDecimalEnter)

document.getElementById('changeDecimalBtn').addEventListener('click', changeDecimal)
document.getElementById('changeBinaryBtn').addEventListener('click', changeBinary)
document.getElementById('changeHexaBtn').addEventListener('click', changeHexa)