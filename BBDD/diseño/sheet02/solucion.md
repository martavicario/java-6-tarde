EJERCICIO 1:
CLIENTE(cod_cliente PK, nombre, calle, portal, piso)
PRODUCTO(cod_producto PK, precio, cod_depart FK)
COMPRA(cod_cliente FK, cod_producto FK, PRIMARY KEY (cod_cliente, cod_producto))
EMPLEADO(numero PK, nombre, cod_depart FK)
DEPARTAMENTO(cod_depart PK, nombre)
TELEFONO (cod_cliente PK, telefono PK)

CREATE TABLE DEPARTAMENTO (
  cod_depart INT PRIMARY KEY,
  nombre VARCHAR(100)
);

CREATE TABLE EMPLEADO (
  numero INT PRIMARY KEY,
  nombre VARCHAR(100),
  telefono VARCHAR(20),
  cod_depart INT,
  FOREIGN KEY (cod_depart) REFERENCES DEPARTAMENTO(cod_depart)
);

CREATE TABLE COMPRA (
  cod_cliente INT,
  cod_producto INT,
  PRIMARY KEY (cod_cliente, cod_producto),
  FOREIGN KEY (cod_cliente) REFERENCES CLIENTE(cod_cliente),
  FOREIGN KEY (cod_producto) REFERENCES PRODUCTO(cod_producto)
);

CREATE TABLE PRODUCTO (
  cod_producto INT PRIMARY KEY,
  precio VARCHAR(10)
  cod_depart INT,
  FOREIGN KEY (cod_depart) REFERENCES DEPARTAMENTO(cod_depart)
);

CREATE TABLE CLIENTE (
  cod_cliente INT PRIMARY KEY,
  nombre VARCHAR(100),
  calle VARCHAR(100),
  portal VARCHAR(100),
  piso VARCHAR(100),
);

EJERCICIO 2:
ESTUDIANTE(idEstudiante PK, nombre, apellido, fechaNacimiento)
ASIGNATURA(idAsignatura PK, nombre)
PROFESOR(idProfesor PK, nombre, apellido)
CLASE(idClase PK, fecha, hora, idProfesor FK, idAsignatura FK)
ESTUDIANTE_ASIGNATURA(idEstudiante FK, idAsignatura FK, PRIMARY KEY(idEstudiante, idAsignatura))
ASISTENCIA(idEstudiante FK, idClase FK, PRIMARY KEY(idEstudiante, idClase))
PROFESOR_ASIGNATURA(idProfesor FK, idAsignatura FK, PRIMARY KEY(idProfesor, idAsignatura))

CREATE TABLE ESTUDIANTE (
  idEstudiante INT PRIMARY KEY,
  nombre VARCHAR(100),
  apellido VARCHAR(100),
  fechaNacimiento DATE
);

CREATE TABLE ASIGNATURA (
  idAsignatura INT PRIMARY KEY,
  nombre VARCHAR(100)
);

CREATE TABLE PROFESOR (
  idProfesor INT PRIMARY KEY,
  nombre VARCHAR(100),
  apellido VARCHAR(100)
);

CREATE TABLE CLASE (
  idClase INT PRIMARY KEY,
  fecha DATE,
  hora TIME,
  idProfesor INT,
  idAsignatura INT,
  FOREIGN KEY (idProfesor) REFERENCES PROFESOR(idProfesor),
  FOREIGN KEY (idAsignatura) REFERENCES ASIGNATURA(idAsignatura)
);

CREATE TABLE ESTUDIANTE_ASIGNATURA (
  idEstudiante INT,
  idAsignatura INT,
  PRIMARY KEY (idEstudiante, idAsignatura),
  FOREIGN KEY (idEstudiante) REFERENCES ESTUDIANTE(idEstudiante),
  FOREIGN KEY (idAsignatura) REFERENCES ASIGNATURA(idAsignatura)
);

CREATE TABLE ASISTENCIA (
  idEstudiante INT,
  idClase INT,
  PRIMARY KEY (idEstudiante, idClase),
  FOREIGN KEY (idEstudiante) REFERENCES ESTUDIANTE(idEstudiante),
  FOREIGN KEY (idClase) REFERENCES CLASE(idClase)
);

CREATE TABLE PROFESOR_ASIGNATURA (
  idProfesor INT,
  idAsignatura INT,
  PRIMARY KEY (idProfesor, idAsignatura),
  FOREIGN KEY (idProfesor) REFERENCES PROFESOR(idProfesor),
  FOREIGN KEY (idAsignatura) REFERENCES ASIGNATURA(idAsignatura)
);

EJERCICIO 3:
DEPARTAMENTO(cod_depto PK, nombre_depto)
EMPLEADO(num_matricula PK, nombre, dirección, cod_depto FK)
TÉCNICO(num_matricula PK FK, nivel)
ADMINISTRATIVO(num_matricula PK FK)
PROYECTO(cod_proyecto PK, nombre_proyecto, cliente, fecha_inicio, fecha_fin)
TRABAJA_EN(num_matricula FK, cod_proyecto FK, fecha_asignacion, fecha_cese, PRIMARY KEY (num_matricula, cod_proyecto))

CREATE TABLE DEPARTAMENTO (
  cod_depto INT PRIMARY KEY,
  nombre_depto VARCHAR(100)
);

CREATE TABLE EMPLEADO (
  num_matricula INT PRIMARY KEY,
  nombre VARCHAR(100),
  direccion VARCHAR(150),
  cod_depto INT,
  FOREIGN KEY (cod_depto) REFERENCES DEPARTAMENTO(cod_depto)
);

CREATE TABLE TECNICO (
  num_matricula INT PRIMARY KEY,
  nivel VARCHAR(50),
  FOREIGN KEY (num_matricula) REFERENCES EMPLEADO(num_matricula)
);

CREATE TABLE ADMINISTRATIVO (
  num_matricula INT PRIMARY KEY,
  FOREIGN KEY (num_matricula) REFERENCES EMPLEADO(num_matricula)
);

CREATE TABLE PROYECTO (
  cod_proyecto INT PRIMARY KEY,
  nombre_proyecto VARCHAR(100),
  cliente VARCHAR(100),
  fecha_inicio DATE,
  fecha_fin DATE
);

CREATE TABLE TRABAJA_EN (
  num_matricula INT,
  cod_proyecto INT,
  fecha_asignacion DATE,
  fecha_cese DATE,
  PRIMARY KEY (num_matricula, cod_proyecto),
  FOREIGN KEY (num_matricula) REFERENCES TECNICO(num_matricula),
  FOREIGN KEY (cod_proyecto) REFERENCES PROYECTO(cod_proyecto)
);


