package network.platon.contracts.evm;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.GasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.13.1.5.
 */
public class AddAssembly extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610229806100206000396000f3fe608060405234801561001057600080fd5b50600436106100625760003560e01c8063042116f114610067578063048a5fed146100b3578063165c4a16146100d1578063188ec3561461011d5780633408e4701461013b578063eb8ac92114610159575b600080fd5b61009d6004803603604081101561007d57600080fd5b8101908080359060200190929190803590602001909291905050506101a5565b6040518082815260200191505060405180910390f35b6100bb6101b9565b6040518082815260200191505060405180910390f35b610107600480360360408110156100e757600080fd5b8101908080359060200190929190803590602001909291905050506101c1565b6040518082815260200191505060405180910390f35b6101256101ce565b6040518082815260200191505060405180910390f35b6101436101d6565b6040518082815260200191505060405180910390f35b61018f6004803603604081101561016f57600080fd5b8101908080359060200190929190803590602001909291905050506101de565b6040518082815260200191505060405180910390f35b60006101b183836101c1565b905092915050565b600047905090565b6000818302905092915050565b600042905090565b600046905090565b60006101ec600260036101a5565b90509291505056fea265627a7a723158209d330a00167877564ca71baac64394329ed91d35c8d4c9199e406fc9e86fb90a64736f6c634300050d0032";

    public static final String FUNC_GETCHAINID = "getChainId";

    public static final String FUNC_GETSELFBALANCE = "getSelfBalance";

    public static final String FUNC_GETTIMESTAMP = "getTimestamp";

    public static final String FUNC_MULTIPLY = "multiply";

    public static final String FUNC_TEST = "test";

    public static final String FUNC_TESTMULTIPLY = "testMultiply";

    protected AddAssembly(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    protected AddAssembly(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }

    public RemoteCall<BigInteger> getChainId() {
        final Function function = new Function(FUNC_GETCHAINID, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getSelfBalance() {
        final Function function = new Function(FUNC_GETSELFBALANCE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getTimestamp() {
        final Function function = new Function(FUNC_GETTIMESTAMP, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> multiply(BigInteger x, BigInteger y) {
        final Function function = new Function(
                FUNC_MULTIPLY, 
                Arrays.<Type>asList(new Uint256(x),
                new Uint256(y)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> test(BigInteger x, BigInteger y) {
        final Function function = new Function(
                FUNC_TEST, 
                Arrays.<Type>asList(new Uint256(x),
                new Uint256(y)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> testMultiply(BigInteger x, BigInteger y) {
        final Function function = new Function(
                FUNC_TESTMULTIPLY, 
                Arrays.<Type>asList(new Uint256(x),
                new Uint256(y)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<AddAssembly> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return deployRemoteCall(AddAssembly.class, web3j, credentials, contractGasProvider, BINARY,  "", chainId);
    }

    public static RemoteCall<AddAssembly> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return deployRemoteCall(AddAssembly.class, web3j, transactionManager, contractGasProvider, BINARY,  "", chainId);
    }

    public static AddAssembly load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return new AddAssembly(contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    public static AddAssembly load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return new AddAssembly(contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }
}
