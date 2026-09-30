package defpackage;

import android.view.DragEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ajb implements mj4 {
    public final /* synthetic */ wr4 a;
    public final /* synthetic */ p59 b;

    public ajb(wr4 wr4Var, p59 p59Var) {
        this.a = wr4Var;
        this.b = p59Var;
    }

    @Override // defpackage.mj4
    public final void B0(fj4 fj4Var) {
        this.a.b.b();
    }

    @Override // defpackage.mj4
    public final void J(fj4 fj4Var) {
        this.a.b.f();
    }

    @Override // defpackage.mj4
    public final boolean U0(fj4 fj4Var) {
        this.b.d(fj4Var);
        DragEvent dragEvent = fj4Var.a;
        a52 a52Var = new a52(dragEvent.getClipData());
        dragEvent.getClipDescription();
        sug sugVar = new sug(a52Var, 1, 19);
        return !(sugVar == this.a.b.d(sugVar));
    }

    @Override // defpackage.mj4
    public final void q0(fj4 fj4Var) {
        this.a.b.c();
    }

    @Override // defpackage.mj4
    public final void v(fj4 fj4Var) {
        this.a.b.e();
    }
}
