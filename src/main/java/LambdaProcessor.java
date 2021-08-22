import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LambdaProcessor implements RequestHandler<MessageWrapper, MessageWrapper> {
	public MessageWrapper handleRequest(MessageWrapper xml, Context context) {
		log.info("Info - Log from Slf4J");
		log.warn("Warn - Log from Slf4J");

		try {
			throw new RuntimeException("sample exception");
		} catch (RuntimeException re) {
			log.error("Sample exception log", re);
		}

		return new MessageWrapper("example response");
	}
}
