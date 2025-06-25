function Enlace({ texto, url }) {
  return (
    <li className="menu__item">
      <a href={url} className="menu__link">{texto}</a>
    </li>
  );
}

export default Enlace;
