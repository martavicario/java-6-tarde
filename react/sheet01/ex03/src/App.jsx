import Menu from './Menu';

function App() {
  const enlaces = [
    { texto: 'Inicio', url: '/' },
    { texto: 'Servicios', url: '/servicios' },
    { texto: 'Contacto', url: '/contacto' }
  ];

  return (
    <div>
      <h1>Mi Sitio</h1>
      <Menu enlaces={enlaces} />
    </div>
  );
}

export default App;
