const buttonEl = document.querySelector('button');
const inputEl = document.querySelector('input');
const listEl = document.querySelector('ul');

buttonEl.addEventListener('click', addGoal);

function addGoal() {
  const enteredValue = inputEl.value;
  const listItemEl = document.createElement("li")
  listItemEl.textContent = enteredValue;
  listEl.appendChild(listItemEl);
  inputEl.value = '';
}