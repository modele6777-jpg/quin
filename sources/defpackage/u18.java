package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u18 extends l4 implements v18, RandomAccess {
    public final List b;

    static {
        new u18();
    }

    public u18() {
        super(false);
        this.b = Collections.EMPTY_LIST;
    }

    @Override // defpackage.n87
    public final n87 G(int i) {
        List list = this.b;
        if (i < list.size()) {
            cva.s();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new u18(arrayList);
    }

    @Override // defpackage.v18
    public final void W(y61 y61Var) {
        a();
        this.b.add(y61Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.l4, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof v18) {
            collection = ((v18) collection).h();
        }
        boolean zAddAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // defpackage.l4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        List list = this.b;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof y61)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, p87.a);
            if (mqf.a.n(bArr, 0, bArr.length) == 0) {
                list.set(i, str2);
            }
            return str2;
        }
        y61 y61Var = (y61) obj;
        Charset charset = p87.a;
        if (y61Var.size() == 0) {
            str = "";
        } else {
            v61 v61Var = (v61) y61Var;
            str = new String(v61Var.bytes, v61Var.g(), v61Var.size(), charset);
        }
        v61 v61Var2 = (v61) y61Var;
        int iG = v61Var2.g();
        if (mqf.a.n(v61Var2.bytes, iG, v61Var2.size() + iG) == 0) {
            list.set(i, str);
        }
        return str;
    }

    @Override // defpackage.v18
    public final List h() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // defpackage.v18
    public final v18 l() {
        return this.a ? new kff(this) : this;
    }

    @Override // defpackage.v18
    public final Object p0(int i) {
        return this.b.get(i);
    }

    @Override // defpackage.l4, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object objRemove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof y61)) {
            return new String((byte[]) objRemove, p87.a);
        }
        y61 y61Var = (y61) objRemove;
        Charset charset = p87.a;
        if (y61Var.size() == 0) {
            return "";
        }
        v61 v61Var = (v61) y61Var;
        return new String(v61Var.bytes, v61Var.g(), v61Var.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof y61)) {
            return new String((byte[]) obj2, p87.a);
        }
        y61 y61Var = (y61) obj2;
        Charset charset = p87.a;
        if (y61Var.size() == 0) {
            return "";
        }
        v61 v61Var = (v61) y61Var;
        return new String(v61Var.bytes, v61Var.g(), v61Var.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    public u18(ArrayList arrayList) {
        super(true);
        this.b = arrayList;
    }

    public u18(int i) {
        this(new ArrayList(i));
    }

    @Override // defpackage.l4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
