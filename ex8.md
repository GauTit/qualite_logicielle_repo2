# Exercice 8 - Tests unitaires BankAccount

## Classe testée
**BankAccount**

## Méthodes testées
- `depositMoney(double amount)`
- `withdrawMoney(double amount)`

---

## Tests écrits

| Test | Type | Scénario | Résultat |
|------|------|----------|----------|
| `testDepositMoney_HappyPath` | Happy path | Déposer 100€ | Solde = 100€  |
| `testDepositMoney_NegativeAmount` | Edge case | Déposer -50€ | Solde inchangé |
| `testWithdrawMoney_HappyPath` | Happy path | Retirer 100€ (solde 500€) | Solde = 400€  |
| `testWithdrawMoney_InsufficientBalance` | Edge case | Retirer 100€ (solde 50€) | Retrait refusé |

---

## Résultat
```
mvn test
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

**Aucune correction nécessaire** - Le code gère correctement tous les cas testés.