<%-- 
    Document   : travel
    Created on : 27/10/2020, 02:11:16 PM
    Author     : JR
--%>
<div class="ventana"><a href="sales">Cerrar</a><div><br>
        <div class="card">
            <div class="card-body">
                <h4 class="card-title">Ingresar nuevo pasajero</h4>
                <form class="forms-sample" action="ticket" method="POST">
                    <div class="bus-sit">
                        <div>
                            <div>1 <input type="radio" name="bus" value="1"></div> 
                            <div>2 <input type="radio" name="bus" value="2"></div>
                            <br>
                            <div>3 <input type="radio" name="bus" value="3"></div> 
                            <div>4 <input type="radio" name="bus" value="4"></div> 
                        </div>
                        <div>
                            <div>5 <input type="radio" name="bus" value="5"></div> 
                            <div>6 <input type="radio" name="bus" value="6"></div>
                            <br>
                            <div>7 <input type="radio" name="bus" value="7"></div> 
                            <div>8 <input type="radio" name="bus" value="8"></div> 
                        </div>
                        <div>
                            <div>9 <input type="radio" name="bus" value="9"></div> 
                            <div>10 <input type="radio" name="bus" value="10"></div>
                            <br>
                            <div>11 <input type="radio" name="bus" value="11"></div> 
                            <div>12 <input type="radio" name="bus" value="12"></div> 
                        </div>
                        <div>
                            <div>13 <input type="radio" name="bus" value="13"></div> 
                            <div>14 <input type="radio" name="bus" value="14"></div>
                            <br>
                            <div>15 <input type="radio" name="bus" value="15"></div> 
                            <div>16 <input type="radio" name="bus" value="16"></div> 
                        </div>
                        <div>
                            <div>17 <input type="radio" name="bus" value="17"></div> 
                            <div>18 <input type="radio" name="bus" value="18"></div>
                            <br>
                            <div>19 <input type="radio" name="bus" value="19"></div> 
                            <div>20 <input type="radio" name="bus" value="20"></div> 
                        </div>
                        <div>
                            <div>21 <input type="radio" name="bus" value="21"></div> 
                            <div>22 <input type="radio" name="bus" value="22"></div>
                            <br>
                            <div>23 <input type="radio" name="bus" value="23"></div> 
                            <div>24 <input type="radio" name="bus" value="24"></div> 
                        </div>
                        <div>
                            <div>25 <input type="radio" name="bus" value="25"></div> 
                            <div>26 <input type="radio" name="bus" value="26"></div>
                            <br>
                            <div>27 <input type="radio" name="bus" value="27"></div> 
                            <div>28 <input type="radio" name="bus" value="28"></div> 
                        </div>
                        <div>
                            <div>29 <input type="radio" name="bus" value="29"></div> 
                            <div>30 <input type="radio" name="bus" value="30"></div>
                            <br>
                            <div>31 <input type="radio" name="bus" value="31"></div> 
                            <div>32 <input type="radio" name="bus" value="32"></div> 
                        </div>
                        <div>
                            <div>33 <input type="radio" name="bus" value="33"></div> 
                            <div>34 <input type="radio" name="bus" value="34"></div>
                            <br>
                            <div>35 <input type="radio" name="bus" value="35"></div> 
                            <div>36 <input type="radio" name="bus" value="36"></div> 
                        </div>
                        <div>
                            <div>37 <input type="radio" name="bus" value="37"></div> 
                            <div>28 <input type="radio" name="bus" value="38"></div>
                            <br>
                            <div>39 <input type="radio" name="bus" value="39"></div> 
                            <div>40 <input type="radio" name="bus" value="40"></div> 
                        </div>
                        <div>
                            <div>41 <input type="radio" name="bus" value="41"></div> 
                            <div>42 <input type="radio" name="bus" value="42"></div>
                            <br>
                            <div>43 <input type="radio" name="bus" value="43"></div> 
                            <div>44 <input type="radio" name="bus" value="44"></div> 
                        </div>
                        <div>
                            <div>45 <input type="radio" name="bus" value="45"></div> 
                            <div>46 <input type="radio" name="bus" value="46"></div>
                            <br>
                            <div>47 <input type="radio" name="bus" value="47"></div> 
                            <div>48 <input type="radio" name="bus" value="48"></div> 
                        </div>
                    </div><br>
                    <div class="datos-pas">
                        <p class="card-descriptio">
                            Ingrese datos del pasajero
                        </p>
                        <div class="form-group">
                            <label for="exampleInputUsername1">DNI</label>
                            <input type="text" class="form-control" id="exampleInputUsername1" placeholder="DNI" name="DNI">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputUsername1">Nombre</label>
                            <input type="text" class="form-control" id="exampleInputUsername1" placeholder="Nombre" name="nombre">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputUsername1">Apellidos</label>
                            <input type="text" class="form-control" id="exampleInputUsername1" placeholder="Apellido" name="apellido">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputUsername1">Fecha Nacimiento</label>
                            <input type="date" class="form-control" id="exampleInputUsername1"  name="fechaNa">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputEmail1">Número de Emergencia</label>
                            <input type="text" class="form-control" id="exampleInputEmail1" placeholder="9755454" name="telefono">
                        </div>
                        <input type="hidden" name="travel" value="${travel}">
                        <input type="hidden" name="cost" value="${cost}">
                        <input type="hidden" name="campus" value="${campus}">
                        <input type="hidden" name="date_travel" value="${date_t}">
                        <button type="submit" class="btn btn-primary mr-2">Registrar</button>
                        <button class="btn btn-light">Cancelar</button>
                    </div>
                </form>
            </div>
        </div> </div> </div>