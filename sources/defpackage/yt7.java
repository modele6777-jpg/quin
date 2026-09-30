package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yt7 extends kj0 {
    public static final yt7 q = new yt7();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ca7] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ca7] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r4v0, types: [c8f] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    public static tjd D0(tjd tjdVar) {
        tt7 tt7VarB;
        j7f j7fVarC0 = tjdVar.c0();
        ?? r4 = 0;
        jgf jgfVarG = null;
        if (j7fVarC0 instanceof cp1) {
            cp1 cp1Var = (cp1) j7fVarC0;
            i8f i8fVar = cp1Var.a;
            i8f i8fVar2 = i8fVar.a() == dsf.IN_VARIANCE ? i8fVar : null;
            jgf jgfVarK0 = (i8fVar2 == null || (tt7VarB = i8fVar2.b()) == null) ? null : tt7VarB.k0();
            ve9 ve9Var = cp1Var.b;
            if (ve9Var == null) {
                Collection collectionE = cp1Var.e();
                ArrayList arrayList = new ArrayList(t72.u(collectionE, 10));
                Iterator it = collectionE.iterator();
                while (it.hasNext()) {
                    arrayList.add(((tt7) it.next()).k0());
                }
                ve9Var = new ve9(i8fVar, new yz3(1, arrayList), (c8f) r4, 8);
                cp1Var.b = ve9Var;
            }
            return new ue9(to1.a, ve9Var, jgfVarK0, tjdVar.a0(), tjdVar.i0(), 32);
        }
        if (!(j7fVarC0 instanceof ca7) || !tjdVar.i0()) {
            return tjdVar;
        }
        ?? r0 = (ca7) j7fVarC0;
        LinkedHashSet<tt7> linkedHashSet = r0.b;
        ArrayList arrayList2 = new ArrayList(t72.u(linkedHashSet, 10));
        boolean z = false;
        for (tt7 tt7Var : linkedHashSet) {
            tt7Var.getClass();
            jgf jgfVarG2 = w8f.g(tt7Var);
            jgfVarG2.getClass();
            arrayList2.add(jgfVarG2);
            z = true;
        }
        if (z) {
            tt7 tt7Var2 = r0.a;
            if (tt7Var2 != null) {
                jgfVarG = w8f.g(tt7Var2);
                jgfVarG.getClass();
            }
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            ca7 ca7Var = new ca7(linkedHashSet2);
            ca7Var.a = jgfVarG;
            r4 = ca7Var;
        }
        if (r4 != 0) {
            r0 = r4;
        }
        return r0.a();
    }

    @Override // defpackage.kj0
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public final jgf v0(xt7 xt7Var) {
        jgf jgfVarE;
        xt7Var.getClass();
        if (!(xt7Var instanceof tt7)) {
            qc0.j("Failed requirement.");
            return null;
        }
        jgf jgfVarK0 = ((tt7) xt7Var).k0();
        if (jgfVarK0 instanceof tjd) {
            jgfVarE = D0((tjd) jgfVarK0);
        } else {
            if (!(jgfVarK0 instanceof bj5)) {
                ap.c();
                return null;
            }
            bj5 bj5Var = (bj5) jgfVarK0;
            tjd tjdVar = bj5Var.c;
            tjd tjdVar2 = bj5Var.b;
            tjd tjdVarD0 = D0(tjdVar2);
            tjd tjdVarD1 = D0(tjdVar);
            jgfVarE = (tjdVarD0 == tjdVar2 && tjdVarD1 == tjdVar) ? jgfVarK0 : rxg.E(tjdVarD0, tjdVarD1);
        }
        uj3 uj3Var = new uj3(1, this, yt7.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lkotlin/reflect/jvm/internal/impl/types/UnwrappedType;", 0, 29);
        tt7 tt7VarL = q7c.l(jgfVarK0);
        return q7c.t(jgfVarE, tt7VarL != null ? (tt7) uj3Var.d(tt7VarL) : null);
    }
}
