import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("Lenovo", "ThinkPad", 8, 256, "Windows 10", "Black", 899.99));
        notebooks.add(new Notebook("Apple", "Macbook Air", 8, 256, "macOS", "Silver", 999.99));
        notebooks.add(new Notebook("HP", "Pavilion", 4, 128, "Windows 10", "White", 449.99));
        notebooks.add(new Notebook("Lenovo", "IdeaPad", 4, 512, "Windows 10", "Black", 549.99));
        notebooks.add(new Notebook("Dell", "Inspiron", 16, 512, "Windows 10", "Gray", 899.99));
        notebooks.add(new Notebook("HP", "ProBook", 8, 1024, "Windows 10", "Blue", 799.99));
        notebooks.add(new Notebook("Asus", "Zenbook", 16, 256, "Windows 10", "Rose Gold", 1099.99));
        notebooks.add(new Notebook("Acer", "Inspire", 8, 512, "Windows 10", "Red", 999.99));
        notebooks.add(new Notebook("MSI", "Katana", 32, 1024, "Windows 11", "Black", 1299.99));

        Map<Integer, String> filterCriteria = new HashMap<>();
        filterCriteria.put(1, "RAM");
        filterCriteria.put(2, "HDD");
        filterCriteria.put(3, "OS");
        filterCriteria.put(4, "Color");

        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filterParams = new HashMap<>();
        for (int i = 1; i <= filterCriteria.size(); i++) {
            System.out.println(i + " - " + filterCriteria.get(i));
            String param = filterCriteria.get(i);
            Object minValue = null;
            switch (i) {
                case 1:
                    System.out.print("Enter minimum RAM size: ");
                    minValue = scanner.nextInt();
                    break;
                case 2:
                    System.out.print("Enter minimum HDD size: ");
                    minValue = scanner.nextInt();
                    break;
                case 3:
                    System.out.print("Enter desired operating system: ");
                    scanner.nextLine();
                    String os = scanner.nextLine().trim();
                    minValue = os;
                    break;
                case 4:
                    System.out.print("Enter desired color: ");
                    String color = scanner.nextLine().trim();
                    minValue = color;
                    break;
            }
            filterParams.put(param, minValue);
        }

        System.out.println("Results:");
        for (Notebook notebook : notebooks) {
            boolean passFilter = true;
            for (Map.Entry<String, Object> entry : filterParams.entrySet()) {
                String param = entry.getKey();
                Object minValue = entry.getValue();
                int notebookValue = 0;
                switch (param) {
                    case "RAM":
                        notebookValue = notebook.getRamSize();
                        break;
                    case "HDD":
                        notebookValue = notebook.getHddSize();
                        break;
                    case "OS":
                        String os = notebook.getOs();
                        if (!os.equals(minValue)) {
                            passFilter = false;
                            break;
                        }
                        break;
                    case "Color":
                        String color = notebook.getColor();
                        if (!color.equalsIgnoreCase((String)minValue)) {
                            passFilter = false;
                            break;
                        }
                        break;
                }
                if (!passFilter) {
                    break;
                }
            }
            if (passFilter) {
                System.out.println(notebook.getBrand() + " " + notebook.getModel() + " - " + notebook.getPrice());
            }
        }
    }
}