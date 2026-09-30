package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cac extends eac implements dac, bac {
    public ArrayList i = new ArrayList();
    public HashSet j = null;
    public String k = null;
    public HashSet l = null;
    public HashSet m = null;

    @Override // defpackage.dac
    public final List a() {
        return this.i;
    }

    @Override // defpackage.bac
    public final Set b() {
        return null;
    }

    @Override // defpackage.bac
    public final String c() {
        return this.k;
    }

    @Override // defpackage.bac
    public final void e(HashSet hashSet) {
        this.j = hashSet;
    }

    @Override // defpackage.dac
    public void f(hac hacVar) {
        this.i.add(hacVar);
    }

    @Override // defpackage.bac
    public final Set g() {
        return this.j;
    }

    @Override // defpackage.bac
    public final void h(HashSet hashSet) {
        this.m = hashSet;
    }

    @Override // defpackage.bac
    public final void i(String str) {
        this.k = str;
    }

    @Override // defpackage.bac
    public final void j(HashSet hashSet) {
        this.l = hashSet;
    }

    @Override // defpackage.bac
    public final Set m() {
        return this.l;
    }

    @Override // defpackage.bac
    public final Set n() {
        return this.m;
    }

    @Override // defpackage.bac
    public final void k(HashSet hashSet) {
    }
}
