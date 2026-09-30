package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class el8 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public el8() {
        if (uzd.b == null) {
            uzd.b = new uzd(9);
        }
    }

    public int b(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i);
        }
        return 0;
    }

    public void c() {
        if (((fl8) this.d).modCount == this.c) {
            return;
        }
        qc0.e();
    }

    public abstract Object d(View view);

    public abstract void e(View view, Object obj);

    public void f() {
        fl8 fl8Var = (fl8) this.d;
        while (this.a < fl8Var.length) {
            int[] iArr = fl8Var.presenceArray;
            int i = this.a;
            if (iArr[i] >= 0) {
                return;
            } else {
                this.a = i + 1;
            }
        }
    }

    public void g(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.b) {
            e(view, obj);
            return;
        }
        i6 i6Var = null;
        if (Build.VERSION.SDK_INT >= this.b) {
            tag = d(view);
        } else {
            tag = view.getTag(this.a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (h(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateE = nvf.e(view);
            if (accessibilityDelegateE != null) {
                i6Var = accessibilityDelegateE instanceof h6 ? ((h6) accessibilityDelegateE).a : new i6(accessibilityDelegateE);
            }
            if (i6Var == null) {
                i6Var = new i6();
            }
            nvf.j(view, i6Var);
            view.setTag(this.a, obj);
            nvf.g(view, this.c);
        }
    }

    public abstract boolean h(Object obj, Object obj2);

    public boolean hasNext() {
        return this.a < ((fl8) this.d).length;
    }

    public void remove() {
        fl8 fl8Var = (fl8) this.d;
        c();
        if (this.b == -1) {
            qc0.p("Call next() before removing element from the iterator.");
            return;
        }
        fl8Var.k();
        fl8Var.v(this.b);
        this.b = -1;
        this.c = fl8Var.modCount;
    }
}
