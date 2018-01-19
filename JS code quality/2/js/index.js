//evaluates INPUT checking if its a number or a name and displays the accordingly
function evaluateInput(){
	var inputVal = document.getElementById("text").value;
	//var num = parseInt(inputVal);
	var p = document.getElementById("result");
	p.innerHTML = "";
	if(inputVal == ""){
		alert("Please Input something!!");
		return;
	}
	if(isNaN(inputVal)){
		
		displayName(p,inputVal);
	}else{
		EvaluateNumber(p,inputVal);
	}		

}

//displays inputName in the innerHTML of the node which are passed as parameter
function displayName(p, inputVal){
	p.innerHTML = "Your Name is " + inputVal;
}

//Evalute and display the range of Number
function EvaluateNumber(p, inputVal){
	var num = parseInt(inputVal);

		if(num < 0 || num > 1000)
			p.innerHTML = "The number is invalid";
		
		else if(num < 50)
			p.innerHTML = "The number is less than 50";

		else if(num >50 && num < 100)
			p.innerHTML = "The number is between 50 & 100";
		else
			p.innerHTML = "The number is greatter than 100 ";
}

function toggleCheckbox(element){
	if(element.checked){
		$('#nameAndAge').hide();
		$('#number').show();
	}else{
		$('#number').hide();
		$('#nameAndAge').show();	
	}
}

function analyzeInput(){

	var p = document.getElementById("result");
	var gender = $('input[name="gender"]').val();
	var classify;
	if(gender == "Male"){
		classify = "Master";
	}else{
		classify = "Miss";
	}

	if( $('input[name="nameOrNumber"]').prop("checked") == false){
		var name = $('#name').val();
		var age = $('#age').val();
		displayNameAndAge(p, classify, name, age);
	} 
	else
		var num = $('input[name="number"]').val();
		

}

function displayNameAndAge(p, gender, name, age){
	
	p.innerHTML = "Your Name is " + gender + " " + name + " And Age is " + age;
	displayTable(gender);
}


function displayNumber(p,gender, num){
	p.innerHTML = 	"You inputted a number: " + num ;
	displayTable(gender);
}

function displayTable(gender){
	$('#divTable').show();
	var html;
	if( $('input[name="nameOrNumber"]').prop("checked") == false){
		var name = $('#name').val();
		var age = $('#age').val();

		html = "<tr><td>" + gender + "</td><td>" + name + "</td><td>" + age +"</td></tr>"
	}
	$('#table').append(html);

}