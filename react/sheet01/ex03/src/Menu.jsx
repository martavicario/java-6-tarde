import Enlace from './Enlace';
import styles from './Menu.module.css';

function Menu({ enlaces }) {
  return (
    <nav className={styles.menu}>
      <ul className={styles.menu__list}>
        {enlaces.map((enlace, index) => (
          <Enlace key={index} texto={enlace.texto} url={enlace.url} />
        ))}
      </ul>
    </nav>
  );
}

export default Menu;
