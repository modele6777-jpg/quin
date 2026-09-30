package defpackage;

import ai.askquin.R;
import android.content.Context;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.tooling.PreviewActivity;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m65 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m65(cb9 cb9Var, Context context, orc orcVar, e89 e89Var) {
        this.a = 29;
        this.b = cb9Var;
        this.c = orcVar;
        this.d = e89Var;
    }

    private final Object a(Object obj, Object obj2) {
        x16 x16Var = (x16) this.b;
        Context context = (Context) this.c;
        o3a o3aVar = (o3a) this.d;
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            g09 g09Var = g09.a;
            j09 j09VarE = oa7.E(ynb.b0(24.0f, 0.0f, g09Var, 2), a7c.b(32.0f));
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarE);
            lf2.q.getClass();
            l46Var.j0();
            boolean z = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf);
            dec.k(l46Var);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            d31 d31Var = d31.a;
            feg.j(od4.A(R.drawable.bg_qixi, 0, l46Var), null, d31Var.b(g09Var), null, an2.g, 0.0f, null, l46Var, 24632, 104);
            j09 j09VarD0 = mh3.d0(g09Var, mh3.T(l46Var), false, 14);
            c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
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
            WeakHashMap weakHashMap = m8g.w;
            o5c.f(l46Var, od4.J(q7c.k(l46Var).g));
            feg.j(od4.A(R.drawable.paywall_qixi, 0, l46Var), null, b.m(g09Var, 305.0f, 371.0f), null, an2.b, 0.0f, null, l46Var, 25016, 104);
            boolean zI = l46Var.i(context) | l46Var.i(o3aVar);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new ek9(8, context, o3aVar);
                l46Var.p0(objR);
            }
            k99.c(0, (x16) objR, l46Var, null);
            l46Var.r(true);
            c8b.h(eb3.Y(ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31Var.a(g09Var, ndb.d)), q7c.k(l46Var).g), false, 0L, 0L, null, x16Var, l46Var, 0, 30);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object e(Object obj, Object obj2) throws Exception {
        String str = (String) this.b;
        String str2 = (String) this.c;
        Object[] objArr = (Object[]) this.d;
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i = PreviewActivity.L0;
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            y41.x(str, str2, l46Var, Arrays.copyOf(objArr, 0));
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0244  */
    /* JADX WARN: Code duplicated, block: B:105:0x024b  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v101 java.lang.Object, still in use, count: 2, list:
          (r4v101 java.lang.Object) from 0x0240: PHI (r4 I:??) = (r4v98 java.lang.Object), (r4v101 java.lang.Object) binds: [B:101:0x023f, B:453:0x0240] A[DONT_GENERATE, DONT_INLINE]
          (r4v101 java.lang.Object) from 0x0232: CHECK_CAST (ai.askquin.ui.router.GiftCardFixtureScenario) (r4v101 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // defpackage.l26
    public final java.lang.Object z(java.lang.Object r43, java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 3518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m65.z(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ m65(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ m65(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
