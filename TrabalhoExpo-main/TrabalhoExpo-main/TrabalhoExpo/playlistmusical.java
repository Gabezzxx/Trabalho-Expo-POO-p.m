import javax.swing.*;
import java.awt.*;

public class playlistmusical {

        public static void main(String[] args) {
                // TODO Fazer o crud do sistema
                JFrame janela = new JFrame("Playlist Musical");
                janela.setSize(700, 500);
                janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                janela.setLocationRelativeTo(null);

                JTabbedPane painelAbas = new JTabbedPane();

                painelAbas.addTab("Samba",
                                criarPainelDeMusicas(new String[] { "Aquarela do Brasil", "Trem das Onze",
                                                "O Mundo é um Moinho" }));
                painelAbas.addTab("Pagode",
                                criarPainelDeMusicas(new String[] { "Deixa Acontecer", "Coração Deserto",
                                                "Tá Vendo Aquela Lua" }));
                painelAbas.addTab("Sertanejo",
                                criarPainelDeMusicas(new String[] { "Evidências", "Chalana", "Fio de Cabelo" }));

                painelAbas.addTab("Internacional",
                                criarPainelDeMusicas(new String[] { "Dark Horse", "Yeah - Usher", "Winter" }));
                janela.add(painelAbas);

                janela.setVisible(true);
        }

        private static JPanel criarPainelDeMusicas(String[] musicas) {
                JPanel painel = new JPanel();
                painel.setLayout(new BorderLayout());

                JList<String> listaMusicas = new JList<>(musicas);
                listaMusicas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

                JScrollPane barraRolagem = new JScrollPane(listaMusicas);
                painel.add(barraRolagem, BorderLayout.CENTER);

                return painel;
        }
}