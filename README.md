# 🌟 Pokedex Project

![Pokemon Banner](https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/25.png)

Una implementación moderna de una Pokedex en Java que permite a los entrenadores explorar y descubrir información detallada sobre diferentes especies de Pokémon, por ahora solo primeros 51 pokemones de la primera generacion.

## ✨ Características Principales

### 🎮 Funcionalidades
- **Búsqueda por Tipo**: Explora Pokémon filtrados por sus elementos:
  - 🌿 Planta
  - 🔥 Fuego
  - 💧 Agua
  - ⚡ Eléctrico
  - ⭐ Normal

### 📱 Interfaz
- Interfaz de consola intuitiva con sistema de colores
- Navegación fluida entre diferentes categorías
- Visualización detallada de estadísticas Pokémon

### 📊 Información Disponible
- Nombre y número de Pokédex
- Descripción detallada
- Estadísticas base
- Habilidades especiales

## 🚀 Estructura del Proyecto

```
src/
├── Main.java           # Punto de entrada del programa
├── Menu/
│   └── Menu.java       # Sistema de navegación
├── Class/
│   ├── Pokemon.java    # Clase base abstracta
│   └── Pokemons/       # Implementaciones específicas
├── Interfaces/
│   └──                 # Interfaces
└── Utils/
    └── Colors.java     # Utilidad de colores
```

## 💻 Requisitos Previos

- Java JDK 11 o superior
- IDE compatible con Java (recomendado: IntelliJ IDEA o Eclipse)
- Git (opcional, para clonar el repositorio)

## 🔧 Instalación

1. **Clonar el Repositorio**
   ```bash
   git clone https://github.com/tuusuario/pokedex-java.git
   cd pokedex-java
   ```

2. **Compilar el Proyecto**
   ```bash
   javac src/Main.java
   ```

3. **Ejecutar la Aplicación**
   ```bash
   java src.Main
   ```

## 📖 Ejemplo de Uso

1. Ejecuta el programa
2. Selecciona un tipo de Pokémon del menú principal
3. Explora la lista de Pokémon disponibles
4. Selecciona un Pokémon específico para ver sus detalles

```bash
=== POKEDEX ===
1. Pokémon Tipo Fuego 🔥
2. Pokémon Tipo Agua 💧
3. Pokémon Tipo Planta 🌿
4. Pokémon Tipo Eléctrico ⚡
5. Pokémon Tipo Normal ⭐
0. Salir
```

## 🤝 Contribuciones

¡Las contribuciones son bienvenidas! Si deseas mejorar este proyecto:

1. Haz un Fork del proyecto
2. Crea una nueva rama (`git checkout -b feature/AmazingFeature`)
3. Realiza tus cambios
4. Commit tus cambios (`git commit -m 'Add: Amazing Feature'`)
5. Push a la rama (`git push origin feature/AmazingFeature`)
6. Abre un Pull Request

## 📄 Licencia

Este proyecto está bajo la Licencia MIT - consulta el archivo [LICENSE](LICENSE) para más detalles.

## 🌟 Pokémon Destacados

### Tipo Fuego
![Charizard](https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/6.png)

### Tipo Agua
![Blastoise](https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/9.png)

### Tipo Planta
![Venusaur](https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/3.png)

### Tipo Eléctrico
![Raichu](https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/26.png)

### Tipo Normal
![Snorlax](https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/143.png)

## 📞 Contacto

Si tienes preguntas o sugerencias, no dudes en:
- Abrir un Issue
- Enviar un Pull Request

---
⭐ ¡No olvides dar una estrella al proyecto si te ha sido útil! ⭐
