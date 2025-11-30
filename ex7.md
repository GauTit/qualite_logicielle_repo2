# Exercice 7 - Maven Lifecycle

## mvn clean
- **Phases** : clean
- **Résultat** : Suppression du dossier target/

## mvn test
- **Phases** : resources → compile → test-compile → test
- **Nouveaux fichiers dans target/** :
    - `classes/` (6 fichiers .class compilés)
    - `maven-status/` (métadonnées)
    - `surefire-reports/` (rapports de tests)

## mvn package
- **Phases** : resources → compile → test → **jar**
- **Nouveaux fichiers dans target/** :
    - `bank-application-1.0-SNAPSHOT.jar`

## mvn verify
- **Phases** : resources → compile → test → jar → verify
- **Nouveaux fichiers** : Aucun (identique à package dans notre cas)

---

## Hypothèse : Différences entre test, package et verify

| Commande | Ce qu'elle fait |
|----------|----------------|
| `mvn test` | Compile et exécute les tests unitaires |
| `mvn package` | Fait `test` + crée le JAR |
| `mvn verify` | Fait `package` + tests d'intégration + vérifications qualité (CI/CD) |

Dans notre projet, `verify` = `package` car pas de tests d'intégration configurés.