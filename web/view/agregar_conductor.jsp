<%-- 
    Document   : agregar_vehiculo
    Created on : 27/10/2020, 03:56:48 PM
    Author     : JR
--%>

  <div class="card datos-pas">
        <div class="card-body">
            <h4 class="card-title">Agregar Conductor</h4>
            <p class="card-description">
                Datos del Conductor
            </p>
            <form class="forms-sample" action="registrar_conductor">
                <div class="form-group">
                    <label for="exampleInputName1">DNI</label>
                    <input type="text" class="form-control" id="exampleInputName1" placeholder="4564" name="DNI">
                </div>
                <div class="form-group">
                    <label for="exampleInputName1">Nombres</label>
                    <input type="text" class="form-control" id="exampleInputName1" placeholder="juan" name="nombre">
                </div>
                <div class="form-group">
                    <label for="exampleInputName1">Apellido</label>
                    <input type="text" class="form-control" id="exampleInputName1" placeholder="Castro" name="apellido">
                </div>
                <div class="form-group">
                    <label for="exampleInputName1">Dirección</label>
                    <input type="text" class="form-control" id="exampleInputName1" placeholder="calle 4" name="direccion">
                </div>
                <div class="form-group">
                    <label for="exampleSelectGender">Licencia</label>
                    <select class="form-control" id="exampleSelectGender" name="licencia">
                        <option>A1</option>
                        <option>A2</option>
                        <option>A3</option>
                        <option>A4</option>
                        <option>A5</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="exampleInputName1">Teléfono</label>
                    <input type="text" class="form-control" id="exampleInputName1" placeholder="458" name="telefono">
                </div>
                
               
                <button type="submit" class="btn btn-primary mr-2">Registrar Conductor</button>
                <button class="btn btn-light">Cancel</button>
            </form>
        </div>
    </div>

