CREATE TABLE PRODUCT (
  id INT PRIMARY KEY,
  marca VARCHAR(50),
  modelo VARCHAR(100),
  precio DECIMAL(10, 2),
  cpu VARCHAR(50),
  ram INT,
  sistema_operativo VARCHAR(50),
  resolucion_pantalla VARCHAR(50),
  bateria INT,
  camaras VARCHAR(50),
  dimensiones VARCHAR(50),
  peso INT
);