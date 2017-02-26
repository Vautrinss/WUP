import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Login extends JDialog {
	private JPanel container = new JPanel();
	private JTextField login;
	private JPasswordField pass;
	private JLabel mail;
	private JLabel password;
	private BufferedImage logo;

	
	public Login() {
		// titre
		this.setTitle("Connexion");
		// taille
		this.setSize(800,800);
		// positionne au milieu
		this.setLocationRelativeTo(null);
		// termine le processus quand on clique sur la croix
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		// redimensionnement impossible
		this.setResizable(false);

		// panel pour le login
		JPanel form = new JPanel();
		form.setLayout(new BoxLayout(form, BoxLayout.PAGE_AXIS));
		
		// Logo
		try {
			logo = ImageIO.read(new File("./logo_gris.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JLabel labelLogo = new JLabel(new ImageIcon(logo));
		form.add(labelLogo);
		
		// Formulaire
		mail = new JLabel("email");
		mail.setFont(new Font("Arial", Font.BOLD, 20));
		form.add(mail);
		
		login = new JTextField();
		login.setPreferredSize(new Dimension(50,50));
		login.setFont(new Font("Arial", Font.PLAIN, 30));
		form.add(login);
		
		password = new JLabel("Mot de passe");
		password.setFont(new Font("Arial", Font.BOLD, 20));
		form.add(password);
		
		pass = new JPasswordField();
		pass.setPreferredSize(new Dimension(50,50));
		form.add(pass);
		
		container.add(form);
		
		// container devient notre contentPane pour le JFrame
		this.setContentPane(container);
		// rendre visible
		this.setVisible(true);
	}
}
