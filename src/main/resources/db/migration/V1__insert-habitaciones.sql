-- Insertar habitaciones del 2do piso
INSERT INTO habitaciones (id_habitacion, descripcion, estado, imagen, precio, cliente_fk_id)
VALUES
    (1, 'Habitación 201: Vista panorámica', false, 'imagen1.jpg', 100.00, NULL),
    (2, 'Habitación 202: Con balcón', false, 'imagen2.jpg', 120.00, NULL),
    (3, 'Habitación 203: Amplia y cómoda', false, 'imagen3.jpg', 110.00, NULL),
    (4, 'Habitación 204: Decoración moderna', false, 'imagen4.jpg', 130.00, NULL),
    (5, 'Habitación 205: Con jacuzzi', false, 'imagen5.jpg', 150.00, NULL);

-- Insertar habitaciones del 3er piso
INSERT INTO habitaciones (id_habitacion, descripcion, estado, imagen, precio, cliente_fk_id)
VALUES
    (6, 'Habitación 301: Estilo contemporáneo', false, 'imagen6.jpg', 100.00, NULL),
    (7, 'Habitación 302: Vistas al jardín', false, 'imagen7.jpg', 120.00, NULL),
    (8, 'Habitación 303: Elegante y luminosa', false, 'imagen8.jpg', 110.00, NULL),
    (9, 'Habitación 304: Diseño minimalista', false, 'imagen9.jpg', 130.00, NULL),
    (10, 'Habitación 305: Con terraza privada', false, 'imagen10.jpg', 150.00, NULL);

-- Insertar suites del 4to piso
INSERT INTO habitaciones (id_habitacion, descripcion, estado, imagen, precio, cliente_fk_id)
VALUES
    (11, 'Suite Presidencial: Lujo y confort', false, 'imagen11.jpg', 250.00, NULL),
    (12, 'Suite Ejecutiva: Espacio y elegancia', false, 'imagen12.jpg', 200.00, NULL),
    (13, 'Suite de Luna de Miel: Romántica y acogedora', false, 'imagen13.jpg', 180.00, NULL),
    (14, 'Suite Familiar: Ideal para familias', false, 'imagen14.jpg', 220.00, NULL);