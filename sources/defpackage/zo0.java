package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zo0 extends q55 {
    public final byte[] a;
    public final byte[] b;

    public zo0(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q55) {
            q55 q55Var = (q55) obj;
            boolean z = q55Var instanceof zo0;
            zo0 zo0Var = (zo0) q55Var;
            if (Arrays.equals(this.a, z ? zo0Var.a : zo0Var.a)) {
                zo0 zo0Var2 = (zo0) q55Var;
                if (Arrays.equals(this.b, z ? zo0Var2.b : zo0Var2.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((Arrays.hashCode(this.a) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
