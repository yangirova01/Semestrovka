<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <title>Upload</title>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
          integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans+Condensed:wght@300&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Quicksand&display=swap" rel="stylesheet">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,300;1,400&display=swap"
          rel="stylesheet">
    <script
            src="https://code.jquery.com/jquery-3.6.0.js"
            integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
            crossorigin="anonymous"></script>
    <script>
        function sendFile() {
            // данные для отправки
            let formData = new FormData();
            console.log(formData);
            // забрал файл из input
            let files = ($('#file'))[0]['files'];
            // добавляю файл в formData
            [].forEach.call(files, function (file, i, files) {
                formData.append("file", file);
            });

            $.ajax({
                type: "POST",
                url: "/files",
                data: formData,
                processData: false,
                contentType: false
            })
                .done(function (response) {
                    let fileUrl = 'http://localhost:8080/files/' + response;
                    $('#photo').append('<img src = "' + fileUrl + '"/>');
                })
                .fail(function () {
                    alert('Error')
                });
        }
    </script>
</head>
<body>
<form action="/profile" method="post">
    <div class="marquee shrift"><span>Скидки до 50% на осеннюю коллекцию!</span></div>
    <div class="main">
        <nav class="navbar navbar-expand-lg navbar-light bg-white ">
            <a class="navbar-brand " href="#">
                <h1>Calvin Klein</h1>
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse " id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto ">
                    <li class="nav-item active shrift ">
                        <a class="nav-link " href="#">ЖЕНЩИНЫ</a>
                    </li>
                    <li class="nav-item shrift">
                        <a class="nav-link" href="#">МУЖЧИНЫ</a>
                    </li>
                    <li class="nav-item shrift">
                        <a class="nav-link" href="#">ДЕТИ</a>
                    </li>
                </ul>
                <form>
                    <input type="text" class="shrift input" placeholder="ПОИСК">
                    <button type="submit" class="shrift">ИСКАТЬ</button>
                </form>
            </div>
            <button type="submit" class="shrift signUp" style="color: black" data-toggle="modal"
                    data-target="#exampleModalSignUp">ЗАРЕГИСТРИРОВАТЬСЯ
            </button>
            <button type="submit" class="shrift signIn" style="color: black" data-toggle="modal"
                    data-target="#exampleModal">ВОЙТИ
            </button>
            <button class="logo">
                <svg width="2em" height="2em" viewBox="0 0 20 20" class="bi bi-bag" fill="black"
                     xmlns="http://www.w3.org/2000/svg">
                    <path fill-rule="evenodd"
                          d="M8 1a2.5 2.5 0 0 0-2.5 2.5V4h5v-.5A2.5 2.5 0 0 0 8 1zm3.5 3v-.5a3.5 3.5 0 1 0-7 0V4H1v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V4h-3.5zM2 5v9a1 1 0 0 0 1 1h10a1 1 0 0 0 1-1V5H2z"/>
                </svg>
            </button>
        </nav>
        <div class="category catside">
            <a class="categoryall" href="#">НОВИНКИ</a>
            <a class="categoryall" href="#">НИЖНЕЕ БЕЛЬЕ</a>
            <a class="categoryall" href="#">ОДЕЖДА</a>
            <a class="categoryall" href="#">СУМКИ И АКСЕССУАРЫ</a>
            <a class="categoryall" href="#">ОБУВЬ</a>
            <a class="categoryall" href="#">ПОДАРКИ</a>
            <a class="categoryall" href="#">ПРЕДЫДУЩИЕ КОЛЛЕКЦИИ</a>
        </div>
    </div>
    <hr>
    <div>
        <input type="file" multiple='multiple' id="file" name="file" placeholder="Имя файла..."/>
        <button onclick="sendFile()">
            Загрузить файл
        </button>
        <input type="hidden" id="file_hidden"></input>
        <div class="filename"></div>
    </div>
    <div id="photo">
    </div>
    <footer class="shrift" style="padding-top: 100px">
        <hr>
        <p style="margin-left: 50px">ПОДПИШИТЕСЬ НА РАССЫЛКУ И ПОЛУЧИТЕ СКИДКУ 10% НА ВАШ ЗАКАЗ</p>
        <p class="dop" style="margin-left: 50px">ОСТАВАЙТЕСЬ В КУРСЕ НАШИХ НОВОСТЕЙ И ПОЛУЧИТЕ СКИДКУ 10%</p>
        <form>
            <div class="form-inline">
                <input type="text" style="margin-left: 50px" class="gdg" placeholder="ВВЕДИТЕ ЭЛ.АДРЕС">
                <button class="test mybtn">ПОДПИШИТЕСЬ</button>
            </div>
        </form>
    </footer>
    </div>
</form>
</body>
</html>