import { useState } from 'react';

function App() {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [errores, setErrores] = useState({});
  const [mensaje, setMensaje] = useState('');

  const validar = () => {
    const errores = {};

    if (!email.includes('@') || !email.includes('.')) {
      errores.email = 'Ingresa un email válido.';
    }

    if (password.length < 6) {
      errores.password = 'La contraseña debe tener al menos 6 caracteres.';
    }

    return errores;
  };

  const manejarEnvio = (e) => {
    e.preventDefault();
    const erroresValidados = validar();

    if (Object.keys(erroresValidados).length > 0) {
      setErrores(erroresValidados);
      setMensaje('');
    } else {
      setErrores({});
      setMensaje('Inicio de sesión exitoso 🎉');
      // Aquí podrías enviar datos o limpiar campos
    }
  };

  return (
    <div style={{ padding: '2rem', maxWidth: '400px', margin: 'auto' }}>
      <h2>Iniciar Sesión</h2>
      <form onSubmit={manejarEnvio}>
        <div>
          <label>Email:</label>
          <input
            type="text"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          />
          {errores.email && <p style={{ color: 'red' }}>{errores.email}</p>}
        </div>

        <div>
          <label>Contraseña:</label>
          <input
            type="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
          />
          {errores.password && <p style={{ color: 'red' }}>{errores.password}</p>}
        </div>

        <button type="submit" style={{ marginTop: '1rem' }}>
          Enviar
        </button>
      </form>

      {mensaje && <p style={{ color: 'green' }}>{mensaje}</p>}
    </div>
  );
}

export default App;
