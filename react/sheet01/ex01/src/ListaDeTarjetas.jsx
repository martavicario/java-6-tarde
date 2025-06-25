import React from 'react';
import Tarjeta from './Tarjeta';


const ListaDeTarjetas = () => {
  return (
    <div className="lista-tarjetas">
      <Tarjeta nombre="Juan" apellido="Pérez" ocupacion="Desarrollador" imagenURL="imagen.jpg" />
      <Tarjeta nombre="Ana" apellido="Gómez" ocupacion="Diseñadora" imagenURL="imagen.jpg" />
      <Tarjeta nombre="Carlos" apellido="López" ocupacion="Ingeniero" imagenURL="imagen.jpg" />
    </div>
  );
};

export default ListaDeTarjetas;
