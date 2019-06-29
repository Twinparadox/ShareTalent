//<!-- Email Function, JS -->
function changeAccount() {

}

//<!-- Check Content is Valid -->
function validateID() {
	var regID = /^[A-Za-z0-9]{6,16}$/;
	var id = $('input[name=id]').val();

	if (id.length < 6 || id.length > 16) {
		$('input[name=id]').removeClass("is-valid");
		$('input[name=id]').addClass("is-invalid");
		return false;
	} else {
		if (regID.test(id) == false) {
			$('input[name=id]').removeClass("is-valid");
			$('input[name=id]').addClass("is-invalid");
			return true;
		} else {
			$('input[name=id]').removeClass("is-invalid");
			$('input[name=id]').addClass("is-valid");
			return false;
		}
	}
}
function validatePW() {
	var regPW = /^(?=.*[a-zA-Z])(?=.*[!%^*+=-])(?=.*[0-9]).{6,16}/;

	var pw = $('input[name=pw]').val();

	if (pw.length < 6 || pw.length > 16) {
		$('input[name=pw]').removeClass("is-valid");
		$('input[name=pw]').addClass("is-invalid");
		return false;
	} else {
		if (regPW.test(pw) == false) {
			$('input[name=pw]').removeClass("is-valid");
			$('input[name=pw]').addClass("is-invalid");
			return false;
		} else {
			$('input[name=pw]').removeClass("is-invalid");
			$('input[name=pw]').addClass("is-valid");
			return true;
		}
	}
}
function validateCheckPW() {
	var pw = $('input[name=pw]').val();
	var pwCheck = $('input[name=pwCheck]').val();

	if(pw ==  "") {
		return validatePW();
	}

	if (pw != "" && pwCheck != "") {
		if (pw == pwCheck) {
			$('input[name=pwCheck]').removeClass("is-invalid");
			$('input[name=pwCheck]').addClass("is-valid");
			return true;
		} else {
			$('input[name=pwCheck]').removeClass("is-valid");
			$('input[name=pwCheck]').addClass("is-invalid");
			return false;
		}
	}
}
function validatePhone() {
	var phone = $('input[name=phone]').val();

	if(phone.length<11) {
		$('input[name=phone]').removeClass("is-valid");
		$('input[name=phone]').addClass("is-invalid");
		return false;
	} else {
		return true;
	}
}
function validateName() {
	var name = $('input[name=name]').val();

	if(!name) {
		$('input[name=name]').removeClass("is-valid");
		$('input[name=name]').addClass("is-invalid");
		return false;
	} else {
		return true;
	}
}
function validateEmail() {
	var email = $('input[name=email]').val();

	if(!email) {
		$('input[name=email]').removeClass("is-valid");
		$('input[name=email]').addClass("is-invalid");
		return false;
	} else {
		return true;
	}
}
function validatePostcode() {
	var postcode = $('input[name=postcode]').val();

	if(!postcode) {
		$('input[name=postcode]').removeClass("is-valid");
		$('input[name=postcode]').addClass("is-invalid");
		return false;
	}
}
function validateAddress() {
	var address = $('input[name=address]').val();
	var extraAddress = $('input[name=extraAddress]').val();
	var detailAddress = $('input[name=detailAddress]').val();

	if(!address) {
		$('input[name=address]').removeClass("is-valid");
		$('input[name=address]').addClass("is-invalid");
		return false;
	}
	if(!extraAddress) {
		$('input[name=extraAddress]').removeClass("is-valid");
		$('input[name=extraAddress]').addClass("is-invalid");
		return false;
	}
	if(!detailAddress) {
		$('input[name=detailAddress]').removeClass("is-valid");
		$('input[name=detailAddress]').addClass("is-invalid");
		return false;
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

// function validate form
function validate() {
	var id = validateID();
	if(id) {
		return true;
	} else {
		return false;
	}
}