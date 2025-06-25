import { useEffect, useState } from 'react';
import './App.css'; // donde estarán las clases .claro y .oscuro

function App() {
  const [tema, setTema] = useState('claro');

  const alternarTema = () => {
    setTema(prev => (prev === 'claro' ? 'oscuro' : 'claro'));
  };

  useEffect(() => {
    document.body.className = tema;
  }, [tema]);

  return (
    <div style={{ padding: '2rem' }}>
      <h2>Tema actual: {tema}</h2>
      <button onClick={alternarTema}>
        Cambiar a {tema === 'claro' ? 'oscuro' : 'claro'}
      </button>
    </div>
  );
}

export default App;
