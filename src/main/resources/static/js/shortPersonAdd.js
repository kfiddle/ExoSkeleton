const form = document.getElementById("form");
const namePlaceHolders = ["First Name", "Last Name", "company"];
const nameAttributes = ["firstName", "lastName", "company"];
const drape = document.getElementById("drape");
const submit = document.getElementById('submit');

let mousePressed;
let mouseY;
let deltaY;


loadForm();
loadForm();

function loadForm() {
    for (let i = 0; i < namePlaceHolders.length; i++) {
        let input = document.createElement("input");
        input.setAttribute('id', nameAttributes[i]);
        input.setAttribute('placeholder', namePlaceHolders[i]);
        input.setAttribute('type', 'text');
        input.setAttribute('name', nameAttributes[i]);
        form.appendChild(input);
    }
}

drape.addEventListener('mousedown', function (x) {
    mousePressed = true;
    drape.style.backgroundColor = "red";
    mouseY = x.clientY;
});

window.addEventListener('mouseup', function () {
    if (mousePressed === true) {
        mousePressed = false;
        drape.style.backgroundColor = "darkgoldenrod";
        console.log(mousePressed);
    }
});

drape.addEventListener('mousemove', function (x) {
    if (mousePressed === true) {
        deltaY = x.clientY - mouseY;

        if (deltaY > 5) {
            loadForm();
        } else if (deltaY < 0) {
            console.log(mousePressed);
            // subtractAField();
        }
    }
});

// submit.addEventListener('click', ()=> {
//
//
// })
