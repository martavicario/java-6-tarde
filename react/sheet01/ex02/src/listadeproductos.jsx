import Producto from './productos';

function ListaDeProductos({ productos }) {
  return (
    <div>
      {productos.map((item, index) => (
        <Producto
          key={index}
          nombre={item.nombre}
          precio={item.precio}
          descripcion={item.descripcion}
        />
      ))}
    </div>
  );
}

export default ListaDeProductos;
