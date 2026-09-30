package defpackage;

import ai.askquin.R;
import android.content.Context;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bka implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vma b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ Context d;

    public /* synthetic */ bka(vma vmaVar, x16 x16Var, Context context, int i) {
        this.a = i;
        this.b = vmaVar;
        this.c = x16Var;
        this.d = context;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0131  */
    /* JADX WARN: Code duplicated, block: B:27:0x0135  */
    /* JADX WARN: Code duplicated, block: B:29:0x0141  */
    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        boolean z;
        int i;
        int i2;
        int i3 = this.a;
        wef wefVar = wef.a;
        Context context = this.d;
        x16 x16Var = this.c;
        vma vmaVar = this.b;
        switch (i3) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i4 = 1;
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    nae.a(null, ((s5d) l46Var.k(u5d.a)).c, 0L, 0L, 0.0f, 0.0f, null, af1.b0(-1707093347, new bka(vmaVar, x16Var, context, i4), l46Var), l46Var, 12582912, 125);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    g09 g09Var = g09.a;
                    j09 j09VarD0 = ynb.d0(0.0f, 24.0f, 0.0f, 8.0f, 5, ynb.b0(24.0f, 0.0f, g09Var, 2));
                    jx0 jx0Var = ndb.Y;
                    c92 c92VarA = a92.a(xc0.c, jx0Var, l46Var2, 0);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarD0);
                    lf2.q.getClass();
                    l46Var2.j0();
                    boolean z2 = l46Var2.S;
                    ov7 ov7Var = LayoutNode.h1;
                    if (z2) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var2, c92VarA);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var2, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var2, numValueOf);
                    dec.k(l46Var2);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var2, j09VarJ);
                    c92 c92VarA2 = a92.a(new uc0(16.0f, true, new qc0(0)), jx0Var, l46Var2, 6);
                    int iHashCode2 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM2 = l46Var2.m();
                    j09 j09VarJ2 = m93.J(l46Var2, g09Var);
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(he2Var, l46Var2, c92VarA2);
                    dec.l(he2Var2, l46Var2, u8aVarM2);
                    ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                    dec.l(he2Var4, l46Var2, j09VarJ2);
                    nte.b(afc.q(R.string.update_title, l46Var2), null, 0L, w6c.l(24), ar5.x, cr5.h, 0L, null, null, w6c.k(38.19d), 0, false, 0, 0, null, null, l46Var2, 1597440, 48, 259886);
                    String strI = vmaVar.c;
                    if (strI == null) {
                        if (vmaVar.a) {
                            i = 832941800;
                            i2 = R.string.update_content_default;
                            z = false;
                        } else {
                            z = false;
                            i = 833020106;
                            i2 = R.string.update_content_force;
                        }
                        strI = tec.i(l46Var2, i, i2, l46Var2, z);
                    } else {
                        if (strI.length() <= 0) {
                            strI = null;
                        }
                        if (strI == null) {
                            if (vmaVar.a) {
                                i = 832941800;
                                i2 = R.string.update_content_default;
                                z = false;
                            } else {
                                z = false;
                                i = 833020106;
                                i2 = R.string.update_content_force;
                            }
                            strI = tec.i(l46Var2, i, i2, l46Var2, z);
                        }
                    }
                    z7f.i(null, w6c.l(14), w6c.l(14), w6c.l(6), af1.b0(791710852, new ob0(strI, 18), l46Var2), l46Var2, 28080, 1);
                    l46Var2.r(true);
                    j09 j09VarD1 = ynb.d0(0.0f, 8.0f, 0.0f, 0.0f, 13, new mq6(ndb.E0));
                    t7c t7cVarA = s7c.a(new uc0(4.0f, true, new qc0(0)), ndb.y, l46Var2, 6);
                    int iHashCode3 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM3 = l46Var2.m();
                    j09 j09VarJ3 = m93.J(l46Var2, j09VarD1);
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(he2Var, l46Var2, t7cVarA);
                    dec.l(he2Var2, l46Var2, u8aVarM3);
                    ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
                    dec.l(he2Var4, l46Var2, j09VarJ3);
                    boolean zG = l46Var2.g(x16Var);
                    Object objR = l46Var2.R();
                    i8c i8cVar = sf2.a;
                    if (zG || objR == i8cVar) {
                        objR = new yca(4, x16Var);
                        l46Var2.p0(objR);
                    }
                    cgg.m((x16) objR, null, false, null, null, null, bzd.d, l46Var2, 805306368, 510);
                    boolean zI = l46Var2.i(context) | l46Var2.i(vmaVar);
                    Object objR2 = l46Var2.R();
                    if (zI || objR2 == i8cVar) {
                        objR2 = new ek9(17, context, vmaVar);
                        l46Var2.p0(objR2);
                    }
                    cgg.m((x16) objR2, null, false, null, null, null, bzd.e, l46Var2, 805306368, 510);
                    l46Var2.r(true);
                    l46Var2.r(true);
                }
                break;
        }
        return wefVar;
    }
}
