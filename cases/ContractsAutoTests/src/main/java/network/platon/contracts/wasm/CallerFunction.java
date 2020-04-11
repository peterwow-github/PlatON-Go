package network.platon.contracts.wasm;

import java.math.BigInteger;
import java.util.Arrays;
import org.web3j.abi.WasmFunctionEncoder;
import org.web3j.abi.datatypes.WasmFunction;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.WasmContract;
import org.web3j.tx.gas.GasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the org.web3j.codegen.WasmFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with platon-web3j version 0.9.1.2-SNAPSHOT.
 */
public class CallerFunction extends WasmContract {
    private static String BINARY_0 = "0x0061736d01000000013f0b60027f7f0060017f0060017f017f60000060037f7f7f0060037f7f7f017f60047f7f7f7f006000017f60027f7f017f60077f7f7f7f7f7f7f0060017f017e02710503656e760c706c61746f6e5f70616e6963000303656e760d706c61746f6e5f63616c6c6572000103656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000703656e7610706c61746f6e5f6765745f696e707574000103656e760d706c61746f6e5f72657475726e00000333320305050302020705030308040401090408060001030101050202020206000002010204000002000000000400010100030a000405017001030305030100020615037f0141f08a040b7f0041f08a040b7f0041e80a0b075406066d656d6f72790200115f5f7761736d5f63616c6c5f63746f727300050b5f5f686561705f6261736503010a5f5f646174615f656e6403020f5f5f66756e63735f6f6e5f65786974001906696e766f6b6500340908010041010b021b310acf3c323600100841a40a420037020041ac0a410036020041a40a10184101101a41b00a420037020041b80a410036020041b00a10184102101a0ba20a010d7f2002410f6a210f410020026b21072002410e6a210a410120026b210e2002410d6a210d410220026b210c0340200020056a2103200120056a220441037145200220054672450440200320042d00003a0000200f417f6a210f200741016a2107200a417f6a210a200e41016a210e200d417f6a210d200c41016a210c200541016a21050c010b0b200220056b210602400240024002402003410371220b044020064120490d03200b4101460d01200b4102460d02200b4103470d032003200120056a280200220a3a0000200041016a210b200220056b417f6a210c200521030340200c4113494504402003200b6a2208200120036a220941046a2802002206411874200a41087672360200200841046a200941086a2802002204411874200641087672360200200841086a2009410c6a28020022064118742004410876723602002008410c6a200941106a280200220a411874200641087672360200200341106a2103200c41706a210c0c010b0b2002417f6a2007416d2007416d4b1b200f6a4170716b20056b2106200120036a41016a2104200020036a41016a21030c030b2006210403402004411049450440200020056a2203200120056a2202290200370200200341086a200241086a290200370200200541106a2105200441706a21040c010b0b027f2006410871450440200120056a2104200020056a0c010b200020056a2202200120056a2201290200370200200141086a2104200241086a0b21052006410471044020052004280200360200200441046a2104200541046a21050b20064102710440200520042f00003b0000200441026a2104200541026a21050b2006410171450d03200520042d00003a000020000f0b2003200120056a2206280200220a3a0000200341016a200641016a2f00003b0000200041036a210b200220056b417d6a210720052103034020074111494504402003200b6a2208200120036a220941046a2802002206410874200a41187672360200200841046a200941086a2802002204410874200641187672360200200841086a2009410c6a28020022064108742004411876723602002008410c6a200941106a280200220a410874200641187672360200200341106a2103200741706a21070c010b0b2002417d6a200c416f200c416f4b1b200d6a4170716b20056b2106200120036a41036a2104200020036a41036a21030c010b2003200120056a2206280200220d3a0000200341016a200641016a2d00003a0000200041026a210b200220056b417e6a210720052103034020074112494504402003200b6a2208200120036a220941046a2802002206411074200d41107672360200200841046a200941086a2802002204411074200641107672360200200841086a2009410c6a28020022064110742004411076723602002008410c6a200941106a280200220d411074200641107672360200200341106a2103200741706a21070c010b0b2002417e6a200e416e200e416e4b1b200a6a4170716b20056b2106200120036a41026a2104200020036a41026a21030b20064110710440200320042d00003a00002003200428000136000120032004290005370005200320042f000d3b000d200320042d000f3a000f200441106a2104200341106a21030b2006410871044020032004290000370000200441086a2104200341086a21030b2006410471044020032004280000360000200441046a2104200341046a21030b20064102710440200320042f00003b0000200441026a2104200341026a21030b2006410171450d00200320042d00003a00000b20000bfc0202027f017e02402002450d00200020013a0000200020026a2203417f6a20013a000020024103490d00200020013a0002200020013a00012003417d6a20013a00002003417e6a20013a000020024107490d00200020013a00032003417c6a20013a000020024109490d002000410020006b41037122046a2203200141ff017141818284086c22013602002003200220046b417c7122046a2202417c6a200136020020044109490d002003200136020820032001360204200241786a2001360200200241746a200136020020044119490d002003200136021820032001360214200320013602102003200136020c200241706a20013602002002416c6a2001360200200241686a2001360200200241646a20013602002001ad220542208620058421052004200341047141187222016b2102200120036a2101034020024120490d0120012005370300200141186a2005370300200141106a2005370300200141086a2005370300200141206a2101200241606a21020c000b000b20000b3501017f230041106b220041f08a0436020c418408200028020c41076a41787122003602004180082000360200418c083f003602000b9f0101047f230041106b220224002002200036020c027f02400240024020000440418c08200041086a22014110762200418c082802006a2203360200418408200141840828020022016a41076a4178712204360200200341107420044d0d0120000d020c030b41000c030b418c08200341016a360200200041016a21000b200040000d0010000b20012002410c6a410410061a200141086a0b200241106a24000b2f01027f2000410120001b2100034002402000100922010d004190082802002202450d0020021103000c010b0b20010b7a01027f41d30a2100024003402000410371044020002d0000450d02200041016a21000c010b0b2000417c6a21000340200041046a22002802002201417f73200141fffdfb776a7141808182847871450d000b0340200141ff0171450d01200041016a2d00002101200041016a21000c000b000b200041d30a6b0bc10301067f024020002001460d00027f02400240200120006b20026b410020024101746b4b044020002001734103712103200020014f0d012003450d0220000c030b20002001200210060f0b024020030d002001417f6a21030340200020026a220441037104402002450d052004417f6a200220036a2d00003a00002002417f6a21020c010b0b2000417c6a21032001417c6a2104034020024104490d01200220036a200220046a2802003602002002417c6a21020c000b000b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b000b200241046a21062002417f73210503400240200120046a2107200020046a2208410371450d0020022004460d03200820072d00003a00002006417f6a2106200541016a2105200441016a21040c010b0b200220046b21014100210303402001410449450440200320086a200320076a280200360200200341046a21032001417c6a21010c010b0b200320076a210120022005417c2005417c4b1b20066a417c716b20046b2102200320086a0b210303402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b000b20000b0a0041940841013602000b0a0041940841003602000b4d01017f20004200370200200041086a2202410036020020012d0000410171450440200020012902003702002002200141086a28020036020020000f0b200020012802082001280204101020000b6401027f2002417049044002402002410a4d0440200020024101743a0000200041016a21030c010b200241106a4170712204100a21032000200236020420002004410172360200200020033602080b2003200120021011200220036a41003a00000f0b000b13002002047f20002001200210060520000b1a0b130020002d0000410171044020002802081a0b0bb70101027f416e20016b20024f0440027f200041016a20002d0000410171450d001a20002802080b2108027f416f200141e6ffffff074b0d001a410b20014101742207200120026a220220022007491b2202410b490d001a200241106a4170710b2207100a21022005044020022006200510110b200320046b220322060440200220056a200420086a200610110b200020023602082000200320056a220136020420002007410172360200200120026a41003a00000f0b000b13002002047f200020012002100c0520000b1a0bf40101037f027f20002d00002203410171220445044020034101760c010b20002802040b220341004f0440410a2102027f02400240200404402000280200417e71417f6a21020b200220036b200149044020002002200120036a20026b20034100200141d30a10130c010b2001450d0020040d01200041016a0c020b20000f0b20002802080b22022003047f200120026a200220031014200141d30a6a41d30a200220036a41d30a4b1b41d30a200241d30a4d1b0541d30a0b20011014200120036a2101024020002d0000410171450440200020014101743a00000c010b200020013602040b200120026a41003a000020000f0b000be30201057f027f20002d00002205410171220445044020054101760c010b20002802040b220641004f04402006200120062001491b2101410a2105200404402000280200417e71417f6a21050b200120066b20056a200349044020002005200320066a20016b20056b200620012003200210130f0b2004047f200028020805200041016a0b21040240024020012003460440200321010c010b200620016b2207450d00200120034b04402004200220031014200320046a200120046a200710140c020b0240200420066a20024d200420024f720d00200120046a20024b04402004200220011014200320016b200220036a2102200121084100210121030c010b2002200320016b6a21020b200420086a220520036a200120056a200710140b200420086a2002200310140b200320016b20066a2101024020002d0000410171450440200020014101743a00000c010b200020013602040b200120046a41003a00000f0b000b6d01027f2001417049044002402001410a4d0440200020014101743a0000200041016a21020c010b200141106a4170712203100a21022000200136020420002003410172360200200020023602080b2001047f20024130200110070520020b1a200120026a41003a00000f0b000b2301017f03402001410c46450440200020016a4100360200200141046a21010c010b0b0b7601037f100d41980828020021000340200004400340419c08419c082802002201417f6a22023602002001410148450440200020024102746a22004184016a280200200041046a280200100e110100100d41980828020021000c010b0b419c084120360200419808200028020022003602000c010b0b0b960101027f100d419808280200220145044041980841a00836020041a00821010b0240419c08280200220241204604404184021009220104402001410041840210071a0b2001450d0120014198082802003602004198082001360200419c084100360200410021020b419c08200241016a360200200120024102746a22014184016a4100360200200141046a2000360200100e0f0b100e0b070041a40a10120b780020004200370210200042ffffffff0f3702082000200129020037020002402002410871450d002000101d20012802044f0d002002410471450440200042003702000c010b10000b024002402002411071450d002000101d20012802044d0d0020024104710d01200042003702000b20000f0b100020000b290002402000280204044020002802002c0000417f4c0d0141010f0b41000f0b2000101e2000101f6a0b240002402000280204450d0020002802002c0000417f4c0d0041000f0b2000102441016a0b8a0301047f0240024020002802040440200010254101210220002802002c00002201417f4c0d010c020b41000f0b200141ff0171220241b7014d0440200241807f6a0f0b02400240200141ff0171220141bf014d04400240200041046a22042802002201200241c97e6a22034d047f100020042802000520010b4102490d0020002802002d00010d0010000b200341054f044010000b20002802002d000145044010000b410021024100210103402001200346450440200028020020016a41016a2d00002002410874722102200141016a21010c010b0b200241384f0d010c020b200141f7014d0440200241c07e6a0f0b0240200041046a22042802002201200241897e6a22034d047f100020042802000520010b4102490d0020002802002d00010d0010000b200341054f044010000b20002802002d000145044010000b410021024100210103402001200346450440200028020020016a41016a2d00002002410874722102200141016a21010c010b0b20024138490d010b200241ff7d490d010b100020020f0b20020b3902017f017e230041306b2201240020012000290200220237031020012002370308200141186a200141086a4114101c101d200141306a24000b5e01027f2000027f027f2001280200220504404100200220036a200128020422014b2001200249720d011a410020012003490d021a200220056a2104200120026b20032003417f461b0c020b41000b210441000b360204200020043602000b2101017f2001101f220220012802044b044010000b200020012001101e200210210b900302097f017e230041406a220224002001280208220341004b0440200241386a20011022200220022903383703182001200241186a102036020c200241306a20011022410021032001027f410020022802302205450d001a410020022802342207200128020c2204490d001a200720042004417f461b210820050b360210200141146a2008360200200141086a41003602000b200141106a2104200141146a21072001410c6a2105200141086a210803400240200341004f0d002007280200450d00200241306a2001102241002103027f20022802302209044041002002280234220a20052802002206490d011a200a20066b2103200620096a0c010b41000b210620072003360200200420063602002002200336022c2002200636022820022002290328370310200241306a20044100200241106a1020102120042002290330220b37020020052005280200200b422088a76a3602002008200828020041016a22033602000c010b0b20022004290200220b3703202002200b3703082000200241086a4114101c1a200241406b24000b4101017f02402000280204450d0020002802002d0000220041bf014d0440200041b801490d01200041c97e6a0f0b200041f801490d00200041897e6a21010b20010b4401017f200028020445044010000b0240200028020022012d0000418101470d00200041046a28020041014d047f100020002802000520010b2c00014100480d0010000b0b9f0101037f02402000280204044020001025200028020022022c000022014100480d0120014100470f0b41000f0b027f4101200141807f460d001a200141ff0171220341b7014d0440200041046a28020041014d047f100020002802000520020b2d00014100470f0b4100200341bf014b0d001a200041046a280200200141ff017141ca7e6a22014d047f100020002802000520020b20016a2d00004100470b0b2c002000200220016b22021029200028020020002802046a2001200210061a2000200028020420026a3602040b9e0201077f02402001450d002000410c6a2107200041106a2105200041046a21060340200528020022022007280200460d01200241786a28020020014904401000200528020021020b200241786a2203200328020020016b220136020020010d01200520033602002000410120062802002002417c6a28020022016b2202102a220341016a20024138491b2204200628020022086a102b2004200120002802006a22046a2004200820016b100c1a0240200241374d0440200028020020016a200241406a3a00000c010b200341f7016a220441ff014d0440200028020020016a20043a00002000280200200120036a6a210103402002450d02200120023a0000200241087621022001417f6a21010c000b000b10000b410121010c000b000b0b1b00200028020420016a220120002802084b044020002001102c0b0b1e01017f03402000044020004108762100200141016a21010c010b0b20010b0f0020002001102c200020013602040b3901017f200028020820014904402001100922022000280200200028020410061a20002802001a200041086a2001360200200020023602000b0b2500200041011029200028020020002802046a20013a00002000200028020441016a3602040b2b01027f2001102a220241b7016a22034180024e044010000b2000200341ff0171102d200020012002102f0b3d002000200028020420026a102b200028020020002802046a417f6a2100034020010440200020013a0000200141087621012000417f6a21000c010b0b0ba00101037f230041106b2202240020012802002103024002400240024020012802042201410146044020032c000022044100480d012000200441ff0171102d0c040b200141374b0d010b200020014180017341ff0171102d0c010b20002001102e0b2002200136020c2002200336020820022002290308370300200020022802002201200120022802046a10272000410010280b200041011028200241106a24000b070041b00a10120bb10301067f230041e0006b220124004114100a22024200370000200241106a4100360000200241086a4200370000200120023602302001200241146a22033602382001200336023420021001200141186a200141306a10332001200141306a1033200141d8006a410036020020014200370350200141d0006a41d60a41001010200141c8006a410036020020014200370340200141406b200128025420012d0050220241017620024101711b220241286a1017027f20012d00502203410171450440200141d0006a410172210420034101760c010b2001280258210420012802540b210541002103200141406b2002200420051016200141406b4101722104200141c8006a21050340200341144704402005280200200420012d00404101711b20026a200120036a22062d000041047641d70a6a2d00003a00002005280200200420012d00404101711b20026a41016a20062d0000410f7141d70a6a2d00003a0000200341016a2103200241026a21020c010b0b200141d0006a10122000200141406b100b10152202290200370200200041086a200241086a28020036020020021018200141406b1012200141e0006a24000b6601037f034020024114470440200020026a41003a0000200241016a21020c010b0b2001280200210341002102200141046a210103400240200241134b0d00200220036a22042001280200460d00200020026a20042d00003a0000200241016a21020c010b0b0b8a0602077f017e230041f0006b22002400100510022201100922021003200020013602442000200236024020002000290340370308200041406b200041106a200041086a411c101c1023200041406b102502400240200041406b1026450d002000280244450d0020002802402d000041c001490d010b10000b200041406b101f2204200028024422034b04401000200028024421030b2000280240210602400240027f027f024020030440410020062c00002201417f4a0d031a200141ff0171220241bf014b0d014100200141ff017141b801490d021a200241c97e6a0c020b410120060d021a410021010c030b4100200141ff017141f801490d001a200241897e6a0b41016a0b2105410021012003200449200420056a20034b720d004100210220032005490d01200520066a2102200320056b20042004417f461b22014109490d0110000c010b410021020b0340200104402001417f6a210120023100002007420886842107200241016a21020c010b0b0240024002400240024002402007500d0041bc0a10352007510d0541c10a10352007520d00200041306a10322000410036024820004200370340200041406b41001036200041d4006a41003602002000420037024c41012102200041d8006a200041306a100f220328020420002d00582201410176200141017122041b2201450d0420014101470d012003280208200341016a20041b2c0000417f4a0d040c020b10000c040b200141384f0d010b200141016a21020c010b200141016a210203402001450d01200241016a2102200141087621010c000b000b20031012200041c8006a2802002002490440200041406b200210360b2000200041d8006a200041306a100f2201280208200141016a20002d0058220241017122031b36026820002001280204200241017620031b36026c20002000290368370300200041406b2000103020011012200041cc006a2201280200200041d0006a28020047044010000b200028024020002802441004200128020022010440200041d0006a20013602000b20002802401a200041306a10120b200041f0006a24000b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b3801017f2000280208200149044020011009200028020020002802041006210220002802001a200041086a2001360200200020023602000b0b0b32010041bc0a0b2b696e6974006765745f706c61746f6e5f63616c6c6572003078000030313233343536373839616263646566";

    public static String BINARY = BINARY_0;

    public static final String FUNC_GET_PLATON_CALLER = "get_platon_caller";

    protected CallerFunction(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected CallerFunction(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<CallerFunction> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(CallerFunction.class, web3j, credentials, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<CallerFunction> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(CallerFunction.class, web3j, transactionManager, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<CallerFunction> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(CallerFunction.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public static RemoteCall<CallerFunction> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(CallerFunction.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public RemoteCall<String> get_platon_caller() {
        final WasmFunction function = new WasmFunction(FUNC_GET_PLATON_CALLER, Arrays.asList(), String.class);
        return executeRemoteCall(function, String.class);
    }

    public static CallerFunction load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new CallerFunction(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static CallerFunction load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new CallerFunction(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
