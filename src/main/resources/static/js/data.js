// ====== 입력 버튼 바꾸기 ======= //
document.getElementById('bitBtn').addEventListener('click', function() {
    document.getElementById('data_bit_form').style.display = 'block';

    document.getElementById('data_byte_form').style.display = 'none';
    document.getElementById('data_kb_form').style.display = 'none';
    document.getElementById('data_mb_form').style.display = 'none';
    document.getElementById('data_gb_form').style.display = 'none';
    document.getElementById('data_tb_form').style.display = 'none';
    document.getElementById('data_pb_form').style.display = 'none';
    document.getElementById('data_eb_form').style.display = 'none';
})
// [BYTE]
document.getElementById('byteBtn').addEventListener('click', function() {
    document.getElementById('data_byte_form').style.display = 'block';

    document.getElementById('data_bit_form').style.display = 'none';
    document.getElementById('data_kb_form').style.display = 'none';
    document.getElementById('data_mb_form').style.display = 'none';
    document.getElementById('data_gb_form').style.display = 'none';
    document.getElementById('data_tb_form').style.display = 'none';
    document.getElementById('data_pb_form').style.display = 'none';
    document.getElementById('data_eb_form').style.display = 'none';
})
// [KB]
document.getElementById('kbBtn').addEventListener('click', function() {
    document.getElementById('data_kb_form').style.display = 'block';

    document.getElementById('data_bit_form').style.display = 'none';
    document.getElementById('data_byte_form').style.display = 'none';
    document.getElementById('data_mb_form').style.display = 'none';
    document.getElementById('data_gb_form').style.display = 'none';
    document.getElementById('data_tb_form').style.display = 'none';
    document.getElementById('data_pb_form').style.display = 'none';
    document.getElementById('data_eb_form').style.display = 'none';
})
// [MB]
document.getElementById('mbBtn').addEventListener('click', function() {
    document.getElementById('data_mb_form').style.display = 'block';

    document.getElementById('data_bit_form').style.display = 'none';
    document.getElementById('data_byte_form').style.display = 'none';
    document.getElementById('data_kb_form').style.display = 'none';
    document.getElementById('data_gb_form').style.display = 'none';
    document.getElementById('data_tb_form').style.display = 'none';
    document.getElementById('data_pb_form').style.display = 'none';
    document.getElementById('data_eb_form').style.display = 'none';
})
// [GB]
document.getElementById('gbBtn').addEventListener('click', function() {
    document.getElementById('data_gb_form').style.display = 'block';

    document.getElementById('data_bit_form').style.display = 'none';
    document.getElementById('data_byte_form').style.display = 'none';
    document.getElementById('data_kb_form').style.display = 'none';
    document.getElementById('data_mb_form').style.display = 'none';
    document.getElementById('data_tb_form').style.display = 'none';
    document.getElementById('data_pb_form').style.display = 'none';
    document.getElementById('data_eb_form').style.display = 'none';
})
// [TB]
document.getElementById('tbBtn').addEventListener('click', function() {
    document.getElementById('data_tb_form').style.display = 'block';

    document.getElementById('data_bit_form').style.display = 'none';
    document.getElementById('data_byte_form').style.display = 'none';
    document.getElementById('data_kb_form').style.display = 'none';
    document.getElementById('data_mb_form').style.display = 'none';
    document.getElementById('data_gb_form').style.display = 'none';
    document.getElementById('data_pb_form').style.display = 'none';
    document.getElementById('data_eb_form').style.display = 'none';
})
// [PB]
document.getElementById('pbBtn').addEventListener('click', function() {
    document.getElementById('data_pb_form').style.display = 'block';

    document.getElementById('data_bit_form').style.display = 'none';
    document.getElementById('data_byte_form').style.display = 'none';
    document.getElementById('data_kb_form').style.display = 'none';
    document.getElementById('data_mb_form').style.display = 'none';
    document.getElementById('data_gb_form').style.display = 'none';
    document.getElementById('data_tb_form').style.display = 'none';
    document.getElementById('data_eb_form').style.display = 'none';
})

// [EB]
document.getElementById('ebBtn').addEventListener('click', function() {
    document.getElementById('data_eb_form').style.display = 'block';

    document.getElementById('data_bit_form').style.display = 'none';
    document.getElementById('data_byte_form').style.display = 'none';
    document.getElementById('data_kb_form').style.display = 'none';
    document.getElementById('data_mb_form').style.display = 'none';
    document.getElementById('data_gb_form').style.display = 'none';
    document.getElementById('data_tb_form').style.display = 'none';
    document.getElementById('data_pb_form').style.display = 'none';
})


