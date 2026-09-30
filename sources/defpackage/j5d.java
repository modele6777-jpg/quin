package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j5d extends eu0 {
    public final km2 D;
    public final sg2 E;
    public final mq4 F;

    public j5d(oi8 oi8Var, tu7 tu7Var, sg2 sg2Var, uh8 uh8Var) {
        super(oi8Var, tu7Var);
        this.E = sg2Var;
        km2 km2Var = new km2(oi8Var, this, new e5d("__container", tu7Var.a, false), uh8Var);
        this.D = km2Var;
        List list = Collections.EMPTY_LIST;
        km2Var.b(list, list);
        a82 a82Var = this.p.x;
        if (a82Var != null) {
            this.F = new mq4(this, this, a82Var);
        }
    }

    @Override // defpackage.eu0, defpackage.ep4
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        this.D.c(rectF, this.n, z);
    }

    @Override // defpackage.eu0
    public final void i(Canvas canvas, Matrix matrix, int i, kq4 kq4Var) {
        mq4 mq4Var = this.F;
        if (mq4Var != null) {
            kq4Var = mq4Var.b(matrix, i);
        }
        this.D.f(canvas, matrix, i, kq4Var);
    }

    @Override // defpackage.eu0
    public final vd9 j() {
        vd9 vd9Var = this.p.w;
        return vd9Var != null ? vd9Var : this.E.p.w;
    }
}
