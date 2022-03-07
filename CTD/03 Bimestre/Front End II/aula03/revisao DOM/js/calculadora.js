import somar from './somar.js'
import subtrair from './subtrair.js'
import dividir from './dividir.js'
import multiplicar from './multiplicar.js'

let operacao = prompt('Informe o tipo de operação \n + para soma \n - para subtração \n * para multiplicação \n / para divisão')

document.getElementById('operacao').innerText += operacao 

let n1 = parseInt(prompt('Informe o primeiro número'))

document.getElementById('n1').innerText += n1

let n2 = parseInt(prompt('Informe o segundo número'))

document.getElementById('n2').innerText += n2

let resultado

switch (operacao) {
    case '+':
        resultado = somar(n1,n2)
        break;
    case '-':
        resultado = subtrair(n1,n2)
        break;
    case '/':
        resultado = dividir(n1,n2)
        break;
    case '*':
        resultado = multiplicar(n1,n2)
        break;

    default:
        break;
}

document.getElementById('resultado').innerText += resultado

// alert(resultado)