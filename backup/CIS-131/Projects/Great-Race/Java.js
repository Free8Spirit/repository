// JavaScript source code

var Racer = ['Spongebob.png', 'Stitch.png', 'Zelda.png', 'Mario.png', 'Gir.png', 'Tinkerbell.png', 'Daxter.png', 'Grimoire.png', 'Squall.png'];             // Running images src ******** p.s. The file name becomes their name ^-^
var Stance = ['SSpongebob.png', 'SStitch.png', 'SZelda.png', 'SMario.png', 'SGir.png', 'STinkerbell.png', 'SDaxter.png', 'SGrimoire.png', 'SSquall.png'];     // Starting Stance image src
var Victor = ['VSpongebob.png', 'VStitch.png', 'VZelda.png', 'VMario.png', 'VGir.png', 'VTinkerbell.png', 'VDaxter.png', 'VGrimoire.png', 'VSquall.png'];     // Victory Pose image src
var futon = ['Start.png', 'Ready.png', 'Set.png', 'Go.png'];
var hacker = !false;

function css() {
    var wand = document.getElementById('controller');
    wand.style.backgroundColor = 'azure';
    wand.style.border = 'groove black 2px';
    wand.style.margin = '.5%';
    wand.style.textAlign = 'center';

    var tan = document.getElementsByTagName('body')[0];
    tan.style.backgroundColor = 'tan';
    tan.style.position = 'absolute';
    tan.style.width = '98%';
    tan.style.height = '98%';

    var wow = document.getElementById('container');
    wow.style.position = 'absolute';
    wow.style.width = '100%';
    wow.style.height = '100%';
    wow.style.backgroundColor = 'silver';
    wow.style.border = 'groove black 2px';
    wow.style.margin = '.5%;';

    for (var i = 0; i < (Racer.length * 2); i++) {
        var pchan = document.getElementsByTagName('p')[i];
        pchan.style.padding = '2%';
        pchan.style.width = '100%';
        pchan.style.margin = 'auto';
        pchan.style.textAlign = 'center';
    }
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
        holder.innerHTML = `<p onclick="cheater(${i})"> ${name} </p> <p id="Score${i}" onclick="cheater(${i})"> ${0} </p>`;
    }

    var z = document.createElement('audio');
    z.src = 'song.mp3';
    z.setAttribute('loop', 'true');
    z.setAttribute('autoplay', 'true');
    z.type = 'audio/mp3';
    z.play();
    document.body.appendChild(z);

    set();
}

function Score(i) {
    var score = document.getElementById(`Score${i}`);
    score.innerHTML = `${parseInt(score.innerHTML) + 1}`;
}

function cheater(z) {
    if (hacker == !true) {
        for (var i = 0; i < Racer.length; i++) {
            if (!(i == z)) {
                document.getElementById(i).style.left = '0px';
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
    x.style.width = '20%';
    x.onclick = stage;
    document.getElementById('controller').appendChild(x);
}

function Countdown() {
    clearInterval(Final);
    Final = setInterval(Countdown, (Math.ceil(Math.random() * 3) * 1000));
    var inc = document.getElementById('click');
    var ink = inc.getAttribute('src');

    if (ink == "Start.png") {
        inc.src = futon[1];
    } else if (ink == "Ready.png") {
        inc.src = futon[2];
    } else if (ink == "Set.png") {
        inc.src = futon[3];
        clearInterval(Final);
        Final = setInterval(Countdown, 800);
    } else {
        clearInterval(Final);
        Start();
    }
}

function controller() {
    var kid = document.getElementById('controller');
    kid.innerHTML = "";

    for (var i = 1; i < futon.length; i++) {
        var x = document.createElement('img');
        x.id = `click${i}`;
        x.src = futon[i];
        x.alt = 'click meh';
        x.style.position = 'relative';
        x.style.width = '20%';
        document.getElementById('controller').appendChild(x);
        kid.appendChild(x);
    }
    document.getElementById('click1').onclick = Red;
    document.getElementById('click2').onclick = Yellow;
    document.getElementById('click3').onclick = Green;
}

function stage() {
    document.getElementById('click').onclick = "";
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
    running = setInterval(move, (Math.ceil(Math.random() * 6) * 10));
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
    running = setInterval(move, (Math.ceil(Math.random() * 6) * 10));
}

function move() {
    var x = 626;
    //var line = document.getElementsByTagName('body')[0].offsetWidth;
    var line = document.getElementById('container').offsetWidth;

    for (var i = 0; i < Racer.length; i++) {
        var rar = document.getElementById(i);
        var Left = parseInt(rar.style.left);
        
        if (Left < (line - (line/10))) {
            rar.style.left = `${Left + (Math.ceil(Math.random() * 10))}px`;
        } else {
            x = i;
            Red();
        }
    }

    if (!(x == 626)) {
        hacker = !false;
        Winner(x);
    }
}

function Winner(i) {
    clear();
    Score(i);
    var broken = Racer[i].split('.');
    var name = broken[0];
    var magic = document.getElementById('controller');
    magic.innerHTML = `<div> Congratulations ${name}! </div>`;
    magic = magic.firstElementChild;
    magic.style.padding = '2%';
    magic.style.fontSize = '350%';

    var x = document.createElement('img');
    x.id = i;
    x.src = Victor[i];
    x.alt = 'Racer';
    x.onclick = set;
    document.getElementById('container').appendChild(x);
    x.style.position = 'relative';
    x.style.left = '20%';
    x.style.width = '45%';
    x.style.maxHeight = '100%';
}

function clear() {
    document.getElementById('controller').innerHTML = "";
    document.getElementById('container').innerHTML = "";
}

window.addEventListener("load", ScoreBoard);