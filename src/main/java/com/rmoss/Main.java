package com.rmoss;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GestTodo gestTodo = new GestTodo();

        gestTodo.addTodo(new Todo("Faire les courses"));
        gestTodo.addTodo(new Todo("Faire le ménage"));
        gestTodo.addTodo(new Todo("Faire la vaisselle"));
        gestTodo.addTodo(new Todo("Faire le lavage"));
        gestTodo.addTodo(new Todo("Faire le repassage"));

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int choix;

        do {
            System.out.println("\nMenu :");
            System.out.println("1. Ajouter une tâche");
            System.out.println("2. Supprimer une tâche");
            System.out.println("3. Marquer une tâche comme terminée");
            System.out.println("4. Modifier une tâche");
            System.out.println("5. Afficher les tâches");
            System.out.println("6. Afficher les tâches terminées");
            System.out.println("7. Afficher les tâches en cours");
            System.out.println("0. Quitter");
            System.out.print("Entrez votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("Entrez la description de la tâche : ");
                    String description = scanner.nextLine();
                    gestTodo.addTodo(new Todo(description));
                    break;
                case 2:
                    gestTodo.displayAllTodos();
                    System.out.println("Entrez l'ID de la tâche à supprimer : ");
                    long idSupprimer = scanner.nextLong();
                    gestTodo.removeTodoById(idSupprimer);
                    break;
                case 3:
                    gestTodo.displayTodosFilterByState(false);
                    System.out.println("Entrez l'ID de la tâche à marquer comme terminée : ");
                    long idTerminer = scanner.nextLong();
                    gestTodo.markTodoAsCompletedById(idTerminer);
                    break;
                case 4:
                    System.out.println("Entrez l'ID de la tâche à modifier : ");
                    long idModifier = scanner.nextLong();
                    scanner.nextLine();
                    System.out.println("Entrez la nouvelle description : ");
                    String newDescription = scanner.nextLine();
                    gestTodo.modifyTodoById(idModifier, newDescription);
                    break;
                case 5:
                    gestTodo.displayAllTodos();
                    break;
                case 6:
                    gestTodo.displayTodosFilterByState(true);
                    break;
                case 7:
                    gestTodo.displayTodosFilterByState(false);
                    break;
                case 0:
                    System.out.println("Bye Bye !");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        } while (choix != 0);

        scanner.close();


    }
}