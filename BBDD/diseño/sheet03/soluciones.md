EJERCICIO 1:
Consulta todos los datos de la tabla film.
```sql
SELECT * FROM film;
```
EJERCICIO 2:
```sql
USE sakila;
SELECT * FROM film
WHERE length > 120;
```
```sql
SELECT * FROM customer
WHERE last_name = 'Smith';
```
EJERCICIO 3:
```sql
SELECT * FROM film
ORDER BY title ASC;
```
```sql
SELECT * FROM film
ORDER BY length DESC;
```
EJERCICIO 4:
```sql
SELECT COUNT(*) AS total_actores
FROM actor;
```
```sql
SELECT AVG(length) AS duracion_promedio
FROM film;
```
EJERCICIO 5:
```sql
SELECT * FROM film
WHERE rating = 'PG' OR rating = 'R';
```
```sql
SELECT * FROM customer
WHERE last_name LIKE '%FORD';
```
EJERCICIO 6:
```sql
SELECT 
    CONCAT(actor.first_name, ' ', actor.last_name) AS actor_nombre,
    film.title AS pelicula_titulo
FROM actor
JOIN film_actor ON actor.actor_id = film_actor.actor_id
JOIN film ON film.film_id = film_actor.film_id;
```
EJERCICIO 7: 
```sql
SELECT DISTINCT film.title
FROM customer
JOIN rental ON customer.customer_id = rental.customer_id
JOIN inventory ON rental.inventory_id = inventory.inventory_id
JOIN film ON inventory.film_id = film.film_id
WHERE customer.first_name = 'MARY'
  AND customer.last_name = 'SMITH';
```
EJERCICIO 8: 
```sql
SELECT customer.customer_id,
       CONCAT(customer.first_name, ' ', customer.last_name) AS nombre_completo,
       COUNT(rental.rental_id) AS total_alquileres
FROM customer
JOIN rental ON customer.customer_id = rental.customer_id
GROUP BY customer.customer_id
HAVING COUNT(rental.rental_id) > 20;
```
EJERCICIO 9:
```sql
SELECT customer_id,
       COUNT(rental_id) AS total_alquileres
FROM rental
GROUP BY customer_id;
```
```sql
SELECT film.film_id,
       film.title,
       SUM(payment.amount) AS total_ingresos
FROM payment
JOIN rental ON payment.rental_id = rental.rental_id
JOIN inventory ON rental.inventory_id = inventory.inventory_id
JOIN film ON inventory.film_id = film.film_id
GROUP BY film.film_id, film.title;
```
EJERCICIO 10:
```sql
SELECT 
    film.title AS pelicula,
    rental.rental_date AS fecha_alquiler,
    CONCAT(customer.first_name, ' ', customer.last_name) AS cliente
FROM rental
JOIN inventory ON rental.inventory_id = inventory.inventory_id
JOIN film ON inventory.film_id = film.film_id
JOIN customer ON rental.customer_id = customer.customer_id
WHERE customer.first_name = 'MARY' AND customer.last_name = 'SMITH';
```
EJERCICIO 11:
```sql
SELECT f.title
FROM film f
WHERE (
    SELECT COUNT(*)
    FROM rental r
    JOIN inventory i ON r.inventory_id = i.inventory_id
    WHERE i.film_id = f.film_id
) > (
    SELECT AVG(rental_count)
    FROM (
        SELECT COUNT(*) AS rental_count
        FROM rental r
        JOIN inventory i ON r.inventory_id = i.inventory_id
        GROUP BY i.film_id
    ) AS avg_rentals
);
```
EJERCICIO 12: 
```sql

