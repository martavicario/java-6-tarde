import { useState } from 'react';
import Elemento from './Elemento';

function App() {
  const lista = ['Interestelar', 'Inception', 'Matrix', 'La La Land'];
  const [favoritos, setFavoritos] = useState([]);

  const agregarAFavoritos = (item) => {
    if (!favoritos.includes(item)) {
      setFavoritos([...favoritos, item]);
    }
  };

  return (
    <div style={{ padding: '2rem' }}>
      <h2>Películas</h2>
      <ul>
        {lista.map((pelicula, index) => (
          <Elemento key={index} item={pelicula} onAgregar={agregarAFavoritos} />
        ))}
      </ul>

      <h3>Favoritos</h3>
      <ul>
        {favoritos.map((fav, index) => (
          <li key={index}>{fav}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;
