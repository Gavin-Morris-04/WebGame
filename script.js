function switchBackgroundColor() {
    const button = document.getElementById('colorToggleButton');
    const htmlElement = document.documentElement;
    const isBlack = htmlElement.classList.toggle('black');

    if (isBlack) {
        htmlElement.style.backgroundColor = '#2E2E2E';
        document.body.style.backgroundColor = '#2E2E2E';
        button.textContent = 'Light';
    } else {
        htmlElement.style.backgroundColor = 'tan';
        document.body.style.backgroundColor = 'tan';
        button.textContent = 'Dark';
    }
}

function navigateToPage(page) {
    window.location.href = page;
}

setInterval(function() {
    const line = document.createElement('div');
    line.classList.add('light-line');
    line.style.height = `${Math.random() * 2}px`; // Random height between 0 and 2px
    line.style.width = `${Math.random() * 100}px`; // Random width between 0 and 100px
    line.style.left = `-${Math.random() * 100}px`; // Start position outside the screen
    line.style.top = `${Math.random() * window.innerHeight}px`; // Random vertical position
    document.body.appendChild(line);

    // Remove the line after animation finishes
    line.addEventListener('animationend', function() {
        document.body.removeChild(line);
    });
}, 200);