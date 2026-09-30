package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dqd extends p3 {
    public static final /* synthetic */ int c = 0;
    public Object a;
    public int b;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object obj2;
        int i = this.b;
        if (i == 0) {
            this.a = obj;
        } else {
            Object obj3 = this.a;
            if (i == 1) {
                if (pa7.t(obj3, obj)) {
                    return false;
                }
                this.a = new Object[]{this.a, obj};
            } else if (i < 5) {
                obj3.getClass();
                Object[] objArr = (Object[]) obj3;
                if (qd0.V(objArr, obj)) {
                    return false;
                }
                int i2 = this.b;
                if (i2 == 4) {
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    LinkedHashSet linkedHashSet = new LinkedHashSet(bm8.F(objArrCopyOf.length));
                    qd0.B0(objArrCopyOf, linkedHashSet);
                    linkedHashSet.add(obj);
                    obj2 = linkedHashSet;
                } else {
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i2 + 1);
                    objArrCopyOf2[objArrCopyOf2.length - 1] = obj;
                    obj2 = objArrCopyOf2;
                }
                this.a = obj2;
            } else {
                obj3.getClass();
                if (!z7f.r(obj3).add(obj)) {
                    return false;
                }
            }
        }
        this.b++;
        return true;
    }

    @Override // defpackage.p3
    public final int c() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a = null;
        this.b = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (c() == 0) {
            return false;
        }
        if (c() == 1) {
            return pa7.t(this.a, obj);
        }
        int iC = c();
        Object obj2 = this.a;
        if (iC < 5) {
            obj2.getClass();
            return qd0.V((Object[]) obj2, obj);
        }
        obj2.getClass();
        return ((Set) obj2).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.b;
        if (i == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        Object obj = this.a;
        if (i == 1) {
            return new hyc(1, obj);
        }
        if (i < 5) {
            obj.getClass();
            return new e9a((Object[]) obj);
        }
        obj.getClass();
        return z7f.r(obj).iterator();
    }
}
