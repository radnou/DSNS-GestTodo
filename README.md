# DSNS - Gestion de Tâches Todo

Ce projet est une simple application de gestion de tâches (TODO) en Java.  Elle permet d'ajouter, supprimer, marquer comme complétées et modifier des tâches.

## Fonctionnalités

* **Ajouter une tâche:**  Ajouter une nouvelle tâche avec une description.
* **Supprimer une tâche:** Supprimer une tâche par son ID.
* **Marquer comme complétée:** Marquer une tâche comme complétée.
* **Modifier une tâche:** Modifier la description d'une tâche existante.
* **Afficher les tâches:** Afficher la liste des tâches avec leur ID, description et statut (complétée ou non).

## Exécution

1. **Prérequis:** Assurez-vous d'avoir Java Development Kit (JDK) installé sur votre système.
2. **Compilation:**  Ouvrez un terminal et naviguez jusqu'au répertoire racine du projet.  Exécutez la commande `mvn compile`.
3. **Exécution:** Exécutez la commande `mvn exec:java -Dexec.mainClass="com.rmoss.Main"`.

Le programme affichera ensuite la liste des tâches générées, puis les modifications successives.
