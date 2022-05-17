-- INSERT INTO ALUMNO (id, nombre, apellidos) VALUES (NEXTVAL('hibernate_sequence'),'Pepe','Pérez'); 
-- INSERT INTO ALUMNO (id, nombre, apellidos) VALUES (NEXTVAL('hibernate_sequence'),'Juan','Gómez'); 


INSERT INTO CURSO (id, nombre) VALUES (1, '1º DAM');

INSERT INTO ALUMNO (id, nombre, apellidos, curso_id) VALUES (1, 'Pepe', 'Pérez', 1);

ALTER SEQUENCE hibernate_sequence RESTART WITH 1000;