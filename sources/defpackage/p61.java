package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p61 implements Iterator {
    public final /* synthetic */ int a = 5;
    public int b = 0;
    public final int c;
    public final /* synthetic */ Iterable d;

    public p61(xlg xlgVar) {
        this.d = xlgVar;
        this.c = xlgVar.c();
    }

    public byte a() {
        try {
            byte[] bArr = ((m98) this.d).b;
            int i = this.b;
            this.b = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            r3.n(e.getMessage());
            return (byte) 0;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b < this.c;
            case 1:
                return this.b < this.c;
            case 2:
                return this.b < this.c;
            case 3:
                return this.b < this.c;
            case 4:
                return this.b < this.c;
            default:
                return this.b < this.c;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterable iterable = this.d;
        int i2 = this.c;
        switch (i) {
            case 0:
                int i3 = this.b;
                if (i3 < i2) {
                    this.b = i3 + 1;
                    return Byte.valueOf(((t61) iterable).d(i3));
                }
                s8f.c();
                return null;
            case 1:
                int i4 = this.b;
                if (i4 < i2) {
                    this.b = i4 + 1;
                    return Byte.valueOf(((u61) iterable).g(i4));
                }
                s8f.c();
                return null;
            case 2:
                return Byte.valueOf(a());
            case 3:
                int i5 = this.b;
                if (i5 < i2) {
                    this.b = i5 + 1;
                    return Byte.valueOf(((xlg) iterable).a(i5));
                }
                s8f.c();
                return null;
            case 4:
                int i6 = this.b;
                if (i6 < i2) {
                    this.b = i6 + 1;
                    return Byte.valueOf(((vyg) iterable).a(i6));
                }
                s8f.c();
                return null;
            default:
                int i7 = this.b;
                if (i7 < i2) {
                    this.b = i7 + 1;
                    return Byte.valueOf(((d1h) iterable).c(i7));
                }
                s8f.c();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public p61(vyg vygVar) {
        this.d = vygVar;
        this.c = vygVar.d();
    }

    public p61(d1h d1hVar) {
        this.d = d1hVar;
        this.c = d1hVar.d();
    }

    public p61(t61 t61Var) {
        this.d = t61Var;
        this.c = t61Var.size();
    }

    public p61(u61 u61Var) {
        this.d = u61Var;
        this.c = u61Var.size();
    }

    public p61(m98 m98Var) {
        this.d = m98Var;
        this.c = m98Var.b.length;
    }
}
