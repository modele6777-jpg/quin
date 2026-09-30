package defpackage;

import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class t18 extends AbstractList implements RandomAccess, w18 {
    public static final jff b = new jff(new t18());
    public final ArrayList a;

    public t18(w18 w18Var) {
        this.a = new ArrayList(w18Var.size());
        addAll(w18Var);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.a.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection instanceof w18) {
            collection = ((w18) collection).h();
        }
        boolean zAddAll = this.a.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.w18
    public final z61 g0(int i) {
        z61 m98Var;
        ArrayList arrayList = this.a;
        Object obj = arrayList.get(i);
        if (obj instanceof z61) {
            m98Var = (z61) obj;
        } else if (obj instanceof String) {
            try {
                m98Var = new m98(((String) obj).getBytes(Constants.ENCODING));
            } catch (UnsupportedEncodingException e) {
                cva.q("UTF-8 not supported?", e);
                return null;
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            m98Var = new m98(bArr2);
        }
        if (m98Var != obj) {
            arrayList.set(i, m98Var);
        }
        return m98Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.a;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof z61) {
            z61 z61Var = (z61) obj;
            String strQ = z61Var.q();
            if (z61Var.i()) {
                arrayList.set(i, strQ);
            }
            return strQ;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = q87.a;
        try {
            String str = new String(bArr, Constants.ENCODING);
            if (mxb.k(bArr, 0, bArr.length) == 0) {
                arrayList.set(i, str);
            }
            return str;
        } catch (UnsupportedEncodingException e) {
            cva.q("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // defpackage.w18
    public final List h() {
        return Collections.unmodifiableList(this.a);
    }

    @Override // defpackage.w18
    public final void h0(m98 m98Var) {
        this.a.add(m98Var);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.w18
    public final jff l() {
        return new jff(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object objRemove = this.a.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof z61) {
            return ((z61) objRemove).q();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = q87.a;
        try {
            return new String(bArr, Constants.ENCODING);
        } catch (UnsupportedEncodingException e) {
            cva.q("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.a.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof z61) {
            return ((z61) obj2).q();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = q87.a;
        try {
            return new String(bArr, Constants.ENCODING);
        } catch (UnsupportedEncodingException e) {
            cva.q("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    public t18() {
        this.a = new ArrayList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.a.size(), collection);
    }
}
