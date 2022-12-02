$('.carousel').carousel({
    interval: 2000
  })

  function onChangeRegion() {
    var inputRegion = document.getElementById("inputRegion");
    var selectedValueRegion = inputRegion.value;
    
    //var indiceSeleccionado = inputRegion.selectedIndex;
    
    //console.log(selectedValueRegion);
    
    if (selectedValueRegion == "13") {
        alert("Ud. ha seleccionado Región Metropolitana");
    }
    else if (selectedValueRegion == "5") {
        alert("Ud. ha seleccionado Región de Valparaiso");
    }
    else if (selectedValueRegion == "6") {
        alert("Ud. ha seleccionado Región de O'Higgins");
    }
    else if (selectedValueRegion == "10") {
        alert("Ud. ha seleccionado Región de Los Lagos")
    }
}


function aceptarClausula() {
    var checkValidacion = document.getElementById("checkValidacion");
    
    if (checkValidacion.checked == false) {
        alert("¡Debe aceptar la clausula, si no, el gatito no tendrá comida!")
    }
}


function validarFormulario(event) {
    //VALIDAMOS CAMPO REGION
    var inputRegion = document.getElementById("inputRegion");
    
    if (inputRegion.value == "0") {
        alert("Debe seleccionar una región");
        
        event.preventDefault(); 
        return false;
    }
    
    //VALIDAMOS CAMPO IDENTIFICACIÓN
    
    var radioIdentificacion = document.forms.miformulario.elements["identificacion"];
    //document.querySelector
    
    if (radioIdentificacion.value == "") {
        alert("Debe seleccionar una identificación");
        
        event.preventDefault();
        return false;
    }
    
    //VALIDAMOS CAMPO VALIDACION
    
    var checkValidacion = document.getElementById("checkValidacion");
    
    if (checkValidacion.checked == false) {
        alert("Debe estar de acuerdo con las condiciones");
        
        event.preventDefault();
        return false;
    }
    
    //VALIDAMOS CAMPO ROBOT
    var inputValor1 = document.getElementById("inputValor1");
    var inputValor2 = document.getElementById("inputValor2");
    
    var valorNumerico1 = parseInt(inputValor1.value); //parseFloat 
    var valorNumerico2 = parseInt(inputValor2.value);
    //Si parseInt no puede transformar a numero, debe NaN
    //NaN significa Not a Number
    
    if ((valorNumerico1+valorNumerico2) !== 20) {
        alert("No esta correcta la operación matematica. Ud. es un robok.");
        
        event.preventDefault();
        return false;
    }
    
    alert("¡Muchas gracias por completar su solicitud!")
    return true;
}

function darkMode() {
    var element = document.body;
    var content = document.getElementById("DarkModetext");
    element.className = "dark-mode";
    content.innerText = "Dark Mode is ON";
    }
    function lightMode() {
    var element = document.body;
    var content = document.getElementById("DarkModetext");
    element.className = "light-mode";
    content.innerText = "Dark Mode is OFF";
  }