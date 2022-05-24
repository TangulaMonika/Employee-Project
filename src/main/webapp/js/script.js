
function message() {
	let a = document.forms["AddEmployee"]["empId"].value;
	if (a == "") {
		alert("This field must be filled out");
		return false;

	}
}
