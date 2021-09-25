var city;
city=["pune","chennai","delhi","nagpur","dombivli","dadar","vashi","kalyan","bhivandi"];
function setcities(){
    document.getElementById("nbr").innerHTML="";
    for (var citycounter of city){
      document.getElementById("nbr").innerHTML+='<option value="'+citycounter+'">'+citycounter+"</option>" ;
    }
}
function clear(){
    document.getElementById('xpos').value="";
    document.getElementById('ypos').value="";
    document.getElementById('citytext').value="";
    document.getElementById('nbr').value="";
}
function addcity(){
    clear();
    setcities();
    document.getElementById('form').style.display="inline";
    document.getElementById('addcity').style.display="none";
}
function submit(){
    if(!document.getElementById('citytext').checkValidity()){
        window.alert("Error: Please fill out the name of the city");
    }
    else if(!document.getElementById('xpos').checkValidity()){
        window.alert("Error: Please fill out the x coordinate of the city");
    }
    else if(!document.getElementById('ypos').checkValidity()){
        window.alert("Error: Please fill out the y coordinate of the city");
    }
    else{
        Add(document.getElementById('citytext').value.lower()+":"
        +document.getElementById('xpos').value+":"
        +document.getElementById('ypos').value);
        document.getElementById('form').style.display="none";
       var tempstring;
       tempstring="";
       
       for (var option of document.getElementById('nbr').options)
    {
        if (option.selected) {
            tempstring=tempstring+(option.value)+',';
        }
    } 
        addneighbour(document.getElementById('citytext').value.lower()+":"+tempstring.slice(0,-1));//Remove the last comma
        addtocitylist(document.getElementById('citytext').value.lower())
        
    }
    document.getElementById('addcity').style.display="inline";
    
}
function addneighbour(a){
    //Put neighbors in database if not present already
  //  window.alert(a);
}
function addtocitylist(a){
    city.push(a);
    //Put the city name into the list
}
function Add(a){
    //window.alert(a)
    /* Put in Data base if not present already
    ..
    ...
    ...
    */
    
}
