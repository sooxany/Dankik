/**
 * 
 */
function resetClass(element, classname){
    element.classList.remove(classname);
  }
  document.getElementsByClassName("show-signup")[0].addEventListener("click",function(){
    let form = document.getElementsByClassName("form")[0];
    resetClass(form, "signin");
    form.classList.add("signup");
    document.getElementById("submit-btn").innerText = "Sign Up";
  });
  document.getElementsByClassName("show-signin")[0].addEventListener("click",function(){
    let form = document.getElementsByClassName("form")[0];
    resetClass(form, "signup");
    form.classList.add("signin");
    document.getElementById("submit-btn").innerText = "Sign In";
  });