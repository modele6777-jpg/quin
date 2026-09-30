package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zs4 implements h1a, zt0, zl2 {
    public final oi8 b;
    public final xc6 c;
    public final du0 d;
    public final x02 e;
    public boolean g;
    public final Path a = new Path();
    public final mx f = new mx(2, false);

    public zs4(oi8 oi8Var, eu0 eu0Var, x02 x02Var) {
        this.b = oi8Var;
        du0 du0VarC0 = x02Var.b.c0();
        this.c = (xc6) du0VarC0;
        du0 du0VarC1 = x02Var.a.c0();
        this.d = du0VarC1;
        this.e = x02Var;
        eu0Var.d(du0VarC0);
        eu0Var.d(du0VarC1);
        du0VarC0.a(this);
        du0VarC1.a(this);
    }

    @Override // defpackage.zt0
    public final void a() {
        this.g = false;
        this.b.invalidateSelf();
    }

    @Override // defpackage.zl2
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            zl2 zl2Var = (zl2) arrayList.get(i);
            if (zl2Var instanceof k5f) {
                k5f k5fVar = (k5f) zl2Var;
                if (k5fVar.c == 1) {
                    this.f.a.add(k5fVar);
                    k5fVar.d(this);
                }
            }
            i++;
        }
    }

    @Override // defpackage.h1a
    public final Path e() {
        boolean z = this.g;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        x02 x02Var = this.e;
        if (x02Var.d) {
            this.g = true;
            return path;
        }
        PointF pointF = (PointF) this.c.d();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (x02Var.c) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.d.d();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f.d(path);
        this.g = true;
        return path;
    }
}
