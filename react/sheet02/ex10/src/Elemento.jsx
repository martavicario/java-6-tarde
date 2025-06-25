function Elemento({ item, onAgregar }) {
  return (
    <li>
      {item}
      <button onClick={() => onAgregar(item)} style={{ marginLeft: '1rem' }}>
        Añadir a favoritos
      </button>
    </li>
  );
}

export default Elemento;

