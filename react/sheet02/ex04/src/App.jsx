import { useState } from 'react';
import './App.css';

function App() {
  const [color, setColor] = useState('rojo');

  const siguiente = () => {
    if (color === 'rojo') setColor('amarillo');
    else if (color === 'amarillo') setColor('verde');
    else setColor('rojo');
  };

  return (
    <div className="contenedor">
      <div className={`luz rojo ${color === 'rojo' ? 'activo' : ''}`}></div>
      <div className={`luz amarillo ${color === 'amarillo' ? 'activo' : ''}`}></div>
      <div className={`luz verde ${color === 'verde' ? 'activo' : ''}`}></div>
      <button onClick={siguiente}>Siguiente</button>
    </div>
  );
}

export default App;
