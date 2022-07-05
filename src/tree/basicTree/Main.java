package tree.basicTree;

public class Main {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode alcoholic = new TreeNode("Alcoholic");
        TreeNode nonAlcoholic = new TreeNode("Non Alcoholic");
        TreeNode greenTea = new TreeNode("Green Tea");
        TreeNode regularTea = new TreeNode("Regular Tea");
        TreeNode espresso = new TreeNode("Espresso");
        TreeNode cappuccino = new TreeNode("Cappuccino");
        TreeNode cocaCola = new TreeNode("Coca Cola");
        TreeNode fanta = new TreeNode("Fanta");
        TreeNode wine = new TreeNode("Wine");
        TreeNode bear = new TreeNode("Bear");

        drinks.addChildren(hot);
        drinks.addChildren(cold);
        hot.addChildren(tea);
        hot.addChildren(coffee);
        cold.addChildren(alcoholic);
        cold.addChildren(nonAlcoholic);
        tea.addChildren(greenTea);
        tea.addChildren(regularTea);
        coffee.addChildren(cappuccino);
        coffee.addChildren(espresso);
        alcoholic.addChildren(wine);
        alcoholic.addChildren(bear);
        nonAlcoholic.addChildren(cocaCola);
        nonAlcoholic.addChildren(fanta);

        System.out.println(drinks.print(0));
    }
}
