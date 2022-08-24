/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


function loadStoreOwnerUser(endpoint) {
    fetch(endpoint).then(function(res){
       return res.json(); 
    }).then(function(data) {
        console.info(data);
        let msg = "";
        for(let i=0; i < data.length; i++){
            msg += 
            `<tr>
                <td>${data[i].userId}</td>
                <td>${data[i].userEmail}</td>
                <td>${data[i].userAddress}</td>
                <td>${data[i].userPhoneNumber}</td>
                <td>
                    <div class="spinner-border text-secondary" style="display:none" id="load${data[i].userId}"></div>
                    <button class="btn btn-danger" id="btn${data[i].userId}">Accept</button>
                </td>
            </tr>`;
        
        let d = document.getElementById("storeOwnerUsers");
        d.innerHTML = msg;
        
        }
    });
}