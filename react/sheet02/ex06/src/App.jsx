import { useEffect, useState } from 'react';

function App() {
  const [usuarios, setUsuarios] = useState([]);
  const [cargando, setCargando] = useState(true);

  useEffect(() => {
    fetch('https://jsonplaceholder.typicode.com/users')
      .then(res => res.json())
      .then(data => {
        setUsuarios(data);
        setCargando(false);
      })
      .catch(error => {
        console.error('Error al cargar los usuarios:', error);
        setCargando(false);
      });
  }, []);

  return (
    <div style={{ padding: '2rem' }}>
      <h2>Lista de Usuarios</h2>
      {cargando ? (
        <p>Cargando...</p>
      ) : (
        <ul>
          {usuarios.map(user => (
            <li key={user.id}>
              {user.name} - {user.email}
            </li>
          ))}
        </ul>
      )}
    </div>
  );
}

export default App;
