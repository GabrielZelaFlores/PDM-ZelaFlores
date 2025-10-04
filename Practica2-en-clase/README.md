# Práctica: RecyclerView con Edición y Long Click  

**Alumno:** Gabriel Frank Krisna Zela Flores  
**Fecha de inicio:** 03/10/2025  
**Fecha de finalización:** 03/10/2025  

---

## Descripción  
En esta práctica trabajé con **RecyclerView** en Android implementando la funcionalidad de **edición** y **eliminación** de elementos mediante un **long click**.  

Se utilizó un **AlertDialog personalizado** para editar los datos sin necesidad de cambiar de pantalla.  

---

##  Preguntas de reflexión  

### 1. ¿Qué diferencia hay entre `notifyItemRemoved()`, `notifyItemInserted()` y `notifyItemChanged()`?  

| Método | ¿Cuándo se usa? | Ejemplo de caso real |
|--------|-----------------|----------------------|
| `notifyItemRemoved(position)` | Cuando se **elimina** un ítem de la lista. | Borré un usuario con el botón de eliminar. |
| `notifyItemInserted(position)` | Cuando se **agrega** un nuevo ítem. | Se añadió un nuevo usuario con el botón flotante ➕. |
| `notifyItemChanged(position)` | Cuando un ítem ya existe, pero fue **modificado**. | Edité el nombre o correo de un usuario desde el diálogo. |

En resumen: **Removed** = borrar, **Inserted** = agregar, **Changed** = actualizar.  

---

### 2. ¿Por qué es necesario validar `bindingAdapterPosition != RecyclerView.NO_POSITION`?  

| Razón | Explicación |
|-------|-------------|
| Seguridad | Si el RecyclerView está actualizando la lista y un usuario hace clic, puede que el ítem ya no exista. |
| Evitar errores | `NO_POSITION` significa que el ítem ya no está vinculado a la lista, y sin esta validación la app podría crashear. |
| Buenas prácticas | Validar garantiza que siempre trabajemos con posiciones válidas. |

En otras palabras: **sirve para evitar bugs cuando un usuario interactúa con elementos que ya no existen en la lista**.  

---

### 3. ¿Qué ventajas tiene usar un diálogo frente a abrir una nueva pantalla para editar?  

| Diálogo (AlertDialog) | Nueva Pantalla (Activity/Fragment) |
|-----------------------|------------------------------------|
| Más rápido, no cambia de vista. | Requiere navegar a otra pantalla. |
| El usuario no pierde el contexto. | Se siente más "pesado". |
| Menos código y más intuitivo. | Útil solo si la edición es muy compleja. |

**Ventaja clave del diálogo:** permite **editar de manera inmediata y simple** sin distraer al usuario con más pantallas.  

---

## ✅ Conclusión  
Con esta práctica entendí mejor cómo funciona **RecyclerView**, cómo notificar cambios a la lista y la importancia de validar posiciones. Además, me quedó claro que los **diálogos son una opción ligera y práctica** para editar datos sin complicar la experiencia del usuario.  

