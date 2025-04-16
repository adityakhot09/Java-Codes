abstract class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public abstract double calculateBonus();
    public abstract String generatePerformanceReport();

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobTitle);
    }
}

class Manager extends Employee {
    private int managedProjects;

    public Manager(String name, String address, double salary, int managedProjects) {
        super(name, address, salary, "Manager");
        this.managedProjects = managedProjects;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.3 + managedProjects * 300;
    }

    @Override
    public String generatePerformanceReport() {
        return name + " has successfully managed " + managedProjects + " projects.";
    }

    public void assignProject() {
        managedProjects++;
        System.out.println(name + " has been assigned a new project. Total projects: " + managedProjects);
    }
}

class Developer extends Employee {
    private int completedTasks;

    public Developer(String name, String address, double salary, int completedTasks) {
        super(name, address, salary, "Developer");
        this.completedTasks = completedTasks;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10 + completedTasks * 200;
    }

    @Override
    public String generatePerformanceReport() {
        return name + " has completed " + completedTasks + " tasks.";
    }

    public void completeTask() {
        completedTasks++;
        System.out.println(name + " has completed a new task. Total tasks: " + completedTasks);
    }
}

class Programmer extends Employee {
    private int codeLines;

    public Programmer(String name, String address, double salary, int codeLines) {
        super(name, address, salary, "Programmer");
        this.codeLines = codeLines;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.1 + codeLines * 0.01;
    }

    @Override
    public String generatePerformanceReport() {
        return name + " has written " + codeLines + " lines of code.";
    }

    public void writeCode(int lines) {
        codeLines += lines;
        System.out.println(name + " has written " + lines + " lines of code. Total lines: " + codeLines);
    }
}

public class Comp {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", "123 Main St", 80000, 5);
        Developer developer = new Developer("Bob", "456 Oak Ave", 60000, 20);
        Programmer programmer = new Programmer("Charlie", "789 Pine Rd", 50000, 5000);

        manager.displayDetails();
        System.out.println("Bonus: " + manager.calculateBonus());
        System.out.println(manager.generatePerformanceReport());
        manager.assignProject();

        System.out.println();

        developer.displayDetails();
        System.out.println("Bonus: " + developer.calculateBonus());
        System.out.println(developer.generatePerformanceReport());
        developer.completeTask();

        System.out.println();

        programmer.displayDetails();
        System.out.println("Bonus: " + programmer.calculateBonus());
        System.out.println(programmer.generatePerformanceReport());
        programmer.writeCode(200);
    }
}