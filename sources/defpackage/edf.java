package defpackage;

import android.graphics.Bitmap;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class edf implements o26 {
    public final /* synthetic */ zt X;
    public final /* synthetic */ List a;
    public final /* synthetic */ g8d b;
    public final /* synthetic */ qad c;
    public final /* synthetic */ lsd d;
    public final /* synthetic */ o26 e;
    public final /* synthetic */ sw3 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ s69 w;
    public final /* synthetic */ j18 x;
    public final /* synthetic */ s69 y;
    public final /* synthetic */ x16 z;

    public edf(List list, g8d g8dVar, qad qadVar, lsd lsdVar, o26 o26Var, sw3 sw3Var, boolean z, boolean z2, s69 s69Var, j18 j18Var, s69 s69Var2, x16 x16Var, zt ztVar) {
        this.a = list;
        this.b = g8dVar;
        this.c = qadVar;
        this.d = lsdVar;
        this.e = o26Var;
        this.f = sw3Var;
        this.g = z;
        this.v = z2;
        this.w = s69Var;
        this.x = j18Var;
        this.y = s69Var2;
        this.z = x16Var;
        this.X = ztVar;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        mx7 mx7Var = (mx7) obj;
        int iIntValue = ((Number) obj2).intValue();
        l46 l46Var = (l46) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        qad qadVar = this.c;
        int i2 = qadVar.b;
        if ((iIntValue2 & 6) == 0) {
            i = (l46Var.g(mx7Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= l46Var.e(iIntValue) ? 32 : 16;
        }
        if (l46Var.W(i & 1, (i & 147) != 146)) {
            d6d d6dVar = (d6d) this.a.get(iIntValue);
            l46Var.f0(1695370274);
            g8d g8dVar = this.b;
            boolean zG = l46Var.g(g8dVar) | l46Var.g(d6dVar);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                objR = kv2.f(0, l46Var);
            }
            s69 s69Var = (s69) objR;
            boolean zG2 = l46Var.g(g8dVar) | l46Var.g(d6dVar);
            Object objR2 = l46Var.R();
            if (zG2 || objR2 == i8cVar) {
                objR2 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR2);
            }
            e89 e89Var = (e89) objR2;
            Object[] objArr = {g8dVar, d6dVar, Integer.valueOf(i2), Integer.valueOf(((sz9) s69Var).j())};
            boolean zI = l46Var.i(g8dVar) | l46Var.g(e89Var) | l46Var.g(this.d) | l46Var.i(d6dVar) | l46Var.i(this.e) | l46Var.i(qadVar);
            Object objR3 = l46Var.R();
            if (zI || objR3 == i8cVar) {
                objR3 = new ddf(this.b, this.d, d6dVar, e89Var, this.e, qadVar, null);
                l46Var.p0(objR3);
            }
            e89 e89VarZ = uyb.z(null, objArr, (l26) objR3, l46Var);
            sw3 sw3Var = this.f;
            float fZ = sw3Var.Z(i2);
            g09 g09Var = g09.a;
            j09 j09VarD = b.d(b.p(g09Var, fZ), sw3Var.Z(d6dVar.d));
            boolean z4 = this.g;
            Boolean boolValueOf = Boolean.valueOf(z4);
            boolean z5 = this.v;
            Boolean boolValueOf2 = Boolean.valueOf(z5);
            boolean zH = l46Var.h(z4) | l46Var.h(z5) | l46Var.g(this.w) | l46Var.g(this.x) | l46Var.g(this.y) | l46Var.g(this.z);
            Object objR4 = l46Var.R();
            if (zH || objR4 == i8cVar) {
                objR4 = new adf(this.g, this.v, this.x, this.z, this.w, this.y);
                l46Var.p0(objR4);
            }
            hia hiaVar = ibe.a;
            j09 j09VarD2 = j09VarD.D(new hbe(boolValueOf, boolValueOf2, null, (PointerInputEventHandler) objR4, 4));
            zt ztVar = this.X;
            boolean zI2 = l46Var.i(ztVar) | l46Var.i(d6dVar);
            Object objR5 = l46Var.R();
            if (zI2 || objR5 == i8cVar) {
                z = false;
                objR5 = new bdf(0, ztVar, d6dVar);
                l46Var.p0(objR5);
            } else {
                z = false;
            }
            j09 j09VarU = b21.u(j09VarD2, (a26) objR5);
            xn8 xn8VarC = s21.c(ndb.b, z);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarU);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            Bitmap bitmap = (Bitmap) e89VarZ.getValue();
            if (bitmap != null) {
                l46Var.f0(1965311507);
                z2 = z;
                z3 = true;
                feg.k(new ks(bitmap), null, b.c, an2.g, 0, l46Var, 25008, 232);
                l46Var.r(z2);
            } else {
                z2 = z;
                z3 = true;
                if (((Boolean) e89Var.getValue()).booleanValue()) {
                    l46Var.f0(1965316186);
                    boolean zG3 = l46Var.g(s69Var);
                    Object objR6 = l46Var.R();
                    if (zG3 || objR6 == i8cVar) {
                        objR6 = new wj7(22, s69Var);
                        l46Var.p0(objR6);
                    }
                    bm8.h((x16) objR6, d31.a.a(g09Var, ndb.f), false, null, null, ok8.e, l46Var, 1572864, 60);
                    l46Var = l46Var;
                    l46Var.r(z2);
                } else {
                    l46Var.f0(795485831);
                    l46Var.r(z2);
                }
            }
            l46Var.r(z3);
            l46Var.r(z2);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
