package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zud extends du0 {
    public final PointF h;
    public final PointF i;
    public final f82 j;
    public final f82 k;

    public zud(f82 f82Var, f82 f82Var2) {
        super(Collections.EMPTY_LIST);
        this.h = new PointF();
        this.i = new PointF();
        this.j = f82Var;
        this.k = f82Var2;
        g(this.d);
    }

    @Override // defpackage.du0
    public final Object d() {
        PointF pointF = this.h;
        float f = pointF.x;
        PointF pointF2 = this.i;
        pointF2.set(f, 0.0f);
        pointF2.set(pointF2.x, pointF.y);
        return pointF2;
    }

    @Override // defpackage.du0
    public final Object e(bp7 bp7Var, float f) {
        PointF pointF = this.h;
        float f2 = pointF.x;
        PointF pointF2 = this.i;
        pointF2.set(f2, 0.0f);
        pointF2.set(pointF2.x, pointF.y);
        return pointF2;
    }

    @Override // defpackage.du0
    public final void g(float f) {
        f82 f82Var = this.j;
        f82Var.g(f);
        f82 f82Var2 = this.k;
        f82Var2.g(f);
        this.h.set(((Float) f82Var.d()).floatValue(), ((Float) f82Var2.d()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((zt0) arrayList.get(i)).a();
            i++;
        }
    }
}
