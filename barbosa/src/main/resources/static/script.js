
function cadastrar() {
    let crud = document.getElementById("cadastrar");
    crud.innerHTML += ` 
    
    <form action="">
    <button class="fechar" onclick="deletar()">Fechar</button>
    <h2>Insira os Dados do Cliente</h2>
    <input type="text" name="" placeholder="Nome">                     
    <input type="text" name="" placeholder="CPF">          
     <input type="text" name="" placeholder="E-mail">
     <button class="but">Salvar</button>
     <button class="but1">Cancelar</button>
    </form>`;
}
function deletar() {
    let del = document.getElementById("cadastrar");
    del.innerHTML = "";
}




