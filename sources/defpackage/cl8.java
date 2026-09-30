package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cl8 extends el8 implements Iterator, zm7 {
    public final /* synthetic */ int e;

    public cl8(fl8 fl8Var, int i) {
        this.e = i;
        fl8Var.getClass();
        this.d = fl8Var;
        this.b = -1;
        this.c = fl8Var.modCount;
        f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                c();
                int i = this.a;
                fl8 fl8Var = (fl8) this.d;
                if (i >= fl8Var.length) {
                    s8f.c();
                    return null;
                }
                int i2 = this.a;
                this.a = i2 + 1;
                this.b = i2;
                dl8 dl8Var = new dl8(fl8Var, i2);
                f();
                return dl8Var;
            case 1:
                c();
                int i3 = this.a;
                fl8 fl8Var2 = (fl8) this.d;
                if (i3 >= fl8Var2.length) {
                    s8f.c();
                    return null;
                }
                int i4 = this.a;
                this.a = i4 + 1;
                this.b = i4;
                Object obj = fl8Var2.keysArray[this.b];
                f();
                return obj;
            default:
                c();
                int i5 = this.a;
                fl8 fl8Var3 = (fl8) this.d;
                if (i5 >= fl8Var3.length) {
                    s8f.c();
                    return null;
                }
                int i6 = this.a;
                this.a = i6 + 1;
                this.b = i6;
                Object[] objArr = fl8Var3.valuesArray;
                objArr.getClass();
                Object obj2 = objArr[this.b];
                f();
                return obj2;
        }
    }
}
