package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qq0 {
    public final String a;
    public final byte[] b;
    public final lua c;

    public qq0(String str, byte[] bArr, lua luaVar) {
        this.a = str;
        this.b = bArr;
        this.c = luaVar;
    }

    public static ta0 a() {
        ta0 ta0Var = new ta0(9, false);
        ta0Var.b = lua.a;
        return ta0Var;
    }

    public final qq0 b(lua luaVar) {
        ta0 ta0VarA = a();
        ta0VarA.N(this.a);
        if (luaVar == null) {
            r82.g("Null priority");
            return null;
        }
        ta0VarA.b = luaVar;
        ta0VarA.d = this.b;
        return ta0VarA.f();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qq0) {
            qq0 qq0Var = (qq0) obj;
            if (this.a.equals(qq0Var.a) && Arrays.equals(this.b, qq0Var.b) && this.c.equals(qq0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return ks0.l(sb, strEncodeToString, ")");
    }
}
