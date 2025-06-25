import { useState } from 'react';

function App() {
  const [tarea, setTarea] = useState('');
  const [lista, setLista] = useState([]);

  const agregarTarea = () => {
    if (tarea.trim() === '') return;
    setLista([...lista, tarea]);
    setTarea('');
  };

  const eliminarTarea = (index) => {
    const nuevaLista = lista.filter((_, i) => i !== index);
    setLista(nuevaLista);
  };

  return (
    <div style={{ padding: '2rem', maxWidth: '400px', margin: 'auto' }}>
      <h2>To-Do List</h2>
      <div style={{ display: 'flex', gap: '0.5rem' }}>
        <input
          type="text"
          value={tarea}
          onChange={(e) => setTarea(e.target.value)}
          placeholder="Nueva tarea"
        />
        <button onClick={agregarTarea}>Agregar</button>
      </div>

      <ul style={{ marginTop: '1rem' }}>
        {lista.map((t, index) => (
          <li key={index}>
            {t}
            <button
              onClick={() => eliminarTarea(index)}
              style={{ marginLeft: '1rem' }}
            >
              Eliminar
            </button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
