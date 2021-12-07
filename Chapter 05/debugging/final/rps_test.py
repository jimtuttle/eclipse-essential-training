'''
Created on Jan 28, 2021

@author: toddperkins
'''
import unittest
import rps


class Test(unittest.TestCase):


    def testName(self):
        assert('player' == rps.get_winner('rock', 'scissors'))
        assert('player' == rps.get_winner('scissors', 'paper'))
        assert('player' == rps.get_winner('paper', 'rock'))
        assert('everybody' == rps.get_winner('paper', 'paper'))
        assert('computer' == rps.get_winner('scissors', 'rock'))
        assert('computer' == rps.get_winner('rock', 'paper'))
        assert('computer' == rps.get_winner('paper', 'scissors'))


if __name__ == "__main__":
    #import sys;sys.argv = ['', 'Test.testName']
    unittest.main()