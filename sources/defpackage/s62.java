package defpackage;

import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s62 {
    public static final mue a = new mue(0, 0, null, null, yp5.d, 0, 0, 0, 0, 0, null, null, 16777183);
    public static final long b;
    public static final j09 c;
    public static final long d;

    static {
        long jB = y72.b(y72.d, 0.5f);
        b = jB;
        c = tm7.o(g09.a, jB, g21.f);
        d = w6c.l(16);
    }

    public static final void a(int i, int i2, final dd2 dd2Var, l46 l46Var, c4c c4cVar) {
        int i3;
        l46Var.h0(1957181635);
        if ((i & 6) == 0) {
            i3 = (l46Var.g(c4cVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= l46Var.g(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= l46Var.i(dd2Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            t62 t62Var = q4c.c(q4c.b(c4cVar, l46Var)).e;
            t62Var.getClass();
            final mue mueVarE = b4c.d(c4cVar, l46Var).e(t62Var.a);
            final j09 j09Var = t62Var.b;
            j09Var.getClass();
            sw3 sw3Var = (sw3) l46Var.k(zg2.h);
            wue wueVar = t62Var.c;
            wueVar.getClass();
            final float F = sw3Var.F(wueVar.a);
            Boolean bool = t62Var.d;
            bool.getClass();
            if9.a(c4cVar, bool.booleanValue(), af1.b0(1968694299, new o26() { // from class: p62
                @Override // defpackage.o26
                public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i4;
                    c4c c4cVar2 = (c4c) obj;
                    j09 j09Var2 = (j09) obj2;
                    l46 l46Var2 = (l46) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    c4cVar2.getClass();
                    j09Var2.getClass();
                    if ((iIntValue & 6) == 0) {
                        i4 = (l46Var2.g(c4cVar2) ? 4 : 2) | iIntValue;
                    } else {
                        i4 = iIntValue;
                    }
                    if ((iIntValue & 48) == 0) {
                        i4 |= l46Var2.g(j09Var2) ? 32 : 16;
                    }
                    int i5 = 0;
                    if (l46Var2.W(i4 & 1, (i4 & 147) != 146)) {
                        j09 j09VarZ = ynb.Z(j09Var2.D(j09Var), F);
                        xn8 xn8VarC = s21.c(ndb.b, false);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        j09 j09VarJ = m93.J(l46Var2, j09VarZ);
                        lf2.q.getClass();
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(LayoutNode.h1);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(hj6.z, l46Var2, xn8VarC);
                        dec.l(hj6.y, l46Var2, u8aVarM);
                        dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                        dec.k(l46Var2);
                        dec.l(hj6.x, l46Var2, j09VarJ);
                        ((r4c) l46Var2.k(s4c.a)).b.t(mueVarE, af1.b0(-375984849, new r62(dd2Var, c4cVar2, i5), l46Var2), l46Var2, 48);
                        l46Var2.r(true);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, (i3 & 14) | 384);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new q62(c4cVar, dd2Var, i, i2);
        }
    }

    public static final void b(c4c c4cVar, String str, l46 l46Var, int i) {
        int i2;
        str.getClass();
        l46Var.h0(-1183188838);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(c4cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(str) ? 32 : 16;
        }
        int i3 = i2 | 384;
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            a(((i3 >> 3) & 112) | (i3 & 14) | 384, 0, af1.b0(1557188131, new ob0(str, 3), l46Var), l46Var, c4cVar);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o62(c4cVar, str, i, i4);
        }
    }
}
