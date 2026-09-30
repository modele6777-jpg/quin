package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g79 implements List, an7 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ g79(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((i79) obj2).h(obj);
                break;
            default:
                ((p89) obj2).b(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                collection.getClass();
                i79 i79Var = (i79) obj;
                if (i < 0 || i > i79Var.b) {
                    i79Var.q(i);
                    throw null;
                }
                int i3 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + i79Var.b;
                Object[] objArr = i79Var.a;
                if (objArr.length < size) {
                    i79Var.o(size, objArr);
                }
                Object[] objArr2 = i79Var.a;
                if (i != i79Var.b) {
                    qd0.Z(collection.size() + i, i, i79Var.b, objArr2, objArr2);
                }
                for (Object obj2 : collection) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        t72.Z();
                        throw null;
                    }
                    objArr2[i3 + i] = obj2;
                    i3 = i4;
                }
                i79Var.b = collection.size() + i79Var.b;
                return true;
            default:
                return ((p89) obj).e(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((i79) obj).k();
                break;
            default:
                ((p89) obj).g();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((i79) obj2).c(obj) >= 0;
            default:
                return ((p89) obj2).h(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                collection.getClass();
                i79 i79Var = (i79) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (i79Var.c(it.next()) < 0) {
                        return false;
                    }
                }
                return true;
            default:
                p89 p89Var = (p89) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!p89Var.h(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                rk9.a(i, this);
                return ((i79) obj).b(i);
            default:
                q89.a(i, this);
                return ((p89) obj).a[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((i79) obj2).c(obj);
            default:
                return ((p89) obj2).i(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((i79) obj).d();
            default:
                return ((p89) obj).c == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new f79(0, 0, this);
            default:
                return new f79(0, 1, this);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        int i2 = this.a;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                i79 i79Var = (i79) obj2;
                Object[] objArr = i79Var.a;
                int i3 = i79Var.b;
                if (obj == null) {
                    i = i3 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i3 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                p89 p89Var = (p89) obj2;
                Object[] objArr2 = p89Var.a;
                for (int i4 = p89Var.c - 1; i4 >= 0; i4--) {
                    if (pa7.t(obj, objArr2[i4])) {
                        return i4;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.a) {
            case 0:
                return new f79(0, 0, this);
            default:
                return new f79(0, 1, this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                rk9.a(i, this);
                return ((i79) obj).m(i);
            default:
                q89.a(i, this);
                return ((p89) obj).k(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                collection.getClass();
                i79 i79Var = (i79) obj;
                int i2 = i79Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    i79Var.l(it.next());
                }
                return i2 != i79Var.b;
            default:
                p89 p89Var = (p89) obj;
                if (!collection.isEmpty()) {
                    int i3 = p89Var.c;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        p89Var.j(it2.next());
                    }
                    if (i3 != p89Var.c) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                collection.getClass();
                i79 i79Var = (i79) obj;
                int i2 = i79Var.b;
                Object[] objArr = i79Var.a;
                for (int i3 = i2 - 1; -1 < i3; i3--) {
                    if (!collection.contains(objArr[i3])) {
                        i79Var.m(i3);
                    }
                }
                return i2 != i79Var.b;
            default:
                p89 p89Var = (p89) obj;
                int i4 = p89Var.c;
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (!collection.contains(p89Var.a[i5])) {
                        p89Var.k(i5);
                    }
                }
                return i4 != p89Var.c;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.a;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                rk9.a(i, this);
                return ((i79) obj2).p(i, obj);
            default:
                q89.a(i, this);
                Object[] objArr = ((p89) obj2).a;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((i79) obj).b;
            default:
                return ((p89) obj).c;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.a) {
            case 0:
                rk9.b(i, i2, this);
                return new h79(this, i, i2, 0);
            default:
                q89.b(i, i2, this);
                return new h79(this, i, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
            case 0:
                objArr.getClass();
                break;
        }
        return bzd.K(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.a) {
            case 0:
                break;
        }
        return bzd.J(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.a;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                ((i79) obj2).g(i, obj);
                break;
            default:
                ((p89) obj2).a(i, obj);
                break;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case 0:
                return new f79(i, 0, this);
            default:
                return new f79(i, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((i79) obj2).l(obj);
            default:
                return ((p89) obj2).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                collection.getClass();
                i79 i79Var = (i79) obj;
                int i2 = i79Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    i79Var.h(it.next());
                }
                return i2 != i79Var.b;
            default:
                p89 p89Var = (p89) obj;
                return p89Var.e(p89Var.c, collection);
        }
    }
}
