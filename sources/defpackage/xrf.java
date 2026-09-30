package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class xrf extends csf implements zy9 {
    public final int g;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final tt7 y;
    public final xrf z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrf(ca1 ca1Var, xrf xrfVar, int i, h10 h10Var, t99 t99Var, tt7 tt7Var, boolean z, boolean z2, boolean z3, tt7 tt7Var2, ntd ntdVar) {
        super(ca1Var, h10Var, t99Var, tt7Var, ntdVar);
        ca1Var.getClass();
        h10Var.getClass();
        t99Var.getClass();
        tt7Var.getClass();
        ntdVar.getClass();
        this.g = i;
        this.v = z;
        this.w = z2;
        this.x = z3;
        this.y = tt7Var2;
        this.z = xrfVar == null ? this : xrfVar;
    }

    @Override // defpackage.bsf
    public final bl2 B() {
        return null;
    }

    @Override // defpackage.bm3
    public final Object D(fm3 fm3Var, Object obj) {
        return fm3Var.e(this, obj);
    }

    public xrf D0(f36 f36Var, t99 t99Var, int i) {
        h10 annotations = getAnnotations();
        annotations.getClass();
        tt7 type = getType();
        type.getClass();
        return new xrf(f36Var, null, i, annotations, t99Var, type, E0(), this.w, this.x, this.y, ntd.T);
    }

    public final boolean E0() {
        return this.v && ((ea1) k()).g() != 2;
    }

    @Override // defpackage.em3, defpackage.bm3
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final ca1 k() {
        bm3 bm3VarK = super.k();
        bm3VarK.getClass();
        return (ca1) bm3VarK;
    }

    @Override // defpackage.em3, defpackage.cm3, defpackage.bm3
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public final xrf a() {
        xrf xrfVar = this.z;
        return xrfVar == this ? this : xrfVar.a();
    }

    @Override // defpackage.bsf
    public final boolean N() {
        return false;
    }

    @Override // defpackage.v7e
    public final dm3 d(q8f q8fVar) {
        q8fVar.getClass();
        if (q8fVar.a.e()) {
            return this;
        }
        cva.f();
        return null;
    }

    @Override // defpackage.gm3
    public final rz3 getVisibility() {
        rz3 rz3Var = sz3.f;
        rz3Var.getClass();
        return rz3Var;
    }

    @Override // defpackage.ca1
    public final Collection l() {
        Collection collectionL = k().l();
        collectionL.getClass();
        Collection collection = collectionL;
        ArrayList arrayList = new ArrayList(t72.u(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((xrf) ((ca1) it.next()).G().get(this.g));
        }
        return arrayList;
    }
}
