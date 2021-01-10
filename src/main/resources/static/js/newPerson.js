const form = document.getElementById("form");

const namePlaceHolders = ["First Name", "Last Name", "company", "email"];
const nameAttributes = ["firstName", "lastName", "company", "email"];

const numberInputNames = ["height", "weight", "waist", "age", "gender", "years", "overallEffort",
    "typicalLiftEffort", "heaviestLiftEffort", "rightShoulderDiscomfort", "leftShoulderDiscomfort",
    "upperBackDiscomfort", "lowerBackDiscomfort", "rightHipDiscomfort", "leftHipDiscomfort", "rightThighDiscomfort",
    "leftThighDiscomfort", "rightKneeDiscomfort", "leftKneeDiscomfort"];

const numberInputPlaceHolders = ["height", "weight", "waist", "age", "gender", "years at current job", "overall Effort",
    "typical Lift Effort", "Heaviest Lift Effort", "Right Shoulder Discomfort", "Left Shoulder Discomfort",
    "Upper Back Discomfort", "Lower Back Discomfort", "Right Hip Discomfort", "Left Hip Discomfort", "Right Thigh Discomfort",
    "Left Thigh Discomfort", "Right Knee Discomfort", "Left Knee Discomfort"];
const nameInputsById = [];

const completeFormList = [nameAttributes, numberInputNames];


loadForms();

function loadForms() {

    for (let i = 0; i < namePlaceHolders.length; i++) {
        let input = document.createElement("input");
        input.setAttribute('id', nameAttributes[i]);
        input.setAttribute('placeholder', namePlaceHolders[i]);
        input.setAttribute('type', 'text');
        input.setAttribute('name', nameAttributes[i]);
        form.appendChild(input);
    }
    let newLine = document.createElement('br');
    form.appendChild(newLine);

    for (let i = 0; i < numberInputNames.length; i++) {
        let input = document.createElement("input");
        input.setAttribute('id', numberInputNames[i]);
        input.setAttribute('placeholder', numberInputPlaceHolders[i]);
        input.setAttribute('type', 'number');
        input.setAttribute('name', numberInputNames[i]);
        form.appendChild(input);
    }
}

function submitForm() {

    for (let i = 0; i < nameAttributes.length; i++) {
        let addedElement = document.getElementById(nameAttributes[i]);
        nameInputsById.push(addedElement);
    }
    for (let i = 0; i < numberInputNames.length; i++) {
        let addedElement = document.getElementById(numberInputNames[i]);
        nameInputsById.push(addedElement);
    }

    for (let i = 4; i < nameInputsById.length; i++) {
        if (nameInputsById[i].value === "") {
            nameInputsById[i].value = 0;
        }
    }

    let formData = {

        firstName: nameInputsById[0].value,
        lastName: nameInputsById[1].value,
        company: nameInputsById[2].value,
        email: nameInputsById[3].value,

        height: parseInt(nameInputsById[5].value),
        weight: parseInt(nameInputsById[6].value),
        waist: parseInt(nameInputsById[7].value),
        age: parseInt(nameInputsById[8].value),
        gender: parseInt(nameInputsById[9].value),
        years: parseInt(nameInputsById[10].value),
        overallEffort: parseInt(nameInputsById[11].value),
        typicalLiftEffort: parseInt(nameInputsById[12].value),
        heaviestLiftEffort: parseInt(nameInputsById[13].value),
        rightShoulderDiscomfort: parseInt(nameInputsById[14].value),
        leftShoulderDiscomfort: parseInt(nameInputsById[15].value),
        upperBackDiscomfort: parseInt(nameInputsById[16].value),
        lowerBackDiscomfort: parseInt(nameInputsById[17].value),
        rightHipDiscomfort: parseInt(nameInputsById[18].value),
        leftHipDiscomfort: parseInt(nameInputsById[19].value),
        rightThighDiscomfort: parseInt(nameInputsById[20].value),
        leftThighDiscomfort: parseInt(nameInputsById[21].value),
        rightKneeDiscomfort: parseInt(nameInputsById[22].value),
        leftKneeDiscomfort: parseInt(nameInputsById[23].value),
    }

    $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/add-person",
            data: JSON.stringify(formData),
            dataType: 'json'
        }
    )

}






