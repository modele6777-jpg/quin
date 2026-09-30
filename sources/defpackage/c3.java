package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c3 extends u2 implements ListIterator {
    public final /* synthetic */ d3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(d3 d3Var, int i) {
        super(d3Var, ((List) d3Var.b).listIterator(i));
        this.e = d3Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        d3 d3Var = this.e;
        boolean zIsEmpty = d3Var.isEmpty();
        b().add(obj);
        d3Var.f.e++;
        if (zIsEmpty) {
            d3Var.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(d3 d3Var) {
        super(d3Var);
        this.e = d3Var;
    }
}
