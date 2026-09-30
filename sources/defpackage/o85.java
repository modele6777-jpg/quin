package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o85 {
    public static final o85 b = new o85(0);
    public final Map a;

    public o85(o85 o85Var) {
        if (o85Var == b) {
            this.a = Collections.EMPTY_MAP;
        } else {
            this.a = Collections.unmodifiableMap(o85Var.a);
        }
    }

    public final void a(s56 s56Var) {
        this.a.put(new m85(s56Var.d.a, s56Var.a), s56Var);
    }

    public o85() {
        this.a = new HashMap();
    }

    public o85(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
