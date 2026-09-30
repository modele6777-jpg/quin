package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ve5 implements cyc {
    public final cyc a;
    public final boolean b;
    public final a26 c;

    public ve5(cyc cycVar, boolean z, a26 a26Var) {
        this.a = cycVar;
        this.b = z;
        this.c = a26Var;
    }

    @Override // defpackage.cyc
    public final Iterator iterator() {
        return new ue5(this);
    }
}
