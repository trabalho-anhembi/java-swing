import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

import java.util.HashMap;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Main implements ActionListener {
	
	// Login page
	private static JFrame loginFrame;
	private static JLabel loginUserLabel;
	private static JTextField loginUserText;
	private static JLabel loginPasswordLabel;
	private static JPasswordField loginPasswordText;
	private static JButton loginButton;
	
	// Usernames and passwords containers
	private static ArrayList<String> usernamesList = new ArrayList<String>();
	private static ArrayList<String> passwordsList = new ArrayList<String>();
	private static HashMap<String, String> employeesUsernamesMap = new HashMap<String, String>();
	
	// Main menu page
	private static JFrame mainMenuFrame;
	private static JButton toSalesRegistryButton;
	private static JButton toLoginManagementButton;
	private static JButton toLoginButton;
	
	// Login management page
	private static JFrame loginManagementFrame;
	private static JComboBox<String> employeesUsernamesComboBox;
	private static JButton addEmployeeButton;
	private static JButton removeEmployeeButton;
	private static JButton loginManagementBackButton;
	
	// Registry page
	private static JFrame salesRegistryFrame;
	private static JButton saveDataButton;
	private static JButton saveExitButton;
	private static JButton registryBackButton;
	private static JLabel employeeLabel;
	private static JComboBox<String> employeesComboBox;
	private static JLabel dateLabel;
	private static JLabel clientNamelabel;
	private static JTextField clientNameTextField;
	private static JLabel addressLabel;
	private static JTextField addressTextField;
	private static JLabel cepLabel;
	private static JTextField cepTextField;
	private static JLabel telephoneLabel;
	private static JTextField telephoneTextField;
	private static JLabel observationLabel;
	private static JTextField observationTextField;
	
	public static void main(String[] args) {
		
		// Adding usernames and passwords to the system
        usernamesList.add("aricam");
        passwordsList.add("rest123");
        employeesUsernamesMap.put("aricam", "Ariane Caminha");
        
        usernamesList.add("alecam");
        passwordsList.add("rest456");
        employeesUsernamesMap.put("alecam", "Alexandre Caminha");
        
        usernamesList.add("caiocam");
        passwordsList.add("rest789");
        employeesUsernamesMap.put("caiocam", "Caio Caminha");
        
        usernamesList.add("a");
        passwordsList.add("a");
		
		/*********************** Login page start ***********************/
		
		// Login frame
		loginFrame = new JFrame("Login");
		loginFrame.setSize(350, 200);
		loginFrame.setResizable(false);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setLayout(null);
		
        // Login username label
		loginUserLabel = new JLabel("Usuário");
		loginUserLabel.setBounds(10,20,80,25);
		loginFrame.add(loginUserLabel);
		
		// Login username text field
		loginUserText = new JTextField(20);
		loginUserText.setBounds(100,20,165,25);
        loginFrame.add(loginUserText);
        
		// Login password label
		loginPasswordLabel = new JLabel("Senha");
		loginPasswordLabel.setBounds(10,50,80,25);
        loginFrame.add(loginPasswordLabel);
		
        // Login password text field
		loginPasswordText = new JPasswordField(20);
		loginPasswordText.setBounds(100,50,165,25);
        loginFrame.add(loginPasswordText);
		
        // Login button
		loginButton = new JButton("Login");
		loginButton.setBounds(10, 80, 80, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(new Main());
        loginFrame.add(loginButton);
		
		// Login frame = visible
        loginFrame.setVisible(true);
        
        /************************ Login page end ************************/
        
        /********************* Main menu page start *********************/
        
        // Main menu frame
        mainMenuFrame = new JFrame("App Restaurante");
        mainMenuFrame.setSize(1200, 400);
        mainMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainMenuFrame.setLocationRelativeTo(null);
        mainMenuFrame.setLayout(null);
        
        // Go to sales registry page button
    	toSalesRegistryButton = new JButton("Registro");
    	toSalesRegistryButton.setBounds(50, 50, 100, 40);
    	toSalesRegistryButton.setFocusable(false);
    	toSalesRegistryButton.addActionListener(new Main());
		mainMenuFrame.add(toSalesRegistryButton);
		
		// Go to login management page button
		toLoginManagementButton = new JButton("Cadastros");
		toLoginManagementButton.setBounds(50, 150, 100, 40);
		toLoginManagementButton.setFocusable(false);
		toLoginManagementButton.addActionListener(new Main());
		mainMenuFrame.add(toLoginManagementButton);
		
		// Quit to login page button
		toLoginButton = new JButton("Deslogar");
		toLoginButton.setBounds(500, 200, 100, 40);
		toLoginButton.setFocusable(false);
		toLoginButton.addActionListener(new Main());
		mainMenuFrame.add(toLoginButton);
        
        /********************** Main menu page end **********************/
		
		/***************** Login management page start *****************/
		
        loginManagementFrame = new JFrame("App Restaurante");
        loginManagementFrame.setSize(1200, 400);
        loginManagementFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginManagementFrame.setLocationRelativeTo(null);
        loginManagementFrame.setLayout(null);
        
        String[] employeesUsernames = new String[usernamesList.size()];
        for(int i = 0; i < usernamesList.size(); i++) {
        	employeesUsernames[i] = usernamesList.get(i);
        }
        employeesUsernamesComboBox = new JComboBox<String>(employeesUsernames);
        employeesUsernamesComboBox.setLocation(100, 30);
        employeesUsernamesComboBox.setSize(employeesUsernamesComboBox.getPreferredSize());
        employeesUsernamesComboBox.setFocusable(false);
        loginManagementFrame.add(employeesUsernamesComboBox);
        
        // Add employee login
        addEmployeeButton = new JButton("Adicionar login");
        addEmployeeButton.setBounds(100, 130, 120, 40);
        addEmployeeButton.setFocusable(false);
        addEmployeeButton.addActionListener(new Main());
 		loginManagementFrame.add(addEmployeeButton);
        
        // Remove employee login
 		removeEmployeeButton = new JButton("Remover login");
 		removeEmployeeButton.setBounds(300, 130, 120, 40);
 		removeEmployeeButton.setFocusable(false);
 		removeEmployeeButton.addActionListener(new Main());
 		loginManagementFrame.add(removeEmployeeButton);
        
        // Back to main menu button
 		loginManagementBackButton = new JButton("Voltar");
 		loginManagementBackButton.setBounds(500, 200, 100, 40);
 		loginManagementBackButton.setFocusable(false);
 		loginManagementBackButton.addActionListener(new Main());
 		loginManagementFrame.add(loginManagementBackButton);
        
        /****************** Login management page end ******************/
		
		/****************** Sales registry page start ******************/
		
		// Sales registry frame
		salesRegistryFrame = new JFrame("App Restaurante");
		salesRegistryFrame.setSize(1600, 900);
		salesRegistryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		salesRegistryFrame.setLocationRelativeTo(null);
		salesRegistryFrame.setLayout(null);
		
		// Employee label
		employeeLabel = new JLabel("Atendente: ");
		employeeLabel.setBounds(100, 30, 80, 25);
		salesRegistryFrame.add(employeeLabel);
		
		// Employees list
		String[] employees = {null, "Ariane", "Alexandre", "Caio"};		
		employeesComboBox = new JComboBox<String>(employees);
		employeesComboBox.setLocation(180, 30);
		employeesComboBox.setSize(employeesComboBox.getPreferredSize());
		employeesComboBox.setFocusable(false);
		salesRegistryFrame.add(employeesComboBox);
		
		// Date label
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		dateLabel = new JLabel("Data: " + dateTimeFormatter.format(now));
		dateLabel.setBounds(300, 30, 120, 25);
		salesRegistryFrame.add(dateLabel);
		
		// Client name label
		clientNamelabel = new JLabel("Nome cliente:");
		clientNamelabel.setBounds(450, 30, 140, 25);
		salesRegistryFrame.add(clientNamelabel);
		
		// Client name text field
		clientNameTextField = new JTextField(20);
		clientNameTextField.setBounds(600, 30, 190, 25);
		salesRegistryFrame.add(clientNameTextField);
		
		// Address label
		addressLabel = new JLabel("Endereço:");
		addressLabel.setBounds(100, 80, 80, 25);
		salesRegistryFrame.add(addressLabel);
		
		// Address text field
		addressTextField = new JTextField(50);
		addressTextField.setBounds(200, 80, 300, 25);
		salesRegistryFrame.add(addressTextField);
		
		// CEP label
		cepLabel = new JLabel("CEP:");
		cepLabel.setBounds(100, 120, 80, 25);
		salesRegistryFrame.add(cepLabel);
		
		// CEP text field
		cepTextField = new JTextField(20);
		cepTextField.setBounds(200, 120, 80, 25);
		salesRegistryFrame.add(cepTextField);
		
		// Telephone label
		telephoneLabel = new JLabel("Telefone:");
		telephoneLabel.setBounds(300, 120, 95, 25);
		salesRegistryFrame.add(telephoneLabel);
		
		// Telephone text field
		telephoneTextField = new JTextField(20);
		telephoneTextField.setBounds(400, 120, 80, 25);
		salesRegistryFrame.add(telephoneTextField);
		
		// Observation label
		observationLabel = new JLabel("Observação:");
		observationLabel.setBounds(500, 120, 80, 25);
		salesRegistryFrame.add(observationLabel);
		
		// Observation text field
		observationTextField = new JTextField(50);
		observationTextField.setBounds(600, 120, 200, 25);
		salesRegistryFrame.add(observationTextField);
		
		// Save data button
		saveDataButton = new JButton("Salvar");
		saveDataButton.setBounds(200, 780, 100, 40);
		saveDataButton.setFocusable(false);
		saveDataButton.addActionListener(new Main());
		salesRegistryFrame.add(saveDataButton);
		
		// Save and exit button
		saveExitButton = new JButton("Salvar e sair");
		saveExitButton.setBounds(400, 780, 120, 40);
		saveExitButton.setFocusable(false);
		saveExitButton.addActionListener(new Main());
		salesRegistryFrame.add(saveExitButton);
		
        // Back to main menu button
		registryBackButton = new JButton("Voltar");
		registryBackButton.setBounds(1450, 780, 100, 40);
		registryBackButton.setFocusable(false);
		registryBackButton.addActionListener(new Main());
        salesRegistryFrame.add(registryBackButton);
		
		/******************* Sales registry page end *******************/
	}
	
	public static boolean loginAuthentication(String username, String password) {
		boolean result = false;
		
		if(usernamesList.contains(username)) {
			if(passwordsList.get(usernamesList.indexOf(username)).equals(password)) {
				result = true;
			}
		}
		
		return result;
	}
	
	public static void switchPages(JFrame fromPage, JFrame toPage) {
		fromPage.setVisible(false);
		toPage.setVisible(true);
		toPage.setLocation(fromPage.getLocation());
		toPage.setSize(fromPage.getSize());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(loginButton)) { // Login button
			// User & password received from user for login verification
			String loginUsername = loginUserText.getText();
			String loginPassword = String.valueOf(loginPasswordText.getPassword());

			if(loginAuthentication(loginUsername, loginPassword)) { // Authentication was successful
				loginFrame.setVisible(false);
				mainMenuFrame.setVisible(true);
			}
			else { // Authentication has failed
				JOptionPane.showMessageDialog(null, "Nome de usuário ou senha incorreto", "Erro de login", JOptionPane.WARNING_MESSAGE);
				loginUserText.setText("");
				loginPasswordText.setText("");
			}
		}
		else if(e.getSource().equals(toLoginButton)) { // Main menu to login page button
			String[] quitOptions = {"Sim", "Não"};
			int quitOption = JOptionPane.showOptionDialog(null, "Tem certeza de que deseja sair?", "Sair", 
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, quitOptions, quitOptions[1]);
			
			if(quitOption == 0) { // Quit to login page
				mainMenuFrame.setVisible(false);
				mainMenuFrame.setLocationRelativeTo(null);
				loginFrame.setVisible(true);
				loginUserText.setText("");
				loginPasswordText.setText("");
			}
		}		
		else if(e.getSource().equals(toSalesRegistryButton)) { // Main menu to sales registry button
			switchPages(mainMenuFrame, salesRegistryFrame);
		}		
		else if(e.getSource().equals(registryBackButton)) { // Sales registry to main menu button
			switchPages(salesRegistryFrame, mainMenuFrame);
		}		
		else if(e.getSource().equals(saveDataButton)) { // Save the sale data button
			// Save the sale data
		}
		else if(e.getSource().equals(saveExitButton)) { // Save the sale data and exit to main menu button
			// Save the sale data
			
			salesRegistryFrame.setVisible(false);
			mainMenuFrame.setVisible(true);
			mainMenuFrame.setLocation(salesRegistryFrame.getLocation());
		}		
		else if(e.getSource().equals(toLoginManagementButton)) { // Main menu to login management
			// if said employee is a manager:
			switchPages(mainMenuFrame, loginManagementFrame);
			// else:
			// blocked message
		}		
		else if(e.getSource().equals(loginManagementBackButton)) { // Login management to main menu button
			switchPages(loginManagementFrame, mainMenuFrame);
		}		
		else if(e.getSource().equals(addEmployeeButton)) { // Add employee username and password to the system
			String newUsername = JOptionPane.showInputDialog("Digite o novo nome de usuário");
			String newPassword = JOptionPane.showInputDialog("Digite a nova senha");
			//String newEmployeeName = JOptionPane.showInputDialog("Digite o nome do novo funcionário cadastrado");
			
			// Check if new employee is regular or manager
			
			usernamesList.add(newUsername);
	        passwordsList.add(newPassword);
	        //employeesUsernamesMap.put(newUsername, newEmployeeName);
		}
		else if(e.getSource().equals(removeEmployeeButton)) { // Remove employee username and password from the system
			String removedEmployee = JOptionPane.showInputDialog("Digite o nome de usuário a ser retirado");
			
			for(int i = 0 ; i < usernamesList.size(); i++) {
				if(removedEmployee.equals(usernamesList.get(i))) {
					JOptionPane.showMessageDialog(null, "O usuário encontrado é " + employeesUsernamesMap.get(removedEmployee));
					
					String[] removeOptions = {"Sim", "Não"};
					int removeOption = JOptionPane.showOptionDialog(null, "Tem certeza de que deseja excluir o usuário?", "Excluir cadastro", 
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, removeOptions, removeOptions[1]);
					
					if(removeOption == 0) {
						usernamesList.remove(i);
						passwordsList.remove(i);
					}					
				}
			}
		}
		
	}

}
