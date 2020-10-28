<%-- 
    Document   : ver_viajes
    Created on : 27/10/2020, 05:46:47 PM
    Author     : JR
--%>
<div class="row">
    <div class="col-lg-12 grid-margin stretch-card">
        <div class="card">
            <div class="card-body">
                <h4 class="card-title">Lista Viajes</h4>
                <div class="table-responsive">
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th>
                                    ID
                                </th>
                                <th>
                                    Ruta
                                </th>
                                <th>
                                    Conductor
                                </th>
                                <th>
                                    Vehículo
                                </th>
                                <th>
                                    Hora salida
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
