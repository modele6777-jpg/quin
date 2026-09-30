package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ru8 {
    public static final HashMap c = new HashMap();
    public final String a;
    public final em7 b;

    public ru8(em7 em7Var, String str) {
        this.a = str;
        this.b = em7Var;
    }

    public final String toString() {
        return ub3.l(new StringBuilder("Metadata.Key("), this.a, ')');
    }
}
