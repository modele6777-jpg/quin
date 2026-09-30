package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zdd extends gu7 implements o26 {
    final /* synthetic */ n26 $content;
    final /* synthetic */ j09 $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdd(j09 j09Var, n26 n26Var) {
        super(4);
        this.$modifier = j09Var;
        this.$content = n26Var;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        sdd sddVar = (sdd) obj;
        j09 j09Var = (j09) obj2;
        l46 l46Var = (l46) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            i = (l46Var.g(sddVar) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= l46Var.g(j09Var) ? 32 : 16;
        }
        if (l46Var.W(i & 1, (i & 147) != 146)) {
            j09 j09VarD = this.$modifier.D(j09Var);
            n26 n26Var = this.$content;
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.h(l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            n26Var.m(sddVar, l46Var, Integer.valueOf(i & 14));
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
