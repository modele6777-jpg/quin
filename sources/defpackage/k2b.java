package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k2b {
    public static final LinkedHashMap a;

    static {
        iy9[] iy9VarArr = {new iy9(by4.UNKNOWN_ERR, new k(26)), new iy9(by4.ABORT_ERR, new k(0)), new iy9(by4.ATTESTATION_NOT_PRIVATE_ERR, new k(16)), new iy9(by4.CONSTRAINT_ERR, new k(1)), new iy9(by4.DATA_ERR, new k(3)), new iy9(by4.INVALID_STATE_ERR, new k(10)), new iy9(by4.ENCODING_ERR, new k(4)), new iy9(by4.NETWORK_ERR, new k(12)), new iy9(by4.NOT_ALLOWED_ERR, new k(14)), new iy9(by4.NOT_SUPPORTED_ERR, new k(17)), new iy9(by4.SECURITY_ERR, new k(22)), new iy9(by4.TIMEOUT_ERR, new k(24))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(bm8.F(12));
        bm8.O(linkedHashMap, iy9VarArr);
        a = linkedHashMap;
    }
}
