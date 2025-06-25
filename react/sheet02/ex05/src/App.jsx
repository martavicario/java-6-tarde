import { useEffect, useState } from 'react';

function App() {
  const [hora, setHora] = useState(new Date());

  useEffect(() => {
    const intervalo = setInterval(() => {
      setHora(new Date());
    }, 1000);

    // Limpieza del intervalo al desmontar el componente
    return () => clearInterval(intervalo);
  }, []);

  const formatoHora = hora.toLocaleTimeString();

  return (
    <div style={{ textAlign: 'center', marginTop: '4rem', fontSize: '2rem' }}>
      <h2>Reloj Digital</h2>
      <p>{formatoHora}</p>
    </div>
  );
}

export default App;
