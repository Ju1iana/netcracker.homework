function sol() {
    dd = document;
    var a = dd.form1.a.value;
    var b = dd.form1.b.value;
    var c = dd.form1.c.value;
    var smth = dd.getElementById("smth");
    var er = dd.getElementById("error");

    if (!not_int(a) || !not_int(b) || !not_int(c) || !not_null(a)) {
        if (!not_null(a) && not_int(a)) {
            dd.getElementById("smth").style.display = 'none';
            dd.getElementById("error").style.display = 'block';
            er.innerHTML = "<b>a</b> should not be equal to 0!"
        } else {
            dd.getElementById("smth").style.display = 'none';
            dd.getElementById("error").style.display = 'block';
            er.innerHTML = "incorrect entry:  " + a + " " + b + " " + c +
                ", fill in all fields with numbers only.";
        }
    } else {
        dd.getElementById("error").style.display = 'none';
        dd.getElementById("smth").style.display = 'block';
        smth.innerHTML = "information:";
        var d = b * b - 4 * a * c;

        if (d < 0) {
            smth.innerHTML = "there are no roots.";
        } else {
            if (d === 0) {
                var x1 = (-b / (2 * a));
                var x2 = (-b / (2 * a));
            } else {
                var x1 = (-b / (2 * a) - Math.sqrt(d) / (2 * a));
                var x2 = (-b / (2 * a) + Math.sqrt(d) / (2 * a));
            }

        }
    }
    dd.form1.x1.value = x1;
    dd.form1.x2.value = x2;
    dd.form1.discriminant.value = d;

    eq = a + "x&sup2 + " + b + "x + " + c;
    dd.form1.equation.value = eq;

    add(eq, d, x1, x2);
}

function add(equation, d, x1, x2) {

    var tr = document.createElement("tr");
    var cols = ['equation', 'discriminant', 'x1', 'x2'];

    if (!isNaN(d)) {
        if ((!isNaN(x1) || !isNaN(x2))) {
            for (var q = 0; q < cols.length; ++q) {
                var td = document.createElement("td");
                td.innerHTML = document.getElementById(cols[q]).value;
                tr.appendChild(td);
            }
            remove(tr);
        } else if (d < 0) {
            add_less_than_zero(equation, d);
        }
    }
}

function add_less_than_zero(equation, d) {

    var z1 = document.createElement('tr');
    var zEquation = document.createElement('td');
    var zDis = document.createElement('td');
    var zX = document.createElement('td');

    document.getElementById('myTable').prepend(z1);

    zX.colSpan = 2;
    zX.innerHTML = "no roots";
    z1.prepend(zX);

    zDis.innerHTML = d;
    z1.prepend(zDis);
    zEquation.innerHTML = equation;
    z1.prepend(zEquation);

    remove(z1);
}

function remove(tr) {
    document.getElementById('dest').prepend(tr);
    document.getElementById('dest').addEventListener('click', function (e) {
        const tr = e.target.closest('tr');
        if (tr)
            tr.remove();
    });
}

function not_int(number) {
    var x = parseFloat(number);
    return (x | 0) === x && !isNaN(number);
}

function not_null(a) {
    return !isNaN(a) && a != 0;
}


