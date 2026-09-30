package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fjg implements k60 {
    public static final fjg c;
    public final boolean a;
    public final String b;

    static {
        lqb lqbVar = new lqb(25, false);
        lqbVar.b = Boolean.FALSE;
        c = new fjg(lqbVar);
    }

    public fjg(lqb lqbVar) {
        this.a = ((Boolean) lqbVar.b).booleanValue();
        this.b = (String) lqbVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fjg)) {
            return false;
        }
        fjg fjgVar = (fjg) obj;
        return ym8.w(null, null) && this.a == fjgVar.a && ym8.w(this.b, fjgVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
