package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c06 implements l26 {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ c06(x16 x16Var, int i, int i2, int i3, boolean z, g06 g06Var, x16 x16Var2, x16 x16Var3) {
        this.d = x16Var;
        this.b = i;
        this.e = i2;
        this.f = i3;
        this.c = z;
        this.w = g06Var;
        this.g = x16Var2;
        this.v = x16Var3;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        boolean z;
        String strR;
        mue mueVarA;
        Integer numValueOf;
        int i;
        int i2 = this.a;
        int i3 = this.f;
        int i4 = this.e;
        wef wefVar = wef.a;
        Object obj3 = this.w;
        Object obj4 = this.v;
        Object obj5 = this.g;
        Object obj6 = this.d;
        switch (i2) {
            case 0:
                x16 x16Var = (x16) obj6;
                g06 g06Var = (g06) obj3;
                x16 x16Var2 = (x16) obj5;
                x16 x16Var3 = (x16) obj4;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g09 g09Var = g09.a;
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarC);
                    lf2.q.getClass();
                    l46Var.j0();
                    boolean z2 = l46Var.S;
                    ov7 ov7Var = LayoutNode.h1;
                    if (z2) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var, xn8VarC);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM);
                    Integer numValueOf2 = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf2);
                    dec.k(l46Var);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ);
                    k8b.a(af1.b0(1253982415, new sz5(3), l46Var), l46Var, 6);
                    j09 j09VarD0 = ynb.d0(0.0f, 24.0f, 0.0f, 16.0f, 5, ynb.b0(32.0f, 0.0f, b.c(g09Var, 1.0f), 2));
                    jx0 jx0Var = ndb.Z;
                    c92 c92VarA = a92.a(new uc0(24.0f, true, new qc0(0)), jx0Var, l46Var, 54);
                    int iHashCode2 = Long.hashCode(l46Var.T);
                    u8a u8aVarM2 = l46Var.m();
                    j09 j09VarJ2 = m93.J(l46Var, j09VarD0);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, c92VarA);
                    dec.l(he2Var2, l46Var, u8aVarM2);
                    ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ2);
                    c92 c92VarA2 = a92.a(new uc0(8.0f, true, new qc0(0)), jx0Var, l46Var, 54);
                    int iHashCode3 = Long.hashCode(l46Var.T);
                    u8a u8aVarM3 = l46Var.m();
                    j09 j09VarJ3 = m93.J(l46Var, g09Var);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, c92VarA2);
                    dec.l(he2Var2, l46Var, u8aVarM3);
                    ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ3);
                    dj6.o(this.b, i4, androidx.compose.ui.platform.b.a(ynb.d0(0.0f, 32.0f, 0.0f, 0.0f, 13, b.c(g09Var, 1.0f)), "friendCouponGrantArt"), l46Var, 384);
                    if (i3 == 1) {
                        z = false;
                        strR = tec.i(l46Var, -885238022, R.string.friend_coupon_grant_title_one, l46Var, false);
                    } else {
                        z = false;
                        l46Var.f0(-885148649);
                        strR = afc.r(R.string.friend_coupon_grant_title, new Object[]{Integer.valueOf(i3)}, l46Var);
                        l46Var.r(false);
                    }
                    String str = strR;
                    if (this.c) {
                        l46Var.f0(-885026819);
                        mue mueVar = pue.a;
                        mueVarA = pue.n(l46Var);
                        l46Var.r(z);
                    } else {
                        l46Var.f0(-884970988);
                        mue mueVar2 = pue.a;
                        mueVarA = mue.a(pue.n(l46Var), 0L, 0L, null, cr5.c, 0L, null, 0, 0L, null, null, 16777183);
                        l46Var.r(false);
                    }
                    mue mueVar3 = mueVarA;
                    pr4 pr4Var = l8b.a;
                    nte.b(str, b.c(g09Var, 1.0f), ((e8b) l46Var.k(pr4Var)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVar3, l46Var, 48, 0, 130040);
                    int iOrdinal = g06Var.ordinal();
                    if (iOrdinal == 0) {
                        numValueOf = Integer.valueOf(R.string.friend_coupon_grant_subtitle_monthly);
                    } else if (iOrdinal != 1) {
                        numValueOf = null;
                        if (iOrdinal != 2) {
                            ap.c();
                            return null;
                        }
                    } else {
                        numValueOf = Integer.valueOf(R.string.friend_coupon_grant_subtitle_annual);
                    }
                    if (numValueOf == null) {
                        l46Var.f0(-884686657);
                        i = 0;
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-884686656);
                        String strQ = afc.q(numValueOf.intValue(), l46Var);
                        mue mueVar4 = oue.a;
                        nte.b(strQ, b.c(g09Var, 1.0f), ((e8b) l46Var.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 48, 0, 130040);
                        i = 0;
                        l46Var.r(false);
                    }
                    l46Var.r(true);
                    j09 j09VarC2 = b.c(g09Var, 1.0f);
                    c92 c92VarA3 = a92.a(new uc0(8.0f, true, new qc0(i)), ndb.Y, l46Var, 6);
                    int iHashCode4 = Long.hashCode(l46Var.T);
                    u8a u8aVarM4 = l46Var.m();
                    j09 j09VarJ4 = m93.J(l46Var, j09VarC2);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, c92VarA3);
                    dec.l(he2Var2, l46Var, u8aVarM4);
                    ib8.s(iHashCode4, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ4);
                    c8b.i(androidx.compose.ui.platform.b.a(b.d(b.c(g09Var, 1.0f), 56.0f), "friendCouponGrantCta"), afc.q(R.string.friend_coupon_grant_cta, l46Var), null, null, 0L, 0.0f, false, null, null, false, null, null, x16Var2, l46Var, 6, 0, 4092);
                    cgg.m(x16Var3, androidx.compose.ui.platform.b.a(b.d(b.c(g09Var, 1.0f), 56.0f), "friendCouponGrantLater"), false, null, null, null, feg.e, l46Var, 805306416, 508);
                    l46Var.r(true);
                    l46Var.r(true);
                    nte.b(afc.q(R.string.friend_coupon_grant_badge, l46Var), ynb.a0(db6.w(ynb.d0(32.0f, 24.0f, 0.0f, 0.0f, 12, g09Var), 0.5f, ((e8b) l46Var.k(pr4Var)).u, a7c.b(12.0f)), 8.0f, 2.0f), ((e8b) l46Var.k(pr4Var)).u, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.i(l46Var), l46Var, 0, 0, 131064);
                    c8b.h(androidx.compose.ui.platform.b.a(ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d)), "friendCouponGrantClose"), false, 0L, 0L, afc.q(R.string.friend_coupon_grant_close, l46Var), x16Var, l46Var, 0, 14);
                    l46Var.r(true);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                ((Integer) obj2).getClass();
                ym8.j((j09) obj5, (String) obj4, this.b, this.c, (x16) obj6, (dd2) obj3, (l46) obj, k99.P(i4 | 1), this.f);
                return wefVar;
            case 2:
                ((Integer) obj2).getClass();
                z7f.l((j09) obj6, (String) obj5, this.c, this.b, (a26) obj4, (a26) obj3, (l46) obj, k99.P(i4 | 1), this.f);
                return wefVar;
            default:
                ((Integer) obj2).getClass();
                b4c.b((c4c) obj6, (String) obj5, (j09) obj4, (a26) obj3, this.b, this.c, this.e, (l46) obj, k99.P(i3 | 1));
                return wefVar;
        }
    }

    public /* synthetic */ c06(j09 j09Var, String str, int i, boolean z, x16 x16Var, dd2 dd2Var, int i2, int i3) {
        this.g = j09Var;
        this.v = str;
        this.b = i;
        this.c = z;
        this.d = x16Var;
        this.w = dd2Var;
        this.e = i2;
        this.f = i3;
    }

    public /* synthetic */ c06(j09 j09Var, String str, boolean z, int i, a26 a26Var, a26 a26Var2, int i2, int i3) {
        this.d = j09Var;
        this.g = str;
        this.c = z;
        this.b = i;
        this.v = a26Var;
        this.w = a26Var2;
        this.e = i2;
        this.f = i3;
    }

    public /* synthetic */ c06(c4c c4cVar, String str, j09 j09Var, a26 a26Var, int i, boolean z, int i2, int i3) {
        this.d = c4cVar;
        this.g = str;
        this.v = j09Var;
        this.w = a26Var;
        this.b = i;
        this.c = z;
        this.e = i2;
        this.f = i3;
    }
}