// ====== 변환 요청 보내기 ======= //
function postConvert(id, inputId, url) {
    let num = $(id).serialize();
    console.log(num);

    if (document.getElementById(inputId).value == "") {
        alert('>> Invalid Input. Please Do It Again <<');
    } else {
        $.ajax({
            type: "post",
            url: url,
            data: num,
            dataType: 'json',
            success: function (data) {
                console.log(data);

                if (data["check"]) {
                    document.getElementById('bitInfo').innerText = data["bitInfo"];
                    document.getElementById('byteInfo').innerText = data["byteInfo"];
                    document.getElementById('kbInfo').innerText = data["kbInfo"];
                    document.getElementById('mbInfo').innerText = data["mbInfo"];
                    document.getElementById('gbInfo').innerText = data["gbInfo"];
                    document.getElementById('tbInfo').innerText = data["tbInfo"];
                    document.getElementById('pbInfo').innerText = data["pbInfo"];
                    document.getElementById('ebInfo').innerText = data["ebInfo"];
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
document.getElementById('data_bit_btn').addEventListener('click', function() {
    postConvert('#data_bit_form', 'data_bit_input',"/bit");
});

document.getElementById('data_byte_btn').addEventListener('click', function() {
    postConvert('#data_byte_form', "data_byte_input", "/byte");
});

document.getElementById('data_kb_btn').addEventListener('click', function() {
    postConvert('#data_kb_form', "data_kb_input","/kb");
});

document.getElementById('data_mb_btn').addEventListener('click', function() {
    postConvert('#data_mb_form', "data_mb_input","/mb");
});

document.getElementById('data_gb_btn').addEventListener('click', function() {
    postConvert('#data_gb_form', "data_gb_input","/gb");
});

document.getElementById('data_tb_btn').addEventListener('click', function() {
    postConvert('#data_tb_form', "data_tb_input","/tb");
});

document.getElementById('data_pb_btn').addEventListener('click', function() {
    postConvert('#data_pb_form', "data_pb_input","/pb");
});

document.getElementById('data_eb_btn').addEventListener('click', function() {
    postConvert('#data_eb_form', "data_eb_input","/eb");
});


function pressBitEnter(event) {
    if (event.keyCode === 13) {
        event.preventDefault();
        postConvert('#data_bit_form', "data_bit_input","/bit");
    }
}

function pressByteEnter(event) {
    if (event.keyCode === 13) {
        event.preventDefault();
        postConvert('#data_byte_form', "data_byte_input","/byte");
    }
}

function pressKbEnter(event) {
    if (event.keyCode === 13) {
        event.preventDefault();
        postConvert('#data_kb_form',"data_kb_input", "/kb");
    }
}

function pressMbEnter(event) {
    if (event.keyCode === 13) {
        event.preventDefault();
        postConvert('#data_mb_form', "data_mb_input","/mb");
    }
}

function pressGbEnter(event) {
    if (event.keyCode === 13) {
        event.preventDefault();
        postConvert('#data_gb_form', "data_gb_input","/gb");
    }
}

function pressTbEnter(event) {
    if (event.keyCode === 13) {
        event.preventDefault();
        postConvert('#data_tb_form', "data_tb_input","/tb");
    }
}

function pressPbEnter(event) {
    if (event.keyCode === 13) {
        event.preventDefault();
        postConvert('#data_pb_form', "data_pb_input","/pb");
    }
}

function pressEbEnter(event) {
    if (event.keyCode === 13) {
        event.preventDefault();
        postConvert('#data_eb_form', "data_eb_input","/eb");
    }
}

document.getElementById('data_bit_input').addEventListener('keypress', pressBitEnter)
document.getElementById('data_byte_input').addEventListener('keypress', pressByteEnter)

document.getElementById('data_kb_input').addEventListener('keypress', pressKbEnter)
document.getElementById('data_mb_input').addEventListener('keypress', pressMbEnter)
document.getElementById('data_gb_input').addEventListener('keypress', pressGbEnter)

document.getElementById('data_tb_input').addEventListener('keypress', pressTbEnter)
document.getElementById('data_pb_input').addEventListener('keypress', pressPbEnter)
document.getElementById('data_eb_input').addEventListener('keypress', pressEbEnter)
