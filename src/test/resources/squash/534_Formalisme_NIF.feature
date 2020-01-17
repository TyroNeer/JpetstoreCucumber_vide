# Automation priority: null
# Automation status: TRANSMITTED
# Test case importance: LOW
# language: fr
Fonctionnalité: Formalisme NIF
 
  Plan du scénario: formalisme 
    Soit un utilisateur habilité
    Quand je saisis le numéro de sécurité sociale <NIF>
    Alors le champ est signalé en erreur
    Exemples:
      | NIF |
      | 1740972122170 | 
      | 17409721221700618 |
      | 174097212217007 | 

  Plan du scénario: formalisme 
    Soit un utilisateur habilité
    Quand je saisis le numéro de sécurité sociale <NIF>
    Alors le champ est signalé  comme valide
    Exemples:
      | NIF |
      | 174097212217006 | 