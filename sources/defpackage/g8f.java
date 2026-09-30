package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g8f {
    public static final g8f d = new g8f(pu4.a, qu4.a, null);
    public final List a;
    public final Map b;
    public final g8f c;

    public g8f(List list, Map map, g8f g8fVar) {
        this.a = list;
        this.b = map;
        this.c = g8fVar;
    }

    public final ao7 a(int i) {
        ao7 ao7Var = (ao7) this.b.get(Integer.valueOf(i));
        if (ao7Var != null) {
            return ao7Var;
        }
        g8f g8fVar = this.c;
        if (g8fVar != null) {
            return g8fVar.a(i);
        }
        return null;
    }
}
