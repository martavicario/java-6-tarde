import { useEffect } from "react"

export default function Saludo({ nombre, actualizaNombre }) {
    useEffect(() => {
        console.log(`El nombre ha cambiado a: ${nombre}`);
    }, )
    return (
        <>
            <p>¡Hola {nombre}!</p>
            <button onClick={() => actualizaNombre('Marta')}>Cambiar nombre a Marta</button>
        </>
    )
}