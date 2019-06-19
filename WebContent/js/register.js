//<!-- Email Function, JS -->
function changeAccount() {

}

//<!-- Check Content is Valid -->
function validateID() {
	var regID = /^[A-Za-z0-9]{6,16}$/;
	var id = $('input[name=id]').val();

	if (id.length < 6 || id.length > 16) {
		$('input[name=id]').addClass("is-invalid");
		$('input[name=id]').removeClass("is-valid");
	} else {
		if (regID.test(id) == false) {
			$('input[name=id]').removeClass("is-valid");
			$('input[name=id]').addClass("is-invalid");
		} else {
			$('input[name=id]').removeClass("is-invalid");
			$('input[name=id]').addClass("is-valid");
		}
	}
}
function validatePW() {
	var regPW = /^(?=.*[a-zA-Z])(?=.*[!%^*+=-])(?=.*[0-9]).{6,16}/;

	var pw = $('input[name=pw]').val();
	var pwCheck = $('input[name=pwCheck]').val();

	if (pw.length < 6 || pw.length > 16) {
		$('input[name=pw]').removeClass("is-valid");
		$('input[name=pw]').addClass("is-invalid");
	} else {
		if (regPW.test(pw) == false) {
			$('input[name=pw]').removeClass("is-valid");
			$('input[name=pw]').addClass("is-invalid");
		} else {
			$('input[name=pw]').removeClass("is-invalid");
			$('input[name=pw]').addClass("is-valid");
		}
	}
}
function checkPW() {
	var pw = $('input[name=pw]').val();
	var pwCheck = $('input[name=pwCheck]').val();

	if (pw != '' && pwCheck != '') {
		if (pw == pwCheck) {
			$('input[name=pwCheck]').removeClass("is-invalid");
			$('input[name=pwCheck]').addClass("is-valid");
		} else {
			$('input[name=pwCheck]').removeClass("is-valid");
			$('input[name=pwCheck]').addClass("is-invalid");
		}
	}
}

$(document).ready(function() {
	$('input[name=phone]').blur(function() {
		var num = $('input[name=phone]').val();
		num = num.replace(/[^0-9]/g, '');
		$('input[name=phone]').val(num);
	});

	$('input[name=birth]').blur(function() {
		var num = $('input[name=birth]').val();
		num = num.replace(/[^0-9]/g, '');
		var tmp = "";
		tmp += num.substr(0, 4);
		tmp += "-";
		tmp += num.substr(4, 2);
		tmp += "-";
		tmp += num.substr(6, 2);
		$('input[name=birth]').val(tmp);
	});
});

function validateEmail() {
	var regEmail = /^[A-Za-z0-9\._+]/;
}
