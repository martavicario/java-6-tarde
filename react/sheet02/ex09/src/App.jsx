import { useState } from 'react';
import Botones from './Botones';

function App() {
  const [contador, setContador] = useState(0);

  const incrementar = () => setContador(contador + 1);
  const decrementar = () => setContador(contador - 1);
  const reiniciar = () => setContador(0);

  return (
    <div style={{ textAlign: 'center', marginTop: '2rem' }}>
      <h2>Contador: {contador}</h2>
      <Botones
        onIncrementar={incrementar}
        onDecrementar={decrementar}
        onReiniciar={reiniciar}
      />
    </div>
  );
}

export default App;
