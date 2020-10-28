<%-- 
    Document   : agregar_vehiculo
    Created on : 27/10/2020, 03:56:48 PM
    Author     : JR
--%>

    <div class="card datos-pas">
        <div class="card-body">
            <h4 class="card-title">Agregar Vehículo</h4>
            <p class="card-description">
                Datos del Vehículo
            </p>
            <form class="forms-sample" action="registrar_vehiculo">
                <div class="form-group">
                    <label for="exampleInputName1">Palca</label>
                    <input type="text" class="form-control" id="exampleInputName1" placeholder="placa" name="placa">
                </div>
                <div class="form-group">
                    <label for="exampleSelectGender">Numero de acientos</label>
                    <select class="form-control" id="exampleSelectGender" name="acientos">
                        <option>12</option>
                        <option>24</option>
                        <option>36</option>
                        <option>60</option>
                        <option>48</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="exampleSelectGender">Clase del vehiculo</label>
                    <select class="form-control" id="exampleSelectGender" name="clase">
                        <option>bus</option>
                        <option>bus cama</option>
                        <option>Minivan</option>
                        <option>Combi</option>
                       
                    </select>
                </div>
               
                <div class="form-group">
                    <label for="exampleSelectGender">Servicios</label>
                    <select class="form-control" id="exampleSelectGender" name="servicio">
                        <option>S</option>
                        <option>N</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="exampleSelectGender">niveles</label>
                    <select class="form-control" id="exampleSelectGender" name="nivel">
                        <option>1</option>
                        <option>2</option>
                    </select>
                </div>
               
                <button type="submit" class="btn btn-primary mr-2">Agregar Vehiculos</button>
                <button class="btn btn-light">Cancel</button>
            </form>
        </div>
    </div>
