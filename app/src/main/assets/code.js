// Hàm tính chu vi hình vuôg
function calculatePerimeter() {
    var sizeCanh = document.getElementById('sizeCanh').value;
    var result = document.getElementById('result');  // Phần tử để hiển thị kết quả

    if (sizeCanh) {
        // Tính chu vi
        var perimeter = 4 * sizeCanh;
        result.innerText = "Chu vi hình vuông là: " + perimeter + " cm";
    } else {
        result.innerText = "Vui lòng nhập chiều dài cạnh!";
    }
}

// MP3 và MP4
window.onload = function() {
    var audio = document.querySelector('audio');
    audio.addEventListener('play', function() {
        console.log('MP3 đang phát');
    });

    var video = document.querySelector('video');
    video.addEventListener('play', function() {
        console.log('Video đang phát');
    });
};
