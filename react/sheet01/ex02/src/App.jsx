import ListaDeProductos from './listadeproductos';

function App() {
  const productos = [
    { nombre: 'Camisa', precio: 25, descripcion: 'Camisa de algodón, color azul.' },
    { nombre: 'Pantalón', precio: 40, descripcion: 'Pantalón de mezclilla, talla 32.' },
    { nombre: 'Zapatos', precio: 60, descripcion: 'Zapatos de cuero, talla 42.' }
  ];

  return (
    <div style={{ padding: '2rem' }}>
      <h1>Lista de Productos</h1>
      <ListaDeProductos productos={productos} />
    </div>
  );
}

export default App;
