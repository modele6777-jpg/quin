package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.adjust.sdk.network.ErrorCodes;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vt3 extends q1f {
    public static final vt3 G = new vt3(new ut3());
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final SparseArray E;
    public final SparseBooleanArray F;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        kv2.v(1000, ErrorCodes.SERVER_RETRY_IN, ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION, ErrorCodes.MALFORMED_URL_EXCEPTION, ErrorCodes.PROTOCOL_EXCEPTION);
        kv2.v(ErrorCodes.SOCKET_TIMEOUT_EXCEPTION, ErrorCodes.SSL_HANDSHAKE_EXCEPTION, ErrorCodes.IO_EXCEPTION, 1008, 1009);
        kv2.v(1010, 1011, 1012, 1013, 1014);
        pqf.D(1015);
        pqf.D(1016);
        pqf.D(1017);
        pqf.D(1018);
    }

    public vt3(ut3 ut3Var) {
        super(ut3Var);
        this.x = ut3Var.x;
        this.y = ut3Var.y;
        this.z = ut3Var.z;
        this.A = ut3Var.A;
        this.B = ut3Var.B;
        this.C = ut3Var.C;
        this.D = ut3Var.D;
        this.E = ut3Var.E;
        this.F = ut3Var.F;
    }

    @Override // defpackage.q1f
    public final pj a() {
        return new ut3(this);
    }

    @Override // defpackage.q1f
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vt3.class == obj.getClass()) {
            vt3 vt3Var = (vt3) obj;
            if (super.equals(vt3Var) && this.x == vt3Var.x && this.y == vt3Var.y && this.z == vt3Var.z && this.A == vt3Var.A && this.B == vt3Var.B && this.C == vt3Var.C && this.D == vt3Var.D) {
                SparseBooleanArray sparseBooleanArray = vt3Var.F;
                SparseBooleanArray sparseBooleanArray2 = this.F;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = vt3Var.E;
                    SparseArray sparseArray2 = this.E;
                    int size2 = sparseArray2.size();
                    if (sparseArray.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray2.valueAt(i2);
                                Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        i1f i1fVar = (i1f) entry.getKey();
                                        if (!map2.containsKey(i1fVar) || !Objects.equals(entry.getValue(), map2.get(i1fVar))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.q1f
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.x ? 1 : 0)) * 961) + (this.y ? 1 : 0)) * 961) + (this.z ? 1 : 0)) * 28629151) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 961) + (this.D ? 1 : 0)) * 31;
    }
}
