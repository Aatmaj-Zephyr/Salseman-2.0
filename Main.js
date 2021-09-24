function addcity(){
    document.getElementById('form').style.display="inline";
    document.getElementById('addcity').style.display="none";
}
function submit(){
    if(!document.getElementById('citytext').checkValidity()){
        window.alert("Error: Please fill out the name of the city")
    }
    else if(!document.getElementById('xpos').checkValidity()){
        window.alert("Error: Please fill out the x coordinate of the city")
    }
    else if(!document.getElementById('ypos').checkValidity()){
        window.alert("Error: Please fill out the y coordinate of the city")
    }
    else{
        Add(document.getElementById('ypos').value)
    }
}
function Add(a){
    //document.getElementById('submit').innerHTML=a
    /* Put in Data base if not present already
    ..
    ...
    ...
    */
}
