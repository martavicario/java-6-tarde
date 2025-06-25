function Producto({ nombre, precio, descripcion }) {
  const estilo = {
    border: '1px solid #ccc',
    padding: '1rem',
    marginBottom: '1rem',
    borderRadius: '8px',
    backgroundColor: '#f9f9f9'
  };

  return (
    <div style={estilo}>
      <h2>{nombre}</h2>
      <p><strong>Precio:</strong> ${precio}</p>
      <p>{descripcion}</p>
    </div>
  );
}

export default Producto;
