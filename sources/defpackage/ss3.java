package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ss3 {
    public static final ss3 a = new ss3();

    public final void a(jkd jkdVar, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        float f = jkdVar.h;
        l46Var2.h0(2137486921);
        int i2 = 2;
        int i3 = i | (l46Var2.g(jkdVar) ? 4 : 2);
        if (l46Var2.W(i3 & 1, (i3 & 3) != 2)) {
            i0f i0fVar = jkdVar.j;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) >= 2139095040) {
                qc0.j("The expandedHeight is expected to be specified and finite");
                return;
            }
            boolean zG = l46Var2.g(i0fVar) | l46Var2.g(null);
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                objR = zrd.b(new j5(9, jkdVar));
                l46Var2.p0(objR);
            }
            h0e h0eVarA = qkd.a(((y72) ((h0e) objR).getValue()).a, vpf.Z(t39.c, l46Var2), null, l46Var2, 0, 12);
            dd2 dd2VarB0 = af1.b0(-1658896622, new zp(i2, jkdVar), l46Var2);
            l46Var2.f0(690108113);
            l46Var2.r(false);
            j09 j09Var = jkdVar.a;
            g09 g09Var = g09.a;
            j09 j09VarD = j09Var.D(g09Var);
            boolean zG2 = l46Var2.g(h0eVarA);
            Object objR2 = l46Var2.R();
            if (zG2 || objR2 == i8cVar) {
                objR2 = new wh1(5, h0eVarA);
                l46Var2.p0(objR2);
            }
            j09 j09VarS = b21.s(j09VarD, (a26) objR2);
            Object objR3 = l46Var2.R();
            if (objR3 == i8cVar) {
                objR3 = new to3(2);
                l46Var2.p0(objR3);
            }
            j09 j09VarB = vwc.b(j09VarS, false, (a26) objR3);
            Object objR4 = l46Var2.R();
            if (objR4 == i8cVar) {
                objR4 = rs3.b;
                l46Var2.p0(objR4);
            }
            j09 j09VarA = ibe.a(j09VarB, wef.a, (PointerInputEventHandler) objR4);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iW = an1.w(l46Var2);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarA);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, xn8VarC);
            dec.l(hj6.y, l46Var2, u8aVarM);
            he2 he2Var = hj6.X;
            if (l46Var2.S || !pa7.t(l46Var2.R(), Integer.valueOf(iW))) {
                tec.r(iW, l46Var2, iW, he2Var);
            }
            dec.l(hj6.x, l46Var2, j09VarJ);
            j09 j09VarF = oa7.F(eb3.Y(g09Var, jkdVar.i));
            pr4 pr4Var = v70.a;
            boolean z = (i3 & 14) == 4;
            Object objR5 = l46Var2.R();
            if (z || objR5 == i8cVar) {
                objR5 = new qs3();
                l46Var2.p0(objR5);
            }
            qj5 qj5Var = (qj5) objR5;
            long j = i0fVar.c;
            long j2 = i0fVar.d;
            long j3 = i0fVar.e;
            long j4 = i0fVar.f;
            dd2 dd2Var = jkdVar.b;
            mue mueVar = jkdVar.c;
            mue mueVar2 = jkdVar.d;
            jx0 jx0Var = jkdVar.e;
            l26 l26Var = jkdVar.f;
            float f2 = jkdVar.h;
            Object objR6 = l46Var2.R();
            if (objR6 == i8cVar) {
                objR6 = new vg3(14);
                l46Var2.p0(objR6);
            }
            v70.d(j09VarF, qj5Var, j, j2, j4, j3, dd2Var, mueVar, mueVar2, (x16) objR6, jx0Var, l26Var, dd2VarB0, f2, l46Var2, 0);
            l46Var2 = l46Var2;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new h8(this, jkdVar, i, 26);
        }
    }
}
