package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class vy6 extends ry6 implements NavigableSet, Iterable {
    public static final /* synthetic */ int f = 0;
    private static final long serialVersionUID = 912559;
    public final transient Comparator d;
    public transient vy6 e;

    public vy6(Comparator comparator) {
        this.d = comparator;
    }

    public static gpb r(Comparator comparator) {
        if (ba9.a == comparator) {
            return gpb.v;
        }
        ey6 ey6Var = jy6.b;
        return new gpb(yob.e, comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.d;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        vy6 vy6VarR = this.e;
        if (vy6VarR == null) {
            gpb gpbVar = (gpb) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(gpbVar.d);
            vy6VarR = gpbVar.isEmpty() ? r(comparatorReverseOrder) : new gpb(gpbVar.g.w(), comparatorReverseOrder);
            this.e = vy6VarR;
            vy6VarR.e = this;
        }
        return vy6VarR;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        gpb gpbVar = (gpb) this;
        return gpbVar.t(0, gpbVar.v(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final gpb subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        pa7.A(this.d.compare(obj, obj2) <= 0);
        gpb gpbVar = (gpb) this;
        gpb gpbVarT = gpbVar.t(gpbVar.w(obj, z), gpbVar.g.size());
        return gpbVarT.t(0, gpbVarT.v(obj2, z2));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        gpb gpbVar = (gpb) this;
        return gpbVar.t(gpbVar.w(obj, true), gpbVar.g.size());
    }

    @Override // defpackage.ry6, defpackage.ay6
    public Object writeReplace() {
        return new uy6(this.d, toArray(ay6.a));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        gpb gpbVar = (gpb) this;
        return gpbVar.t(0, gpbVar.v(obj, false));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        gpb gpbVar = (gpb) this;
        return gpbVar.t(gpbVar.w(obj, z), gpbVar.g.size());
    }
}
