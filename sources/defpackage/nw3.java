package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nw3 implements cyc {
    public final CharSequence a;
    public final int b;
    public final l26 c;

    public nw3(CharSequence charSequence, int i, l26 l26Var) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = l26Var;
    }

    @Override // defpackage.cyc
    public final Iterator iterator() {
        return new mw3(this);
    }
}
