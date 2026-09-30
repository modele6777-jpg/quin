package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dcc implements Iterable {
    public acc a;
    public acc b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    public final Object a(Object obj, Object obj2) {
        acc accVar = this.a;
        while (accVar != null && !accVar.a.equals(obj)) {
            accVar = accVar.c;
        }
        if (accVar != null) {
            return accVar.b;
        }
        acc accVar2 = new acc(obj, obj2);
        this.d++;
        acc accVar3 = this.b;
        if (accVar3 == null) {
            this.a = accVar2;
            this.b = accVar2;
            return null;
        }
        accVar3.c = accVar2;
        accVar2.d = accVar3;
        this.b = accVar2;
        return null;
    }

    public final boolean equals(Object obj) {
        zbc zbcVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dcc)) {
            return false;
        }
        dcc dccVar = (dcc) obj;
        if (this.d != dccVar.d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = dccVar.iterator();
        while (true) {
            zbcVar = (zbc) it;
            if (!zbcVar.hasNext()) {
                break;
            }
            zbc zbcVar2 = (zbc) it2;
            if (!zbcVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) zbcVar.next();
            Object next = zbcVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (zbcVar.hasNext() || ((zbc) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            zbc zbcVar = (zbc) it;
            if (!zbcVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) zbcVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        acc accVar = this.a;
        acc accVar2 = this.b;
        zbc zbcVar = new zbc();
        zbcVar.a = accVar2;
        zbcVar.b = accVar;
        this.c.put(zbcVar, Boolean.FALSE);
        return zbcVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            zbc zbcVar = (zbc) it;
            if (!zbcVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) zbcVar.next()).toString());
            if (zbcVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
