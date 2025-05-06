function calculate() {

    var operation = document.getElementById('operation').value
    var a = document.getElementById('n1').value
    var b = document.getElementById('n2').value
    if (a == '') {
        alert("no1 is blank")
    }
    else if (isNaN(a)) {
        alert(a + " is not a number")
    }

    else if (b == '') {
        alert("no2 is blank")
    }
    else if (isNaN(b)) {
        alert(b + " is not a number")
    }
    else if (operation == '') {
        alert('select operation')
    }
    else if (operation == 'addition') {
        var c = parseFloat(a) + parseFloat(b)
        document.getElementById('n3').value = c
    }
    else if (operation == 'subtraction') {
        var c = parseFloat(a) - parseFloat(b)
        document.getElementById('n3').value = c
    }
    else if (operation == 'multiplication') {
        var c = parseFloat(a) * parseFloat(b)
        document.getElementById('n3').value = c
    }
    else if (operation == 'division') {
        var c = parseFloat(a) / parseFloat(b)
        document.getElementById('n3').value = c
    }
}