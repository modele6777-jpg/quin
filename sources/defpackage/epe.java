package defpackage;

import android.view.DragEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class epe implements mj4 {
    public final /* synthetic */ loe a;
    public final /* synthetic */ moe b;
    public final /* synthetic */ loe c;
    public final /* synthetic */ loe d;
    public final /* synthetic */ loe e;
    public final /* synthetic */ loe f;

    public epe(loe loeVar, moe moeVar, loe loeVar2, loe loeVar3, loe loeVar4, loe loeVar5) {
        this.a = loeVar;
        this.b = moeVar;
        this.c = loeVar2;
        this.d = loeVar3;
        this.e = loeVar4;
        this.f = loeVar5;
    }

    @Override // defpackage.mj4
    public final void C0(fj4 fj4Var) {
        DragEvent dragEvent = fj4Var.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
        ape apeVar = this.d.b;
        bv7 bv7VarB = apeVar.G0.b();
        if (bv7VarB != null && bv7VarB.h()) {
            jFloatToRawIntBits = bv7VarB.C(jFloatToRawIntBits);
        }
        int iD = apeVar.G0.d(jFloatToRawIntBits, true);
        if (iD >= 0) {
            apeVar.F0.j(u3c.b(iD, iD));
        }
        apeVar.H0.A(sg6.a, jFloatToRawIntBits);
    }

    @Override // defpackage.mj4
    public final void J(fj4 fj4Var) {
        this.f.d(fj4Var);
    }

    @Override // defpackage.mj4
    public final boolean U0(fj4 fj4Var) {
        this.a.d(fj4Var);
        DragEvent dragEvent = fj4Var.a;
        a52 a52Var = new a52(dragEvent.getClipData());
        dragEvent.getClipDescription();
        this.b.z(a52Var, new b52());
        return Boolean.TRUE.booleanValue();
    }

    @Override // defpackage.mj4
    public final void q0(fj4 fj4Var) {
        this.e.d(fj4Var);
    }

    @Override // defpackage.mj4
    public final void v(fj4 fj4Var) {
        this.c.d(fj4Var);
    }

    @Override // defpackage.mj4
    public final void B0(fj4 fj4Var) {
    }
}
