# Automation priority: null
# Automation status: TRANSMITTED
# Test case importance: LOW
# language: fr
Fonctionnalité: Login
  
    Plan du Scénario: se connecter au jpetstore.
    Soit un utilisateur enregistré.
    Lorsque je me connecte avec le login <login> et le mot de passe <mdp>.
    Alors le pet store s'affiche.
    Exemples:
		| login	| mdp |
		| j2ee | j2ee |
		| ACID | ACID |