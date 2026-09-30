package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e5e extends ku0 {
    public final boolean p;
    public final f82 q;

    /* JADX WARN: Illegal instructions before constructor call */
    public e5e(oi8 oi8Var, eu0 eu0Var, m5d m5dVar) {
        int iB = kv2.B(m5dVar.f);
        Paint.Cap cap = iB != 0 ? iB != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iB2 = kv2.B(m5dVar.g);
        super(oi8Var, eu0Var, cap, iB2 != 0 ? iB2 != 1 ? iB2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, m5dVar.h, m5dVar.d, m5dVar.e, m5dVar.b, m5dVar.a);
        this.p = m5dVar.i;
        du0 du0VarC0 = m5dVar.c.c0();
        this.q = (f82) du0VarC0;
        du0VarC0.a(this);
        eu0Var.d(du0VarC0);
    }

    @Override // defpackage.ku0, defpackage.ep4
    public final void f(Canvas canvas, Matrix matrix, int i, kq4 kq4Var) {
        if (this.p) {
            return;
        }
        f82 f82Var = this.q;
        this.i.setColor(f82Var.k(f82Var.c.p(), f82Var.b()));
        super.f(canvas, matrix, i, kq4Var);
    }
}
