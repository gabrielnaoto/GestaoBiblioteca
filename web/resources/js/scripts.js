window.onload = function () {
    time();
};

function time() {
    dayName = new Array("domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sábado");
    monName = new Array("janeiro", "fevereiro", "março", "abril", "maio", "junho", "agosto", "outubro", "novembro", "dezembro");
    now = new Date;
    hour = now.getHours()
    min = now.getMinutes()
    document.getElementById("time").innerHTML = hour + ":" + min + " - " + dayName[now.getDay()] + ", " + now.getDate() + " de " + monName [now.getMonth()] + " de " + now.getFullYear();
}

