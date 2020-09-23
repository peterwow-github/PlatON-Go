package network.platon.test.evm.function.assembly;

import network.platon.contracts.evm.AddAssembly;
import network.platon.test.evm.beforetest.ContractPrepareTest;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

public class AddAssemblyTest extends ContractPrepareTest {

    @Before
    public void before() {
        this.prepare();
    }

    @Test
    public void test(){
        try{
            AddAssembly addAssembly = AddAssembly.deploy(web3j, transactionManager, provider, chainId).send();
            System.out.println(addAssembly.getTimestamp().send());
            System.out.println(System.currentTimeMillis());
            System.out.println(addAssembly.getChainId().send());
//            System.out.println(addAssembly.getSelfBalance().send());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
