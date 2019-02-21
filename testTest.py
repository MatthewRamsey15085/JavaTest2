import unittest

class TestStringMethods(unittest.TestCase):

    def test_upper(self):
        self.assertEqual('foo'.upper(), 'FOO')

    def test_isupper(self):
        self.assertTrue('FOO'.isupper())
        self.assertFalse('Foo'.isupper())

    def test_split(self):
        s = 'hello world'
        self.assertEqual(s.split(), ['hello', 'world'])
        # check that s.split fails when the separator is not a string
        with self.assertRaises(TypeError):
            s.split(2)

class DefaultStringSizeTestCase(unittest.TestCase):
    def runTest(self, word):
        #word = 'The widget'
        self.assertEqual(len(word),
                         11, 'incorrect default size')
#unittest.main()
testCase = DefaultStringSizeTestCase()
testCase.runTest("12345123451")
#testCase.test_isupper()

