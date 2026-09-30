package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cv4 {
    public final jv4 a;
    public final byte[] b;

    public cv4(jv4 jv4Var, byte[] bArr) {
        if (jv4Var == null) {
            r82.g("encoding is null");
            throw null;
        }
        if (bArr == null) {
            r82.g("bytes is null");
            throw null;
        }
        this.a = jv4Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv4)) {
            return false;
        }
        cv4 cv4Var = (cv4) obj;
        if (this.a.equals(cv4Var.a)) {
            return Arrays.equals(this.b, cv4Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
