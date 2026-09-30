package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mw3 implements Iterator, zm7 {
    public int a = -1;
    public int b;
    public int c;
    public z67 d;
    public int e;
    public final /* synthetic */ nw3 f;

    public mw3(nw3 nw3Var) {
        this.f = nw3Var;
        int iO = mh3.o(0, 0, nw3Var.a.length());
        this.b = iO;
        this.c = iO;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    /* JADX WARN: Code duplicated, block: B:18:0x007b  */
    public final void b() {
        iy9 iy9Var;
        nw3 nw3Var = this.f;
        CharSequence charSequence = nw3Var.a;
        int i = this.c;
        if (i < 0) {
            this.a = 0;
            this.d = null;
            return;
        }
        int i2 = nw3Var.b;
        if (i2 > 0) {
            int i3 = this.e + 1;
            this.e = i3;
            if (i3 >= i2) {
                int i4 = this.b;
                charSequence.getClass();
                this.d = new z67(i4, charSequence.length() - 1, 1);
                this.c = -1;
            } else if (i > charSequence.length()) {
                int i5 = this.b;
                charSequence.getClass();
                this.d = new z67(i5, charSequence.length() - 1, 1);
                this.c = -1;
            } else {
                iy9Var = (iy9) nw3Var.c.z(charSequence, Integer.valueOf(this.c));
                if (iy9Var == null) {
                    int i6 = this.b;
                    charSequence.getClass();
                    this.d = new z67(i6, charSequence.length() - 1, 1);
                    this.c = -1;
                } else {
                    int iIntValue = ((Number) iy9Var.a()).intValue();
                    int iIntValue2 = ((Number) iy9Var.b()).intValue();
                    this.d = mh3.c0(this.b, iIntValue);
                    int i7 = iIntValue + iIntValue2;
                    this.b = i7;
                    this.c = i7 + (iIntValue2 == 0 ? 1 : 0);
                }
            }
        } else if (i > charSequence.length()) {
            int i8 = this.b;
            charSequence.getClass();
            this.d = new z67(i8, charSequence.length() - 1, 1);
            this.c = -1;
        } else {
            iy9Var = (iy9) nw3Var.c.z(charSequence, Integer.valueOf(this.c));
            if (iy9Var == null) {
                int i9 = this.b;
                charSequence.getClass();
                this.d = new z67(i9, charSequence.length() - 1, 1);
                this.c = -1;
            } else {
                int iIntValue3 = ((Number) iy9Var.a()).intValue();
                int iIntValue4 = ((Number) iy9Var.b()).intValue();
                this.d = mh3.c0(this.b, iIntValue3);
                int i10 = iIntValue3 + iIntValue4;
                this.b = i10;
                this.c = i10 + (iIntValue4 == 0 ? 1 : 0);
            }
        }
        this.a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a == -1) {
            b();
        }
        return this.a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a == -1) {
            b();
        }
        if (this.a == 0) {
            s8f.c();
            return null;
        }
        z67 z67Var = this.d;
        z67Var.getClass();
        this.d = null;
        this.a = -1;
        return z67Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
