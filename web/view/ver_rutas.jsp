<%-- 
    Document   : ver_rutas
    Created on : 27/10/2020, 05:46:00 PM
    Author     : JR
--%>
<div class="row">
    <div class="col-lg-12 grid-margin stretch-card">
        <div class="card">
            <div class="card-body">
                <h4 class="card-title">Lista de Rutas</h4>
                <div class="table-responsive">
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th>
                                    id
                                </th>
                                <th>
                                   Ciudad Origen
                                </th>
                                <th>
                                    Cciudad Destino
                                </th>
                                <th>
                                    Tiempo llegada
                                </th>
                                <th>
                                    Campus
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