package com.rmoss;

import java.util.ArrayList;

/**
 * Classe gérant une liste de tâches (todos).
 */
public class GestTodo {
    private final ArrayList<Todo> todosList;

    /**
     * Constructeur de la classe GestTodo.
     *
     */
    public GestTodo() {
        this.todosList = new ArrayList<>();
    }

    /**
     * Ajoute une tâche à la liste.
     *
     * @param todo La tâche à ajouter.
     */
    public void addTodo(Todo todo) {
        this.todosList.add(todo);
    }

    /**
     * Supprime une tâche de la liste en fonction de son ID.
     *
     * @param id L'ID de la tâche à supprimer.
     */
    public void removeTodoById(Long id) {
        this.todosList.removeIf(todo -> todo.getId().equals(id));
    }

    /**
     * Marque une tâche comme complétée en fonction de son ID.
     *
     * @param id L'ID de la tâche à marquer comme complétée.
     */
    public void markTodoAsCompletedById(Long id) {
        for (Todo todo : this.todosList) {
            if (todo.getId().equals(id)) {
                todo.setCompleted(true);
                break;
            }
        }
    }

    /**
     * Modifie la description d'une tâche en fonction de son ID.
     *
     * @param id             L'ID de la tâche à modifier.
     * @param newDescription La nouvelle description de la tâche.
     */
    public void modifyTodoById(Long id, String newDescription) {
        for (Todo todo : this.todosList) {
            if (todo.getId().equals(id)) {
                todo.setDescription(newDescription);
                break;
            }
        }
    }

    /**
     * Affiche la liste des tâches dans un format tabulaire.
     * L'affichage inclut l'ID, la description et le statut de complétion de chaque tâche.
     */
    public void displayTodos() {
        // Trouver la longueur maximale des descriptions
        int maxDescriptionLength = 0;
        for (Todo todo : this.todosList) {
            maxDescriptionLength = Math.max(maxDescriptionLength, todo.getDescription().length());
        }

        // Définir une largeur minimale pour la colonne de description
        int minDescriptionWidth = 10;
        maxDescriptionLength = Math.max(maxDescriptionLength, minDescriptionWidth);

        String horizontalLine = "+" + "-".repeat(4) + "+" + "-".repeat(maxDescriptionLength + 2) + "+" + "-".repeat(11) + "+";

        // En-tête
        System.out.println(horizontalLine);
        System.out.printf("| %2s | %-" + maxDescriptionLength + "s | %-9s |\n", "ID", "Description", "Completed");
        System.out.println(horizontalLine);

        // Tâches
        for (Todo todo : this.todosList) {
            String completedStatus = todo.isCompleted() ? "✓" : " ";
            String description = todo.getDescription();

            // Tronquer la description si elle est trop longue
            if (description.length() > maxDescriptionLength) {
                description = description.substring(0, maxDescriptionLength - 3) + "...";
            }

            // Ajuster la description pour l'alignement
            description = String.format("%-" + maxDescriptionLength + "s", description);

            System.out.printf("| %2d | %s | %-9s |\n", todo.getId(), description, completedStatus);
        }

        // Pied de page
        System.out.println(horizontalLine);
    }
}