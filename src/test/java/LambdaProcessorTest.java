import org.junit.jupiter.api.Test;

public class LambdaProcessorTest {

	@Test
	void testRequestHandler() {
		new LambdaProcessor().handleRequest(new MessageWrapper("sample-body"), null);
	}
}
