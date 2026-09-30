package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gj7 extends aj7 {
    public String i;
    public boolean j;

    @Override // defpackage.aj7
    public final nh7 J() {
        return new ti7((LinkedHashMap) this.h);
    }

    @Override // defpackage.aj7
    public final void M(nh7 nh7Var, String str) {
        str.getClass();
        nh7Var.getClass();
        if (!this.j) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.h;
            String str2 = this.i;
            if (str2 == null) {
                pa7.g0("tag");
                throw null;
            }
            linkedHashMap.put(str2, nh7Var);
            this.j = true;
            return;
        }
        if (nh7Var instanceof yi7) {
            this.i = ((yi7) nh7Var).c();
            this.j = false;
        } else {
            if (nh7Var instanceof ti7) {
                throw kj0.v(wi7.b);
            }
            if (nh7Var instanceof yg7) {
                throw kj0.v(ah7.b);
            }
            ap.c();
        }
    }
}
