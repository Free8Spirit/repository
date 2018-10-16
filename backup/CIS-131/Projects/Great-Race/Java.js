// JavaScript source code

var Racer = ['Start.png', 'Ready.png', 'Set.png', 'Go.png', 'Start.png', 'Ready.png', 'Set.png', 'Go.png'];
var Stance = ['Start.png', 'Ready.png', 'Set.png', 'Go.png', 'Start.png', 'Ready.png', 'Set.png', 'Go.png'];
var Victor = ['Start.png', 'Ready.png', 'Set.png', 'Go.png', 'Start.png', 'Ready.png', 'Set.png', 'Go.png'];
var futon = ['Start.png', 'Ready.png', 'Set.png', 'Go.png'];
var hacker = !false;

function css() {

}

function css2() {
    
}

function ScoreBoard() {
    var board = document.getElementById('ScoreBoard');
    board.style.backgroundColor = 'grey';
    board.style.border = 'groove black 2px';
    board.style.display = 'flex';

    for (var i = 0; i < Racer.length; i++) {
        var broken = Racer[i].split('.');
        var name = broken[0];
        var holder = document.createElement('div');
        holder.style.width = `${(100 / Racer.length) - 1}%`;
        holder.style.backgroundColor = 'azure';
        holder.style.border = 'groove crimson 2px';
        holder.style.margin = '2%';
        board.appendChild(holder);
        holder.innerHTML = `<p class="autoM" onclick="cheater(${i})"> ${name} </p> <p id="Score${i}" class="autoM" onclick="cheater(${i})"> ${0} </p>`;
    }
    set();
}

function Score(i) {

}

function cheater(z) {
    if (hacker == !true) {
        for (var i = 0; i < Racer.length; i++) {
            if (!(i == z)) {

            }
        }
        console.log('Are we gambling or just for fun?');
    }
}

function set() {
    clear();
    createHead();
    create();
    css();
}

function create() {
    for (var i = 0; i < Stance.length; i++) {
        var x = document.createElement('img');
        x.id = i;
        x.src = Stance[i];
        x.alt = 'Racer';
        x.style.width = '10%';
        document.getElementById('container').appendChild(x);
    }
}

function createHead() {
    var x = document.createElement('img');
    x.id = 'click';
    x.src = futon[0];
    x.alt = 'click meh';
    x.style.position = 'relative';
    x.style.left = '40%';
    x.style.width = '20%';
    x.onclick = stage;
    document.getElementById('controller').appendChild(x);
}

function Countdown() {
    var inc = document.getElementById('click');
    var ink = inc.getAttribute('src');

    if (ink == "Start.png") {
        clearInterval(Final);
        inc.src = futon[1];
        Final = setInterval(Countdown, (Math.ceil(Math.random() * 3) * 1000));
    } else if (ink == "Ready.png") {
        clearInterval(Final);
        inc.src = futon[2];
        Final = setInterval(Countdown, (Math.ceil(Math.random() * 3) * 1000));
    } else if (ink == "Set.png") {
        clearInterval(Final);
        inc.src = futon[3];
        Final = setInterval(Countdown, (Math.ceil(Math.random() * 3) * 1000));
    } else {
        clearInterval(Final);
        Start();
    }
}

function controller() {
    var kid = document.getElementById('controller');
    for (var i = 1; i < futon.length; i++) {

        kid.appendChild(x);
    }
}

function stage() {
    for (var i = 0; i < Racer.length; i++) {
        var x = document.getElementById(i);
        x.src = Racer[i];
        x.style.position = 'absolute';
        x.style.left = '0px';
        x.style.bottom = `${i * 10}%`;
    }
    Final = setInterval(Countdown, (Math.ceil(Math.random() * 3) * 1000));
}

function Start() {
    hacker = !true;
    controller();
    var line = document.getElementsByTagName('body')[0].offsetWidth;
    console.log(line);
}

function Red() {
    clearInterval(running);
}

function Yellow() {
    Red();
    running = setInterval(move, (Math.ceil(Math.random() * 10) * 100));
}

function Green() {
    Red();
    running = setInterval(move, (Math.ceil(Math.random() * 60)));
}

function move() {

}

function Winner(i) {
    clear();
    Score(i);

}

function clear() {
    document.getElementById('controller').innerHTML = "";
    document.getElementById('container').innerHTML = "";
}

window.addEventListener("load", ScoreBoard);