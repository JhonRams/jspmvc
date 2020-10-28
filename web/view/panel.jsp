
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%
    DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
    Calendar hoy = Calendar.getInstance();
    Date hoydia = hoy.getTime();
%>
<html lang="en">

    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Panel de Viajes</title>
        <!-- base:css -->
        <link rel="stylesheet" href="./css/materialdesignicons.min.css">
        <link rel="stylesheet" href="./css/vendor.bundle.base.css">
        <!-- endinject -->
        <!-- plugin css for this page -->
        <!-- End plugin css for this page -->
        <!-- inject:css -->
        <link rel="stylesheet" href="./css/style.css">
        <link rel="stylesheet" href="./css/estilos.css">
        <!-- endinject -->
        <link rel="shortcut icon" href="./images/favicon.png" />
    </head>
    <body>
        <div class="container-scroller d-flex">
            <!-- partial:./partials/_sidebar.html -->
            <nav class="sidebar sidebar-offcanvas" id="sidebar">
                <ul class="nav">
                    <li class="nav-item sidebar-category">
                        <p>Navegacion</p>
                        <span></span>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="sales">
                            <i class="mdi mdi-view-quilt menu-icon"></i>
                            <span class="menu-title">Salidas</span>
                            <div class="badge badge-info badge-pill">2</div>
                        </a>
                    </li>
                    <li class="nav-item sidebar-category">
                        <p>Administracion</p>
                        <span></span>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" data-toggle="collapse" href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
                            <i class="mdi mdi-palette menu-icon"></i>
                            <span class="menu-title">Vehículos</span>
                            <i class="menu-arrow"></i>
                        </a>
                        <div class="collapse" id="ui-basic">
                            <ul class="nav flex-column sub-menu">
                                <li class="nav-item"> <a class="nav-link" href="ver_vehiculos">Ver Vehículos</a></li>
                                <li class="nav-item"> <a class="nav-link" href="agregar_vehiculo">Agregar Vehículo</a></li>
                            </ul>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" data-toggle="collapse" href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
                            <i class="mdi mdi-palette menu-icon"></i>
                            <span class="menu-title">Conductores</span>
                            <i class="menu-arrow"></i>
                        </a>
                        <div class="collapse" id="ui-basic">
                            <ul class="nav flex-column sub-menu">
                                <li class="nav-item"> <a class="nav-link" href="ver_conductores">Ver Conductores</a></li>
                                <li class="nav-item"> <a class="nav-link" href="agregar_conductor">Agregar Conductor</a></li>
                            </ul>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" data-toggle="collapse" href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
                            <i class="mdi mdi-palette menu-icon"></i>
                            <span class="menu-title">Viajes</span>
                            <i class="menu-arrow"></i>
                        </a>
                        <div class="collapse" id="ui-basic">
                            <ul class="nav flex-column sub-menu">
                                <li class="nav-item"> <a class="nav-link" href="ver_viajes">Ver Viajes</a></li>
                                <li class="nav-item"> <a class="nav-link" href="agregar_viaje">Agregar Viaje</a></li>
                            </ul>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" data-toggle="collapse" href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
                            <i class="mdi mdi-palette menu-icon"></i>
                            <span class="menu-title">Rutas</span>
                            <i class="menu-arrow"></i>
                        </a>
                        <div class="collapse" id="ui-basic">
                            <ul class="nav flex-column sub-menu">
                                <li class="nav-item"> <a class="nav-link" href="ver_rutas">Ver Rutas</a></li>
                                <li class="nav-item"> <a class="nav-link" href="agregar_ruta">Agregar Ruta</a></li>
                            </ul>
                        </div>
                    </li>
                   
                   

                </ul>
            </nav>
            <!-- partial -->
            <div class="container-fluid page-body-wrapper">
                <!-- partial:./partials/_navbar.html -->
                <nav class="navbar col-lg-12 col-12 px-0 py-0 py-lg-4 d-flex flex-row">
                    <div class="navbar-menu-wrapper d-flex align-items-center justify-content-end">
                        <button class="navbar-toggler navbar-toggler align-self-center" type="button" data-toggle="minimize">
                            <span class="mdi mdi-menu"></span>
                        </button>
                        <div class="navbar-brand-wrapper">
                            <a class="navbar-brand brand-logo" href="index.html"><img src="images/logo.svg" alt="logo"/></a>
                            <a class="navbar-brand brand-logo-mini" href="index.html"><img src="images/logo-mini.svg" alt="logo"/></a>
                        </div>
                        <h4 class="font-weight-bold mb-0 d-none d-md-block mt-1">Bienvenido , ${sessionScope.name} ${sessionScope.last_name}</h4>
                        <ul class="navbar-nav navbar-nav-right">
                            <li class="nav-item">
                                <h4 class="mb-0 font-weight-bold d-none d-xl-block"><%=dateFormat.format(hoydia)%></h4>
                            </li>
                            <li class="nav-item dropdown mr-1">
                                <a class="nav-link count-indicator dropdown-toggle d-flex justify-content-center align-items-center" id="messageDropdown" href="#" data-toggle="dropdown">
                                    <i class="mdi mdi-calendar mx-0"></i>
                                    <span class="count bg-info">2</span>
                                </a>
                                <div class="dropdown-menu dropdown-menu-right navbar-dropdown preview-list" aria-labelledby="messageDropdown">
                                    <p class="mb-0 font-weight-normal float-left dropdown-header">Messages</p>
                                    <a class="dropdown-item preview-item">
                                        <div class="preview-thumbnail">
                                            <img src="images/faces/face4.jpg" alt="image" class="profile-pic">
                                        </div>
                                        <div class="preview-item-content flex-grow">
                                            <h6 class="preview-subject ellipsis font-weight-normal">David Grey
                                            </h6>
                                            <p class="font-weight-light small-text text-muted mb-0">
                                                The meeting is cancelled
                                            </p>
                                        </div>
                                    </a>
                                    <a class="dropdown-item preview-item">
                                        <div class="preview-thumbnail">
                                            <img src="images/faces/face2.jpg" alt="image" class="profile-pic">
                                        </div>
                                        <div class="preview-item-content flex-grow">
                                            <h6 class="preview-subject ellipsis font-weight-normal">Tim Cook
                                            </h6>
                                            <p class="font-weight-light small-text text-muted mb-0">
                                                New product launch
                                            </p>
                                        </div>
                                    </a>
                                    <a class="dropdown-item preview-item">
                                        <div class="preview-thumbnail">
                                            <img src="images/faces/face3.jpg" alt="image" class="profile-pic">
                                        </div>
                                        <div class="preview-item-content flex-grow">
                                            <h6 class="preview-subject ellipsis font-weight-normal"> Johnson
                                            </h6>
                                            <p class="font-weight-light small-text text-muted mb-0">
                                                Upcoming board meeting
                                            </p>
                                        </div>
                                    </a>
                                </div>
                            </li>
                            <li class="nav-item dropdown mr-2">
                                <a class="nav-link count-indicator dropdown-toggle d-flex align-items-center justify-content-center" id="notificationDropdown" href="#" data-toggle="dropdown">
                                    <i class="mdi mdi-email-open mx-0"></i>
                                    <span class="count bg-danger">1</span>
                                </a>
                                <div class="dropdown-menu dropdown-menu-right navbar-dropdown preview-list" aria-labelledby="notificationDropdown">
                                    <p class="mb-0 font-weight-normal float-left dropdown-header">Notifications</p>
                                    <a class="dropdown-item preview-item">
                                        <div class="preview-thumbnail">
                                            <div class="preview-icon bg-success">
                                                <i class="mdi mdi-information mx-0"></i>
                                            </div>
                                        </div>
                                        <div class="preview-item-content">
                                            <h6 class="preview-subject font-weight-normal">Application Error</h6>
                                            <p class="font-weight-light small-text mb-0 text-muted">
                                                Just now
                                            </p>
                                        </div>
                                    </a>
                                    <a class="dropdown-item preview-item">
                                        <div class="preview-thumbnail">
                                            <div class="preview-icon bg-warning">
                                                <i class="mdi mdi-settings mx-0"></i>
                                            </div>
                                        </div>
                                        <div class="preview-item-content">
                                            <h6 class="preview-subject font-weight-normal">Settings</h6>
                                            <p class="font-weight-light small-text mb-0 text-muted">
                                                Private message
                                            </p>
                                        </div>
                                    </a>
                                    <a class="dropdown-item preview-item">
                                        <div class="preview-thumbnail">
                                            <div class="preview-icon bg-info">
                                                <i class="mdi mdi-account-box mx-0"></i>
                                            </div>
                                        </div>
                                        <div class="preview-item-content">
                                            <h6 class="preview-subject font-weight-normal">New user registration</h6>
                                            <p class="font-weight-light small-text mb-0 text-muted">
                                                2 days ago
                                            </p>
                                        </div>
                                    </a>
                                </div>
                            </li>
                        </ul>
                        <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button" data-toggle="offcanvas">
                            <span class="mdi mdi-menu"></span>
                        </button>
                    </div>
                    <div class="navbar-menu-wrapper navbar-search-wrapper d-none d-lg-flex align-items-center">
                        <ul class="navbar-nav mr-lg-2">
                            <li class="nav-item nav-search d-none d-lg-block">
                                <div class="input-group">
                                    <input type="text" class="form-control" placeholder="Buscar aqui..." aria-label="search" aria-describedby="search">
                                </div>
                            </li>
                        </ul>
                        <ul class="navbar-nav navbar-nav-right">
                            <li class="nav-item nav-profile dropdown">
                                <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" id="profileDropdown">
                                    <img src="${sessionScope.photo}" alt="profile"/>
                                    <span class="nav-profile-name">${sessionScope.name} ${sessionScope.last_name}</span>
                                </a>
                                <div class="dropdown-menu dropdown-menu-right navbar-dropdown" aria-labelledby="profileDropdown">
                                    <a class="dropdown-item">
                                        <i class="mdi mdi-settings text-primary"></i>
                                        Configurar
                                    </a>
                                    <a class="dropdown-item" href="login?logout=true">
                                        <i class="mdi mdi-logout text-primary"></i>
                                        Cerrar Sesión
                                    </a>
                                </div>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link icon-link">
                                    <i class="mdi mdi-plus-circle-outline"></i>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link icon-link">
                                    <i class="mdi mdi-web"></i>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link icon-link">
                                    <i class="mdi mdi-clock-outline"></i>
                                </a>
                            </li>
                        </ul>
                    </div>
                </nav>
                <!-- partial -->
                <div class="main-panel">
                    <div class="content-wrapper">
                        <%
                            String url = request.getAttribute("javax.servlet.forward.request_uri").toString();
                            String pgn[] = url.split("/");
                            switch (pgn[2]) {
                                case "sales":%><%@include file="sales.jsp" %><%break;
                                case "travel":%><%@include file="travel.jsp" %><%break;
                                case "ver_vehiculos":%><%@include file="ver_vehiculos.jsp" %><%break;
                                case "agregar_vehiculo":%><%@include file="agregar_vehiculo.jsp" %><%break;
                                case "ver_conductores":%><%@include file="ver_conductores.jsp" %><%break;
                                case "agregar_conductor":%><%@include file="agregar_conductor.jsp" %><%break;
                                case "ver_rutas":%><%@include file="ver_rutas.jsp" %><%break;
                                case "agregar_ruta":%><%@include file="agregar_ruta.jsp" %><%break;
                                case "ver_viajes":%><%@include file="ver_viajes.jsp" %><%break;
                                case "agregar_viaje":%><%@include file="agregar_viaje.jsp" %><%break;
                                    }
                        %>

                    </div>
                    <!-- content-wrapper ends -->
                    <!-- partial:./partials/_footer.html -->
                    <footer class="footer">
                        <div class="card">
                            <div class="card-body">
                                <div class="d-sm-flex justify-content-center justify-content-sm-between py-2">
                                    <p class="text-center text-sm-left d-block d-sm-inline-block mb-0">Copyright © 2019 <a href="https://www.bootstrapdash.com/" target="_blank">Bootstrapdash</a>. All rights reserved.</p>
                                    <p class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center mb-0">Hand-crafted & made with <i class="mdi mdi-heart-outline text-muted icon-sm"></i></p>
                                </div>
                            </div>
                        </div>
                    </footer>
                    <!-- partial -->
                </div>
                <!-- main-panel ends -->
            </div>
            <!-- page-body-wrapper ends -->
        </div>
        <!-- container-scroller -->

        <!-- base:js -->
        <script src="./js/vendor.bundle.base.js"></script>
        <!-- endinject -->
        <!-- Plugin js for this page-->
        <script src="./js/Chart.min.js"></script>
        <!-- End plugin js for this page-->
        <!-- inject:js -->
        <script src="./js/off-canvas.js"></script>
        <script src="./js/hoverable-collapse.js"></script>
        <script src="./js/template.js"></script>
        <!-- endinject -->
        <!-- plugin js for this page -->
        <!-- End plugin js for this page -->
        <!-- Custom js for this page-->
        <script src="./js/dashboard.js"></script>
        <!-- End custom js for this page-->
    </body>

</html>

