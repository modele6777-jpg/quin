package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n68 implements Iterator {
    public final CharSequence a;
    public final m68 b;
    public int c = 0;
    public q68 d = null;

    public n68(CharSequence charSequence, m68 m68Var) {
        this.a = charSequence;
        this.b = m68Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.a.length();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            s8f.c();
            return null;
        }
        q68 q68Var = this.d;
        int i = 6;
        if (q68Var == null) {
            m68 m68Var = this.b;
            if (!m68Var.hasNext()) {
                int length = this.a.length();
                h71 h71Var = new h71(this.c, length, i);
                this.c = length;
                return h71Var;
            }
            if (!m68Var.hasNext()) {
                s8f.c();
                return null;
            }
            q68 q68Var2 = m68Var.b;
            m68Var.b = null;
            this.d = q68Var2;
            q68Var = q68Var2;
        }
        int i2 = this.c;
        int i3 = q68Var.b;
        if (i2 < i3) {
            h71 h71Var2 = new h71(i2, i3, i);
            this.c = i3;
            return h71Var2;
        }
        this.c = q68Var.c;
        this.d = null;
        return q68Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
