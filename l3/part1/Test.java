import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class Test
{
	@BeforeEach
	void setUp()
	{
		Executor test = new Executor();
		test.Execute('qq*all', '*');
	}

	@Test
	void testString()
	{

		assertEquals('qq all', delCharsFromStr());
	}

	@Test
	void testCount()
	{
		assertEquals('2', getWordsCountFromStr());
	}
}