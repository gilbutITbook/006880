package Snippets;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.enterprise.event.Event;
import javax.inject.Inject;

import com.devchronicles.observer.MessageEvent;
import com.devchronicles.observer.MessageEvent.Type;
import javax.ejb.TransactionAttributeType;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class EventService {
    @Inject
    private String message;
    @Inject
    @MessageEvent(Type.SERVICE)
    Event<String> serviceEvent;
    @Inject
    @MessageEvent(Type.PARAMETER)
    Event<String> parameterEvent;

    public void startService() {
        serviceEvent.fire("서비스 시작: " + message);
        parameterEvent.fire("-d -p");
    }
}