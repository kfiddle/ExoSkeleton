const form = document.getElementById("form");

const firstNames = [];
const lastNames = [];
const companies = [];

const inputs = [firstNames, lastNames, companies];
const namePlaceHolders = ["First Name", "Last Name", "company"];
const nameAttributes = ["firstName", "lastName", "company"];
const drape = document.getElementById("drape");
const submit = document.getElementById('submit');

let mousePressed;
let mouseY;
let deltaY;


loadForm();


class Person {
    constructor(firstName, lastName, company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
    }

}


function loadForm() {
    for (let i = 0; i < namePlaceHolders.length; i++) {
        let input = document.createElement("input");
        input.setAttribute('id', nameAttributes[i]);
        input.setAttribute('placeholder', namePlaceHolders[i]);
        input.setAttribute('type', 'text');
        input.setAttribute('name', nameAttributes[i]);
        inputs[i].push(input);
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

submit.addEventListener('click', () => {
    let formData = {
        firstName: "joey",
        lastName: "jablonski"
    }
    $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/add-short-person",
            data: JSON.stringify(formData),
            dataType: 'json'
        }
    )
});


// submit.addEventListener('click', () => {
//     for (let i = 0; i < inputs[i].length; i++) {
//         if (inputs[0][i].value !== "" && inputs[1][i].value !== "" && inputs[2][i].value !== "") {
//             let formData = {
//                 firstName: inputs[0][i].value,
//                 lastName: inputs[1][i].value,
//                 company: inputs[2][i].value
//             }
//             $.ajax({
//                     type: "POST",
//                     contentType: "application/json",
//                     url: "/add-short-person",
//                     data: JSON.stringify(formData),
//                     dataType: 'json'
//                 }
//             )
//         }
//     }
// });


