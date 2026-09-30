package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x8a implements Iterator, zm7 {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public final Object[] d;

    public x8a(o4f o4fVar, q4f[] q4fVarArr) {
        this.a = 0;
        o4fVar.getClass();
        this.d = q4fVarArr;
        this.c = true;
        q4f q4fVar = q4fVarArr[0];
        Object[] objArr = o4fVar.d;
        int iBitCount = Integer.bitCount(o4fVar.a) * 2;
        q4fVar.getClass();
        objArr.getClass();
        q4fVar.b = objArr;
        q4fVar.c = iBitCount;
        q4fVar.d = 0;
        this.b = 0;
        c();
    }

    public void b() {
        q4f[] q4fVarArr = (q4f[]) this.d;
        int i = this.b;
        q4f q4fVar = q4fVarArr[i];
        if (q4fVar.d < q4fVar.c) {
            return;
        }
        while (-1 < i) {
            int iD = d(i);
            if (iD == -1) {
                q4f q4fVar2 = q4fVarArr[i];
                int i2 = q4fVar2.d;
                Object[] objArr = q4fVar2.b;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    q4fVar2.d = i2 + 1;
                    iD = d(i);
                }
            }
            if (iD != -1) {
                this.b = iD;
                return;
            }
            if (i > 0) {
                q4f q4fVar3 = q4fVarArr[i - 1];
                int i3 = q4fVar3.d;
                int length2 = q4fVar3.b.length;
                q4fVar3.d = i3 + 1;
            }
            q4fVarArr[i].b(p4f.e.d, 0, 0);
            i--;
        }
        this.c = false;
    }

    public void c() {
        q4f[] q4fVarArr = (q4f[]) this.d;
        int i = this.b;
        q4f q4fVar = q4fVarArr[i];
        if (q4fVar.d < q4fVar.c) {
            return;
        }
        while (-1 < i) {
            int iE = e(i);
            if (iE == -1) {
                q4f q4fVar2 = q4fVarArr[i];
                int i2 = q4fVar2.d;
                Object[] objArr = q4fVar2.b;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    q4fVar2.d = i2 + 1;
                    iE = e(i);
                }
            }
            if (iE != -1) {
                this.b = iE;
                return;
            }
            if (i > 0) {
                q4f q4fVar3 = q4fVarArr[i - 1];
                int i3 = q4fVar3.d;
                int length2 = q4fVar3.b.length;
                q4fVar3.d = i3 + 1;
            }
            q4f q4fVar4 = q4fVarArr[i];
            Object[] objArr2 = o4f.e.d;
            q4fVar4.getClass();
            objArr2.getClass();
            q4fVar4.b = objArr2;
            q4fVar4.c = 0;
            q4fVar4.d = 0;
            i--;
        }
        this.c = false;
    }

    public int d(int i) {
        q4f[] q4fVarArr = (q4f[]) this.d;
        q4f q4fVar = q4fVarArr[i];
        int i2 = q4fVar.d;
        if (i2 < q4fVar.c) {
            return i;
        }
        Object[] objArr = q4fVar.b;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        p4f p4fVar = (p4f) obj;
        if (i == 6) {
            q4f q4fVar2 = q4fVarArr[i + 1];
            Object[] objArr2 = p4fVar.d;
            q4fVar2.b(objArr2, objArr2.length, 0);
        } else {
            q4fVarArr[i + 1].b(p4fVar.d, Integer.bitCount(p4fVar.a) * 2, 0);
        }
        return d(i + 1);
    }

    public int e(int i) {
        q4f[] q4fVarArr = (q4f[]) this.d;
        q4f q4fVar = q4fVarArr[i];
        int i2 = q4fVar.d;
        if (i2 < q4fVar.c) {
            return i;
        }
        Object[] objArr = q4fVar.b;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        o4f o4fVar = (o4f) obj;
        if (i == 6) {
            q4f q4fVar2 = q4fVarArr[i + 1];
            Object[] objArr2 = o4fVar.d;
            int length2 = objArr2.length;
            q4fVar2.getClass();
            q4fVar2.b = objArr2;
            q4fVar2.c = length2;
            q4fVar2.d = 0;
        } else {
            q4f q4fVar3 = q4fVarArr[i + 1];
            Object[] objArr3 = o4fVar.d;
            int iBitCount = Integer.bitCount(o4fVar.a) * 2;
            q4fVar3.getClass();
            objArr3.getClass();
            q4fVar3.b = objArr3;
            q4fVar3.c = iBitCount;
            q4fVar3.d = 0;
        }
        return e(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.a;
        Object[] objArr = this.d;
        switch (i) {
            case 0:
                if (!this.c) {
                    s8f.c();
                    return null;
                }
                Object next = ((q4f[]) objArr)[this.b].next();
                c();
                return next;
            default:
                if (!this.c) {
                    s8f.c();
                    return null;
                }
                Object next2 = ((q4f[]) objArr)[this.b].next();
                b();
                return next2;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public x8a(p4f p4fVar, q4f[] q4fVarArr) {
        this.a = 1;
        this.d = q4fVarArr;
        this.c = true;
        q4fVarArr[0].b(p4fVar.d, Integer.bitCount(p4fVar.a) * 2, 0);
        this.b = 0;
        b();
    }
}
