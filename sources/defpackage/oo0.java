package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class oo0 extends dy2 {
    public final Context a;
    public final j52 b;
    public final j52 c;
    public final String d;

    public oo0(Context context, j52 j52Var, j52 j52Var2, String str) {
        if (context == null) {
            r82.g("Null applicationContext");
            throw null;
        }
        this.a = context;
        if (j52Var == null) {
            r82.g("Null wallClock");
            throw null;
        }
        this.b = j52Var;
        if (j52Var2 == null) {
            r82.g("Null monotonicClock");
            throw null;
        }
        this.c = j52Var2;
        if (str != null) {
            this.d = str;
        } else {
            r82.g("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dy2) {
            oo0 oo0Var = (oo0) ((dy2) obj);
            if (this.a.equals(oo0Var.a) && this.b.equals(oo0Var.b) && this.c.equals(oo0Var.c) && this.d.equals(oo0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return ks0.l(sb, this.d, "}");
    }
}
