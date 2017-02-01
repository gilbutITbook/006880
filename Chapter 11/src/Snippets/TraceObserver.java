import com.devchronicles.observer.javaee.MessageEvent.Type;

@Stateless
public class TraceObserver {

    public void serviceTrace(
    @Observes @MessageEvent(Type.SERVICE) String message) {
        System.out.println("서비스 메시지: " + message);
    }
    public void parameterTrace(
    @Observes @MessageEvent(Type.PARAMETER) String message) {
        System.out.println("파라미터 메시지: " + message);
    }
}