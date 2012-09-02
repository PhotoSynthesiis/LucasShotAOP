package introduce;

public class PerformanceMonitor {

    private static ThreadLocal<MethodPerformance> performaceRecord =
            new ThreadLocal<MethodPerformance>();

    public static void begin(String method) {
        System.out.println("Begin Monitor...");
        MethodPerformance methodPerformance = new MethodPerformance(method);
        performaceRecord.set(methodPerformance);
    }

    public static void end() {
        System.out.println("End Monitor...");
        MethodPerformance methodPerformance = performaceRecord.get();

        methodPerformance.printPerformance();
    }
}
