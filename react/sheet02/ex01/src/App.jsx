import { useState } from 'react';

function App() {
  const [contador, setContador] = useState(0);

  const incrementar = () => setContador(contador + 1);
  const decrementar = () => setContador(contador - 1);
  const resetear = () => setContador(0);

  return (
    <div style={{ textAlign: 'center', marginTop: '2rem' }}>
      <h1>Contador: {contador}</h1>
      <div style={{ display: 'flex', justifyContent: 'center', gap: '1rem' }}>
        <button onClick={decrementar}>-</button>
        <button onClick={resetear}>Reset</button>
        <button onClick={incrementar}>+</button>
      </div>
    </div>
  );
}

export default App;
