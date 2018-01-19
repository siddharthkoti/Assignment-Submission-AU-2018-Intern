var textSample = `You do not like green eggs and ham?
I do not like them, Sam-I-am.
Could you, would you, with a goat?
I would not, could not, with a goat!
Would you, could you, on a boat?
I could not, would not, on a boat.
I will not, will not, with a goat.
I will not eat them in the rain.
I will not eat them on a train.
Not in the dark! Not in a tree!
Not in a car! You let me be!
I do not like them in a box.
I do not like them with a fox.
I will not eat them in a house.
I do not like them with a mouse.
I do not like them here or there.
I do not like them ANYWHERE!
I do not like green eggs and ham!
I do not like them, Sam-I-am.`;

document.write("<b>Original Text: </b><br>"+textSample);


var name = window.prompt("Your Name?");
var word1 = window.prompt("Hello "+name+"\n Enter Word 1---->");
var word2 = window.prompt(name+", Now Enter Word 2---->");
var word3 = window.prompt("And Enter Word 3---->");
var word4 = window.prompt("And Word 4 too---->");
var word5 = window.prompt("Fianlly "+ name + ", Word 5---->");
var color = window.prompt(name + ", your Fav Color???")
// var color = "red";
var words = [word1, word2, word3, word4, word5];
// var words = ["word1", "word2", "word3", "word4", "word5"];

var arrText = textSample.split(" ");
var leng = arrText.length;
console.log(leng);

var makeARandomNumber = function(len){
    return Math.floor(Math.random() * len);
}

var randoms = Array(5).fill(0).map(makeARandomNumber.bind(null,leng));

for (var i = 0; i < 5; i++) {
	arrText[randoms[i]] = "<div style='color:"+ color +"'>" + words[i] + "</div>";
}

var finalText = arrText.join(" ");



document.write("<br><br> <b>Final Text after midLabs:</b><br>" + finalText);
