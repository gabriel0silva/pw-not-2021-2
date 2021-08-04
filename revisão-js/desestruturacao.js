// Vetor
let carros = ['Celta', 'Uno', 'Gol']

// Desestruturação total do vetor
let [a,b,c] = carros

console.log(a)
console.log(b)
console.log(c)

// Desestruturação parcial
let [m, n] = carros

console.log('---------------------------')

console.log(m)
console.log(n)

console.log('---------------------------')

// Desustruturação das pontas
let [x, ,z] = carros

console.log(x)
console.log(z)

console.log('---------------------------')

let [, i, j] = carros

console.log(i)
console.log(j)

console.log('---------------------------')

// Objeto
let veiculo = {
    marca: 'Volkswagen',
    modelo: 'Fusca',
    cor: 'preto',
    ano: 1969
}

/* 
    Desestruturação total de um objeto
        1º regra: as variáveis devem ter o mesmo nome das propriedades
        2º regra: a ordem não importa
*/

let { cor, modelo, ano, marca } = veiculo

console.log(marca)
console.log(modelo)
console.log(cor)
console.log(ano)

console.log('---------------------------')

// Para fazer a desestruturação parcial de objeto, basta criar
// variáveis correspondentes apenas às propriedades de interesse.

