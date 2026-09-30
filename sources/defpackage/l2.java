package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.adjust.sdk.sig.r3;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class l2 implements Iterator, zm7 {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public l2(kx4 kx4Var) {
        this.a = 2;
        this.c = kx4Var;
        this.b = kx4Var.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return this.b < ((o2) obj).c();
            case 1:
                return this.b < ((Object[]) obj).length;
            case 2:
                return this.b > 0;
            case 3:
                return this.b < ((fud) obj).d();
            case 4:
                return this.b < ((byte[]) obj).length;
            case 5:
                return this.b < ((int[]) obj).length;
            case 6:
                return this.b < ((long[]) obj).length;
            case 7:
                return this.b < ((short[]) obj).length;
            default:
                return this.b < ((ViewGroup) obj).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    s8f.c();
                    return null;
                }
                int i2 = this.b;
                this.b = i2 + 1;
                return ((o2) obj).get(i2);
            case 1:
                try {
                    int i3 = this.b;
                    this.b = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    r3.n(e.getMessage());
                    return null;
                }
            case 2:
                kx4 kx4Var = (kx4) obj;
                int i4 = kx4Var.c;
                int i5 = this.b;
                this.b = i5 - 1;
                return kx4Var.e[i4 - i5];
            case 3:
                int i6 = this.b;
                this.b = i6 + 1;
                return ((fud) obj).e(i6);
            case 4:
                int i7 = this.b;
                byte[] bArr = (byte[]) obj;
                if (i7 < bArr.length) {
                    this.b = i7 + 1;
                    return new u9f(bArr[i7]);
                }
                r3.n(String.valueOf(i7));
                return null;
            case 5:
                int i8 = this.b;
                int[] iArr = (int[]) obj;
                if (i8 < iArr.length) {
                    this.b = i8 + 1;
                    return new aaf(iArr[i8]);
                }
                r3.n(String.valueOf(i8));
                return null;
            case 6:
                int i9 = this.b;
                long[] jArr = (long[]) obj;
                if (i9 < jArr.length) {
                    this.b = i9 + 1;
                    return new faf(jArr[i9]);
                }
                r3.n(String.valueOf(i9));
                return null;
            case 7:
                int i10 = this.b;
                short[] sArr = (short[]) obj;
                if (i10 < sArr.length) {
                    this.b = i10 + 1;
                    return new maf(sArr[i10]);
                }
                r3.n(String.valueOf(i10));
                return null;
            default:
                int i11 = this.b;
                this.b = i11 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i11);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 7:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.c;
                int i = this.b - 1;
                this.b = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }

    public l2(Object[] objArr) {
        this.a = 1;
        objArr.getClass();
        this.c = objArr;
    }

    public /* synthetic */ l2(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }
}
