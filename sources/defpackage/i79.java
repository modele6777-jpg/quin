package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i79 extends qk9 {
    public g79 c;

    public i79(int i) {
        this.a = i == 0 ? rk9.a : new Object[i];
    }

    public final void g(int i, Object obj) {
        int i2;
        if (i < 0 || i > (i2 = this.b)) {
            q(i);
            throw null;
        }
        int i3 = i2 + 1;
        Object[] objArr = this.a;
        if (objArr.length < i3) {
            o(i3, objArr);
        }
        Object[] objArr2 = this.a;
        int i4 = this.b;
        if (i != i4) {
            qd0.Z(i + 1, i, i4, objArr2, objArr2);
        }
        objArr2[i] = obj;
        this.b++;
    }

    public final void h(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            o(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void i(qk9 qk9Var) {
        qk9Var.getClass();
        if (qk9Var.d()) {
            return;
        }
        int i = this.b + qk9Var.b;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            o(i, objArr);
        }
        qd0.Z(this.b, 0, qk9Var.b, qk9Var.a, this.a);
        this.b += qk9Var.b;
    }

    public final void j(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        int i = this.b;
        int size = list.size() + i;
        Object[] objArr = this.a;
        if (objArr.length < size) {
            o(size, objArr);
        }
        Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b = list.size() + this.b;
    }

    public final void k() {
        qd0.h0(0, this.b, null, this.a);
        this.b = 0;
    }

    public final boolean l(Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            return false;
        }
        m(iC);
        return true;
    }

    public final Object m(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            f(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            qd0.Z(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void n(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            r3.g(this.b, ib8.n(i, i2, "Start (", ") and end (", ") must be in 0.."));
            return;
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.a;
                qd0.Z(i, i2, i3, objArr, objArr);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            qd0.h0(i5, i4, null, this.a);
            this.b = i5;
        }
    }

    public final void o(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        qd0.Z(0, 0, length, objArr, objArr2);
        this.a = objArr2;
    }

    public final Object p(int i, Object obj) {
        if (i < 0 || i >= this.b) {
            f(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final void q(int i) {
        StringBuilder sbN = ub3.n(i, "Index ", " must be in 0..");
        sbN.append(this.b);
        throw new IndexOutOfBoundsException(sbN.toString());
    }

    public /* synthetic */ i79() {
        this(16);
    }
}
