// ====== 입력 버튼 바꾸기 ======= //
function changePage(btnId, formId) {
    document.getElementById(btnId).addEventListener('click', function() {
        document.getElementById('length_mm_form').style.display = 'none';
        document.getElementById('length_cm_form').style.display = 'none';
        document.getElementById('length_m_form').style.display = 'none';
        document.getElementById('length_km_form').style.display = 'none';

        document.getElementById('length_yard_form').style.display = 'none';
        document.getElementById('length_inch_form').style.display = 'none';
        document.getElementById('length_mile_form').style.display = 'none';
        document.getElementById('length_ft_form').style.display = 'none';


        document.getElementById('length_ja_form').style.display = 'none';
        document.getElementById('length_gan_form').style.display = 'none';
        document.getElementById('length_ri_form').style.display = 'none';
        document.getElementById('length_jung_form').style.display = 'none';

        document.getElementById(formId).style.display = 'block';
    })
}

changePage("mmBtn", "length_mm_form");
changePage("cmBtn", "length_cm_form");
changePage("mBtn", "length_m_form");
changePage("kmBtn", "length_km_form");

changePage("yardBtn", "length_yard_form");
changePage("inchBtn", "length_inch_form");
changePage("mileBtn", "length_mile_form");
changePage("ftBtn", "length_ft_form");

changePage("jaBtn", "length_ja_form");
changePage("ganBtn", "length_gan_form");
changePage("riBtn", "length_ri_form");
changePage("jungBtn", "length_jung_form");


// ====== 변환 요청 보내기 ======= //
function postConvert(btnId, formId, inputId, url) {

    document.getElementById(btnId).addEventListener('click', function() {
        let num = $(formId).serialize();
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
                        document.getElementById('mmInfo').innerText = data["mmInfo"];
                        document.getElementById('cmInfo').innerText = data["cmInfo"];
                        document.getElementById('mInfo').innerText = data["mInfo"];
                        document.getElementById('kmInfo').innerText = data["kmInfo"];

                        document.getElementById('inchInfo').innerText = data["inchInfo"];
                        document.getElementById('yardInfo').innerText = data["yardInfo"];
                        document.getElementById('mileInfo').innerText = data["mileInfo"];
                        document.getElementById('ftInfo').innerText = data["ftInfo"];

                        document.getElementById('jaInfo').innerText = data["jaInfo"];
                        document.getElementById('ganInfo').innerText = data["ganInfo"];
                        document.getElementById('jungInfo').innerText = data["jungInfo"];
                        document.getElementById('riInfo').innerText = data["riInfo"];

                        document.getElementById('').style.color = 'red';
                    } else {
                        alert(">> Invalid Input. Please Do It Again <<")
                    }

                },
                error: function (request, status, error) {
                    console.log("code:" + request.status + "\n" + "message:" + request.responseText + "\n" + "error:" + error);
                }
            });
        }
    })

}

postConvert("length_mm_btn", "length_mm_btn", "length_mm_input", "/mm");
postConvert("length_cm_btn", "length_cm_btn", "length_cm_input", "/cm");
postConvert("length_m_btn", "length_m_btn", "length_m_input", "/m");
postConvert("length_km_btn", "length_km_btn", "length_km_input", "/km");

postConvert("length_inch_btn", "length_inch_btn", "length_inch_input", "/inch");
postConvert("length_yard_btn", "length_yard_btn", "length_yard_input", "/yard");
postConvert("length_mile_btn", "length_mile_btn", "length_mile_input", "/mile");
postConvert("length_ft_btn", "length_ft_btn", "length_ft_input", "/ft");

postConvert("length_ja_btn", "length_ja_btn", "length_ja_input", "/ja");
postConvert("length_gan_btn", "length_gan_btn", "length_gan_input", "/gan");
postConvert("length_ri_btn", "length_ri_btn", "length_ri_input", "/ri");
postConvert("length_jung_btn", "length_jung_btn", "length_jung_input", "/jung");

