let nota = 7.3
let situacao

/*
    if(nota >= 6) {
        situacao = 'APROVADO'   
    }
    else {
        situacao =  'REPROVADO'
    }
*/
// Usando o operador ternário
situacao = nota >= 6 ? 'APROVADO' : 'REPROVADO'

console.log(`Nota ${nota}, situação ${situacao}.`)

console.log('---------------------------------------')

let user = 'admiguest'

let msg = user === 'admin' ? 'Pode logar' : 'Não pode logar'

console.log(msg)