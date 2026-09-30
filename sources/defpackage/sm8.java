package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sm8 extends o2 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public sm8(List list) {
        list.getClass();
        this.b = list;
    }

    @Override // defpackage.d1
    public final int c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((um8) obj).a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.d1, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                String strGroup = ((um8) obj).a.group(i);
                return strGroup == null ? "" : strGroup;
            default:
                return ((List) obj).get(s72.T0(i, this));
        }
    }

    @Override // defpackage.o2, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.o2, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.a) {
            case 1:
                return new m0c(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.o2, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.o2, java.util.List
    public ListIterator listIterator() {
        switch (this.a) {
            case 1:
                return new m0c(this, 0);
            default:
                return super.listIterator();
        }
    }

    public sm8(um8 um8Var) {
        this.b = um8Var;
    }

    @Override // defpackage.o2, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.a) {
            case 1:
                return new m0c(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
