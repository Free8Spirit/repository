// Vert, David; 10/01/2018; JavaScript source code

// No change in code needed! Just add more image files into the array!

var img = ["yesh.jpg", "MeaningOfLife.jpg", "exactly.jpg", "try().jpg", "Coffee().jpg", "jQPGrx.jpg", "program.jpg", "Don'tTryThisAtHome.jpg", "error.jpg", "code-horror.jpg", "java2javascript.jpg", "lie.jpg", "name.jpg", "solve-meh.jpg", "garfield.jpg", "wanted.jpg", "yup.jpg", "oof.jpg", "nuu.jpg", "true.jpg", "TheProgrammer.jpg", "WhoGetsThis.jpg",  "WeNeedMoreCodesLikeThis.jpg",  "false.jpg"];

var i = 0;

var times = setInterval(timer, 3000);

function imgSet() {

    var t = document.createElement('title');
    t.innerHTML = 'Photo Swap';
    document.head.appendChild(t)

    var l = document.createElement('link');
    l.rel = 'shortcut icon';
    l.type = 'image/x-icon';
    l.href = 'insanity.jpg';
    document.head.appendChild(l);

    document.body.style.backgroundColor = 'azure';

    for (i = 0; i < img.length; i++) {
        var x = new Image;
        x.src = img[i];
        x.alt = 'img';
        x.id = i;
        x.style.width = '14%'; // Image Sizing!!!
        x.style.padding = '1.2%';
        x.onclick = bigscreen;
        document.body.appendChild(x);
    }

    var x = document.createElement('audio');
    x.src = 'Aloha-Ohana.mp3'; // Change song by source name here
    x.setAttribute('loop', 'true');
    x.play();
    document.body.appendChild(x);

    var y = document.createElement('img');
    y.id = 'important';
    y.src = img[0];
    y.alt = 'music';
    y.style.width = '100%';
    document.body.appendChild(y);
}

function bigscreen() {
    clearInterval(times);
    var x = this.id;
    document.getElementById("important").src = img[x];
    times = setInterval(timer, 8000);
}

function timer() {
    var num = Math.floor(Math.random() * img.length);
    document.getElementById("important").src = img[num];
}

window.addEventListener("load", imgSet);