package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ut3 extends pj {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final SparseArray E;
    public final SparseBooleanArray F;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public ut3(vt3 vt3Var) {
        f(vt3Var);
        this.x = vt3Var.x;
        this.y = vt3Var.y;
        this.z = vt3Var.z;
        this.A = vt3Var.A;
        this.B = vt3Var.B;
        this.C = vt3Var.C;
        this.D = vt3Var.D;
        SparseArray sparseArray = vt3Var.E;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.E = sparseArray2;
        this.F = vt3Var.F.clone();
    }

    @Override // defpackage.pj
    public final q1f a() {
        return new vt3(this);
    }

    @Override // defpackage.pj
    public final pj b(int i) {
        super.b(i);
        return this;
    }

    @Override // defpackage.pj
    public final pj h() {
        this.l = -3;
        return this;
    }

    @Override // defpackage.pj
    public final pj i(o1f o1fVar) {
        super.i(o1fVar);
        return this;
    }

    @Override // defpackage.pj
    public final pj j() {
        super.j();
        return this;
    }

    @Override // defpackage.pj
    public final pj k(String[] strArr) {
        super.k(strArr);
        return this;
    }

    @Override // defpackage.pj
    public final pj l() {
        this.k = false;
        return this;
    }

    @Override // defpackage.pj
    public final pj m(int i, boolean z) {
        super.m(i, z);
        return this;
    }

    public final void n(Set set) {
        ((HashSet) this.w).clear();
        ((HashSet) this.w).addAll(set);
    }

    public ut3() {
        this.E = new SparseArray();
        this.F = new SparseBooleanArray();
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = true;
        this.C = true;
        this.D = true;
    }
}
