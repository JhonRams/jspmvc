<%-- 
    Document   : ver_vehiculos
    Created on : 27/10/2020, 03:56:15 PM
    Author     : JR
--%>
<div class="row">
    <div class="col-lg-12 grid-margin stretch-card">
        <div class="card">
            <div class="card-body">
                <h4 class="card-title">Lista de Conductores</h4>
                <div class="table-responsive">
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th>
                                    DNI
                                </th>
                                <th>
                                    Nombres
                                </th>
                                <th>
                                    Apellidos
                                </th>
                                <th>
                                    Direccion
                                </th>
                                <th>
                                    Licencia
                                </th>
                                <th>
                                    Telefono
                                </th>
                            </tr>
                        </thead>
                        <tbody>
                            ${table_body}
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
