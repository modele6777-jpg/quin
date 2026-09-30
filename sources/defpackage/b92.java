package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b92 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b92(z6g z6gVar, int i, e89 e89Var, s69 s69Var, s69 s69Var2) {
        this.a = 2;
        this.c = z6gVar;
        this.b = i;
        this.d = e89Var;
        this.e = s69Var;
        this.f = s69Var2;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0110  */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        int iL;
        int i = this.a;
        int i2 = 0;
        wef wefVar = wef.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        int i3 = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                cea[] ceaVarArr = (cea[]) obj5;
                c92 c92Var = (c92) obj4;
                zn8 zn8Var = (zn8) obj3;
                int[] iArr = (int[]) obj2;
                bea beaVar = (bea) obj;
                int length = ceaVarArr.length;
                int i4 = 0;
                while (i2 < length) {
                    cea ceaVar = ceaVarArr[i2];
                    int i5 = i4 + 1;
                    ceaVar.getClass();
                    Object objE = ceaVar.E();
                    r7c r7cVar = objE instanceof r7c ? (r7c) objE : null;
                    cv7 layoutDirection = zn8Var.getLayoutDirection();
                    an1 an1Var = r7cVar != null ? r7cVar.c : null;
                    beaVar.g(ceaVar, an1Var != null ? an1Var.j(i3, ceaVar.a, layoutDirection) : c92Var.b.a(ceaVar.a, i3, layoutDirection), iArr[i4], 0.0f);
                    i2++;
                    i4 = i5;
                }
                return wefVar;
            case 1:
                fxd fxdVar = (fxd) obj5;
                fxd fxdVar2 = (fxd) obj4;
                fxd fxdVar3 = (fxd) obj3;
                my myVar = (my) obj;
                return myVar.a(((ka4) myVar.d()).a == 1 ? kn2.c0(rw4.m(fxdVar, new i73(12)).a(rw4.f(fxdVar2, 2)), rw4.g(fxdVar3, 2).a(rw4.o(fxdVar, new xp(i3, 3)))) : kn2.c0(rw4.m(fxdVar, new xp(i3, 3)).a(rw4.f(fxdVar2, 2)), rw4.o(fxdVar, new i73(12)).a(rw4.g(fxdVar3, 2))), new ild(true, new i1(13, (fxd) obj2)));
            case 2:
                e89 e89Var = (e89) obj4;
                s69 s69Var = (s69) obj2;
                bv7 bv7Var = (bv7) obj;
                e89Var.setValue(bv7Var);
                ((sz9) ((s69) obj3)).k((int) (bv7Var.l() >> 32));
                View view = ((z6g) obj5).a;
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                int i6 = rect.top;
                int i7 = rect.bottom;
                bv7 bv7Var2 = (bv7) e89Var.getValue();
                hkb hkbVarG = (bv7Var2 == null || !bv7Var2.h()) ? hkb.e : z5c.g(bv7Var2.c(0L), db6.Y0(bv7Var2.l()));
                int i8 = i6 + i3;
                int i9 = i7 - i3;
                float f = hkbVarG.b;
                if (f <= i7) {
                    float f2 = hkbVarG.d;
                    if (f2 < i6) {
                        iL = i9 - i8;
                    } else {
                        iL = ym8.L(Math.max(f - i8, i9 - f2));
                    }
                } else {
                    iL = i9 - i8;
                }
                ((sz9) s69Var).k(Math.max(iL, 0));
                return wefVar;
            case 3:
                oo5 oo5Var = (oo5) obj4;
                oo5 oo5Var2 = (oo5) obj3;
                it3 it3Var = (it3) obj2;
                gx0 gx0Var = (gx0) obj;
                if (((oo5) obj5) != ((bo5) vd0.t0(oo5Var).getFocusOwner()).g()) {
                    return Boolean.TRUE;
                }
                boolean zQ = urg.Q(oo5Var, oo5Var2, i3, it3Var);
                Boolean boolValueOf = Boolean.valueOf(zQ);
                if (zQ || !gx0Var.a()) {
                    return boolValueOf;
                }
                return null;
            case 4:
                oo5 oo5Var3 = (oo5) obj4;
                hkb hkbVar = (hkb) obj3;
                it3 it3Var2 = (it3) obj2;
                gx0 gx0Var2 = (gx0) obj;
                if (((oo5) obj5) != ((bo5) vd0.t0(oo5Var3).getFocusOwner()).g()) {
                    return Boolean.TRUE;
                }
                boolean zC = uyb.C(i3, it3Var2, oo5Var3, hkbVar);
                Boolean boolValueOf2 = Boolean.valueOf(zC);
                if (zC || !gx0Var2.a()) {
                    return boolValueOf2;
                }
                return null;
            default:
                String str = (String) obj3;
                a26 a26Var = (a26) obj2;
                l1f l1fVar = (l1f) obj;
                kv2.y(l1fVar, "btn", (String) obj5, "widget", (String) obj4);
                l1fVar.a("widget_onboarding", "pathway");
                l1fVar.a(Integer.valueOf(i3), "layer");
                if (str != null && !v4e.Q(str)) {
                    l1fVar.a(str, "scenario");
                }
                a26Var.d(l1fVar);
                return wefVar;
        }
    }

    public /* synthetic */ b92(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
        this.f = obj4;
    }

    public /* synthetic */ b92(Serializable serializable, Object obj, int i, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.c = serializable;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.f = obj3;
    }
}
