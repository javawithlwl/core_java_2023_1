function showTable() {
    let num = document.querySelector("#num").value;
    const tableContent = document.querySelector("#table-content");
    let str = "";
    if (num !== "") {
        str = "<br><ul class='list-group'>";
        for (let i = 1; i <= 10; i++) {
            str += `<li class="list-group-item">${num} * ${i} = ${num * i}</li>`;
        }
        str += "</ul>";

    }
    tableContent.innerHTML = str;

}

const add = document.querySelector("#add");
const sub = document.querySelector("#sub");
const mul = document.querySelector("#mul");
const div = document.querySelector("#div");
const resDiv = document.querySelector("#result");

add.addEventListener('click', () => {
    let num1 = document.querySelector("#num1").value;
    let num2 = document.querySelector("#num2").value;
    let res = `${num1} + ${num2} = ${Number.parseInt(num1) + Number.parseInt(num2)}`;
    resDiv.innerHTML = res;
});


addFun = (a, b) => a + b;
bigFun = (a, b) => a > b ? a : b;

function res(arr, f) {
    let ele = arr[0];
    for (let i = 1; i < arr.length; i++) {
        ele = f(ele, arr[i]);
    }
    return ele;
}

console.log(res([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], bigFun));

const todos = [];

const todoEle = document.querySelector("#todo");
const showTodoEle = document.querySelector("#show-todos");
let isEditOn = false;
let editIndex = -1;
todoEle.addEventListener("keyup", (event) => {
    if (event.keyCode == 13) {
        let todo = event.target.value;
        if (todo !== "" && todo.trim().length > 0) {
            if(isEditOn && editIndex != -1){
                todos[editIndex] = todo;
                isEditOn = false;
                editIndex = -1;
            }else{
                todos.push(todo);
            }
            event.target.value = "";
            showTodos();
        }
    }
})
function removeTodo(index){
    todos.splice(index,1);
    showTodos();
}

function editTodo(index){
    editIndex = index;
    isEditOn = true;
    let todo = todos[index];
    todoEle.value = todo;
}
function showTodos() {
    let str = "";
    if (num !== "") {
        str = "<br><ul class='list-group'>";
        for (let i = 0; i < todos.length; i++) {
            str += `<li class="list-group-item">${todos[i]} 
                    <span class="icons">
                    <i class="fa fa-edit" onclick="editTodo(${i})"></i>
                    &nbsp;
                    <i class="fa fa-trash" onclick="removeTodo(${i})"></i></span></li>`;
        }
        str += "</ul>";

    }
    showTodoEle.innerHTML = str;
}


const showContent = document.querySelector("#show-content");

fetch('https://jsonplaceholder.typicode.com/users')
    .then(data=>{console.log(data);return data.json()})
    .then(res=>{
        showEmployeeDetails(res);
    }).catch(error=>{
    console.log(error);
})
function showEmployeeDetails(arr){

        let str = "<table class='table'>";
        str += "<thead><th>#id</th><th> Name</th><th>Username</th><th>Email</th></thead>";
        str += "<tbody>";
        for(let i=0;i<arr.length;i++){
            str += `<tr><td>${arr[i].id}</td><td>${arr[i].name}</td><td>${arr[i].username}</td><td>${arr[i].email}</td></tr>`;
        }
        str += "</tbody></table>";
        showContent.innerHTML = str;


}