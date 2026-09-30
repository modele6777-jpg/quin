package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hy6 extends jy6 {
    public final transient int c;
    public final transient int d;
    final /* synthetic */ jy6 this$0;

    public hy6(jy6 jy6Var, int i, int i2) {
        this.this$0 = jy6Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.ay6
    public final Object[] d() {
        return this.this$0.d();
    }

    @Override // defpackage.ay6
    public final int e() {
        return this.this$0.g() + this.c + this.d;
    }

    @Override // defpackage.ay6
    public final int g() {
        return this.this$0.g() + this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        pa7.C(i, this.d);
        return this.this$0.get(i + this.c);
    }

    @Override // defpackage.ay6
    public final boolean i() {
        return true;
    }

    @Override // defpackage.jy6, defpackage.ay6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.jy6, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.jy6, defpackage.ay6
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.jy6, java.util.List
    /* JADX INFO: renamed from: z */
    public final jy6 subList(int i, int i2) {
        pa7.H(i, i2, this.d);
        jy6 jy6Var = this.this$0;
        int i3 = this.c;
        return jy6Var.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.jy6, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
