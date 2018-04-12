package management;

public class Director extends Manager {
    private double budget;
    public Director(String name, String niNumber, double salary, String dptName, double budget) {
        super(name, niNumber, salary, dptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus() {
        return (this.getSalary()) * 0.02;
    }

}
