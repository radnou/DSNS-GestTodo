package com.rmoss;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    // simule le fonctionnement d'une application de Gestion de Todo
        generateFakeData();


    }

    //methode de generation de fake data pour les Todo et Gest Todo
    public static void generateFakeData(){
        GestTodo gestTodo = new GestTodo(5);
        gestTodo.addTodo(new Todo("Faire les courses"));
        gestTodo.addTodo(new Todo("Faire le ménage"));
        gestTodo.addTodo(new Todo("Faire la vaisselle"));
        gestTodo.addTodo(new Todo("Faire le lavage"));
        gestTodo.addTodo(new Todo("Faire le repassage"));
        gestTodo.displayTodos();
        gestTodo.markTodoAsCompletedById(1L);
        gestTodo.markTodoAsCompletedById(3L);
        gestTodo.markTodoAsCompletedById(5L);
        System.out.println("Apres avoir marqué les todos avec id 1, 3 et 5  comme complete");
        gestTodo.displayTodos();
        gestTodo.removeTodoById(1L);
        System.out.println("Apres avoir supprimer le todo avec id 1");
        gestTodo.displayTodos();
    }

}