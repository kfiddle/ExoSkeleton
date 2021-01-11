const form = document.getElementById("form");
const namePlaceHolders = ["First Name", "Last Name", "company"];
const nameAttributes = ["firstName", "lastName", "company"];

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
