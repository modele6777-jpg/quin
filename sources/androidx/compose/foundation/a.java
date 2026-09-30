package androidx.compose.foundation;

import defpackage.g09;
import defpackage.i5c;
import defpackage.ib8;
import defpackage.j09;
import defpackage.l46;
import defpackage.n26;
import defpackage.o17;
import defpackage.r17;
import defpackage.sf2;
import defpackage.t69;
import defpackage.x16;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n26 {
    public final /* synthetic */ r17 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ i5c c;
    public final /* synthetic */ x16 d;

    public a(r17 r17Var, boolean z, i5c i5cVar, x16 x16Var) {
        this.a = r17Var;
        this.b = z;
        this.c = i5cVar;
        this.d = x16Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        l46 l46Var = (l46) obj2;
        ((Number) obj3).intValue();
        l46Var.f0(-1525724089);
        Object objR = l46Var.R();
        if (objR == sf2.a) {
            objR = ib8.e(l46Var);
        }
        t69 t69Var = (t69) objR;
        j09 j09VarD = o17.a(g09.a, t69Var, this.a).D(new ClickableElement(t69Var, null, false, this.b, null, this.c, this.d));
        l46Var.r(false);
        return j09VarD;
    }
}
