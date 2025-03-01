package Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import Class.Pokemon;
import Interfaces.Planta;
import Interfaces.Fuego;
import Interfaces.Agua;
import Interfaces.Electrico;
import Interfaces.Normal;

public class GUIMenu extends JFrame {

    private CardLayout cardLayout;
    private JPanel mainPanel;
    private ArrayList<Pokemon> pokemons;

    public GUIMenu() {
        this.pokemons = Pokemon.getPokemons();
        setTitle("Pokédex - Menú");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void Menu(){
        setTitle("Pokédex - Menú");
        setSize(1000, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    
        // Usamos CardLayout para poder cambiar entre paneles
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
    
        // Panel del menú principal
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        JLabel labelBanner = new JLabel("<html><pre>" + getBannerText() + "</pre></html>", SwingConstants.CENTER);
        labelBanner.setFont(new Font("Monospaced", Font.BOLD, 14));
        panelPrincipal.add(labelBanner, BorderLayout.NORTH);
    
        JPanel botonera = new JPanel();
        JButton btnConsultar = new JButton("Consultar");
        JButton btnSalir = new JButton("Salir");
        botonera.add(btnConsultar);
        botonera.add(btnSalir);
        panelPrincipal.add(botonera, BorderLayout.SOUTH);
    
        // Acción para el botón "Consultar"
        btnConsultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "consultar");
            }
        });
        // Acción para el botón "Salir"
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    
        // Panel del submenú de consulta
        JPanel panelConsultar = new JPanel();
        panelConsultar.setLayout(new GridLayout(8, 1, 10, 10));
        panelConsultar.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    
        JLabel labelConsulta = new JLabel("¿Qué tipo desea consultar?", SwingConstants.CENTER);
        panelConsultar.add(labelConsulta);
    
        // Creamos los botones
        JButton btnPlanta    = new JButton("1. Planta");
        JButton btnFuego     = new JButton("2. Fuego");
        JButton btnAgua      = new JButton("3. Agua");
        JButton btnElectrico = new JButton("4. Eléctrico");
        JButton btnNormal    = new JButton("5. Normal");
        JButton btnTodos     = new JButton("6. Todos");
        JButton btnRegresar  = new JButton("7. Regresar");
    
        // ====== AGREGAR ÍCONOS A LOS BOTONES ======
        // A modo de ejemplo, escalamos la imagen a 24x24
        // Ajusta la ruta y el tamaño a tus necesidades
        
        ImageIcon iconPlanta = new ImageIcon(getClass().getResource("/Images/Types/Planta.png"));
        btnPlanta.setIcon(iconPlanta);
        btnPlanta.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnPlanta.setText(""); // Sin Texto
        // btnPlanta.setBorderPainted(false);  // Quita el borde
        // btnPlanta.setContentAreaFilled(false);  // No pinta el fondo
        // btnPlanta.setFocusPainted(false);  // Quita el foco visual
    
        ImageIcon iconFuego = new ImageIcon(getClass().getResource("/Images/Types/Fuego.png"));
        btnFuego.setIcon(iconFuego);
        btnFuego.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnFuego.setText("");
    
        ImageIcon iconAgua = new ImageIcon(getClass().getResource("/Images/Types/Agua.png"));
        btnAgua.setIcon(iconAgua);
        btnAgua.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnAgua.setText("");
    
        ImageIcon iconElectrico = new ImageIcon(getClass().getResource("/Images/Types/Electrico.png"));
        btnElectrico.setIcon(iconElectrico);
        btnElectrico.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnElectrico.setText("");
    
        ImageIcon iconNormal = new ImageIcon(getClass().getResource("/Images/Types/Normal.png"));
        btnNormal.setIcon(iconNormal);
        btnNormal.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnNormal.setText("");
    
        // Añadimos los botones al panel
        panelConsultar.add(btnPlanta);
        panelConsultar.add(btnFuego);
        panelConsultar.add(btnAgua);
        panelConsultar.add(btnElectrico);
        panelConsultar.add(btnNormal);
        panelConsultar.add(btnTodos);
        panelConsultar.add(btnRegresar);
    
        // Acciones para cada botón de consulta
        btnPlanta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarPokemonsPorTipo(Planta.class);
            }
        });
        btnFuego.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarPokemonsPorTipo(Fuego.class);
            }
        });
        btnAgua.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarPokemonsPorTipo(Agua.class);
            }
        });
        btnElectrico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarPokemonsPorTipo(Electrico.class);
            }
        });
        btnNormal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarPokemonsPorTipo(Normal.class);
            }
        });
        btnTodos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarTodosPokemons();
            }
        });
        // Volver al menú principal
        btnRegresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "principal");
            }
        });
    
        // Agregamos ambos paneles al CardLayout
        mainPanel.add(panelPrincipal, "principal");
        mainPanel.add(panelConsultar, "consultar");
    
        add(mainPanel);
        setVisible(true);
    }
    
    
    // Método para mostrar los Pokémon filtrados por tipo en un cuadro con scroll
    private void mostrarPokemonsPorTipo(Class<?> tipo){
        // Crear un JFrame en lugar de un JOptionPane
        JFrame frameLista = new JFrame("Lista de Pokémon");
        frameLista.setSize(600, 500);
        frameLista.setLocationRelativeTo(this);
        // Crear un panel con un layout que se ajuste al número de botones
        JPanel panelPokemons = new JPanel(new GridLayout(0, 1, 10, 10));
            for (Pokemon p : pokemons) {
            if (tipo.isInstance(p)) {
                JButton btnPokemon = new JButton(p.getNombre() + " #" + p.getNum());
                btnPokemon.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        mostrarDetallesPokemon(p);
                    }
                });
                panelPokemons.add(btnPokemon);
            }
        }
        // Colocar el panel de botones dentro de un JScrollPane
        JScrollPane scrollPane = new JScrollPane(panelPokemons);
            
        // Añadir un botón para cerrar la ventana de lista
        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frameLista.dispose();
            }
        });
        
        // Panel para el botón cerrar
        JPanel panelBoton = new JPanel();
        panelBoton.add(btnCerrar);
        
        // Añadir componentes al frame
        frameLista.setLayout(new BorderLayout());
        frameLista.add(scrollPane, BorderLayout.CENTER);
        frameLista.add(panelBoton, BorderLayout.SOUTH);
        
        // Mostrar el frame
        frameLista.setVisible(true);
    }

        // Método para mostrar todos los Pokémon como botones en un cuadro con scroll
        private void mostrarTodosPokemons() {
            // Crear un JFrame en lugar de un JOptionPane
            JFrame frameLista = new JFrame("Lista de Pokémon");
            frameLista.setSize(600, 500);
            frameLista.setLocationRelativeTo(this);
            
            // Crear un panel con un layout que se ajuste al número de botones
            JPanel panelPokemons = new JPanel(new GridLayout(0, 1, 10, 10));
        
            // Crear un botón por cada Pokémon
            for (Pokemon p : pokemons) {
                JButton btnPokemon = new JButton(p.getNombre() + " #" + p.getNum());
                btnPokemon.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        mostrarDetallesPokemon(p);
                    }
                });
                panelPokemons.add(btnPokemon);
            }
        
            // Colocar el panel de botones dentro de un JScrollPane
            JScrollPane scrollPane = new JScrollPane(panelPokemons);
            
            // Añadir un botón para cerrar la ventana de lista
            JButton btnCerrar = new JButton("Cerrar");
            btnCerrar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frameLista.dispose();
                }
            });
            
            // Panel para el botón cerrar
            JPanel panelBoton = new JPanel();
            panelBoton.add(btnCerrar);
            
            // Añadir componentes al frame
            frameLista.setLayout(new BorderLayout());
            frameLista.add(scrollPane, BorderLayout.CENTER);
            frameLista.add(panelBoton, BorderLayout.SOUTH);
            
            // Mostrar el frame
            frameLista.setVisible(true);
        }

    // Método para mostrar una ventana con la imagen y descripción del Pokémon
    private void mostrarDetallesPokemon(Pokemon pokemon) {
        // Crear un nuevo JFrame para mostrar los detalles
        JFrame frameDetalles = new JFrame(pokemon.getNombre() + " #" + pokemon.getNum());
        frameDetalles.setSize(500, 500);
        frameDetalles.setLayout(new BorderLayout(10, 10));
        // Configurar para que siempre esté por encima
        frameDetalles.setAlwaysOnTop(true);
    
        // Cargar la imagen del Pokémon
        // Suponiendo que las imágenes están en la carpeta "images" dentro de los recursos del proyecto
        String id = pokemon.getNum().substring(1);
        
        ImageIcon icono = new ImageIcon(getClass().getResource("/Images/Pokemons/" + id + ".png"));
    
        JLabel lblImagen = new JLabel(icono);
        lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
        frameDetalles.add(lblImagen, BorderLayout.CENTER);
    
        // Crear un área de texto para la descripción del Pokémon
        JTextArea areaDescripcion = new JTextArea(pokemon.getDescripcion());
        areaDescripcion.setEditable(false);
        areaDescripcion.setLineWrap(true);
        areaDescripcion.setWrapStyleWord(true);
        JScrollPane scrollDescripcion = new JScrollPane(areaDescripcion);
        scrollDescripcion.setPreferredSize(new Dimension(280, 25));
        //frameDetalles.add(scrollDescripcion, BorderLayout.SOUTH);

        // Añadir un botón para cerrar la ventana de lista
        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frameDetalles.dispose();
            }
        });
        
        // Panel para el botón cerrar
        JPanel panelBoton = new JPanel();
        panelBoton.add(btnCerrar);

        // Crear un panel contenedor para ambos componentes
        JPanel panelSur = new JPanel();
        panelSur.setLayout(new BorderLayout());
        // Agregar el área de descripción en el centro del panel contenedor
        panelSur.add(scrollDescripcion, BorderLayout.CENTER);
        // Agregar el panel del botón en la parte inferior del panel contenedor
        panelSur.add(panelBoton, BorderLayout.SOUTH);

        // Agregar el panel contenedor a la región SOUTH del frame
        frameDetalles.add(panelSur, BorderLayout.SOUTH);
    
        // Configurar y mostrar la ventana de detalles
        frameDetalles.setLocationRelativeTo(this);
        frameDetalles.setVisible(true);
        

    }
        
    // Método que retorna el banner en ASCII (el mismo que usas en consola)
    private String getBannerText() {
        return "██████╗░░█████╗░██╗░░██╗███████╗██████╗░███████╗██╗░░██╗\n"
             + "██╔══██╗██╔══██╗██║░██╔╝██╔════╝██╔══██╗██╔════╝╚██╗██╔╝\n"
             + "██████╔╝██║░░██║█████═╝░█████╗░░██║░░██║█████╗░░░╚███╔╝░\n"
             + "██╔═══╝░██║░░██║██╔═██╗░██╔══╝░░██║░░██║██╔══╝░░░██╔██╗░\n"
             + "██║░░░░░╚█████╔╝██║░╚██╗███████╗██████╔╝███████╗██╔╝╚██╗\n"
             + "╚═╝░░░░░░╚════╝░╚═╝░░╚═╝╚══════╝╚═════╝░╚══════╝╚═╝░░╚═╝\n"
             + "By Smash";
    }
    
}
