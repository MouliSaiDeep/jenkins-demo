package jenkins_demo.jenkins_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CseRocksTest {
	CseRocks cal = new CseRocks();

	@Test
	void test1() {
		int result = cal.mul(2, 3);
		assertEquals(5, result);
	}
}
