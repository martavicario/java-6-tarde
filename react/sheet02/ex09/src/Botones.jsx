function Botones({ onIncrementar, onDecrementar, onReiniciar }) {
  return (
    <div style={{ display: 'flex', justifyContent: 'center', gap: '1rem' }}>
      <button onClick={onDecrementar}>-</button>
      <button onClick={onReiniciar}>Reset</button>
      <button onClick={onIncrementar}>+</button>
    </div>
  );
}

export default Botones;
