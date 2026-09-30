package defpackage;

import android.graphics.Matrix;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h9c extends eac implements j9c, bac {
    public HashSet i = null;
    public String j = null;
    public HashSet k = null;
    public HashSet l = null;
    public HashSet m = null;
    public Matrix n;

    @Override // defpackage.bac
    public final Set b() {
        return this.k;
    }

    @Override // defpackage.bac
    public final String c() {
        return this.j;
    }

    @Override // defpackage.bac
    public final void e(HashSet hashSet) {
        this.i = hashSet;
    }

    @Override // defpackage.bac
    public final Set g() {
        return this.i;
    }

    @Override // defpackage.bac
    public final void h(HashSet hashSet) {
        this.m = hashSet;
    }

    @Override // defpackage.bac
    public final void i(String str) {
        this.j = str;
    }

    @Override // defpackage.bac
    public final void j(HashSet hashSet) {
        this.l = hashSet;
    }

    @Override // defpackage.bac
    public final void k(HashSet hashSet) {
        this.k = hashSet;
    }

    @Override // defpackage.j9c
    public final void l(Matrix matrix) {
        this.n = matrix;
    }

    @Override // defpackage.bac
    public final Set m() {
        return this.l;
    }

    @Override // defpackage.bac
    public final Set n() {
        return this.m;
    }
}
