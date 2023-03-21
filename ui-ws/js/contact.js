function init(){

    fetch('http://localhost:8081/cbook/api/contact/all')
    .then(data=>data.json())
    .then(res=>{
        showContacts(res);
    });


}
function showContacts(contacts){
        const contacts_content=document.querySelector("#contacts-content");
        let str="";
        if(contacts.length>0){
            str = `<table class='table'>
            <thead>
                <th>#</th>
                <th>Name</th>
                <th>Email</th>
                <th>Mobile</th>
                <th>Edit</th>
                <th>Delete</th>
            </thead>
            <tbody>`
            for(let i=0;i<contacts.length;i++){
               let c = contacts[i];
               str += `<tr>
                    <td>${c.id}</td>
                    <td>${c.fullName}</td>
                    <td>${c.email}</td>
                    <td>${c.mobile}</td>
                    <td><i class="fa fa-edit" onclick='editContact(${JSON.stringify(c)})'></i></td>
                    <td><i class="fa fa-trash" onclick='deleteContact("${c.id}","${c.fullName}")'></i></td>
                </tr>`
            }
            str +=`</tbody>
        </table>`;
            
        }else{
            str = "Contact list empty! please add contact to see the contacts";
        }
        contacts_content.innerHTML = str;
}
let updateId;
function editContact(contact){
    document.querySelector("#add").style.visibility = 'hidden';
    document.querySelector("#update").style.visibility = 'visible';
    let formData = document.querySelector("#addContact");
    formData.fullName.value = contact.fullName;
    formData.email.value = contact.email;
    formData.mobile.value = contact.mobile;
    updateId = contact.id;
      
}
function updateContact(){
    let formData = document.querySelector("#addContact");
    let fullName = formData.fullName.value;
    let mobile = formData.mobile.value;
    let email  = formData.email.value;

    let contact =JSON.stringify({
            "id":updateId,
            "fullName":fullName,
            "mobile": mobile,
            "email": email
    });
    

    var myHeaders = new Headers();
    myHeaders.append("Content-Type", "application/json");

    let requestOptions = {
        method: 'PUT',
         headers: myHeaders,
        body: contact
    };

fetch("http://localhost:8081/cbook/api/contact", requestOptions)
  .then(response => response.json())
  .then(result => init())
  .catch(error => console.log('error', error));
  updateId = "";
  formData.reset();
  console.log(contact);
  document.querySelector("#add").style.visibility = 'visible';
  document.querySelector("#update").style.visibility = 'hidden';
}
function deleteContact(id,name){
        let res = confirm("Are you sure do you want to delete "+name+" ?");
        if(res){
            var raw = "";
            var requestOptions = {
                 method: 'DELETE',
                 body: raw,
                 redirect: 'follow'
            };
            fetch(`http://localhost:8081/cbook/api/contact/${id}`, requestOptions)
            .then(response => response.json())
            .then(result => init())
            .catch(error => console.log('error', error));
        }
}

function addContact(){
    let formData = document.querySelector("#addContact");
    let fullName = formData.fullName.value;
    let mobile = formData.mobile.value;
    let email  = formData.email.value;

    let contact =JSON.stringify({
            "fullName":fullName,
            "mobile": mobile,
            "email": email
    });
    formData.reset();
    console.log(contact);

    var myHeaders = new Headers();
    myHeaders.append("Content-Type", "application/json");

    let requestOptions = {
        method: 'POST',
         headers: myHeaders,
        body: contact
    };

fetch("http://localhost:8081/cbook/api/contact", requestOptions)
  .then(response => response.json())
  .then(result => init())
  .catch(error => console.log('error', error));

}
document.querySelector("#update").style.visibility = 'hidden';
init();