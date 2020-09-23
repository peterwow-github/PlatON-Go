pragma solidity 0.5.13;

contract AddAssembly {

    function multiply(uint x, uint y) public returns (uint) {
        return x * y;
    }
    function testMultiply(uint x, uint y) public returns (uint) {
        return multiply(x,y);
    }
    function test(uint x, uint y) public returns (uint) {
        return testMultiply(2,3);
    }

    function getTimestamp() public view returns (uint result){
        assembly{
            result := timestamp()
        }
    }

    function getSelfBalance() public view returns (uint result){
        assembly{
            result := selfbalance()
        }
    }

    function getChainId() public view returns (uint result){
        assembly{
            result := chainid()
        }
    }

//    function test1() public{
//        assembly{
//            beginsub(1,2)
//            mul
//            returnsub
//        }
//    }

//    function getChainId() public view returns (uint result){
//        assembly{
//            result := chainid
//        }
//    }
}