package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dl8 implements Map.Entry, bn7 {
    public final fl8 a;
    public final int b;
    public final int c;

    public dl8(fl8 fl8Var, int i) {
        fl8Var.getClass();
        this.a = fl8Var;
        this.b = i;
        this.c = fl8Var.modCount;
    }

    public final void b() {
        if (this.a.modCount != this.c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return pa7.t(entry.getKey(), getKey()) && pa7.t(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        b();
        return this.a.keysArray[this.b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        b();
        Object[] objArr = this.a.valuesArray;
        objArr.getClass();
        return objArr[this.b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        b();
        fl8 fl8Var = this.a;
        fl8Var.k();
        Object[] objArrI = fl8Var.i();
        int i = this.b;
        Object obj2 = objArrI[i];
        objArrI[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
