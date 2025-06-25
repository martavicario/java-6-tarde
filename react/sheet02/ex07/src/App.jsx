import { useEffect, useState } from 'react';

function App() {
  const [posicionScroll, setPosicionScroll] = useState(0);

  useEffect(() => {
    const manejarScroll = () => {
      setPosicionScroll(window.scrollY);
    };

    window.addEventListener('scroll', manejarScroll);

    // Limpieza del efecto al desmontar el componente
    return () => {
      window.removeEventListener('scroll', manejarScroll);
    };
  }, []);

  return (
    <div style={{ padding: '2rem' }}>
      <h2>Scroll Vertical: {Math.round(posicionScroll)} px</h2>

      {/* Contenido largo para permitir scroll */}
      <div style={{ height: '2000px', background: 'linear-gradient(white, lightgray)' }} />
    </div>
  );
}

export default App;
