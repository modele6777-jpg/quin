package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dug extends vtg implements NavigableSet, Iterable {
    public final transient Comparator f;
    public transient dug g;

    public dug(Comparator comparator) {
        super(1);
        this.f = comparator;
    }

    public static jvg q(Comparator comparator) {
        if (qug.b == comparator) {
            return jvg.w;
        }
        wsg wsgVar = qtg.d;
        return new jvg(wug.g, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f;
    }

    @Override // java.util.SortedSet
    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        jvg jvgVar = (jvg) this;
        return jvgVar.t(0, jvgVar.r(obj, false));
    }

    @Override // java.util.SortedSet
    public abstract Object last();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final dug descendingSet() {
        dug dugVarQ = this.g;
        if (dugVarQ == null) {
            jvg jvgVar = (jvg) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(jvgVar.f);
            dugVarQ = jvgVar.isEmpty() ? q(comparatorReverseOrder) : new jvg(jvgVar.v.m(), comparatorReverseOrder);
            this.g = dugVarQ;
            dugVarQ.g = this;
        }
        return dugVarQ;
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final jvg subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.f.compare(obj, obj2) > 0) {
            cva.s();
            return null;
        }
        jvg jvgVar = (jvg) this;
        jvg jvgVarT = jvgVar.t(jvgVar.s(obj, z), jvgVar.v.size());
        return jvgVarT.t(0, jvgVarT.r(obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        jvg jvgVar = (jvg) this;
        return jvgVar.t(jvgVar.s(obj, true), jvgVar.v.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        jvg jvgVar = (jvg) this;
        return jvgVar.t(0, jvgVar.r(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        jvg jvgVar = (jvg) this;
        return jvgVar.t(jvgVar.s(obj, z), jvgVar.v.size());
    }
}
