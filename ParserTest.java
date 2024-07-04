//package com.example.cmsc330proj1;
//
//
//import org.junit.Test;
//import org.junit.Before;
//import org.junit.After;
//import static org.junit.Assert.*;
//
//import java.io.File;
//import java.io.IOException;
//import java.net.URL;
//
//public class ParserTest {
//
//    private Parser parser;
//
//    @Before
//    public void setUp() throws IOException {
//        // Load the test file from resources
//        File testFile = getResourceFile("/Users/nardoslemma/Desktop/cmsc 335");
//        parser = new Parser(testFile);
//    }
//
//    @After
//    public void tearDown() {
//        // Clean up after each test
//        parser = null;
//    }
//
//    @Test
//    public void testParseScene_InvalidFile() {
//        try {
//            File invalidFile = getResourceFile("invalid_scene_definition.txt");
//            Parser invalidParser = new Parser(invalidFile);
//            invalidParser.parseScene();
//            fail("Expected a SyntaxError to be thrown");
//        } catch (IOException e) {
//            fail("Unexpected IOException: " + e.getMessage());
//        } catch (SyntaxError e) {
//            // Expected exception, no action needed
//        } catch (LexicalError e) {
//            fail("Unexpected LexicalError: " + e.getMessage());
//        }
//    }
//
//    @Test
//    public void testGetNumberList() throws IOException, LexicalError, SyntaxError {
//        // Assuming the lexer is positioned correctly to read a number list
//        int[] expected = {3, 5};
//        int[] actual = parser.getNumberList(2);
//        assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testGetNumberListVariableLength() throws IOException, LexicalError, SyntaxError {
//        // Assuming the lexer is positioned correctly to read a variable length number list
//        int[] expected = {1, 2, 3, 4};
//        int[] actual = parser.getNumberList();
//        assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testVerifyNextToken() throws IOException, LexicalError, SyntaxError {
//        // Assuming the lexer is positioned correctly to get the next token
//        parser.verifyNextToken(Token.SCENE);
//        assertEquals(Token.SCENE, parser.token);
//    }
//
//    @Test
//    public void testVerifyCurrentToken() throws SyntaxError {
//        // Assuming the lexer is positioned correctly to get the current token
//        parser.token = Token.SCENE;
//        parser.verifyCurrentToken(Token.SCENE);
//        // If no exception is thrown, the test passes
//    }
//
//    @Test(expected = SyntaxError.class)
//    public void testVerifyCurrentToken_Failure() throws SyntaxError {
//        // Assuming the lexer is positioned correctly to get the current token
//        parser.token = Token.IDENTIFIER;
//        parser.verifyCurrentToken(Token.SCENE);
//        // Expected a SyntaxError to be thrown
//    }
//
//    // Helper method to load a file from the resources directory
//    private File getResourceFile(String fileName) {
//        URL resource = getClass().getClassLoader().getResource(fileName);
//        if (resource == null) {
//            throw new IllegalArgumentException("File not found: " + fileName);
//        }
//        return new File(resource.getFile());
//    }
//}
