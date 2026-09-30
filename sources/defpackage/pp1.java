package defpackage;

import androidx.compose.foundation.layout.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pp1 {
    public static final /* synthetic */ wn7[] a = {new q79(pp1.class, "cardCirclePreviewStage", "getCardCirclePreviewStage(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lai/askquin/ui/onboard/static/CardCirclePreviewStage;", 1)};
    public static final gxc b = new gxc("CardCirclePreviewStage");

    public static final void a(int i, x16 x16Var, x16 x16Var2, l46 l46Var, boolean z) {
        x16 x16Var3;
        x16 x16Var4;
        l46 l46Var2;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(-749206525);
        int i2 = (l46Var.i(x16Var) ? 4 : 2) | i | (l46Var.i(x16Var2) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            x16Var3 = x16Var;
            x16Var4 = x16Var2;
            l46Var2 = l46Var;
            b(x16Var3, x16Var4, z ? qp1.c : qp1.a, null, l46Var2, i2 & 126);
        } else {
            x16Var3 = x16Var;
            x16Var4 = x16Var2;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new np1(x16Var3, x16Var4, z, i);
        }
    }

    public static final void b(x16 x16Var, x16 x16Var2, qp1 qp1Var, fy9 fy9Var, l46 l46Var, int i) {
        x16 x16Var3;
        int i2;
        fy9 fy9Var2;
        int i3;
        fy9 fy9VarE;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(1409365284);
        if ((i & 6) == 0) {
            x16Var3 = x16Var;
            i2 = (l46Var.i(x16Var3) ? 4 : 2) | i;
        } else {
            x16Var3 = x16Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(x16Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.e(qp1Var.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        boolean z = true;
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            l46Var.b0();
            int i4 = i & 1;
            i8c i8cVar = sp1.a;
            if (i4 == 0 || l46Var.C()) {
                i8cVar.getClass();
                i3 = i2 & (-7169);
                fy9VarE = dt1.e(i8c.o(l46Var), l46Var, 48, 0);
            } else {
                l46Var.Z();
                i3 = i2 & (-7169);
                fy9VarE = fy9Var;
            }
            l46Var.s();
            qp1 qp1Var2 = qp1.c;
            qp1 qp1Var3 = qp1.b;
            qp1 qp1Var4 = (qp1Var == qp1Var2 && fy9VarE == null) ? qp1Var3 : qp1Var;
            Object objR = l46Var.R();
            i8c i8cVar2 = sf2.a;
            if (objR == i8cVar2) {
                objR = q1c.f(qp1Var4);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            boolean zI = ((i3 & 896) == 256) | l46Var.i(fy9VarE);
            Object objR2 = l46Var.R();
            if (zI || objR2 == i8cVar2) {
                objR2 = new op1(qp1Var, fy9VarE, e89Var, null);
                l46Var.p0(objR2);
            }
            af1.p(qp1Var, fy9VarE, (l26) objR2, l46Var);
            mfc mfcVar = ((e8b) l46Var.k(l8b.a)).C;
            i8cVar.getClass();
            sp1 sp1VarO = i8c.o(l46Var);
            boolean zE = l46Var.e(mfcVar.ordinal()) | l46Var.e(sp1VarO.ordinal());
            Object objR3 = l46Var.R();
            if (zE || objR3 == i8cVar2) {
                objR3 = new die(r8c.e(mfcVar), sp1VarO);
                l46Var.p0(objR3);
            }
            die dieVar = (die) objR3;
            if (((qp1) e89Var.getValue()) != qp1.a && ((qp1) e89Var.getValue()) != qp1Var3) {
                z = false;
            }
            Object objR4 = l46Var.R();
            if (objR4 == i8cVar2) {
                objR4 = new jl0(19);
                l46Var.p0(objR4);
            }
            rxg.a(z, (x16) objR4, l46Var, 48, 0);
            lmg.J(b.c, af1.b0(2027508109, new jt(e89Var, x16Var3, z, x16Var2, dieVar, fy9VarE), l46Var), l46Var, 54);
            fy9Var2 = fy9VarE;
        } else {
            l46Var.Z();
            fy9Var2 = fy9Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb(x16Var, x16Var2, qp1Var, fy9Var2, i);
        }
    }
}
