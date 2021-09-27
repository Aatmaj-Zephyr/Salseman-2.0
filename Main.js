//updatecitylist()
var city;
city=["pune","chennai","delhi","nagpur","dombivli","dadar","vashi","kalyan","bhivandi"];
function showroute(){
    //Get route from backend.
    window.alert("todo");//display the route to be taken
}
function setroute(){
    setcities();
    document.getElementById("ctyform").style.display="inline";
    document.getElementById('setroute').style.display="none";
    showroute();
}
function setcities(){
    //Set the dropdown boxes
    document.getElementById("nbr").innerHTML="";
    for (var nbrcounter of city){
      document.getElementById("nbr").innerHTML+='<option value="'+nbrcounter+'">'+nbrcounter+"</option>" ;
    }
   document.getElementById("ctystart").innerHTML="";
    for (var citystartcounter of city){
      document.getElementById("ctystart").innerHTML+='<option value="'+citystartcounter+'">'+citystartcounter+"</option>" ;
    }
       document.getElementById("ctyend").innerHTML="";
    for (var cityendcounter of city){
      document.getElementById("ctyend").innerHTML+='<option value="'+cityendcounter+'">'+cityendcounter+"</option>" ;
    }
}
function submitcty(){
    document.getElementById("ctyform").style.display="none";
    document.getElementById('setroute').style.display="inline";
    
    //Get the shortest path
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
        if(!city.includes(document.getElementById('citytext').value.toLowerCase())){
        Add(document.getElementById('citytext').value.toLowerCase()+":"
        +document.getElementById('xpos').value+":"
        +document.getElementById('ypos').value); //send city and coordinates.
        
        document.getElementById('form').style.display="none"; //hide form
        
       var tempstring;
       tempstring="";
       
       for (var option of document.getElementById('nbr').options)
    {
        if (option.selected) {
            tempstring=tempstring+(option.value)+','; //Put the neighbours
        }
    } 
        addneighbour(document.getElementById('citytext').value.toLowerCase()+
                          ":"+tempstring.slice(0,-1));//Remove the last comma
                          
        updatecitylist(document.getElementById('citytext').value.toLowerCase());
         document.getElementById('addcity').style.display="inline";
         setcities();
    }
    else{
        window.alert("Error! City already present");
    }
    }
    
}
function addneighbour(a){
    //Put neighbors in database if not present already
  //  window.alert(a);
}
function updatecitylist(a){
    //Update citylist
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
