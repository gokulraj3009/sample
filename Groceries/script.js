var groceris = document.getElementsByClassName("groceris")[0];
var pencil = document.getElementByID("pencil");
var allItems = document.getElementByID("allItems");
var userInput = document.getElementByID("userInput");

pencil.addEventListener("click",function(){
    allItems.innerHTML="";
})
userInput.addEventListener("keydown",function(event){
    if(event.key === "Enter")
    addItem();
})
function addItem(){
    var name = document.createElement("h2");
    name.innerHTML = "- " + userInput.value;

    name.addEventListener("click",function(){
        name.style.textDecoration = "line-through";
    })

    allItems.insertAdjacentElement("beforeend",name);
    

}