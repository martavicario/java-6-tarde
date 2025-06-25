import React from 'react';
import './Tarjeta.css';

const Tarjeta = ({ nombre, apellido, ocupacion, imagenURL }) => {
  return (
    <div className="tarjeta">
      {nombre} 
      {apellido} 
      {ocupacion} 
      {imagenURL}
    </div>
  );
};

export default Tarjeta;

