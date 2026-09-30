package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fy6 extends jy6 {
    public final transient jy6 c;

    public fy6(jy6 jy6Var) {
        this.c = jy6Var;
    }

    @Override // defpackage.jy6, defpackage.ay6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        jy6 jy6Var = this.c;
        pa7.C(i, jy6Var.size());
        return jy6Var.get((jy6Var.size() - 1) - i);
    }

    @Override // defpackage.ay6
    public final boolean i() {
        return this.c.i();
    }

    @Override // defpackage.jy6, java.util.List
    public final int indexOf(Object obj) {
        jy6 jy6Var = this.c;
        int iLastIndexOf = jy6Var.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (jy6Var.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.jy6, defpackage.ay6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.jy6, java.util.List
    public final int lastIndexOf(Object obj) {
        jy6 jy6Var = this.c;
        int iIndexOf = jy6Var.indexOf(obj);
        if (iIndexOf >= 0) {
            return (jy6Var.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // defpackage.jy6, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // defpackage.jy6
    public final jy6 w() {
        return this.c;
    }

    @Override // defpackage.jy6, defpackage.ay6
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.jy6, java.util.List
    /* JADX INFO: renamed from: z */
    public final jy6 subList(int i, int i2) {
        jy6 jy6Var = this.c;
        pa7.H(i, i2, jy6Var.size());
        return jy6Var.subList(jy6Var.size() - i2, jy6Var.size() - i).w();
    }

    @Override // defpackage.jy6, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
