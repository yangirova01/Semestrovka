<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <link rel="stylesheet" href="css/home.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
          integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans+Condensed:wght@300&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Quicksand&display=swap" rel="stylesheet">
    <script src="js/search.js"></script>
</head>
<body>
<div class="marquee shrift" style="width: 100%"><span>Скидки до 50% на осеннюю коллекцию!</span></div>
<div class="main">
    <nav class="navbar navbar-expand-lg navbar-light bg-white ">
        <a class="navbar-brand " href="#">
            <form action="/home" method="get">
                <h1>Calvin Klein</h1></form>
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse " id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto ">
                <li class="nav-item active shrift ">
                    <form action="/products" method="post">
                        <a class="nav-link " href="/products">ОДЕЖДА</a>
                    </form>
                </li>
                <li class="nav-item active shrift ">
                    <a class="nav-link " href="/products">НИЖНЕЕ БЕЛЬЕ</a>
                </li>
            </ul>
        </div>
        <form action="/signUp" method="get">
            <button type="submit" class="shrift signUp" style="color: black" data-toggle="modal"
                    data-target="#exampleModalSignUp">ЗАРЕГИСТРИРОВАТЬСЯ
            </button>
        </form>
        <form action="/signIn">
            <button type="submit" class="shrift signIn" style="color: black" data-toggle="modal"
                    data-target="#exampleModal">ВОЙТИ
            </button>
        </form>
        <form action="basket.ftlh" method="get">
            <button class="logo">
                <svg width="2em" height="2em" viewBox="0 0 20 20" class="bi bi-bag" fill="black"
                     xmlns="http://www.w3.org/2000/svg">
                    <path fill-rule="evenodd"
                          d="M8 1a2.5 2.5 0 0 0-2.5 2.5V4h5v-.5A2.5 2.5 0 0 0 8 1zm3.5 3v-.5a3.5 3.5 0 1 0-7 0V4H1v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V4h-3.5zM2 5v9a1 1 0 0 0 1 1h10a1 1 0 0 0 1-1V5H2z"/>
                </svg>
            </button>
        </form>
        <form action="/profile" method="get">
            <button class="logo" style="background-color:white" style="margin-leftt: 5px">
                <svg width="2em" height="2em" viewBox="0 0 20 20" fill="black" xmlns="http://www.w3.org/2000/svg">
                    <path fill-rule="evenodd"
                          d="M10 5a2 2 0 1 1-4 0 2 2 0 0 1 4 0zM8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm6 5c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10z"/>
                </svg>
            </button>
        </form>
    </nav>
    <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="homeimages/1165489.jpg" height="750"
                     width="1450"/></div>
            <div class="carousel-item">
                <img src="homeimages/Calvin-Klein3-1.jpg" height="700" width="1450"/></div>
            <div class="carousel-item">
                <img src="homeimages/tild3232-6632-4364-a239-306231336261__sp18-hero-revised-1.jpg" height="750"
                     width="1450"/></div>
            <div class="carousel-item">
                <img src="homeimages/tufli-3.jpg" height="750" width="1450"/></div>
            <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
        <footer class="shrift">
            <p style="margin-left: 20px">ПОДПИШИТЕСЬ НА РАССЫЛКУ И ПОЛУЧИТЕ СКИДКУ 10% НА ВАШ ЗАКАЗ</p>
            <p class="dop" style="margin-left: 20px">ОСТАВАЙТЕСЬ В КУРСЕ НАШИХ НОВОСТЕЙ И ПОЛУЧИТЕ СКИДКУ 10%</p>
            <form>
                <div class="form-inline">
                    <input type="text" class="gdg" placeholder="ВВЕДИТЕ ЭЛ.АДРЕС">
                    <button class="test mybtn">ПОДПИШИТЕСЬ</button>
                </div>
            </form>
        </footer>
    </div>
    </form>
</body>
</html>