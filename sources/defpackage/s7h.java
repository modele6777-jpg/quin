package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s7h {
    public final Context a;
    public final u8e b;

    public s7h(Context context, u8e u8eVar) {
        this.a = context;
        this.b = u8eVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s7h)) {
            return false;
        }
        s7h s7hVar = (s7h) obj;
        if (!this.a.equals(s7hVar.a)) {
            return false;
        }
        u8e u8eVar = s7hVar.b;
        u8e u8eVar2 = this.b;
        if (u8eVar2 == null) {
            return u8eVar == null;
        }
        return u8eVar2.equals(u8eVar);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        u8e u8eVar = this.b;
        return (u8eVar == null ? 0 : u8eVar.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        ub3.v(sb, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
