<%-- 
    Document   : login
    Created on : 27/10/2020, 01:40:25 PM
    Author     : JR
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">

    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Spica Admin</title>
        <!-- base:css -->
        <link rel="stylesheet" href="./css/materialdesignicons.min.css">
        <link rel="stylesheet" href="./css/vendor.bundle.base.css">
        <!-- endinject -->
        <!-- plugin css for this page -->
        <!-- End plugin css for this page -->
        <!-- inject:css -->
        <link rel="stylesheet" href="./css/style.css">
        <!-- endinject -->
        <link rel="shortcut icon" href="./images/favicon.png" />
    </head>

    <body>
        <div class="container-scroller d-flex">
            <div class="container-fluid page-body-wrapper full-page-wrapper d-flex">
                <div class="content-wrapper d-flex align-items-center auth px-0">
                    <div class="row w-100 mx-0">
                        <div class="col-lg-4 mx-auto">
                            <div class="auth-form-light text-left py-5 px-4 px-sm-5">
                                <div class="brand-logo text-center">
                                    <img src="images/logoBus.JPG" alt="logo">
                                    <h4>Sistema de Viajes</h4>
                                </div>
                                <form class="pt-3" action="login" method="POST">
                                    <div class="form-group">
                                        <input name="email" type="email" class="form-control form-control-lg" id="exampleInputEmail1" placeholder="Email">
                                    </div>
                                    <div class="form-group">
                                        <input name="password" type="password" class="form-control form-control-lg" id="exampleInputPassword1" placeholder="Contraseña">
                                    </div>
                                    <div class="mt-3">
                                        <button class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn" type="submit">INGRESAR</button>
                                    </div>
                                    <div class="my-2 d-flex justify-content-between ">
                                        <a href="#" class="auth-link text-black">Olvidó su contraseña?</a>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- content-wrapper ends -->
            </div>
            <!-- page-body-wrapper ends -->
        </div>
        <!-- container-scroller -->
        <!-- base:js -->
        <script src="js/vendor.bundle.base.js"></script>
        <!-- endinject -->
        <!-- inject:js -->
        <script src="js/off-canvas.js"></script>
        <script src="js/hoverable-collapse.js"></script>
        <script src="js/template.js"></script>

        <!-- endinject -->
    </body>

</html>
