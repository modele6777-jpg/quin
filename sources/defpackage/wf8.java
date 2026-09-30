package defpackage;

import ai.askquin.R;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wf8 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wf8(hs3 hs3Var) {
        this.a = 10;
        ira iraVar = ira.a;
        this.b = hs3Var;
    }

    private final Object a(Object obj, Object obj2) {
        qna qnaVar = (qna) this.b;
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        boolean zBooleanValue = true;
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            if (((Boolean) qnaVar.g.getValue()).booleanValue()) {
                l46Var.f0(589004294);
            } else {
                l46Var.f0(-1920661373);
                zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
            }
            l46Var.r(false);
            if (zBooleanValue) {
                l46Var.f0(589053347);
                nte.b(afc.q(R.string.settings_update_has_newer_version, l46Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b4d.l(l46Var), l46Var, 0, 0, 131070);
                l46Var.r(false);
            } else {
                l46Var.f0(589209990);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object e(Object obj, Object obj2) {
        t7 t7Var = (t7) this.b;
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            nte.b((String) ((mo3) t7Var).b.getValue(), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b4d.l(l46Var), l46Var, 0, 0, 131070);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object f(Object obj, Object obj2) {
        zz5 zz5Var = (zz5) this.b;
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            l46Var.Z();
        } else if (zz5Var.equals(xz5.a)) {
            l46Var.f0(1619847459);
            l46Var.r(false);
        } else {
            if (!(zz5Var instanceof yz5)) {
                throw tec.d(1619845726, l46Var, false);
            }
            l46Var.f0(1619849376);
            b4d.b(((yz5) zz5Var).a, 48, l46Var, ynb.d0(8.0f, 0.0f, 0.0f, 0.0f, 14, g09.a));
            l46Var.r(false);
        }
        return wef.a;
    }

    private final Object g(Object obj, Object obj2) {
        r7d r7dVar = (r7d) this.b;
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, g09.a);
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
            tec.q(0, ((u7d) r7dVar).a, l46Var, true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v165 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // defpackage.l26
    public final java.lang.Object z(java.lang.Object r59, java.lang.Object r60) {
        /*
            Method dump skipped, instruction units count: 3056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf8.z(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ wf8(k1 k1Var, int i, int i2) {
        this.a = i2;
        this.b = k1Var;
    }

    public /* synthetic */ wf8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ wf8(uqd uqdVar, fqd fqdVar) {
        this.a = 12;
        this.b = uqdVar;
    }
}
