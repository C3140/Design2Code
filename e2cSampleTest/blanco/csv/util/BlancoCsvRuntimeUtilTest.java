package blanco.csv.util;

import junit.framework.TestCase;
import blanco.sample.csv.util.BlancoCsvRuntimeUtil;

public class BlancoCsvRuntimeUtilTest extends TestCase {

    // public void testReadToken01() throws Exception {
    // Reader stringReader = new StringReader("あいう,えおか");
    // assertEquals("あいう", BlancoCsvRuntimeUtil.readToken(stringReader, ',',
    // false));
    // assertEquals("えおか", BlancoCsvRuntimeUtil.readToken(stringReader, ',',
    // true));
    // }
    //
    // public void testReadToken02() throws Exception {
    // Reader stringReader = new StringReader("あいう,,えおか");
    // assertEquals("あいう", BlancoCsvRuntimeUtil.readToken(stringReader, ',',
    // false));
    // assertEquals("", BlancoCsvRuntimeUtil.readToken(stringReader, ',',
    // false));
    // assertEquals("えおか", BlancoCsvRuntimeUtil.readToken(stringReader, ',',
    // true));
    // }
    //
    // public void testReadTokenWithQuote01() throws Exception {
    // Reader stringReader = new StringReader("\"あいう\",\"\",\"えおか\"");
    // assertEquals("あいう", BlancoCsvRuntimeUtil.readTokenWithQuote(
    // stringReader, ',', false));
    // assertEquals("", BlancoCsvRuntimeUtil.readTokenWithQuote(stringReader,
    // ',', false));
    // assertEquals("えおか", BlancoCsvRuntimeUtil.readTokenWithQuote(
    // stringReader, ',', true));
    // }
    //
    // public void testReadTokenWithQuote02() throws Exception {
    // Reader stringReader = new StringReader("\"あいう\",,えおか");
    // assertEquals("あいう", BlancoCsvRuntimeUtil.readTokenWithQuote(
    // stringReader, ',', false));
    // assertEquals("", BlancoCsvRuntimeUtil.readToken(stringReader, ',',
    // false));
    // assertEquals("えおか", BlancoCsvRuntimeUtil.readToken(stringReader, ',',
    // true));
    // }
    //
    // public void testReadTokenWithQuote03() throws Exception {
    // Reader stringReader = new StringReader("\"あ\"\",いう\",,えおか");
    // assertEquals("あ\",いう", BlancoCsvRuntimeUtil.readTokenWithQuote(
    // stringReader, ',', false));
    // assertEquals("", BlancoCsvRuntimeUtil.readToken(stringReader, ',',
    // false));
    // assertEquals("えおか", BlancoCsvRuntimeUtil.readToken(stringReader, ',',
    // true));
    // }

    public void testGetTokenWithQuote01() throws Exception {
        assertEquals("\"あいう\"", BlancoCsvRuntimeUtil.getTokenWithQuote("あいう"));
        assertEquals("\"あ\"\"いう\"", BlancoCsvRuntimeUtil
                .getTokenWithQuote("あ\"いう"));
        assertEquals("\"\"\"\"", BlancoCsvRuntimeUtil.getTokenWithQuote("\""));
    }
}
