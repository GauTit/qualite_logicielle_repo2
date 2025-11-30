# Exercice 9 - JaCoCo Coverage

## Couverture initiale
`mvn clean test` → Rapport : `target/site/jacoco/index.html`

**BankAccount** : 23% (< 50%)

## Méthodes non couvertes (rouge)
- `BankAccount(int, double, double, String, String)`
- `loadFromText(String)`

## Tests ajoutés
1. `testConstructorWithParameters()` - constructeur complet
2. `testLoadFromText()` - lecture fichier

## Résultat
`mvn clean test`

**BankAccount : 23% → 33%**