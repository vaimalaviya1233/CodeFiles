

var counter;
var Elements = document.getElementsByClassName("font120 mt0 mb10 mobfont110 lineheight20 moblineheight15");
var length = Elements.length;

for(counter = 0; counter < length; counter++){
    console.log(Elements[counter].firstChild.href);
    //var url = Elements[counter].firstChild.href;
    window.open(Elements[counter].firstChild.href, "_blank");

}